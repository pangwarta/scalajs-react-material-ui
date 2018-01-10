package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object InfoOutlineIcon {

  @JSImport("material-ui-icons", "InfoOutline")
  @js.native
  private object RawComponent extends js.Object
  private val InfoOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = InfoOutline()
}

