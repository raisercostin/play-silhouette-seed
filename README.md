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
* Password reset/change functionality
* Account activation functionality
* Email sending and auth token cleanup
* [Security headers](https://www.playframework.com/documentation/2.4.x/SecurityHeaders)
* [CSRF Protection](https://www.playframework.com/documentation/2.4.x/ScalaCsrf)
* play-slick database access

## Documentation

Consult the [Silhouette documentation](http://silhouette.mohiva.com/docs) for more information. If you need help with the integration of Silhouette into your project, don't hesitate and ask questions in our [mailing list](https://groups.google.com/forum/#!forum/play-silhouette) or on [Stack Overflow](http://stackoverflow.com/questions/tagged/playframework).

### Slick

The template stores all authentication information in a database via [Slick](http://slick.typesafe.com/) It uses an in memory [H2](www.h2database.com/) database by default.

In order to use another database supported by Slick, you need to change the driver in your application.conf and add the corresponding JDBC driver to your dependencies. The [Play Slick documentation](https://www.playframework.com/documentation/2.4.x/PlaySlick) has more information about database configuration.

## Activator

This project template is also
[hosted at typesafe](https://typesafe.com/activator/template/play-silhouette-slick-seed).

# License

The code is licensed under [Apache License v2.0](http://www.apache.org/licenses/LICENSE-2.0).

# Rationale

## The plan

Adding authorization in your web-app should be simple.
Following Convention over Configuration strategy you should be able to get something working in several steps:

1. Just work - Import a library and configuring some properties.
2. Change UI - You should be able to override some UI styling aspects and the master layout of the authorization related pages.
3. Choose another UI - Maybe you want to switch to templates or angularjs UI
4. Choose another persistence - To use a database layer that you already have.

## Roadmap

- [done] Create a *multiproject* layout to simplify integration of features developed in different forks: persistance and presentation.
- [in progress] Clarify current features in the forks ecosystem - almost done
- Extract silhouette-persistence in a separate library. Looks like silhouette-4.x already does this?
- Extract silhouette-persistence implementations in separate libraries:
  - in memory
  - slick in memory
  - slick with h2 in memory - good for testing the schema and upgrades
  - slick with h2 in file - good for testing
  - slick with mysql
  - slick with postgresql
  - mongodb
- Extract silhouette-backend in a separate library. This can be reused without visualy impacting any project.
- Extract silhouette-presentation implementations in separate libraries:
  - based on templates
  - based on angularjs

## Tags

There are multiple working tags/branches that contain various features.

### Single project seeds
* play-2.2--singleproject--silhouette-0.9
* play-2.3--singleproject--silhouette-1.0
* play-2.3--singleproject--silhouette-2.0
* play-2.3--singleproject--silhouette-2.0--slick-2.0
* play-2.4--singleproject--silhouette-3.0
* play-2.5--singleproject--silhouette-4.0

### Multi project seeds
* play-2.2--multiproject--silhouette-0.9
* play-2.3--multiproject--silhouette-1.0
* play-2.3--multiproject--silhouette-2.0
* play-2.3--multiproject--silhouette-2.0--slick-2.0
* play-2.4--multiproject--silhouette-3.0
* play-2.4--multiproject--silhouette-3.0--slick-2.0-tag
* play-2.5--multiproject--silhouette-4.0
* play-2.5--multiproject--silhouette-4.0--slick-3.0

## Dependencies

| seed | library  | play   | activator | sbt            | scala       | jdk            | slick       | slick plugin      | silhouette | bootstrap     |
|------|----------|--------|-----------|----------------|-------------|----------------|-------------|-------------------|------------|---------------|
| 1.0  | play23   | 2.3    | 1.3.2     | 0.13.8         | 2.10 2.11   | jdk6/jdk7/jdk8 | 2.0.0       | 0.7.0             | 1.0/2.0.2  | 3.2.0         |
| 3.0  | play24   | 2.4    | 1.3.12    | 0.13.8         | 2.10 2.11.6 | jdk8           | 3.0.5 3.1.x | 1.0.0 1.0.1/1.1.1 | 3.0.5      | 3.2.0         |
| 4.0  | play25   | 2.5.4  | 1.3.12    | 0.13.8 0.13.11 | 2.11.7      | jdk8           | 3.1.0       | 2.0.2             | 4.0.0      | 3.2.0         |
|      |          |        |           |                |             |                |             |                   |            |               |
| -    | play-2.6 | 2.5.12 | 1.3.12    | 0.13.13        | 2.11/2.12   | jdk9           | 3.1         | 2.0.2             | 4.0        | 4.0.0-alpha.6 |
