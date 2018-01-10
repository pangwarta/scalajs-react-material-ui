package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TodayIcon {

  @JSImport("material-ui-icons", "Today")
  @js.native
  private object RawComponent extends js.Object
  private val Today = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Today()
}

