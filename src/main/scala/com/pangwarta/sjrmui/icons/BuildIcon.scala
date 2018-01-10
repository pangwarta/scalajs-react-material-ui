package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BuildIcon {

  @JSImport("material-ui-icons", "Build")
  @js.native
  private object RawComponent extends js.Object
  private val Build = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Build()
}

