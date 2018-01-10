package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BackspaceIcon {

  @JSImport("material-ui-icons", "Backspace")
  @js.native
  private object RawComponent extends js.Object
  private val Backspace = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Backspace()
}

