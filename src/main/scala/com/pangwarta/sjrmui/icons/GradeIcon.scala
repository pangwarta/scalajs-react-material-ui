package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GradeIcon {

  @JSImport("material-ui-icons", "Grade")
  @js.native
  private object RawComponent extends js.Object
  private val Grade = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Grade()
}

