package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MouseIcon {

  @JSImport("material-ui-icons", "Mouse")
  @js.native
  private object RawComponent extends js.Object
  private val Mouse = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Mouse()
}

