package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DeveloperBoardIcon {

  @JSImport("material-ui-icons", "DeveloperBoard")
  @js.native
  private object RawComponent extends js.Object
  private val DeveloperBoard = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DeveloperBoard()
}

