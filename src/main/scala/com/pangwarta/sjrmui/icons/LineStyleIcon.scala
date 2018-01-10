package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LineStyleIcon {

  @JSImport("material-ui-icons", "LineStyle")
  @js.native
  private object RawComponent extends js.Object
  private val LineStyle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LineStyle()
}

