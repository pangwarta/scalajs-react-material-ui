package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GrainIcon {

  @JSImport("material-ui-icons", "Grain")
  @js.native
  private object RawComponent extends js.Object
  private val Grain = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Grain()
}

