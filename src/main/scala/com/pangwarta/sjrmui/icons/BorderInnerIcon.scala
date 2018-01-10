package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderInnerIcon {

  @JSImport("material-ui-icons", "BorderInner")
  @js.native
  private object RawComponent extends js.Object
  private val BorderInner = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderInner()
}

