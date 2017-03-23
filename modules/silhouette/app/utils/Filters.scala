package utils

import javax.inject.Inject

import play.api.http.HttpFilters
import play.api.mvc.EssentialFilter
import play.filters.csrf.CSRFFilter
import play.filters.headers.SecurityHeadersFilter
import play.api.http.DefaultHttpFilters
import play.filters.cors.CORSFilter

/**
 * Provides filters.
 * Added LoggingFilter to log the filter errors on the server side. 
 */
class Filters @Inject() (loggingFilter:LoggingFilter, corsFilter:CORSFilter, csrfFilter: CSRFFilter, securityHeadersFilter: SecurityHeadersFilter) 
  extends DefaultHttpFilters(loggingFilter, corsFilter, csrfFilter, securityHeadersFilter)