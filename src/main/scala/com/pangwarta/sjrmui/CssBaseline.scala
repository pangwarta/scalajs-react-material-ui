package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CssBaseline {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(children: ReactElement) = {
    val p = js.Dynamic.literal(children = children).asInstanceOf[Props]
    this.component(p)
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var children: js.UndefOr[ReactElement] = js.native
  }

  @JSImport("@material-ui/core", "CssBaseline")
  @js.native
  private object RawComponent extends js.Object
}
