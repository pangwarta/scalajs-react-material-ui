package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EventNoteIcon {

  @JSImport("material-ui-icons", "EventNote")
  @js.native
  private object RawComponent extends js.Object
  private val EventNote = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = EventNote()
}

