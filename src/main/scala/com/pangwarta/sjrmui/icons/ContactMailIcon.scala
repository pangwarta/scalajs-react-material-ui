package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ContactMailIcon {

  @JSImport("material-ui-icons", "ContactMail")
  @js.native
  private object RawComponent extends js.Object
  private val ContactMail = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ContactMail()
}

