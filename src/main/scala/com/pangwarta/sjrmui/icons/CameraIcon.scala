package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CameraIcon {

  @JSImport("material-ui-icons", "Camera")
  @js.native
  private object RawComponent extends js.Object
  private val Camera = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Camera()
}

