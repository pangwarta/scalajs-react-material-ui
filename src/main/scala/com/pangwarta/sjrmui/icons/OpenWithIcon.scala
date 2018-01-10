package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object OpenWithIcon {

  @JSImport("material-ui-icons", "OpenWith")
  @js.native
  private object RawComponent extends js.Object
  private val OpenWith = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = OpenWith()
}

