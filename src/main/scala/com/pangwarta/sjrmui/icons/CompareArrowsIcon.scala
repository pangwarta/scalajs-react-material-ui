package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CompareArrowsIcon {

  @JSImport("material-ui-icons", "CompareArrows")
  @js.native
  private object RawComponent extends js.Object
  private val CompareArrows = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CompareArrows()
}

