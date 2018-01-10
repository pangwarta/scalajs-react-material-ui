package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ThumbUpIcon {

  @JSImport("material-ui-icons", "ThumbUp")
  @js.native
  private object RawComponent extends js.Object
  private val ThumbUp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ThumbUp()
}

