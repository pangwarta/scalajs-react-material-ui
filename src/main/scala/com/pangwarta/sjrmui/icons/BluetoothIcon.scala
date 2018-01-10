package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BluetoothIcon {

  @JSImport("material-ui-icons", "Bluetooth")
  @js.native
  private object RawComponent extends js.Object
  private val Bluetooth = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Bluetooth()
}

