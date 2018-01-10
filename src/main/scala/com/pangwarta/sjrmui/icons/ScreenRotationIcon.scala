package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ScreenRotationIcon {

  @JSImport("material-ui-icons", "ScreenRotation")
  @js.native
  private object RawComponent extends js.Object
  private val ScreenRotation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ScreenRotation()
}

