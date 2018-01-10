package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LiveHelpIcon {

  @JSImport("material-ui-icons", "LiveHelp")
  @js.native
  private object RawComponent extends js.Object
  private val LiveHelp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LiveHelp()
}

