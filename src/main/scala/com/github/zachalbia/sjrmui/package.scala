package com.github.zachalbia

import scala.language.implicitConversions
import scala.scalajs.js

package object sjrmui {
  implicit def mapToDictionary(map: Map[String, String]): js.Dictionary[String] =
    map.foldLeft(js.Dictionary.empty[String]) { (b, a) => b(a._1) = a._2; b }
}
