package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GpsOffIcon {

  @JSImport("material-ui-icons", "GpsOff")
  @js.native
  private object RawComponent extends js.Object
  private val GpsOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = GpsOff()
}

