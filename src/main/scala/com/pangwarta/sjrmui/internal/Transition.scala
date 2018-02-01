package com.pangwarta.sjrmui.internal

import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Transition extends js.Object {
  var enter: Double = js.native
  var exit: Double = js.native
}

object Transition {
  type Duration = Double | Transition
  type Callback = js.Function1[html.Element, Unit]

  @js.native
  trait Classes extends js.Object {
    var appear: js.UndefOr[String] = js.native
    var appearActive: js.UndefOr[String] = js.native
    var enter: js.UndefOr[String] = js.native
    var enterActive: js.UndefOr[String] = js.native
    var exit: js.UndefOr[String] = js.native
    var exitActive: js.UndefOr[String] = js.native
  }

  @js.native
  trait Handlers extends js.Object {
    var onEnter: Callback = js.native
    var onEntering: Callback = js.native
    var onEntered: Callback = js.native
    var onExit: Callback = js.native
    var onExiting: Callback = js.native
    var onExited: Callback = js.native
  }

  @js.native
  trait Props extends js.Object {
    var onEnter: js.UndefOr[Callback] = js.native
    var onEntering: js.UndefOr[Callback] = js.native
    var onEntered: js.UndefOr[Callback] = js.native
    var onExit: js.UndefOr[Callback] = js.native
    var onExiting: js.UndefOr[Callback] = js.native
    var onExited: js.UndefOr[Callback] = js.native
    var style: js.UndefOr[js.Object] = js.native
    var className: js.UndefOr[String] = js.native
    var in: Boolean = js.native
    var appear: js.UndefOr[Boolean] = js.native
    var unmountOnExit: js.UndefOr[Boolean] = js.native
  }
}
