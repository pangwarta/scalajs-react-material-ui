package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AssignmentIcon {

  @JSImport("material-ui-icons", "Assignment")
  @js.native
  private object RawComponent extends js.Object
  private val Assignment = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Assignment()
}

