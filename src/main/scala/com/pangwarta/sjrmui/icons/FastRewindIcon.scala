package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FastRewindIcon {

  @JSImport("material-ui-icons", "FastRewind")
  @js.native
  private object RawComponent extends js.Object
  private val FastRewind = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FastRewind()
}

