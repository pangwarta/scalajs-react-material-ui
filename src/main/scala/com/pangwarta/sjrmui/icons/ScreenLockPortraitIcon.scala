package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ScreenLockPortraitIcon {

  @JSImport("material-ui-icons", "ScreenLockPortrait")
  @js.native
  private object RawComponent extends js.Object
  private val ScreenLockPortrait = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ScreenLockPortrait()
}

