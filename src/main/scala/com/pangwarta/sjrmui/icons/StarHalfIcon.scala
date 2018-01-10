package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StarHalfIcon {

  @JSImport("material-ui-icons", "StarHalf")
  @js.native
  private object RawComponent extends js.Object
  private val StarHalf = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = StarHalf()
}

