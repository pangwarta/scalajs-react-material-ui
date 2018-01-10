package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StoreIcon {

  @JSImport("material-ui-icons", "Store")
  @js.native
  private object RawComponent extends js.Object
  private val Store = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Store()
}

