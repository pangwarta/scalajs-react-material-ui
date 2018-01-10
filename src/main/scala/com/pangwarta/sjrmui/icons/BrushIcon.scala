package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BrushIcon {

  @JSImport("material-ui-icons", "Brush")
  @js.native
  private object RawComponent extends js.Object
  private val Brush = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Brush()
}

