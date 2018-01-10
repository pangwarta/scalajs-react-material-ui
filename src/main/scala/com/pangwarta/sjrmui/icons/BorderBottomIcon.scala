package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderBottomIcon {

  @JSImport("material-ui-icons", "BorderBottom")
  @js.native
  private object RawComponent extends js.Object
  private val BorderBottom = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderBottom()
}

