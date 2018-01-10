package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HomeIcon {

  @JSImport("material-ui-icons", "Home")
  @js.native
  private object RawComponent extends js.Object
  private val Home = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Home()
}

