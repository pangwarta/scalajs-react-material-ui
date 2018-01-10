package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MicNoneIcon {

  @JSImport("material-ui-icons", "MicNone")
  @js.native
  private object RawComponent extends js.Object
  private val MicNone = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MicNone()
}

