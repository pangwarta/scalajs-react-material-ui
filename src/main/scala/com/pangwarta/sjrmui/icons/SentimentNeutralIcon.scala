package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SentimentNeutralIcon {

  @JSImport("material-ui-icons", "SentimentNeutral")
  @js.native
  private object RawComponent extends js.Object
  private val SentimentNeutral = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SentimentNeutral()
}

