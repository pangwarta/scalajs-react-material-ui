package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LanguageIcon {

  @JSImport("material-ui-icons", "Language")
  @js.native
  private object RawComponent extends js.Object
  private val Language = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Language()
}

