package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ImportantDevicesIcon {

  @JSImport("material-ui-icons", "ImportantDevices")
  @js.native
  private object RawComponent extends js.Object
  private val ImportantDevices = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ImportantDevices()
}

