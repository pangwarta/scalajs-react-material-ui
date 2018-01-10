package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HistoryIcon {

  @JSImport("material-ui-icons", "History")
  @js.native
  private object RawComponent extends js.Object
  private val History = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = History()
}

