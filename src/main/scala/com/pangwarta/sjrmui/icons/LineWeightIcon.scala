package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LineWeightIcon {

  @JSImport("material-ui-icons", "LineWeight")
  @js.native
  private object RawComponent extends js.Object
  private val LineWeight = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LineWeight()
}

