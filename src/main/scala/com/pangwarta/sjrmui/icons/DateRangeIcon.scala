package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DateRangeIcon {

  @JSImport("material-ui-icons", "DateRange")
  @js.native
  private object RawComponent extends js.Object
  private val DateRange = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DateRange()
}

