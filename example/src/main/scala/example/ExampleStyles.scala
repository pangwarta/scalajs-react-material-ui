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
}
