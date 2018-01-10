package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object OpenInNewIcon {

  @JSImport("material-ui-icons", "OpenInNew")
  @js.native
  private object RawComponent extends js.Object
  private val OpenInNew = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = OpenInNew()
}

