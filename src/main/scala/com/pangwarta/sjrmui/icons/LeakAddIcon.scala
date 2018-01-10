package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LeakAddIcon {

  @JSImport("material-ui-icons", "LeakAdd")
  @js.native
  private object RawComponent extends js.Object
  private val LeakAdd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LeakAdd()
}

