package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HealingIcon {

  @JSImport("material-ui-icons", "Healing")
  @js.native
  private object RawComponent extends js.Object
  private val Healing = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Healing()
}

