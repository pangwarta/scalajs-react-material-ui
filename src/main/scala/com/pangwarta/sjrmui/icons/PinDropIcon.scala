package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PinDropIcon {

  @JSImport("material-ui-icons", "PinDrop")
  @js.native
  private object RawComponent extends js.Object
  private val PinDrop = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PinDrop()
}

