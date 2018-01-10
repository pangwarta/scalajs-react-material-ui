package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ToysIcon {

  @JSImport("material-ui-icons", "Toys")
  @js.native
  private object RawComponent extends js.Object
  private val Toys = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Toys()
}

