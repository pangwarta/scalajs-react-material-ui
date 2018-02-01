package com.pangwarta.sjrmui.transitions

import com.pangwarta.sjrmui.StringType
import com.pangwarta.sjrmui.internal.Transition

import scala.scalajs.js

object Slide {

  @js.native
  private[sjrmui] trait Props extends Transition.Props {
    var direction: String = js.native
    var timeout: js.UndefOr[Transition.Duration] = js.native
  }

  abstract case class Direction(get: String) extends StringType
  object left extends Direction("left")
  object right extends Direction("right")
  object up extends Direction("up")
  object down extends Direction("down")

  def props(
      direction: js.UndefOr[String],
      timeout:   js.UndefOr[Transition.Duration]
  ): Props = {
    val p = js.Dynamic.literal()
    direction.foreach(p.updateDynamic("direction")(_))
    timeout.foreach(p.updateDynamic("timeout")(_))
    p.asInstanceOf[Props]
  }
}
