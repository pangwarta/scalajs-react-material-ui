package example

import scalacss.DevDefaults._

object example extends StyleSheet.Inline {
  import dsl._

  val avatar = style(
    width(128.px),
    height(128.px))

  val upperMargin = style(
    marginTop(80.px))
}
