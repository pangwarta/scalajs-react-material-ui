package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BusinessIcon {

  @JSImport("material-ui-icons", "Business")
  @js.native
  private object RawComponent extends js.Object
  private val Business = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Business()
}

