package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhonelinkRingIcon {

  @JSImport("material-ui-icons", "PhonelinkRing")
  @js.native
  private object RawComponent extends js.Object
  private val PhonelinkRing = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhonelinkRing()
}

