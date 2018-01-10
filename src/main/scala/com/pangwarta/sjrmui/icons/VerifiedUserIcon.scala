package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VerifiedUserIcon {

  @JSImport("material-ui-icons", "VerifiedUser")
  @js.native
  private object RawComponent extends js.Object
  private val VerifiedUser = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VerifiedUser()
}

