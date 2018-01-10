package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EvStationIcon {

  @JSImport("material-ui-icons", "EvStation")
  @js.native
  private object RawComponent extends js.Object
  private val EvStation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = EvStation()
}

