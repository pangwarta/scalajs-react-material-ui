package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallToActionIcon {

  @JSImport("material-ui-icons", "CallToAction")
  @js.native
  private object RawComponent extends js.Object
  private val CallToAction = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CallToAction()
}

