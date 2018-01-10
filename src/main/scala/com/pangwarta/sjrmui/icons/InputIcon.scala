package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object InputIcon {

  @JSImport("material-ui-icons", "Input")
  @js.native
  private object RawComponent extends js.Object
  private val Input = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Input()
}

