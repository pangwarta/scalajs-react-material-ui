package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HeadsetIcon {

  @JSImport("material-ui-icons", "Headset")
  @js.native
  private object RawComponent extends js.Object
  private val Headset = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Headset()
}

