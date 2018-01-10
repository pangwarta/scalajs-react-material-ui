package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlightIcon {

  @JSImport("material-ui-icons", "Flight")
  @js.native
  private object RawComponent extends js.Object
  private val Flight = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Flight()
}

