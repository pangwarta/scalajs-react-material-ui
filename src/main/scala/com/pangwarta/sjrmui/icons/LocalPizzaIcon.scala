package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalPizzaIcon {

  @JSImport("material-ui-icons", "LocalPizza")
  @js.native
  private object RawComponent extends js.Object
  private val LocalPizza = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalPizza()
}

