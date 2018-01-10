package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HighlightOffIcon {

  @JSImport("material-ui-icons", "HighlightOff")
  @js.native
  private object RawComponent extends js.Object
  private val HighlightOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HighlightOff()
}

