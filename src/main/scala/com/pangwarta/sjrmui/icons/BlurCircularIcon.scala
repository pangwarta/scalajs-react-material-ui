package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BlurCircularIcon {

  @JSImport("material-ui-icons", "BlurCircular")
  @js.native
  private object RawComponent extends js.Object
  private val BlurCircular = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BlurCircular()
}

