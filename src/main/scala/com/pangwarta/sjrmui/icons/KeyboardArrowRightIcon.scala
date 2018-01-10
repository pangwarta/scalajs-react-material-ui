package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardArrowRightIcon {

  @JSImport("material-ui-icons", "KeyboardArrowRight")
  @js.native
  private object RawComponent extends js.Object
  private val KeyboardArrowRight = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = KeyboardArrowRight()
}

