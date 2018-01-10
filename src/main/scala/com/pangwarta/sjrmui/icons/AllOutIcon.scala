package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AllOutIcon {

  @JSImport("material-ui-icons", "AllOut")
  @js.native
  private object RawComponent extends js.Object
  private val AllOut = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AllOut()
}

