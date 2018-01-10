package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CameraRollIcon {

  @JSImport("material-ui-icons", "CameraRoll")
  @js.native
  private object RawComponent extends js.Object
  private val CameraRoll = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CameraRoll()
}

