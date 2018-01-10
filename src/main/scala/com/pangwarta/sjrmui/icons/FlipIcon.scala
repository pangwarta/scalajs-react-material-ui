package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlipIcon {

  @JSImport("material-ui-icons", "Flip")
  @js.native
  private object RawComponent extends js.Object
  private val Flip = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Flip()
}

