package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewCompactIcon {

  @JSImport("material-ui-icons", "ViewCompact")
  @js.native
  private object RawComponent extends js.Object
  private val ViewCompact = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewCompact()
}

