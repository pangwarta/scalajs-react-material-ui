package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PaletteIcon {

  @JSImport("material-ui-icons", "Palette")
  @js.native
  private object RawComponent extends js.Object
  private val Palette = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Palette()
}

