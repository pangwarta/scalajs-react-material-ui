package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CheckBoxIcon {

  @JSImport("material-ui-icons", "CheckBox")
  @js.native
  private object RawComponent extends js.Object
  private val CheckBox = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CheckBox()
}

