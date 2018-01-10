package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ArrowDropDownIcon {

  @JSImport("material-ui-icons", "ArrowDropDown")
  @js.native
  private object RawComponent extends js.Object
  private val ArrowDropDown = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ArrowDropDown()
}

