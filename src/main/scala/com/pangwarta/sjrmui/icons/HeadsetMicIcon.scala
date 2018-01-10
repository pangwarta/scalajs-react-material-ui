package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HeadsetMicIcon {

  @JSImport("material-ui-icons", "HeadsetMic")
  @js.native
  private object RawComponent extends js.Object
  private val HeadsetMic = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HeadsetMic()
}

