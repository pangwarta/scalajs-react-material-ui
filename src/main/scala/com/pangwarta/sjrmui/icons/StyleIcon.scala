package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StyleIcon {

  @JSImport("material-ui-icons", "Style")
  @js.native
  private object RawComponent extends js.Object
  private val Style = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Style()
}

