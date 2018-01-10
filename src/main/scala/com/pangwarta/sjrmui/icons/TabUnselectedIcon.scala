package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TabUnselectedIcon {

  @JSImport("material-ui-icons", "TabUnselected")
  @js.native
  private object RawComponent extends js.Object
  private val TabUnselected = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TabUnselected()
}

