package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TranslateIcon {

  @JSImport("material-ui-icons", "Translate")
  @js.native
  private object RawComponent extends js.Object
  private val Translate = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Translate()
}

