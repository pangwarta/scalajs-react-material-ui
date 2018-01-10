package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WrapTextIcon {

  @JSImport("material-ui-icons", "WrapText")
  @js.native
  private object RawComponent extends js.Object
  private val WrapText = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = WrapText()
}

