package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AudiotrackIcon {

  @JSImport("material-ui-icons", "Audiotrack")
  @js.native
  private object RawComponent extends js.Object
  private val Audiotrack = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Audiotrack()
}

