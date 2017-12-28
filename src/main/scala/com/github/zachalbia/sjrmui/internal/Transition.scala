package com.github.zachalbia.sjrmui.internal

import com.github.zachalbia.sjrmui.internal.Transition.Callback
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
}

@js.native
trait TransitionClasses extends js.Object {
  var appear: js.UndefOr[String] = js.native
  var appearActive: js.UndefOr[String] = js.native
  var enter: js.UndefOr[String] = js.native
  var enterActive: js.UndefOr[String] = js.native
  var exit: js.UndefOr[String] = js.native
  var exitActive: js.UndefOr[String] = js.native
}

@js.native
trait TransitionHandlers extends js.Object {
  var onEnter: Callback = js.native
  var onEntering: Callback = js.native
  var onEntered: Callback = js.native
  var onExit: Callback = js.native
  var onExiting: Callback = js.native
  var onExited: Callback = js.native
}

@js.native
trait TransitionProps extends js.Object {
  var onEnter: js.UndefOr[Callback] = js.native
  var onEntering: js.UndefOr[Callback] = js.native
  var onEntered: js.UndefOr[Callback] = js.native
  var onExit: js.UndefOr[Callback] = js.native
  var onExiting: js.UndefOr[Callback] = js.native
  var onExited: js.UndefOr[Callback] = js.native
  //TODO: var style: ??? = js.native
  var className: js.UndefOr[String] = js.native
  var in: Boolean = js.native
  var appear: js.UndefOr[Boolean] = js.native
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}
