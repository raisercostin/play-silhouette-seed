Silhouette Slick Seed Template
==============================

This is a fork of the official Silhouette Seed project. If you want to have a first look at Silhouette, I suggest you have a look at the [official project](https://github.com/mohiva/play-silhouette-seed).

The Silhouette Seed project is an Activator template which shows how [Silhouette](https://github.com/mohiva/play-silhouette) can be implemented in a Play Framework application. It's a starting point which can be extended to fit your needs.
It uses the [play-slick](https://github.com/playframework/play-slick) library for database access.

## Example

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

(The "Build App" phase will take a few minutes)

Currently, there is no live example of this template.

## Features

* Sign Up
* Sign In (Credentials)
* Social Auth (Facebook, Google+, VK, Twitter, Xing, Yahoo)
* Two-factor authentication with Clef
* Dependency Injection with Guice
* Publishing Events
* Avatar service
* Remember me functionality
* [Security headers](https://www.playframework.com/documentation/2.4.x/SecurityHeaders)
* [CSRF Protection](https://www.playframework.com/documentation/2.4.x/ScalaCsrf)
* play-slick database access

## Documentation

Consulate the [Silhouette documentation](http://silhouette.mohiva.com/docs) for more information. If you need help with the integration of Silhouette into your project, don't hesitate and ask questions in our [mailing list](https://groups.google.com/forum/#!forum/play-silhouette) or on [Stack Overflow](http://stackoverflow.com/questions/tagged/playframework).

### Slick

The template stores all authentication information in a database via [Slick](http://slick.typesafe.com/) It uses an in memory [H2](www.h2database.com/) database by default.

In order to use another database supported by Slick, you need to change the driver in your application.conf and add the corresponding JDBC driver to your dependencies. The [Play Slick documentation](https://www.playframework.com/documentation/2.4.x/PlaySlick) has more information about database configuration.

## Activator

This project template is also
[hosted at typesafe](https://typesafe.com/activator/template/play-silhouette-slick-seed).

# License

The code is licensed under [Apache License v2.0](http://www.apache.org/licenses/LICENSE-2.0).

# Dependencies

| library | play   | activator | sbt            | scala       | jdk            | slick       | play-slick        | silhouette | bootstrap     |
|---------|--------|-----------|----------------|-------------|----------------|-------------|-------------------|------------|---------------|
| play23  | 2.3    | 1.3.2     | 0.13.8         | 2.10 2.11   | jdk6/jdk7/jdk8 | 2.0.0       | 0.7.0             | 1.0/2.0.2  | 3.2.0         |
| play24  | 2.4    | 1.3.12    | 0.13.8         | 2.10.6      | jdk8           | 3.0.5 3.1.x | 1.0.0 1.0.1/1.1.1 | 3.0.5      | 3.2.0         |
| play24  | 2.4    | 1.3.12    | 0.13.8         | 2.11.8      | jdk8           | 3.0.5 3.1.x | 1.0.0 1.0.1/1.1.1 | 3.0.5      | 3.2.0         |
| play25  | 2.5.12 | 1.3.12    | 0.13.8 0.13.11 | 2.11.7      | jdk8           | 3.1.x       | 2.0.2             | 4.0        | 3.2.0         |
|         |        |           |                |             |                |             |                   |            |               |
| last    | 2.5    | 1.3.12    | 0.13.13        | 2.11/2.12   | jdk9           | 3.1         | 2.0.2             | 4.0        | 4.0.0-alpha.6 |
