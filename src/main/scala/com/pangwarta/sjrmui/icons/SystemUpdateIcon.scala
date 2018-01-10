package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SystemUpdateIcon {

  @JSImport("material-ui-icons", "SystemUpdate")
  @js.native
  private object RawComponent extends js.Object
  private val SystemUpdate = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SystemUpdate()
}

