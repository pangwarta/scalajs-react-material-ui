package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TimerIcon {

  @JSImport("material-ui-icons", "Timer")
  @js.native
  private object RawComponent extends js.Object
  private val Timer = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Timer()
}

