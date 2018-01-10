package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FormatListNumberedIcon {

  @JSImport("material-ui-icons", "FormatListNumbered")
  @js.native
  private object RawComponent extends js.Object
  private val FormatListNumbered = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FormatListNumbered()
}

