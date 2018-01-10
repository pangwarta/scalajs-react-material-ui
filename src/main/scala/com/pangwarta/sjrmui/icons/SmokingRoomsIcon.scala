package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SmokingRoomsIcon {

  @JSImport("material-ui-icons", "SmokingRooms")
  @js.native
  private object RawComponent extends js.Object
  private val SmokingRooms = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SmokingRooms()
}

