package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PageviewIcon {

  @JSImport("material-ui-icons", "Pageview")
  @js.native
  private object RawComponent extends js.Object
  private val Pageview = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Pageview()
}

