package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PlusOneIcon {

  @JSImport("material-ui-icons", "PlusOne")
  @js.native
  private object RawComponent extends js.Object
  private val PlusOne = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PlusOne()
}

