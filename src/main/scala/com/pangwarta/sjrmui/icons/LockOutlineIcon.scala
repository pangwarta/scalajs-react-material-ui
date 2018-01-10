package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LockOutlineIcon {

  @JSImport("material-ui-icons", "LockOutline")
  @js.native
  private object RawComponent extends js.Object
  private val LockOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LockOutline()
}

