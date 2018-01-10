package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ReorderIcon {

  @JSImport("material-ui-icons", "Reorder")
  @js.native
  private object RawComponent extends js.Object
  private val Reorder = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Reorder()
}

