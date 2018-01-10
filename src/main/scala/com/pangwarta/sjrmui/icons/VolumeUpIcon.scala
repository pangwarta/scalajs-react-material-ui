package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VolumeUpIcon {

  @JSImport("material-ui-icons", "VolumeUp")
  @js.native
  private object RawComponent extends js.Object
  private val VolumeUp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VolumeUp()
}

