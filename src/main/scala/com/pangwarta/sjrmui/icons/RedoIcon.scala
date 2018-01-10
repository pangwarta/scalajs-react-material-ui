package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RedoIcon {

  @JSImport("material-ui-icons", "Redo")
  @js.native
  private object RawComponent extends js.Object
  private val Redo = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Redo()
}

