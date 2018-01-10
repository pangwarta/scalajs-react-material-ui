package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsBluetoothIcon {

  @JSImport("material-ui-icons", "SettingsBluetooth")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsBluetooth = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsBluetooth()
}

