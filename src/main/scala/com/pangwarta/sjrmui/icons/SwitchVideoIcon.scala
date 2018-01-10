package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SwitchVideoIcon {

  @JSImport("material-ui-icons", "SwitchVideo")
  @js.native
  private object RawComponent extends js.Object
  private val SwitchVideo = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SwitchVideo()
}

