package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PlayForWorkIcon {

  @JSImport("material-ui-icons", "PlayForWork")
  @js.native
  private object RawComponent extends js.Object
  private val PlayForWork = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PlayForWork()
}

