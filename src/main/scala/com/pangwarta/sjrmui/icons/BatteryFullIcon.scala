package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BatteryFullIcon {

  @JSImport("material-ui-icons", "BatteryFull")
  @js.native
  private object RawComponent extends js.Object
  private val BatteryFull = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BatteryFull()
}

