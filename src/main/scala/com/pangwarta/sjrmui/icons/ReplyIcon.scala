package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ReplyIcon {

  @JSImport("material-ui-icons", "Reply")
  @js.native
  private object RawComponent extends js.Object
  private val Reply = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Reply()
}

