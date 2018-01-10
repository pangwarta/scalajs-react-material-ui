package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PowerInputIcon {

  @JSImport("material-ui-icons", "PowerInput")
  @js.native
  private object RawComponent extends js.Object
  private val PowerInput = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PowerInput()
}

