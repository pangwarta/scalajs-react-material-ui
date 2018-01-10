package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FeaturedVideoIcon {

  @JSImport("material-ui-icons", "FeaturedVideo")
  @js.native
  private object RawComponent extends js.Object
  private val FeaturedVideo = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FeaturedVideo()
}

