package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardArrowUpIcon {

  @JSImport("material-ui-icons", "KeyboardArrowUp")
  @js.native
  private object RawComponent extends js.Object
  private val KeyboardArrowUp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = KeyboardArrowUp()
}

