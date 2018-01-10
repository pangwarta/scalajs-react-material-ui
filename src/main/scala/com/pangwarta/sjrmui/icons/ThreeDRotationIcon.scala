package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ThreeDRotationIcon {

  @JSImport("material-ui-icons", "ThreeDRotation")
  @js.native
  private object RawComponent extends js.Object
  private val ThreeDRotation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ThreeDRotation()
}

