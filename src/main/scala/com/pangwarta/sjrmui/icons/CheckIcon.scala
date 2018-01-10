package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CheckIcon {

  @JSImport("material-ui-icons", "Check")
  @js.native
  private object RawComponent extends js.Object
  private val Check = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Check()
}

