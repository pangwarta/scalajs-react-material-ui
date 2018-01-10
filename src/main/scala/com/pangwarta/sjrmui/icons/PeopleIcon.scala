package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PeopleIcon {

  @JSImport("material-ui-icons", "People")
  @js.native
  private object RawComponent extends js.Object
  private val People = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = People()
}

