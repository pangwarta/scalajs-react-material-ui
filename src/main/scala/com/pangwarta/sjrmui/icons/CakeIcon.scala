package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CakeIcon {

  @JSImport("material-ui-icons", "Cake")
  @js.native
  private object RawComponent extends js.Object
  private val Cake = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Cake()
}

