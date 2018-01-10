package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlagIcon {

  @JSImport("material-ui-icons", "Flag")
  @js.native
  private object RawComponent extends js.Object
  private val Flag = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Flag()
}

