package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TextsmsIcon {

  @JSImport("material-ui-icons", "Textsms")
  @js.native
  private object RawComponent extends js.Object
  private val Textsms = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Textsms()
}

