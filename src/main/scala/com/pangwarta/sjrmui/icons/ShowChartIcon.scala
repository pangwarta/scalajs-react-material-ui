package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ShowChartIcon {

  @JSImport("material-ui-icons", "ShowChart")
  @js.native
  private object RawComponent extends js.Object
  private val ShowChart = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ShowChart()
}

