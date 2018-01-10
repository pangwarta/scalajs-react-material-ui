package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WhatshotIcon {

  @JSImport("material-ui-icons", "Whatshot")
  @js.native
  private object RawComponent extends js.Object
  private val Whatshot = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Whatshot()
}

