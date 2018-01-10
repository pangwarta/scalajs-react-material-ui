package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FindInPageIcon {

  @JSImport("material-ui-icons", "FindInPage")
  @js.native
  private object RawComponent extends js.Object
  private val FindInPage = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FindInPage()
}

