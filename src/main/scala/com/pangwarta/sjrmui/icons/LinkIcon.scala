package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LinkIcon {

  @JSImport("material-ui-icons", "Link")
  @js.native
  private object RawComponent extends js.Object
  private val Link = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Link()
}

