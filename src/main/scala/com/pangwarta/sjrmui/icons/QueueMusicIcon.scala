package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object QueueMusicIcon {

  @JSImport("material-ui-icons", "QueueMusic")
  @js.native
  private object RawComponent extends js.Object
  private val QueueMusic = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = QueueMusic()
}

