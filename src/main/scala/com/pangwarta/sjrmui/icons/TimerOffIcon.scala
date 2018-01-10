package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TimerOffIcon {

  @JSImport("material-ui-icons", "TimerOff")
  @js.native
  private object RawComponent extends js.Object
  private val TimerOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TimerOff()
}

