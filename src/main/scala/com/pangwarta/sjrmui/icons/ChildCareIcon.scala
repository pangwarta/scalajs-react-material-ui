package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChildCareIcon {

  @JSImport("material-ui-icons", "ChildCare")
  @js.native
  private object RawComponent extends js.Object
  private val ChildCare = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChildCare()
}

