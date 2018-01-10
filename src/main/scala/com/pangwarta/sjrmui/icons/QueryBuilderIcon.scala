package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object QueryBuilderIcon {

  @JSImport("material-ui-icons", "QueryBuilder")
  @js.native
  private object RawComponent extends js.Object
  private val QueryBuilder = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = QueryBuilder()
}

