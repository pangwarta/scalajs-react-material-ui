package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ExpandLessIcon {

  @JSImport("material-ui-icons", "ExpandLess")
  @js.native
  private object RawComponent extends js.Object
  private val ExpandLess = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ExpandLess()
}

