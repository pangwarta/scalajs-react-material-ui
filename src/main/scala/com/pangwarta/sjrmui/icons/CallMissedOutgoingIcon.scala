package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallMissedOutgoingIcon {

  @JSImport("material-ui-icons", "CallMissedOutgoing")
  @js.native
  private object RawComponent extends js.Object
  private val CallMissedOutgoing = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CallMissedOutgoing()
}

