package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DockIcon {

  @JSImport("material-ui-icons", "Dock")
  @js.native
  private object RawComponent extends js.Object
  private val Dock = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Dock()
}

