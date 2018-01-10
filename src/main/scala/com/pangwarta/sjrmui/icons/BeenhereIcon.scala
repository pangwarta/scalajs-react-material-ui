package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BeenhereIcon {

  @JSImport("material-ui-icons", "Beenhere")
  @js.native
  private object RawComponent extends js.Object
  private val Beenhere = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Beenhere()
}

