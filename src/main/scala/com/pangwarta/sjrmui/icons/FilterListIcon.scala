package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FilterListIcon {

  @JSImport("material-ui-icons", "FilterList")
  @js.native
  private object RawComponent extends js.Object
  private val FilterList = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FilterList()
}

