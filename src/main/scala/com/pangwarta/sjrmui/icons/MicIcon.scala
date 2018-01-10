package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MicIcon {

  @JSImport("material-ui-icons", "Mic")
  @js.native
  private object RawComponent extends js.Object
  private val Mic = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Mic()
}

