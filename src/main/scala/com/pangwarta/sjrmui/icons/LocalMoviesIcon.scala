package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalMoviesIcon {

  @JSImport("material-ui-icons", "LocalMovies")
  @js.native
  private object RawComponent extends js.Object
  private val LocalMovies = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalMovies()
}

