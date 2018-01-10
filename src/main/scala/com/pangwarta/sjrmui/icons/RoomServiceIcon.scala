package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RoomServiceIcon {

  @JSImport("material-ui-icons", "RoomService")
  @js.native
  private object RawComponent extends js.Object
  private val RoomService = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RoomService()
}

