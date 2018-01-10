package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SwitchCameraIcon {

  @JSImport("material-ui-icons", "SwitchCamera")
  @js.native
  private object RawComponent extends js.Object
  private val SwitchCamera = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SwitchCamera()
}

