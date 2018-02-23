package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiThemeProvider {

  @JSImport("material-ui", "MuiThemeProvider")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var disableStylesGeneration: js.UndefOr[Boolean] = js.native
    var sheetsManager: js.UndefOr[js.Object] = js.native
    var theme: js.Object = js.native
  }

  private def props(
      disableStylesGeneration: js.UndefOr[Boolean],
      sheetsManager:           js.UndefOr[js.Object],
      theme:                   js.UndefOr[js.Object]
  ): Props = {
    val p = js.Dynamic.literal(theme = theme)
    disableStylesGeneration.foreach(p.updateDynamic("disableStylesGeneration")(_))
    sheetsManager.foreach(p.updateDynamic("sheetsManager")(_))
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      disableStylesGeneration: js.UndefOr[Boolean],
      sheetsManager:           js.UndefOr[js.Object],
      theme:                   js.UndefOr[js.Object]
  )(children: VdomNode*) = {
    val p = props(
      disableStylesGeneration,
      sheetsManager,
      theme
    )
    this.component(p)(children: _*)
  }
}
