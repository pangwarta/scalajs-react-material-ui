package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DeleteIcon {

  @JSImport("material-ui-icons", "Delete")
  @js.native
  private object RawComponent extends js.Object
  private val Delete = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Delete()
}

