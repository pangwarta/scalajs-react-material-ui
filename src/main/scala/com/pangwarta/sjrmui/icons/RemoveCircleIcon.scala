package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RemoveCircleIcon {

  @JSImport("material-ui-icons", "RemoveCircle")
  @js.native
  private object RawComponent extends js.Object
  private val RemoveCircle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RemoveCircle()
}

