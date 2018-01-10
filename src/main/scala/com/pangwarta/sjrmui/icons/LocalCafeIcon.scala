package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalCafeIcon {

  @JSImport("material-ui-icons", "LocalCafe")
  @js.native
  private object RawComponent extends js.Object
  private val LocalCafe = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalCafe()
}

