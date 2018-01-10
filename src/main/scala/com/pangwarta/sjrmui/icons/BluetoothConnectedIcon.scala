package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BluetoothConnectedIcon {

  @JSImport("material-ui-icons", "BluetoothConnected")
  @js.native
  private object RawComponent extends js.Object
  private val BluetoothConnected = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BluetoothConnected()
}

