package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EditLocationIcon {

  @JSImport("material-ui-icons", "EditLocation")
  @js.native
  private object RawComponent extends js.Object
  private val EditLocation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = EditLocation()
}

