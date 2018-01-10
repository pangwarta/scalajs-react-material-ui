package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AccessibleIcon {

  @JSImport("material-ui-icons", "Accessible")
  @js.native
  private object RawComponent extends js.Object
  private val Accessible = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Accessible()
}

