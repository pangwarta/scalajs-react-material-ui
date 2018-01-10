package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChangeHistoryIcon {

  @JSImport("material-ui-icons", "ChangeHistory")
  @js.native
  private object RawComponent extends js.Object
  private val ChangeHistory = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChangeHistory()
}

