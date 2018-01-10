package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WidgetsIcon {

  @JSImport("material-ui-icons", "Widgets")
  @js.native
  private object RawComponent extends js.Object
  private val Widgets = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Widgets()
}

