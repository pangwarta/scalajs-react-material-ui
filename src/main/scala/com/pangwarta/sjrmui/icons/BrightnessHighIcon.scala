package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BrightnessHighIcon {

  @JSImport("material-ui-icons", "BrightnessHigh")
  @js.native
  private object RawComponent extends js.Object
  private val BrightnessHigh = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BrightnessHigh()
}

