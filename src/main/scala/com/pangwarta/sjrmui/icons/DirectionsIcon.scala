package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DirectionsIcon {

  @JSImport("material-ui-icons", "Directions")
  @js.native
  private object RawComponent extends js.Object
  private val Directions = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Directions()
}

