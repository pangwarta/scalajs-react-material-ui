package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RadioButtonUncheckedIcon {

  @JSImport("material-ui-icons", "RadioButtonUnchecked")
  @js.native
  private object RawComponent extends js.Object
  private val RadioButtonUnchecked = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RadioButtonUnchecked()
}

