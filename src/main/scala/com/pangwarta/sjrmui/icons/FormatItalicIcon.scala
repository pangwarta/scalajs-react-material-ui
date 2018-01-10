package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FormatItalicIcon {

  @JSImport("material-ui-icons", "FormatItalic")
  @js.native
  private object RawComponent extends js.Object
  private val FormatItalic = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FormatItalic()
}

