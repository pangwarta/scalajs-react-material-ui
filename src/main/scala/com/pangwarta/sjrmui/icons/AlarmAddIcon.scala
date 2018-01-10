package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AlarmAddIcon {

  @JSImport("material-ui-icons", "AlarmAdd")
  @js.native
  private object RawComponent extends js.Object
  private val AlarmAdd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AlarmAdd()
}

