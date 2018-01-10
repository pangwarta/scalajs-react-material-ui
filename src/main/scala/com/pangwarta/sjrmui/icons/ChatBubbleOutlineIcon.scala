package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChatBubbleOutlineIcon {

  @JSImport("material-ui-icons", "ChatBubbleOutline")
  @js.native
  private object RawComponent extends js.Object
  private val ChatBubbleOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChatBubbleOutline()
}

