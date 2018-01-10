package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ColorizeIcon {

  @JSImport("material-ui-icons", "Colorize")
  @js.native
  private object RawComponent extends js.Object
  private val Colorize = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Colorize()
}

