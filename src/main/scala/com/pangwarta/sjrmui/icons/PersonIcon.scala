package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PersonIcon {

  @JSImport("material-ui-icons", "Person")
  @js.native
  private object RawComponent extends js.Object
  private val Person = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Person()
}

