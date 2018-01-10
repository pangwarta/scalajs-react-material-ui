package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlightLandIcon {

  @JSImport("material-ui-icons", "FlightLand")
  @js.native
  private object RawComponent extends js.Object
  private val FlightLand = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlightLand()
}

