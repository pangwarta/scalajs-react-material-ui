package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MenuIcon {

  @JSImport("material-ui-icons", "Menu")
  @js.native
  private object RawComponent extends js.Object
  private val Menu = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Menu()
}

