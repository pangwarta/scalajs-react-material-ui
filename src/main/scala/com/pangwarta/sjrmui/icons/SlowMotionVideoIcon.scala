package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SlowMotionVideoIcon {

  @JSImport("material-ui-icons", "SlowMotionVideo")
  @js.native
  private object RawComponent extends js.Object
  private val SlowMotionVideo = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SlowMotionVideo()
}

