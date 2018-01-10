package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DomainIcon {

  @JSImport("material-ui-icons", "Domain")
  @js.native
  private object RawComponent extends js.Object
  private val Domain = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Domain()
}

