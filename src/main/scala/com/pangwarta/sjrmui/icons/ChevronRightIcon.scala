package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChevronRightIcon {

  @JSImport("material-ui-icons", "ChevronRight")
  @js.native
  private object RawComponent extends js.Object
  private val ChevronRight = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChevronRight()
}

