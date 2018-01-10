package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CompareIcon {

  @JSImport("material-ui-icons", "Compare")
  @js.native
  private object RawComponent extends js.Object
  private val Compare = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Compare()
}

