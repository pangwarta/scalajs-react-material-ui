package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ShortTextIcon {

  @JSImport("material-ui-icons", "ShortText")
  @js.native
  private object RawComponent extends js.Object
  private val ShortText = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ShortText()
}

