package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SignalWifiOffIcon {

  @JSImport("material-ui-icons", "SignalWifiOff")
  @js.native
  private object RawComponent extends js.Object
  private val SignalWifiOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SignalWifiOff()
}

