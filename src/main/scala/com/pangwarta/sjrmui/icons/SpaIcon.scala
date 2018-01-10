package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SpaIcon {

  @JSImport("material-ui-icons", "Spa")
  @js.native
  private object RawComponent extends js.Object
  private val Spa = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Spa()
}

