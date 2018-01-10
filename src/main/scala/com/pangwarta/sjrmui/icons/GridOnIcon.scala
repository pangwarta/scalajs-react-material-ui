package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GridOnIcon {

  @JSImport("material-ui-icons", "GridOn")
  @js.native
  private object RawComponent extends js.Object
  private val GridOn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = GridOn()
}

