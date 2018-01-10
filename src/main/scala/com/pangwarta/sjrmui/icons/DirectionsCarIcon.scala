package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DirectionsCarIcon {

  @JSImport("material-ui-icons", "DirectionsCar")
  @js.native
  private object RawComponent extends js.Object
  private val DirectionsCar = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DirectionsCar()
}

