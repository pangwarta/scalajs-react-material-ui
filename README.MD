# ScalaJS React Material UI (version 0.1.0-SNAPSHOT)

[scalajs-react](https://github.com/japgolly/scalajs-react) wrappers for [Material-UI 1.0.0 beta](material-ui-next.com) components

## Getting Started

Wrappers are in "./src/main/scala/com/pangwarta/sjrmui".

An example project is in the "example" folder. To compile, run `example/fastOptJS` in SBT. When developing the example, run `example/fastOptJS::startWebpackDevServer` in SBT for faster dev cycles when running `example/fastOptJS` each time you make changes to the project. When done, run `example/fastOptJS::stopWebpackDevServer`. 

These wrappers are very much pre-alpha, haven't been heavily tested yet, and are subject to change as Material UI itself stabilizes towards version 1.0.0.

### Prerequisites

- sbt 1.0.0+
- Scala 2.12.4+
- NodeJS 8.9.1+
- Yarn 1.3.2+

## Contributing

Add missing wrappers. Test them by using them in the example project. Improve the example project. Add automated tests. Fix bugs.

## Roadmap

Eventually, we would like this library to contribute to [scalajs-react components](https://github.com/chandu0101/scalajs-react-components) or forks thereof, which still wraps the old version of the Material UI library. With this in mind, as Material UI 1.0.0 releases, we are looking to use Scala macros to clean up the wrappers and eventually share the same code style with the rest of scalajs-react components.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Zachary Albia** - *Initial work* - [zach-albia](https://github.com/zach-albia)
* **Kent Dun Lagaras** - [kentdunlagaras](https://github.com/kentdunlagaras)

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details
