package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ReplyAllIcon {

  @JSImport("material-ui-icons", "ReplyAll")
  @js.native
  private object RawComponent extends js.Object
  private val ReplyAll = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ReplyAll()
}

