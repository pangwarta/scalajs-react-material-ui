package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PersonAddIcon {

  @JSImport("material-ui-icons", "PersonAdd")
  @js.native
  private object RawComponent extends js.Object
  private val PersonAdd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PersonAdd()
}

