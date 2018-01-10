package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RadioButtonCheckedIcon {

  @JSImport("material-ui-icons", "RadioButtonChecked")
  @js.native
  private object RawComponent extends js.Object
  private val RadioButtonChecked = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RadioButtonChecked()
}

