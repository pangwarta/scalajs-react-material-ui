package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BlurLinearIcon {

  @JSImport("material-ui-icons", "BlurLinear")
  @js.native
  private object RawComponent extends js.Object
  private val BlurLinear = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BlurLinear()
}

