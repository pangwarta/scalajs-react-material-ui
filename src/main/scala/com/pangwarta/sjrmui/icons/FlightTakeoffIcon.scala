package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlightTakeoffIcon {

  @JSImport("material-ui-icons", "FlightTakeoff")
  @js.native
  private object RawComponent extends js.Object
  private val FlightTakeoff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlightTakeoff()
}

