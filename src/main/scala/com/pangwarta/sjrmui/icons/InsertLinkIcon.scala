package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object InsertLinkIcon {

  @JSImport("material-ui-icons", "InsertLink")
  @js.native
  private object RawComponent extends js.Object
  private val InsertLink = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = InsertLink()
}

