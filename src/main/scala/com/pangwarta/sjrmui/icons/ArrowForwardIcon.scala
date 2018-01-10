package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ArrowForwardIcon {

  @JSImport("material-ui-icons", "ArrowForward")
  @js.native
  private object RawComponent extends js.Object
  private val ArrowForward = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ArrowForward()
}

