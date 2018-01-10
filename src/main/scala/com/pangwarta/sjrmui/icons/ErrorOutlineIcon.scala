package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ErrorOutlineIcon {

  @JSImport("material-ui-icons", "ErrorOutline")
  @js.native
  private object RawComponent extends js.Object
  private val ErrorOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ErrorOutline()
}

