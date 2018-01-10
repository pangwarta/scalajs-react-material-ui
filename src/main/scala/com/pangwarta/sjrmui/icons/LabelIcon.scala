package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LabelIcon {

  @JSImport("material-ui-icons", "Label")
  @js.native
  private object RawComponent extends js.Object
  private val Label = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Label()
}

