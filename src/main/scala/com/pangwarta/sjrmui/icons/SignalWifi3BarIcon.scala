package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SignalWifi3BarIcon {

  @JSImport("material-ui-icons", "SignalWifi3Bar")
  @js.native
  private object RawComponent extends js.Object
  private val SignalWifi3Bar = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SignalWifi3Bar()
}

