package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HotelIcon {

  @JSImport("material-ui-icons", "Hotel")
  @js.native
  private object RawComponent extends js.Object
  private val Hotel = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Hotel()
}

