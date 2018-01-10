package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ArrowDropUpIcon {

  @JSImport("material-ui-icons", "ArrowDropUp")
  @js.native
  private object RawComponent extends js.Object
  private val ArrowDropUp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ArrowDropUp()
}

