package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GamepadIcon {

  @JSImport("material-ui-icons", "Gamepad")
  @js.native
  private object RawComponent extends js.Object
  private val Gamepad = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Gamepad()
}

