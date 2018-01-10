package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MusicNoteIcon {

  @JSImport("material-ui-icons", "MusicNote")
  @js.native
  private object RawComponent extends js.Object
  private val MusicNote = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MusicNote()
}

