package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DetailsIcon {

  @JSImport("material-ui-icons", "Details")
  @js.native
  private object RawComponent extends js.Object
  private val Details = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Details()
}

