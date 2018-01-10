package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SortIcon {

  @JSImport("material-ui-icons", "Sort")
  @js.native
  private object RawComponent extends js.Object
  private val Sort = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Sort()
}

