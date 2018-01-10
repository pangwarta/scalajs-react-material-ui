package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FavoriteBorderIcon {

  @JSImport("material-ui-icons", "FavoriteBorder")
  @js.native
  private object RawComponent extends js.Object
  private val FavoriteBorder = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FavoriteBorder()
}

