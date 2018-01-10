package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EmailIcon {

  @JSImport("material-ui-icons", "Email")
  @js.native
  private object RawComponent extends js.Object
  private val Email = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Email()
}

