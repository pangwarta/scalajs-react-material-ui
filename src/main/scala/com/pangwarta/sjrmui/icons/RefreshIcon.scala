package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RefreshIcon {

  @JSImport("material-ui-icons", "Refresh")
  @js.native
  private object RawComponent extends js.Object
  private val Refresh = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Refresh()
}

