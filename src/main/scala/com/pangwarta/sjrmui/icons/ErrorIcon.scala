package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ErrorIcon {

  @JSImport("material-ui-icons", "Error")
  @js.native
  private object RawComponent extends js.Object
  private val Error = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Error()
}

