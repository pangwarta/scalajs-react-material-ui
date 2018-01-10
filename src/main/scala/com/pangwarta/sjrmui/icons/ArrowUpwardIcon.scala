package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ArrowUpwardIcon {

  @JSImport("material-ui-icons", "ArrowUpward")
  @js.native
  private object RawComponent extends js.Object
  private val ArrowUpward = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ArrowUpward()
}

