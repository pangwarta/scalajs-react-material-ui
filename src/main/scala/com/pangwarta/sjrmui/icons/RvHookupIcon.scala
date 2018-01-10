package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RvHookupIcon {

  @JSImport("material-ui-icons", "RvHookup")
  @js.native
  private object RawComponent extends js.Object
  private val RvHookup = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RvHookup()
}

