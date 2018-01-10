package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CancelIcon {

  @JSImport("material-ui-icons", "Cancel")
  @js.native
  private object RawComponent extends js.Object
  private val Cancel = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Cancel()
}

