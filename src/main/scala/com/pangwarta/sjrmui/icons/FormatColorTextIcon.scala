package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FormatColorTextIcon {

  @JSImport("material-ui-icons", "FormatColorText")
  @js.native
  private object RawComponent extends js.Object
  private val FormatColorText = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FormatColorText()
}

