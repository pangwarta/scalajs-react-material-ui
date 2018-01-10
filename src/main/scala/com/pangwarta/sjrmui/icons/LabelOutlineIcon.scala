package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LabelOutlineIcon {

  @JSImport("material-ui-icons", "LabelOutline")
  @js.native
  private object RawComponent extends js.Object
  private val LabelOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LabelOutline()
}

