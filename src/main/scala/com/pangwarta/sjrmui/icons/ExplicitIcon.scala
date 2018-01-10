package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ExplicitIcon {

  @JSImport("material-ui-icons", "Explicit")
  @js.native
  private object RawComponent extends js.Object
  private val Explicit = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Explicit()
}

