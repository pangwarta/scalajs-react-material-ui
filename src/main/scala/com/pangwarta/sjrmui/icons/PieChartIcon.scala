package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PieChartIcon {

  @JSImport("material-ui-icons", "PieChart")
  @js.native
  private object RawComponent extends js.Object
  private val PieChart = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PieChart()
}

