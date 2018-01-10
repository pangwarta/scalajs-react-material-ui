package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WarningIcon {

  @JSImport("material-ui-icons", "Warning")
  @js.native
  private object RawComponent extends js.Object
  private val Warning = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Warning()
}

