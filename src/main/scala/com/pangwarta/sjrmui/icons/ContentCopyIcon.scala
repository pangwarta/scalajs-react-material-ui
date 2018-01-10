package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ContentCopyIcon {

  @JSImport("material-ui-icons", "ContentCopy")
  @js.native
  private object RawComponent extends js.Object
  private val ContentCopy = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ContentCopy()
}

