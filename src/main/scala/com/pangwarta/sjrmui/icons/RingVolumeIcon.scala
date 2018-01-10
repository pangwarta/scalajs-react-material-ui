package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RingVolumeIcon {

  @JSImport("material-ui-icons", "RingVolume")
  @js.native
  private object RawComponent extends js.Object
  private val RingVolume = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RingVolume()
}

