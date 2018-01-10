package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VolumeOffIcon {

  @JSImport("material-ui-icons", "VolumeOff")
  @js.native
  private object RawComponent extends js.Object
  private val VolumeOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VolumeOff()
}

