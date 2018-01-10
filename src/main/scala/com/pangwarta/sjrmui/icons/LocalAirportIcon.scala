package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalAirportIcon {

  @JSImport("material-ui-icons", "LocalAirport")
  @js.native
  private object RawComponent extends js.Object
  private val LocalAirport = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalAirport()
}

