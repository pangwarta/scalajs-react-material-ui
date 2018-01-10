package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallIcon {

  @JSImport("material-ui-icons", "Call")
  @js.native
  private object RawComponent extends js.Object
  private val Call = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Call()
}

