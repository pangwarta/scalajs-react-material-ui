package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TrendingFlatIcon {

  @JSImport("material-ui-icons", "TrendingFlat")
  @js.native
  private object RawComponent extends js.Object
  private val TrendingFlat = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TrendingFlat()
}

