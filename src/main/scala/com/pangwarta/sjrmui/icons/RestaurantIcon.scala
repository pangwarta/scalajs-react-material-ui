package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RestaurantIcon {

  @JSImport("material-ui-icons", "Restaurant")
  @js.native
  private object RawComponent extends js.Object
  private val Restaurant = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Restaurant()
}

