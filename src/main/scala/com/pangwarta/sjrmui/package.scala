package com.pangwarta

import cats.Show
import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.component.Js.UnmountedWithRawType
import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.raw.SyntheticEvent

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.|

package object sjrmui {
  type OptJsFun1[A]                             = js.UndefOr[js.Function1[A, Unit]]
  type OptJsFun2[A, B]                          = js.UndefOr[js.Function2[A, B, Unit]]
  type OnJSEv1[E <: SyntheticEvent[_]]          = OptJsFun1[E]
  type OnJSEv2[E <: SyntheticEvent[_], A]       = OptJsFun2[E, A]
  type Handler1[A]                              = js.UndefOr[A => Callback]
  type Handler2[A, B]                           = js.UndefOr[(A, B) => Callback]
  type ReactHandler1[E <: SyntheticEvent[_]]    = Handler1[E]
  type ReactHandler2[E <: SyntheticEvent[_], A] = Handler2[E, A]
  type CssProperties                            = js.Any
  private[sjrmui] val defaultTransitionDuration: Transition = {
    val d = (new js.Object).asInstanceOf[Transition]
    d.enter = 0
    d.exit = 0
    d
  }

  private[sjrmui] def addOtherProps(p: js.Dynamic, otherProps: (String, js.Any)*): Unit =
    otherProps.foreach { case (key, value) => p.updateDynamic(key)(value) }

  implicit private[sjrmui] def stringTypeToStr[T <: StringType](t: T): String =
    t.get

  implicit private[sjrmui] def stringTypeShow[T <: StringType]: Show[T] =
    (t: T) => t.get

  implicit private[sjrmui] def stringShow: Show[String] =
    (t: String) => t

  implicit private[sjrmui] def mapToDictionary[T](map: Map[T, String])(implicit sh: Show[T]): js.Dictionary[String] =
    map.foldLeft(js.Dictionary.empty[String]) { (b, a) =>
      b(sh.show(a._1)) = a._2; b
    }

  implicit private[sjrmui] def undefOrString[A](a: js.UndefOr[A])(implicit conv: A => String): js.UndefOr[String] =
    a.map(conv)

  implicit private[sjrmui] def toOn1[E](on: js.UndefOr[E => Callback]): OptJsFun1[E] =
    js.UndefOr.any2undefOrA((e: E) => on.map(_(e).runNow()).getOrElse(()))

  implicit private[sjrmui] def toOn2[E, A](on: js.UndefOr[(E, A) => Callback]): OptJsFun2[E, A] =
    js.UndefOr.any2undefOrA((e: E, a: A) => on.map(_(e, a).runNow()).getOrElse(()))

  implicit private[sjrmui] def unmountedToReactElement(
    unmounted: js.UndefOr[UnmountedWithRawType[_, _, _]]
  ): js.UndefOr[ReactElement] =
    unmounted.map(_.vdomElement.rawElement)

  implicit private[sjrmui] def unionToJsAny[A, B](union: A | B): js.Any =
    union.asInstanceOf[js.Any]

  implicit private[sjrmui] def undefToAny[A](undefOrA: js.UndefOr[A]): js.Any =
    undefOrA.asInstanceOf[js.Any]
}
