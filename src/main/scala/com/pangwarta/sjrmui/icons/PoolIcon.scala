package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PoolIcon {

  @JSImport("material-ui-icons", "Pool")
  @js.native
  private object RawComponent extends js.Object
  private val Pool = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Pool()
}

