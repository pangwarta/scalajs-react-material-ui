package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VideoCallIcon {

  @JSImport("material-ui-icons", "VideoCall")
  @js.native
  private object RawComponent extends js.Object
  private val VideoCall = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VideoCall()
}

