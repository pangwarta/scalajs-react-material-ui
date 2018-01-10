package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ShopIcon {

  @JSImport("material-ui-icons", "Shop")
  @js.native
  private object RawComponent extends js.Object
  private val Shop = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Shop()
}

