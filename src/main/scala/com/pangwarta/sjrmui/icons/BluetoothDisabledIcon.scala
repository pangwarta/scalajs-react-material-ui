package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BluetoothDisabledIcon {

  @JSImport("material-ui-icons", "BluetoothDisabled")
  @js.native
  private object RawComponent extends js.Object
  private val BluetoothDisabled = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BluetoothDisabled()
}

