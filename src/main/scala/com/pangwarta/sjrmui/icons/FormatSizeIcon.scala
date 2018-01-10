package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FormatSizeIcon {

  @JSImport("material-ui-icons", "FormatSize")
  @js.native
  private object RawComponent extends js.Object
  private val FormatSize = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FormatSize()
}

