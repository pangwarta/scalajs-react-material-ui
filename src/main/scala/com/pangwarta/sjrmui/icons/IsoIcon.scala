package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object IsoIcon {

  @JSImport("material-ui-icons", "Iso")
  @js.native
  private object RawComponent extends js.Object
  private val Iso = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Iso()
}

