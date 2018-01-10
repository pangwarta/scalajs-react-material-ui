package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewDayIcon {

  @JSImport("material-ui-icons", "ViewDay")
  @js.native
  private object RawComponent extends js.Object
  private val ViewDay = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewDay()
}

