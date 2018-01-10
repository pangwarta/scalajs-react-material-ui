package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PieChartOutlinedIcon {

  @JSImport("material-ui-icons", "PieChartOutlined")
  @js.native
  private object RawComponent extends js.Object
  private val PieChartOutlined = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PieChartOutlined()
}

