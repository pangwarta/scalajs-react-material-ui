package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallEndIcon {

  @JSImport("material-ui-icons", "CallEnd")
  @js.native
  private object RawComponent extends js.Object
  private val CallEnd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CallEnd()
}

