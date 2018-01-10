package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardReturnIcon {

  @JSImport("material-ui-icons", "KeyboardReturn")
  @js.native
  private object RawComponent extends js.Object
  private val KeyboardReturn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = KeyboardReturn()
}

