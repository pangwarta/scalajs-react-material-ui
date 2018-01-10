package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CardMembershipIcon {

  @JSImport("material-ui-icons", "CardMembership")
  @js.native
  private object RawComponent extends js.Object
  private val CardMembership = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CardMembership()
}

