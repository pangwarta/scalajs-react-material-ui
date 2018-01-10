package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NavigateNextIcon {

  @JSImport("material-ui-icons", "NavigateNext")
  @js.native
  private object RawComponent extends js.Object
  private val NavigateNext = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NavigateNext()
}

