package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TouchAppIcon {

  @JSImport("material-ui-icons", "TouchApp")
  @js.native
  private object RawComponent extends js.Object
  private val TouchApp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TouchApp()
}

