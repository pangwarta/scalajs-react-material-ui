package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CachedIcon {

  @JSImport("material-ui-icons", "Cached")
  @js.native
  private object RawComponent extends js.Object
  private val Cached = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Cached()
}

