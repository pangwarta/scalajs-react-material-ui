package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NavigateBeforeIcon {

  @JSImport("material-ui-icons", "NavigateBefore")
  @js.native
  private object RawComponent extends js.Object
  private val NavigateBefore = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NavigateBefore()
}

