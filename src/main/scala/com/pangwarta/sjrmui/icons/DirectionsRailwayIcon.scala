package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DirectionsRailwayIcon {

  @JSImport("material-ui-icons", "DirectionsRailway")
  @js.native
  private object RawComponent extends js.Object
  private val DirectionsRailway = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DirectionsRailway()
}

