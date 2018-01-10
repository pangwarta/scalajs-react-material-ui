package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ShoppingCartIcon {

  @JSImport("material-ui-icons", "ShoppingCart")
  @js.native
  private object RawComponent extends js.Object
  private val ShoppingCart = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ShoppingCart()
}

