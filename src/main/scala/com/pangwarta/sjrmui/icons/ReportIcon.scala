package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ReportIcon {

  @JSImport("material-ui-icons", "Report")
  @js.native
  private object RawComponent extends js.Object
  private val Report = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Report()
}

