package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FormatUnderlinedIcon {

  @JSImport("material-ui-icons", "FormatUnderlined")
  @js.native
  private object RawComponent extends js.Object
  private val FormatUnderlined = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FormatUnderlined()
}

