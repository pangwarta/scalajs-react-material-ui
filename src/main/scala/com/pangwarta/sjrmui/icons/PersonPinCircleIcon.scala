package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PersonPinCircleIcon {

  @JSImport("material-ui-icons", "PersonPinCircle")
  @js.native
  private object RawComponent extends js.Object
  private val PersonPinCircle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PersonPinCircle()
}

