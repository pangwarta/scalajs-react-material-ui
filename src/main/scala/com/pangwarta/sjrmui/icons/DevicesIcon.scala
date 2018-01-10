package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DevicesIcon {

  @JSImport("material-ui-icons", "Devices")
  @js.native
  private object RawComponent extends js.Object
  private val Devices = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Devices()
}

