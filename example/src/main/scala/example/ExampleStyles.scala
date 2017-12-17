package example

import scalacss.DevDefaults._

object ExampleStyles extends StyleSheet.Inline {
  import dsl._

  val avatar = style(
    width(128.px),
    height(128.px))

  val badge = style(
    width(48.px),
    height(48.px))

  val margin = style(
    marginTop(80.px),
    marginLeft(16.px),
    marginRight(16.px))

  val paper = style(
    marginTop(16.px),
    marginBottom(16.px),
    padding(8.px))

  val paperShadow2 = style(
    boxShadow := "0px 1px 5px 0px rgba(255, 0, 0, 0.2), 0px 2px 2px 0px rgba(255, 0, 0, 0.14), 0px 3px 1px -2px rgba(255, 0, 0, 0.12)")
}
