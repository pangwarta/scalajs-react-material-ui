package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ScreenLockRotationIcon {

  @JSImport("material-ui-icons", "ScreenLockRotation")
  @js.native
  private object RawComponent extends js.Object
  private val ScreenLockRotation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ScreenLockRotation()
}

