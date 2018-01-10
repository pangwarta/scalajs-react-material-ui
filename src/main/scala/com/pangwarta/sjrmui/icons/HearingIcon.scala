package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HearingIcon {

  @JSImport("material-ui-icons", "Hearing")
  @js.native
  private object RawComponent extends js.Object
  private val Hearing = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Hearing()
}

