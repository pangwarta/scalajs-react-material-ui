package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FiberNewIcon {

  @JSImport("material-ui-icons", "FiberNew")
  @js.native
  private object RawComponent extends js.Object
  private val FiberNew = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FiberNew()
}

