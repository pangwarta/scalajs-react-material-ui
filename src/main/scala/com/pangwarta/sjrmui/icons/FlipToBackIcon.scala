package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlipToBackIcon {

  @JSImport("material-ui-icons", "FlipToBack")
  @js.native
  private object RawComponent extends js.Object
  private val FlipToBack = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlipToBack()
}

