package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardHideIcon {

  @JSImport("material-ui-icons", "KeyboardHide")
  @js.native
  private object RawComponent extends js.Object
  private val KeyboardHide = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = KeyboardHide()
}

