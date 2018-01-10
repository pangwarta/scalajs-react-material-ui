package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TransformIcon {

  @JSImport("material-ui-icons", "Transform")
  @js.native
  private object RawComponent extends js.Object
  private val Transform = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Transform()
}

