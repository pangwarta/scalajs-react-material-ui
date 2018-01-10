package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ClassIcon {

  @JSImport("material-ui-icons", "Class")
  @js.native
  private object RawComponent extends js.Object
  private val Class = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Class()
}

