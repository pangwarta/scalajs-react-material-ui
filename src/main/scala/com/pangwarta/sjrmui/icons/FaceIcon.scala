package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FaceIcon {

  @JSImport("material-ui-icons", "Face")
  @js.native
  private object RawComponent extends js.Object
  private val Face = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Face()
}

