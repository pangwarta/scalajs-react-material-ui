package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DonutSmallIcon {

  @JSImport("material-ui-icons", "DonutSmall")
  @js.native
  private object RawComponent extends js.Object
  private val DonutSmall = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DonutSmall()
}

