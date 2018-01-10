package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FiberPinIcon {

  @JSImport("material-ui-icons", "FiberPin")
  @js.native
  private object RawComponent extends js.Object
  private val FiberPin = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FiberPin()
}

