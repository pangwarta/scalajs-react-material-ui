package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BrightnessAutoIcon {

  @JSImport("material-ui-icons", "BrightnessAuto")
  @js.native
  private object RawComponent extends js.Object
  private val BrightnessAuto = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BrightnessAuto()
}

