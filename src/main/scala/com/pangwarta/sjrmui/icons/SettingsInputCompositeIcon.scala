package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsInputCompositeIcon {

  @JSImport("material-ui-icons", "SettingsInputComposite")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsInputComposite = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsInputComposite()
}

