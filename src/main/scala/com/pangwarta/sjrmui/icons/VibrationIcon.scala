package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VibrationIcon {

  @JSImport("material-ui-icons", "Vibration")
  @js.native
  private object RawComponent extends js.Object
  private val Vibration = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Vibration()
}

