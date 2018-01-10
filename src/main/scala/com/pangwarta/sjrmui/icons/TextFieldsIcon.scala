package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TextFieldsIcon {

  @JSImport("material-ui-icons", "TextFields")
  @js.native
  private object RawComponent extends js.Object
  private val TextFields = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TextFields()
}

