package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlipToFrontIcon {

  @JSImport("material-ui-icons", "FlipToFront")
  @js.native
  private object RawComponent extends js.Object
  private val FlipToFront = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlipToFront()
}

