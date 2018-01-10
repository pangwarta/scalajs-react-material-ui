package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SortByAlphaIcon {

  @JSImport("material-ui-icons", "SortByAlpha")
  @js.native
  private object RawComponent extends js.Object
  private val SortByAlpha = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SortByAlpha()
}

