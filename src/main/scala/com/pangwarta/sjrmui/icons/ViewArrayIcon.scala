package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewArrayIcon {

  @JSImport("material-ui-icons", "ViewArray")
  @js.native
  private object RawComponent extends js.Object
  private val ViewArray = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewArray()
}

