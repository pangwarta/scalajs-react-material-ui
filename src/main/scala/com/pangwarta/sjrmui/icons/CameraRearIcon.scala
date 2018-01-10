package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CameraRearIcon {

  @JSImport("material-ui-icons", "CameraRear")
  @js.native
  private object RawComponent extends js.Object
  private val CameraRear = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CameraRear()
}

