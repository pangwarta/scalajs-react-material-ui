package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RateReviewIcon {

  @JSImport("material-ui-icons", "RateReview")
  @js.native
  private object RawComponent extends js.Object
  private val RateReview = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RateReview()
}

