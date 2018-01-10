package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HighlightIcon {

  @JSImport("material-ui-icons", "Highlight")
  @js.native
  private object RawComponent extends js.Object
  private val Highlight = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Highlight()
}

