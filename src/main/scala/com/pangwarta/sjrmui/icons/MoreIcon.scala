package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MoreIcon {

  @JSImport("material-ui-icons", "More")
  @js.native
  private object RawComponent extends js.Object
  private val More = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = More()
}

