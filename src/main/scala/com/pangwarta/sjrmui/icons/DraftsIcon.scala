package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DraftsIcon {

  @JSImport("material-ui-icons", "Drafts")
  @js.native
  private object RawComponent extends js.Object
  private val Drafts = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Drafts()
}

