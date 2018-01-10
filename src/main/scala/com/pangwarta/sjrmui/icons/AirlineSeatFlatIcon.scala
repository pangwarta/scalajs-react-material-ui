package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AirlineSeatFlatIcon {

  @JSImport("material-ui-icons", "AirlineSeatFlat")
  @js.native
  private object RawComponent extends js.Object
  private val AirlineSeatFlat = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AirlineSeatFlat()
}

