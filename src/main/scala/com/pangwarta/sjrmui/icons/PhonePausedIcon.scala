package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhonePausedIcon {

  @JSImport("material-ui-icons", "PhonePaused")
  @js.native
  private object RawComponent extends js.Object
  private val PhonePaused = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhonePaused()
}

