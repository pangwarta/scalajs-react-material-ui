package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NoteIcon {

  @JSImport("material-ui-icons", "Note")
  @js.native
  private object RawComponent extends js.Object
  private val Note = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Note()
}

