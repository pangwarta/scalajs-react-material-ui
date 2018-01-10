package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardBackspaceIcon {

  @JSImport("material-ui-icons", "KeyboardBackspace")
  @js.native
  private object RawComponent extends js.Object
  private val KeyboardBackspace = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = KeyboardBackspace()
}

