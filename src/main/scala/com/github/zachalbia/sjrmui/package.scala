package com.github.zachalbia

import cats.Show
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.SyntheticEvent

import scala.language.implicitConversions
import scala.scalajs.js

package object sjrmui {
  type OnJS1[E <: SyntheticEvent[_]] = js.UndefOr[js.Function1[E, Unit]]
  type OnJS2[E <: SyntheticEvent[_], A] = js.UndefOr[js.Function2[E, A, Unit]]
  type Handler1[E <: SyntheticEvent[_]] = js.UndefOr[E => Callback]
  type Handler2[E <: SyntheticEvent[_], A] = js.UndefOr[(E, A) => Callback]

  private[sjrmui] implicit def stringTypeToStr[T <: StringType](t: T): String =
    t.get

  private[sjrmui] implicit def stringTypeShow[T <: StringType]: Show[T] =
    (t: T) => t.get

  private[sjrmui] implicit def stringShow: Show[String] =
    (t: String) => t

  private[sjrmui] implicit def mapToDictionary[T](map: Map[T, String])(implicit sh: Show[T]): js.Dictionary[String] =
    map.foldLeft(js.Dictionary.empty[String]) { (b, a) => b(sh.show(a._1)) = a._2; b }

  private[sjrmui] implicit def undefOrString[A](a: js.UndefOr[A])(implicit conv: A => String): js.UndefOr[String] =
    a.map(conv)

  private[sjrmui] implicit def toOn1[E <: SyntheticEvent[_]](on: js.UndefOr[E => Callback]): OnJS1[E] =
    js.UndefOr.any2undefOrA((e: E) => on.map(_(e).runNow()).get)

  private[sjrmui] implicit def toOn2[E <: SyntheticEvent[_], A](on: js.UndefOr[(E, A) => Callback]): OnJS2[E, A] =
    js.UndefOr.any2undefOrA((e: E, a: A) => on.map(_(e, a).runNow()).get)
}
