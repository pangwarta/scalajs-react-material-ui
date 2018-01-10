package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhonelinkIcon {

  @JSImport("material-ui-icons", "Phonelink")
  @js.native
  private object RawComponent extends js.Object
  private val Phonelink = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Phonelink()
}

