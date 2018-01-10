package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CastIcon {

  @JSImport("material-ui-icons", "Cast")
  @js.native
  private object RawComponent extends js.Object
  private val Cast = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Cast()
}

