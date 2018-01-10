package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MovieFilterIcon {

  @JSImport("material-ui-icons", "MovieFilter")
  @js.native
  private object RawComponent extends js.Object
  private val MovieFilter = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MovieFilter()
}

