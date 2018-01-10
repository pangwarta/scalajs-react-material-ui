package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ModeCommentIcon {

  @JSImport("material-ui-icons", "ModeComment")
  @js.native
  private object RawComponent extends js.Object
  private val ModeComment = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ModeComment()
}

