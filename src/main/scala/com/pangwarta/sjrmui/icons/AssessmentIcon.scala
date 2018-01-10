package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AssessmentIcon {

  @JSImport("material-ui-icons", "Assessment")
  @js.native
  private object RawComponent extends js.Object
  private val Assessment = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Assessment()
}

