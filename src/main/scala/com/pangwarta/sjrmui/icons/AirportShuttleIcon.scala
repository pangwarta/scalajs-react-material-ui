package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AirportShuttleIcon {

  @JSImport("material-ui-icons", "AirportShuttle")
  @js.native
  private object RawComponent extends js.Object
  private val AirportShuttle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AirportShuttle()
}

