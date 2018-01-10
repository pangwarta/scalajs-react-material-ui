package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SentimentSatisfiedIcon {

  @JSImport("material-ui-icons", "SentimentSatisfied")
  @js.native
  private object RawComponent extends js.Object
  private val SentimentSatisfied = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SentimentSatisfied()
}

