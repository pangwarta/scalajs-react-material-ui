package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NavigationIcon {

  @JSImport("material-ui-icons", "Navigation")
  @js.native
  private object RawComponent extends js.Object
  private val Navigation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Navigation()
}

