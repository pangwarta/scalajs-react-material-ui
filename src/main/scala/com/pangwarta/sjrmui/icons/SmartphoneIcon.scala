package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SmartphoneIcon {

  @JSImport("material-ui-icons", "Smartphone")
  @js.native
  private object RawComponent extends js.Object
  private val Smartphone = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Smartphone()
}

