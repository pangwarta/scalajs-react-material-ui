package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SpeakerNotesIcon {

  @JSImport("material-ui-icons", "SpeakerNotes")
  @js.native
  private object RawComponent extends js.Object
  private val SpeakerNotes = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SpeakerNotes()
}

