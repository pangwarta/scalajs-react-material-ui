package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LastPageIcon {

  @JSImport("material-ui-icons", "LastPage")
  @js.native
  private object RawComponent extends js.Object
  private val LastPage = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LastPage()
}

