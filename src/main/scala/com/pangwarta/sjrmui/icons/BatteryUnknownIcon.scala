package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BatteryUnknownIcon {

  @JSImport("material-ui-icons", "BatteryUnknown")
  @js.native
  private object RawComponent extends js.Object
  private val BatteryUnknown = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BatteryUnknown()
}

