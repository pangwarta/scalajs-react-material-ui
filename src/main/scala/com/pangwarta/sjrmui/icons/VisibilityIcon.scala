package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VisibilityIcon {

  @JSImport("material-ui-icons", "Visibility")
  @js.native
  private object RawComponent extends js.Object
  private val Visibility = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Visibility()
}

