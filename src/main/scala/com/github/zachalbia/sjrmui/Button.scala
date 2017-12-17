package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.language.higherKinds
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Button {

  @JSImport("material-ui", "Button")
  @js.native
  private object RawComponent extends js.Object

  abstract case class Color(get: String) extends StringType
  object default extends Color("default")
  object inherit extends Color("inherit")
  object primary extends Color("primary")
  object accent extends Color("accent")
  object contrast extends Color("contrast")

  @js.native
  private[sjrmui] trait Props extends ButtonBase.Props {
    var color: String = js.native
    var dense: Boolean = js.native
    var disableFocusRipple: Boolean = js.native
    var fab: Boolean = js.native
    var href: js.UndefOr[String] = js.native
    var mini: Boolean = js.native
    var raised: Boolean = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object dense extends ClassKey("dense")
  object label extends ClassKey("label")
  object flatPrimary extends ClassKey("flatPrimary")
  object flatAccent extends ClassKey("flatAccent")
  object flatContrast extends ClassKey("flatContrast")
  object colorInherit extends ClassKey("colorInherit")
  object raised extends ClassKey("raised")
  object keyboardFocused extends ClassKey("keyboardFocused")
  object raisedPrimary extends ClassKey("raisedPrimary")
  object raisedAccent extends ClassKey("raisedAccent")
  object raisedContrast extends ClassKey("raisedContrast")
  object disabled extends ClassKey("disabled")
  object fab extends ClassKey("fab")
  object mini extends ClassKey("mini")

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      color:                    Color                        = default,
      dense:                    Boolean                      = false,
      disableFocusRipple:       Boolean                      = false,
      fab:                      Boolean                      = false,
      href:                     js.UndefOr[String]           = js.undefined,
      mini:                     Boolean                      = false,
      raised:                   Boolean                      = false,
      centerRipple:             Boolean                      = false,
      className:                js.UndefOr[String]           = js.undefined,
      component:                String | ReactElement        = "button",
      disableRipple:            Boolean                      = false,
      disabled:                 Boolean                      = false,
      focusRipple:              Boolean                      = false,
      keyboardFocusedClassName: js.UndefOr[String]           = js.undefined,
      onBlur:                   Handler1[ReactEvent]         = js.undefined,
      onClick:                  Handler1[ReactMouseEvent]    = js.undefined,
      onFocus:                  Handler1[ReactFocusEvent]    = js.undefined,
      onKeyboardFocus:          Handler1[ReactFocusEvent]    = js.undefined,
      onKeyDown:                Handler1[ReactKeyboardEvent] = js.undefined,
      onKeyUp:                  Handler1[ReactKeyboardEvent] = js.undefined,
      onMouseDown:              Handler1[ReactMouseEvent]    = js.undefined,
      onMouseLeave:             Handler1[ReactMouseEvent]    = js.undefined,
      onMouseUp:                Handler1[ReactMouseEvent]    = js.undefined,
      onTouchEnd:               Handler1[ReactTouchEvent]    = js.undefined,
      onTouchMove:              Handler1[ReactTouchEvent]    = js.undefined,
      onTouchStart:             Handler1[ReactTouchEvent]    = js.undefined,
      role:                     js.UndefOr[String]           = js.undefined,
      tabIndex:                 js.UndefOr[Int | String]     = js.undefined)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.color = color
    p.dense = dense
    p.disableFocusRipple = disableFocusRipple
    p.fab = fab
    p.href = href
    p.mini = mini
    p.raised = raised
    p.centerRipple = centerRipple
    p.className = className
    p.component = component
    p.disableRipple = disableRipple
    p.disabled = disabled
    p.focusRipple = focusRipple
    p.keyboardFocusedClassName = keyboardFocusedClassName
    p.onBlur = onBlur
    p.onClick = onClick
    p.onFocus = onFocus
    p.onKeyboardFocus = onKeyboardFocus
    p.onKeyDown = onKeyDown
    p.onKeyUp = onKeyUp
    p.onMouseDown = onMouseDown
    p.onMouseLeave = onMouseLeave
    p.onMouseUp = onMouseUp
    p.onTouchEnd = onTouchEnd
    p.onTouchMove = onTouchMove
    p.onTouchStart = onTouchStart
    p.role = role
    p.tabIndex = tabIndex
    this.component(p)(children: _*)
  }
}
