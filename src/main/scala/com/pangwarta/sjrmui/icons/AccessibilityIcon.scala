package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AccessibilityIcon {

  @JSImport("material-ui-icons", "Accessibility")
  @js.native
  private object RawComponent extends js.Object
  private val Accessibility = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Accessibility()
}

