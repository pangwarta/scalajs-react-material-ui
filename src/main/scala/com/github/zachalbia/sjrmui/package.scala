package com.github.zachalbia

import scala.language.implicitConversions
import scala.scalajs.js

package object sjrmui {
  private[sjrmui] implicit def keyToString(classKey: StringType): String =
    classKey.get

  private[sjrmui] implicit def mapToDictionary[K <: StringType](map: Map[K, String]): js.Dictionary[String] =
    map.foldLeft(js.Dictionary.empty[String]) { (b, a) => b(a._1) = a._2; b }
}
