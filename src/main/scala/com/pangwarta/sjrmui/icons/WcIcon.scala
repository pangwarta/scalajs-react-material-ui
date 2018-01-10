package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WcIcon {

  @JSImport("material-ui-icons", "Wc")
  @js.native
  private object RawComponent extends js.Object
  private val Wc = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Wc()
}

