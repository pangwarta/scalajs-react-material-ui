package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TabIcon {

  @JSImport("material-ui-icons", "Tab")
  @js.native
  private object RawComponent extends js.Object
  private val Tab = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Tab()
}

