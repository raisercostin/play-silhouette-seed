package utils
import play.api.mvc.{ Result, RequestHeader, Filter }
import play.api.routing.Router.Tags;
import scala.concurrent.Future
import org.slf4j.LoggerFactory
import akka.stream.Materializer
import javax.inject.Inject
import scala.concurrent.ExecutionContext
import play.api.Configuration
import scala.util.Success
import scala.util.Failure

class LoggingFilter @Inject() (implicit val mat: Materializer, ec: ExecutionContext, config: Configuration) extends Filter {
  val loggerAccess = LoggerFactory.getLogger("accesslog")
  val logger = LoggerFactory.getLogger(classOf[LoggingFilter])
  val excludeStatus: Set[Int] = config.getIntSeq("filter.logging.excludeStatus").map(_.map(_.toInt).toSet).getOrElse(Set(304))

  override def apply(nextFilter: (RequestHeader) => Future[Result])(request: RequestHeader): Future[Result] = {
    val startTime = System.currentTimeMillis

    val msg = s"method=${request.method} uri=${request.uri} remote-address=${request.remoteAddress} " +
      s"domain=${request.domain} query-string=${request.rawQueryString} " +
      s"referer=${request.headers.get("referer").getOrElse("N/A")} " +
      s"user-agent=[${request.headers.get("user-agent").getOrElse("N/A")}]"
    loggerAccess.info(msg)
    val action = scala.util.Try {
      request.tags(Tags.RouteController) + "." + request.tags(Tags.RouteActionMethod) + " " + request.uri
    }.getOrElse(request.toString)

    nextFilter(request).andThen {
      case Success(result) =>
        //Logger.warn("tags="+(requestHeader.tags mkString "\n"))
        val endTime = System.currentTimeMillis
        val requestTime = endTime - startTime
        if (!excludeStatus.contains(result.header.status)) {
          logger.info(s"${request.method} ${action} took ${requestTime}ms and returned ${result.header.status}")
        }
        result.withHeaders("Request-Time" -> requestTime.toString)
      case error: Failure[_] =>
        val endTime = System.currentTimeMillis
        val requestTime = endTime - startTime
        logger.warn(s"${request.method} ${action} took ${requestTime}ms and returned exception ${error}")
        error
    }
  }
}
