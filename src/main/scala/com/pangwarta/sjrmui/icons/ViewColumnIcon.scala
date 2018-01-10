package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewColumnIcon {

  @JSImport("material-ui-icons", "ViewColumn")
  @js.native
  private object RawComponent extends js.Object
  private val ViewColumn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewColumn()
}

