package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TabletAndroidIcon {

  @JSImport("material-ui-icons", "TabletAndroid")
  @js.native
  private object RawComponent extends js.Object
  private val TabletAndroid = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TabletAndroid()
}

