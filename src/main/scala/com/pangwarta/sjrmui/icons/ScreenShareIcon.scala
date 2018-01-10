package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ScreenShareIcon {

  @JSImport("material-ui-icons", "ScreenShare")
  @js.native
  private object RawComponent extends js.Object
  private val ScreenShare = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ScreenShare()
}

