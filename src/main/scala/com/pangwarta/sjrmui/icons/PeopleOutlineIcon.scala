package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PeopleOutlineIcon {

  @JSImport("material-ui-icons", "PeopleOutline")
  @js.native
  private object RawComponent extends js.Object
  private val PeopleOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PeopleOutline()
}

