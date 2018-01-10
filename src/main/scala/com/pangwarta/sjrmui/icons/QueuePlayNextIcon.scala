package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object QueuePlayNextIcon {

  @JSImport("material-ui-icons", "QueuePlayNext")
  @js.native
  private object RawComponent extends js.Object
  private val QueuePlayNext = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = QueuePlayNext()
}

