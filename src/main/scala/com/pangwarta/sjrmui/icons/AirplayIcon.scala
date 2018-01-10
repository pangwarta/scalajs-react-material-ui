package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AirplayIcon {

  @JSImport("material-ui-icons", "Airplay")
  @js.native
  private object RawComponent extends js.Object
  private val Airplay = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Airplay()
}

