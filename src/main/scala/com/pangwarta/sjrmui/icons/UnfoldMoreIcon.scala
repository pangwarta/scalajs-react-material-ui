package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object UnfoldMoreIcon {

  @JSImport("material-ui-icons", "UnfoldMore")
  @js.native
  private object RawComponent extends js.Object
  private val UnfoldMore = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = UnfoldMore()
}

