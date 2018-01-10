package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VolumeMuteIcon {

  @JSImport("material-ui-icons", "VolumeMute")
  @js.native
  private object RawComponent extends js.Object
  private val VolumeMute = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VolumeMute()
}

