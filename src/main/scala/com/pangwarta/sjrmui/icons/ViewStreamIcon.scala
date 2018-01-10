package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewStreamIcon {

  @JSImport("material-ui-icons", "ViewStream")
  @js.native
  private object RawComponent extends js.Object
  private val ViewStream = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewStream()
}

