package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FilterIcon {

  @JSImport("material-ui-icons", "Filter")
  @js.native
  private object RawComponent extends js.Object
  private val Filter = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Filter()
}

