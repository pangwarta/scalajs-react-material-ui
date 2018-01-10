package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WebAssetIcon {

  @JSImport("material-ui-icons", "WebAsset")
  @js.native
  private object RawComponent extends js.Object
  private val WebAsset = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = WebAsset()
}

