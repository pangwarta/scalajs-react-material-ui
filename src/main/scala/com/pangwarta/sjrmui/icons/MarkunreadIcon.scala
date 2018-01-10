package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MarkunreadIcon {

  @JSImport("material-ui-icons", "Markunread")
  @js.native
  private object RawComponent extends js.Object
  private val Markunread = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Markunread()
}

