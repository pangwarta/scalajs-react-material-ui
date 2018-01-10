package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NewReleasesIcon {

  @JSImport("material-ui-icons", "NewReleases")
  @js.native
  private object RawComponent extends js.Object
  private val NewReleases = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NewReleases()
}

