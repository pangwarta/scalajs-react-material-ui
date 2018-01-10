package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SlideshowIcon {

  @JSImport("material-ui-icons", "Slideshow")
  @js.native
  private object RawComponent extends js.Object
  private val Slideshow = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Slideshow()
}

