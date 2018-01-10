package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GolfCourseIcon {

  @JSImport("material-ui-icons", "GolfCourse")
  @js.native
  private object RawComponent extends js.Object
  private val GolfCourse = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = GolfCourse()
}

