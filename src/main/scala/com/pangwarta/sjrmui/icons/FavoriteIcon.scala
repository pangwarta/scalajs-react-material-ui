package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FavoriteIcon {

  @JSImport("material-ui-icons", "Favorite")
  @js.native
  private object RawComponent extends js.Object
  private val Favorite = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Favorite()
}

