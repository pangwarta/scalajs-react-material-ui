package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChildFriendlyIcon {

  @JSImport("material-ui-icons", "ChildFriendly")
  @js.native
  private object RawComponent extends js.Object
  private val ChildFriendly = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChildFriendly()
}

