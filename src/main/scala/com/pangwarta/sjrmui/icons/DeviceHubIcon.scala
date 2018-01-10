package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DeviceHubIcon {

  @JSImport("material-ui-icons", "DeviceHub")
  @js.native
  private object RawComponent extends js.Object
  private val DeviceHub = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DeviceHub()
}

