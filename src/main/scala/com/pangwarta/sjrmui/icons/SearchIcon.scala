package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SearchIcon {

  @JSImport("material-ui-icons", "Search")
  @js.native
  private object RawComponent extends js.Object
  private val Search = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Search()
}

