package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ControlPointIcon {

  @JSImport("material-ui-icons", "ControlPoint")
  @js.native
  private object RawComponent extends js.Object
  private val ControlPoint = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ControlPoint()
}

