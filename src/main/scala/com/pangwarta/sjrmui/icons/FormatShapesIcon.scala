package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FormatShapesIcon {

  @JSImport("material-ui-icons", "FormatShapes")
  @js.native
  private object RawComponent extends js.Object
  private val FormatShapes = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FormatShapes()
}

