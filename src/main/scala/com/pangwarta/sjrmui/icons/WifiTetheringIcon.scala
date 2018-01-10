package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WifiTetheringIcon {

  @JSImport("material-ui-icons", "WifiTethering")
  @js.native
  private object RawComponent extends js.Object
  private val WifiTethering = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = WifiTethering()
}

