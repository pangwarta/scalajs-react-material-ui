package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DoneIcon {

  @JSImport("material-ui-icons", "Done")
  @js.native
  private object RawComponent extends js.Object
  private val Done = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Done()
}

