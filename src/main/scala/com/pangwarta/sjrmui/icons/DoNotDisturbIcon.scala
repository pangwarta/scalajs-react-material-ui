package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DoNotDisturbIcon {

  @JSImport("material-ui-icons", "DoNotDisturb")
  @js.native
  private object RawComponent extends js.Object
  private val DoNotDisturb = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DoNotDisturb()
}

