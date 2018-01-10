package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MoreHorizIcon {

  @JSImport("material-ui-icons", "MoreHoriz")
  @js.native
  private object RawComponent extends js.Object
  private val MoreHoriz = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MoreHoriz()
}

