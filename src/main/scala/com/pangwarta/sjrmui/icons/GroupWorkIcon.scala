package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GroupWorkIcon {

  @JSImport("material-ui-icons", "GroupWork")
  @js.native
  private object RawComponent extends js.Object
  private val GroupWork = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = GroupWork()
}

