package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Reboot {

  @JSImport("material-ui", "Reboot")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var children: js.UndefOr[ReactElement] = js.native
  }

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(children: ReactElement) = {
    val p = js.Dynamic.literal(children = children).asInstanceOf[Props]
    this.component(p)
  }
}
