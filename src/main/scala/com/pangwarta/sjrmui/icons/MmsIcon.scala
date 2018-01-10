package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MmsIcon {

  @JSImport("material-ui-icons", "Mms")
  @js.native
  private object RawComponent extends js.Object
  private val Mms = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Mms()
}

