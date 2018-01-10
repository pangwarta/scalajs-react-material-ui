package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallMadeIcon {

  @JSImport("material-ui-icons", "CallMade")
  @js.native
  private object RawComponent extends js.Object
  private val CallMade = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CallMade()
}

