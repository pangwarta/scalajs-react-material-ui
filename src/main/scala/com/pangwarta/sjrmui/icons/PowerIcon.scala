package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PowerIcon {

  @JSImport("material-ui-icons", "Power")
  @js.native
  private object RawComponent extends js.Object
  private val Power = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Power()
}

