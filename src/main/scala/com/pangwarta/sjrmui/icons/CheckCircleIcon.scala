package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CheckCircleIcon {

  @JSImport("material-ui-icons", "CheckCircle")
  @js.native
  private object RawComponent extends js.Object
  private val CheckCircle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CheckCircle()
}

