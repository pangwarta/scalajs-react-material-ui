package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SubwayIcon {

  @JSImport("material-ui-icons", "Subway")
  @js.native
  private object RawComponent extends js.Object
  private val Subway = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Subway()
}

