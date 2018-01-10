package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ExploreIcon {

  @JSImport("material-ui-icons", "Explore")
  @js.native
  private object RawComponent extends js.Object
  private val Explore = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Explore()
}

