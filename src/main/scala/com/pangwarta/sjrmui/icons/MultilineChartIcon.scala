package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MultilineChartIcon {

  @JSImport("material-ui-icons", "MultilineChart")
  @js.native
  private object RawComponent extends js.Object
  private val MultilineChart = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MultilineChart()
}

