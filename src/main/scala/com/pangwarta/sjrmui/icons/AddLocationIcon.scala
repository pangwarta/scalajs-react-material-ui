package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AddLocationIcon {

  @JSImport("material-ui-icons", "AddLocation")
  @js.native
  private object RawComponent extends js.Object
  private val AddLocation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AddLocation()
}

