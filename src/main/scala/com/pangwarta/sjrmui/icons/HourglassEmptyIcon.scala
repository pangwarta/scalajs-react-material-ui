package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HourglassEmptyIcon {

  @JSImport("material-ui-icons", "HourglassEmpty")
  @js.native
  private object RawComponent extends js.Object
  private val HourglassEmpty = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HourglassEmpty()
}

