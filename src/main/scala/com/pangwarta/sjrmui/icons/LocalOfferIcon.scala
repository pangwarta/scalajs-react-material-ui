package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalOfferIcon {

  @JSImport("material-ui-icons", "LocalOffer")
  @js.native
  private object RawComponent extends js.Object
  private val LocalOffer = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalOffer()
}

