package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AddShoppingCartIcon {

  @JSImport("material-ui-icons", "AddShoppingCart")
  @js.native
  private object RawComponent extends js.Object
  private val AddShoppingCart = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AddShoppingCart()
}

