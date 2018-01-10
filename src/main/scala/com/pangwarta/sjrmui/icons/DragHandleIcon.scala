package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DragHandleIcon {

  @JSImport("material-ui-icons", "DragHandle")
  @js.native
  private object RawComponent extends js.Object
  private val DragHandle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DragHandle()
}

