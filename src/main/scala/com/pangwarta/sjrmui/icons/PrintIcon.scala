package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PrintIcon {

  @JSImport("material-ui-icons", "Print")
  @js.native
  private object RawComponent extends js.Object
  private val Print = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Print()
}

