package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EditIcon {

  @JSImport("material-ui-icons", "Edit")
  @js.native
  private object RawComponent extends js.Object
  private val Edit = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Edit()
}

