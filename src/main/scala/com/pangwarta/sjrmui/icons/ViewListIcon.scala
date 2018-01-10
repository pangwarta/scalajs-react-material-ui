package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewListIcon {

  @JSImport("material-ui-icons", "ViewList")
  @js.native
  private object RawComponent extends js.Object
  private val ViewList = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewList()
}

