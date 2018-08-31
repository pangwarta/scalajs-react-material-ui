# ScalaJS React Material UI (version 0.2.0-SNAPSHOT)

[scalajs-react](https://github.com/japgolly/scalajs-react) wrappers for [Material-UI 3.0.1](material-ui-next.com) 
components.

## Getting Started

Wrappers are in "./src/main/scala/com/pangwarta/sjrmui".

An example project is in the "example" folder. To compile, run `example/fastOptJS` in SBT. When developing the example, 
run `example/fastOptJS::startWebpackDevServer` in SBT. That opens the project within the default web browser. For 
faster dev cycles run `~example/fastOptJS`. When done, run `example/fastOptJS::stopWebpackDevServer` to shut
down the Webpack DevServer. 

These wrappers are very much pre-alpha, haven't been heavily tested yet, and are subject to change.

### Prerequisites

- sbt
- NodeJS with npm installed

## Contributing

* Add missing wrappers.
* Test them by using them in the example project.
* Improve the example project.
* Add automated tests.
* Copying Material UI props comments as Scaladoc comments to all the `def apply` methods.
* Fix bugs. 

## Roadmap

We'd like to include typed theming. So far the theming is pretty much  We've had some trouble trying to 

Eventually, we would like this library to contribute to 
[scalajs-react components](https://github.com/chandu0101/scalajs-react-components) or forks thereof, which still wraps 
the old version of the Material UI library. With this in mind, as Material UI 1.0.0 releases, we are looking to use 
Scala macros to clean up the wrappers and eventually share the same code style with the rest of scalajs-react 
components.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the 
[tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Zachary Albia** - *Initial work* - [zach-albia](https://github.com/zach-albia)
* **Kent Dun Lagaras** - [kentdunlagaras](https://github.com/kentdunlagaras)

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details
