package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SignalWifi2BarIcon {

  @JSImport("material-ui-icons", "SignalWifi2Bar")
  @js.native
  private object RawComponent extends js.Object
  private val SignalWifi2Bar = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SignalWifi2Bar()
}

