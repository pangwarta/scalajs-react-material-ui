package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LoupeIcon {

  @JSImport("material-ui-icons", "Loupe")
  @js.native
  private object RawComponent extends js.Object
  private val Loupe = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Loupe()
}

