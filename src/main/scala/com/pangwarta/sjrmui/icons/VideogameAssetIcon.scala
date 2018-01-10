package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VideogameAssetIcon {

  @JSImport("material-ui-icons", "VideogameAsset")
  @js.native
  private object RawComponent extends js.Object
  private val VideogameAsset = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VideogameAsset()
}

