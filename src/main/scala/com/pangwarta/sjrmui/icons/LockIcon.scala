package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LockIcon {

  @JSImport("material-ui-icons", "Lock")
  @js.native
  private object RawComponent extends js.Object
  private val Lock = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Lock()
}

