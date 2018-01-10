package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChevronLeftIcon {

  @JSImport("material-ui-icons", "ChevronLeft")
  @js.native
  private object RawComponent extends js.Object
  private val ChevronLeft = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChevronLeft()
}

