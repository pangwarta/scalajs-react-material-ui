package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BugReportIcon {

  @JSImport("material-ui-icons", "BugReport")
  @js.native
  private object RawComponent extends js.Object
  private val BugReport = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BugReport()
}

