package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AddToPhotosIcon {

  @JSImport("material-ui-icons", "AddToPhotos")
  @js.native
  private object RawComponent extends js.Object
  private val AddToPhotos = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AddToPhotos()
}

