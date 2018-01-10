package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewComfyIcon {

  @JSImport("material-ui-icons", "ViewComfy")
  @js.native
  private object RawComponent extends js.Object
  private val ViewComfy = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewComfy()
}

