package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BubbleChartIcon {

  @JSImport("material-ui-icons", "BubbleChart")
  @js.native
  private object RawComponent extends js.Object
  private val BubbleChart = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BubbleChart()
}

