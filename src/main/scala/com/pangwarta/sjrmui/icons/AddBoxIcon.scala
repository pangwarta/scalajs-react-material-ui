package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AddBoxIcon {

  @JSImport("material-ui-icons", "AddBox")
  @js.native
  private object RawComponent extends js.Object
  private val AddBox = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AddBox()
}

