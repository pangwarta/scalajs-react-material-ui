package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallMissedIcon {

  @JSImport("material-ui-icons", "CallMissed")
  @js.native
  private object RawComponent extends js.Object
  private val CallMissed = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CallMissed()
}

