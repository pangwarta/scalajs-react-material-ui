package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TvIcon {

  @JSImport("material-ui-icons", "Tv")
  @js.native
  private object RawComponent extends js.Object
  private val Tv = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Tv()
}

