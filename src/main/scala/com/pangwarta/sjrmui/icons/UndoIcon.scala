package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object UndoIcon {

  @JSImport("material-ui-icons", "Undo")
  @js.native
  private object RawComponent extends js.Object
  private val Undo = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Undo()
}

