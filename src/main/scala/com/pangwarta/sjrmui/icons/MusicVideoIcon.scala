package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MusicVideoIcon {

  @JSImport("material-ui-icons", "MusicVideo")
  @js.native
  private object RawComponent extends js.Object
  private val MusicVideo = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MusicVideo()
}

