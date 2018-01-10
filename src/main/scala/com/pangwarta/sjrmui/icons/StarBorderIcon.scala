package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StarBorderIcon {

  @JSImport("material-ui-icons", "StarBorder")
  @js.native
  private object RawComponent extends js.Object
  private val StarBorder = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = StarBorder()
}

