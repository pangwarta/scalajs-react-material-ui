package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewWeekIcon {

  @JSImport("material-ui-icons", "ViewWeek")
  @js.native
  private object RawComponent extends js.Object
  private val ViewWeek = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewWeek()
}

