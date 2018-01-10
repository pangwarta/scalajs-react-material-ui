package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SendIcon {

  @JSImport("material-ui-icons", "Send")
  @js.native
  private object RawComponent extends js.Object
  private val Send = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Send()
}

