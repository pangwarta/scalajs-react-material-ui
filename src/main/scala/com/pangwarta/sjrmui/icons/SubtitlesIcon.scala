package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SubtitlesIcon {

  @JSImport("material-ui-icons", "Subtitles")
  @js.native
  private object RawComponent extends js.Object
  private val Subtitles = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Subtitles()
}

