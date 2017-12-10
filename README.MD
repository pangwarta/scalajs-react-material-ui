# ScalaJS React Material UI (version 0.0.0)

[scalajs-react](https://github.com/japgolly/scalajs-react) wrappers for [Material-UI 1.0.x beta](material-ui-next.com) components

## Getting Started

Wrappers are in "./src/main/scala/com/github/zachalbia/sjrmui".

An example project is in the "example" folder. To compile, run `example/fastOptJS` in SBT. When developing the example, run `example/fastOptJS::startWebpackDevServer` in SBT for faster dev cycles when running `example/fastOptJS` each time you make changes to the project. When done, run `example/fastOptJS::stopWebpackDevServer`. 

### Prerequisites

- sbt 1.0.0+
- Scala 2.12.4+
- NodeJS 8.9.1+
- Yarn 1.3.2+

## Contributing

Add more wrappers. Test them by using them in the example project.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Zachary Albia** - *Initial work* - [ZachAlbia](https://github.com/ZachAlbia)

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details
