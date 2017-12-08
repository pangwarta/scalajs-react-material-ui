package com.github.zachalbia

import scala.language.implicitConversions
import scala.scalajs.js
import scala.scalajs.js.JSConverters._

package object sjrmui {
  private[sjrmui] implicit def keyToString(classKey: StringType): String =
    classKey.get

  private[sjrmui] implicit def mapToDictionary[K <: StringType](map: Map[K, String]): js.Dictionary[String] =
    map.foldLeft(js.Dictionary.empty[String]) { (b, a) => b(a._1) = a._2; b }

  private[sjrmui] implicit def toUndefOr[A](option: Option[A]): js.UndefOr[A] =
    option.orUndefined
}
