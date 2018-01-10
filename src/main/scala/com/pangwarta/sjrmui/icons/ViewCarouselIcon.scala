package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewCarouselIcon {

  @JSImport("material-ui-icons", "ViewCarousel")
  @js.native
  private object RawComponent extends js.Object
  private val ViewCarousel = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewCarousel()
}

