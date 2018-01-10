package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MotorcycleIcon {

  @JSImport("material-ui-icons", "Motorcycle")
  @js.native
  private object RawComponent extends js.Object
  private val Motorcycle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Motorcycle()
}

