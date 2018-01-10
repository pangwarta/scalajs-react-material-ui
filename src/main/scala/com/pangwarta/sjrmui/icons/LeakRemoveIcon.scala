package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LeakRemoveIcon {

  @JSImport("material-ui-icons", "LeakRemove")
  @js.native
  private object RawComponent extends js.Object
  private val LeakRemove = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LeakRemove()
}

