package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CodeIcon {

  @JSImport("material-ui-icons", "Code")
  @js.native
  private object RawComponent extends js.Object
  private val Code = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Code()
}

