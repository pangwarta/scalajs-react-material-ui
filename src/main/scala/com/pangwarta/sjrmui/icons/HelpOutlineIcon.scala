package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HelpOutlineIcon {

  @JSImport("material-ui-icons", "HelpOutline")
  @js.native
  private object RawComponent extends js.Object
  private val HelpOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HelpOutline()
}

