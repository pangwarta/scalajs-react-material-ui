package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardIcon {

  @JSImport("material-ui-icons", "Keyboard")
  @js.native
  private object RawComponent extends js.Object
  private val Keyboard = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Keyboard()
}

