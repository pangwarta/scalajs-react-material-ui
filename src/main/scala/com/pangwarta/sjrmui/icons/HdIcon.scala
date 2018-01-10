package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HdIcon {

  @JSImport("material-ui-icons", "Hd")
  @js.native
  private object RawComponent extends js.Object
  private val Hd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Hd()
}

