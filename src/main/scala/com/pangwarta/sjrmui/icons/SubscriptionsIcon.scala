package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SubscriptionsIcon {

  @JSImport("material-ui-icons", "Subscriptions")
  @js.native
  private object RawComponent extends js.Object
  private val Subscriptions = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Subscriptions()
}

