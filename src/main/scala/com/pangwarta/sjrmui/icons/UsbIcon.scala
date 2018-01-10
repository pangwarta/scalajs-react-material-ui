package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object UsbIcon {

  @JSImport("material-ui-icons", "Usb")
  @js.native
  private object RawComponent extends js.Object
  private val Usb = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Usb()
}

