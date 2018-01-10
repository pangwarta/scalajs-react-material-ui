package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AllInclusiveIcon {

  @JSImport("material-ui-icons", "AllInclusive")
  @js.native
  private object RawComponent extends js.Object
  private val AllInclusive = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AllInclusive()
}

