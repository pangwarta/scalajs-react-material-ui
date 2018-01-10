package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TitleIcon {

  @JSImport("material-ui-icons", "Title")
  @js.native
  private object RawComponent extends js.Object
  private val Title = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Title()
}

