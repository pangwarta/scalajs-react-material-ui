package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NetworkWifiIcon {

  @JSImport("material-ui-icons", "NetworkWifi")
  @js.native
  private object RawComponent extends js.Object
  private val NetworkWifi = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NetworkWifi()
}

