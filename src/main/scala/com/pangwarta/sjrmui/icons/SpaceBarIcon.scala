package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SpaceBarIcon {

  @JSImport("material-ui-icons", "SpaceBar")
  @js.native
  private object RawComponent extends js.Object
  private val SpaceBar = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SpaceBar()
}

