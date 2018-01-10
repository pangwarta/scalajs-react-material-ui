package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhoneAndroidIcon {

  @JSImport("material-ui-icons", "PhoneAndroid")
  @js.native
  private object RawComponent extends js.Object
  private val PhoneAndroid = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhoneAndroid()
}

