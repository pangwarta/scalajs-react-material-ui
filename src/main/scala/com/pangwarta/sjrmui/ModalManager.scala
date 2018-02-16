package com.pangwarta.sjrmui

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("material-ui", "ModalManager")
@js.native
class ModalManager(opts: js.UndefOr[ModalManager.Opts] = js.undefined) extends js.Any {
  def add(modal: js.Any, container: js.Any): Int = js.native
  def remove(modal: js.Any): Unit = js.native
  def isTopModal(modal: js.Any): Boolean = js.native
}

object ModalManager {
  @js.native
  trait Opts extends js.Object {
    var hideSiblingNodes: js.UndefOr[Boolean] = js.native
    var handleContainerOverflow: js.UndefOr[Boolean] = js.native
  }
}
