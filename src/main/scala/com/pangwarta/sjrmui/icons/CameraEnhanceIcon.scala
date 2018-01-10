package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CameraEnhanceIcon {

  @JSImport("material-ui-icons", "CameraEnhance")
  @js.native
  private object RawComponent extends js.Object
  private val CameraEnhance = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CameraEnhance()
}

