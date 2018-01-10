package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DashboardIcon {

  @JSImport("material-ui-icons", "Dashboard")
  @js.native
  private object RawComponent extends js.Object
  private val Dashboard = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Dashboard()
}

