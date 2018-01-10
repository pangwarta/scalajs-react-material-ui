package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ThumbDownIcon {

  @JSImport("material-ui-icons", "ThumbDown")
  @js.native
  private object RawComponent extends js.Object
  private val ThumbDown = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ThumbDown()
}

