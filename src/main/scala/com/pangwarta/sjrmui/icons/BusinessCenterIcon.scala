package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BusinessCenterIcon {

  @JSImport("material-ui-icons", "BusinessCenter")
  @js.native
  private object RawComponent extends js.Object
  private val BusinessCenter = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BusinessCenter()
}

