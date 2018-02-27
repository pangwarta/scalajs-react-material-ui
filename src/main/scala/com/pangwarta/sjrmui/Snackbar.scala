package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import internal.Transition
import japgolly.scalajs.react.vdom.VdomNode

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Snackbar {

  @JSImport("material-ui", "Snackbar")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait OriginInternal extends js.Object {
    var horizontal: String | Int = js.native
    var vertical: String | Int = js.native
  }

  case class Origin(
      horizontal: Either[Horizontal, Int],
      vertical:   Either[Vertical, Int]
  )

  private def toOriginInternal(origin: Origin): OriginInternal = {
    val originInternal = js.Dynamic.literal()
    origin.horizontal match {
      case Left(h)  => originInternal.updateDynamic("horizontal")(h.get)
      case Right(n) => originInternal.updateDynamic("horizontal")(n)
    }
    origin.vertical match {
      case Left(v)  => originInternal.updateDynamic("vertical")(v.get)
      case Right(n) => originInternal.updateDynamic("vertical")(n)
    }
    originInternal.asInstanceOf[OriginInternal]
  }

  sealed abstract case class Horizontal(get: String) extends StringType
  object Horizontal {
    object left extends Horizontal("left")
    object center extends Horizontal("center")
    object right extends Horizontal("right")
  }

  sealed abstract case class Vertical(get: String) extends StringType
  object Vertical {
    object top extends Vertical("top")
    object center extends Vertical("center")
    object bottom extends Vertical("bottom")
  }

  @js.native
  private[sjrmui] trait Props extends Transition.HandlerOpts {
    var action: js.UndefOr[ReactElement] = js.native
    var anchorOrigin: js.UndefOr[OriginInternal] = js.native
    var autoHideDuration: js.UndefOr[Int] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableWindowBlurListener: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[js.Any] = js.native
    var message: js.UndefOr[ReactElement] = js.native
    var onClose: OnJSEv2[ReactEvent, String] = js.native
    var onMouseEnter: OnJSEv1[ReactMouseEventFromHtml] = js.native
    var onMouseLeave: OnJSEv1[ReactMouseEventFromHtml] = js.native
    var open: js.UndefOr[Boolean] = js.native
    var resumeHideDuration: js.UndefOr[Int] = js.native
    var SnackBarContentProps: js.UndefOr[SnackbarContent.Props] = js.native
    var transition: js.UndefOr[String | ReactElement] = js.native
    var transitionDuration: js.UndefOr[Transition.Duration] = js.native
  }

  private def props(
      action:                    js.UndefOr[ReactElement],
      anchorOrigin:              js.UndefOr[OriginInternal],
      autoHideDuration:          js.UndefOr[Int],
      classes:                   js.Dictionary[String],
      className:                 js.UndefOr[String],
      disableWindowBlurListener: js.UndefOr[Boolean],
      key:                       js.UndefOr[js.Any],
      message:                   js.UndefOr[ReactElement],
      onClose:                   OnJSEv2[ReactEvent, String],
      onMouseEnter:              OnJSEv1[ReactMouseEventFromHtml],
      onMouseLeave:              OnJSEv1[ReactMouseEventFromHtml],
      open:                      js.UndefOr[Boolean],
      resumeHideDuration:        js.UndefOr[Int],
      SnackBarContentProps:      js.UndefOr[SnackbarContent.Props],
      transition:                js.UndefOr[String | ReactElement],
      transitionDuration:        js.UndefOr[Transition.Duration],
      otherProps:                (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    action.foreach(p.updateDynamic("action")(_))
    anchorOrigin.foreach(p.updateDynamic("anchorOrigin")(_))
    autoHideDuration.foreach(p.updateDynamic("autoHideDuration")(_))
    className.foreach(p.updateDynamic("className")(_))
    disableWindowBlurListener.foreach(p.updateDynamic("disableWindowBlurListener")(_))
    key.foreach(p.updateDynamic("key")(_))
    message.foreach(p.updateDynamic("message")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    onMouseEnter.foreach(p.updateDynamic("onMouseEnter")(_))
    onMouseLeave.foreach(p.updateDynamic("onMouseLeave")(_))
    open.foreach(p.updateDynamic("open")(_))
    resumeHideDuration.foreach(p.updateDynamic("resumeHideDuration")(_))
    SnackBarContentProps.foreach(p.updateDynamic("SnackBarContentProps")(_))
    transition.foreach(p.updateDynamic("transition")(_))
    transitionDuration.foreach(p.updateDynamic("transitionDuration")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object anchorTopCenter extends ClassKey("anchorTopCenter")
    object anchorBottomCenter extends ClassKey("anchorBottomCenter")
    object anchorTopRight extends ClassKey("anchorTopRight")
    object anchorBottomRight extends ClassKey("anchorBottomRight")
    object anchorTopLeft extends ClassKey("anchorTopLeft")
    object anchorBottomLeft extends ClassKey("anchorBottomLeft")
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      action:                    js.UndefOr[ReactElement]          = js.undefined,
      anchorOrigin:              js.UndefOr[Origin]                = js.undefined,
      autoHideDuration:          js.UndefOr[Int]                   = js.undefined,
      classes:                   Map[ClassKey, String]             = Map.empty,
      className:                 js.UndefOr[String]                = js.undefined,
      disableWindowBlurListener: js.UndefOr[Boolean]               = js.undefined,
      key:                       js.UndefOr[js.Any]                = js.undefined,
      message:                   js.UndefOr[ReactElement]          = js.undefined,
      onClose:                   OnJSEv2[ReactEvent, String]       = js.undefined,
      onMouseEnter:              OnJSEv1[ReactMouseEventFromHtml]  = js.undefined,
      onMouseLeave:              OnJSEv1[ReactMouseEventFromHtml]  = js.undefined,
      open:                      js.UndefOr[Boolean]               = js.undefined,
      resumeHideDuration:        js.UndefOr[Int]                   = js.undefined,
      SnackBarContentProps:      js.UndefOr[SnackbarContent.Props] = js.undefined,
      transition:                js.UndefOr[String | ReactElement] = js.undefined,
      transitionDuration:        js.UndefOr[Transition.Duration]   = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      action,
      anchorOrigin.map(toOriginInternal),
      autoHideDuration,
      classes,
      className,
      disableWindowBlurListener,
      key,
      message,
      onClose,
      onMouseEnter,
      onMouseLeave,
      open,
      resumeHideDuration,
      SnackBarContentProps,
      transition,
      transitionDuration,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
