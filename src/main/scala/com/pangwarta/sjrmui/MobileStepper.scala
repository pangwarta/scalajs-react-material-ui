package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MobileStepper {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    activeStep: js.UndefOr[Int],
    backButton: ReactElement,
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    nextButton: ReactElement,
    position: js.UndefOr[Position],
    steps: Int,
    `type`: js.UndefOr[Type]
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      activeStep,
      backButton,
      classes,
      className,
      nextButton,
      position,
      steps,
      `type`,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    activeStep: js.UndefOr[Int],
    backButton: ReactElement,
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    nextButton: ReactElement,
    position: js.UndefOr[String],
    steps: Int,
    `type`: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      backButton = backButton,
      classes = classes,
      nextButton = nextButton,
      steps = steps
    )
    activeStep.foreach(p.updateDynamic("activeStep")(_))
    className.foreach(p.updateDynamic("className")(_))
    position.foreach(p.updateDynamic("position")(_))
    `type`.foreach(p.updateDynamic("`type`")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var activeStep: js.UndefOr[Int]    = js.native
    var backButton: ReactElement       = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String]  = js.native
    var nextButton: ReactElement       = js.native
    var position: js.UndefOr[String]   = js.native
    var steps: Int                     = js.native
    var `type`: js.UndefOr[String]     = js.native
  }

  sealed abstract case class Position(get: String) extends StringType

  sealed abstract case class Type(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object bottom extends Position("bottom")

  object top extends Position("top")

  object static extends Position("static")

  object text extends Type("text")

  object dots extends Type("dots")

  object progress extends Type("progress")

  object ClassKey {
    object root           extends ClassKey("root")
    object rounded        extends ClassKey("rounded")
    object shadow0        extends ClassKey("shadow0")
    object shadow1        extends ClassKey("shadow1")
    object shadow2        extends ClassKey("shadow2")
    object shadow3        extends ClassKey("shadow3")
    object shadow4        extends ClassKey("shadow4")
    object shadow5        extends ClassKey("shadow5")
    object shadow6        extends ClassKey("shadow6")
    object shadow7        extends ClassKey("shadow7")
    object shadow8        extends ClassKey("shadow8")
    object shadow9        extends ClassKey("shadow9")
    object shadow10       extends ClassKey("shadow10")
    object shadow11       extends ClassKey("shadow11")
    object shadow12       extends ClassKey("shadow12")
    object shadow13       extends ClassKey("shadow13")
    object shadow14       extends ClassKey("shadow14")
    object shadow15       extends ClassKey("shadow15")
    object shadow16       extends ClassKey("shadow16")
    object shadow17       extends ClassKey("shadow17")
    object shadow18       extends ClassKey("shadow18")
    object shadow19       extends ClassKey("shadow19")
    object shadow20       extends ClassKey("shadow20")
    object shadow21       extends ClassKey("shadow21")
    object shadow22       extends ClassKey("shadow22")
    object shadow23       extends ClassKey("shadow23")
    object shadow24       extends ClassKey("shadow24")
    object positionBottom extends ClassKey("positionBottom")
    object positionTop    extends ClassKey("positionTop")
    object positionStatic extends ClassKey("positionStatic")
    object dots           extends ClassKey("dots")
    object dot            extends ClassKey("dot")
    object dotActive      extends ClassKey("dotActive")
    object progress       extends ClassKey("progress")
  }

  @JSImport("@material-ui/core", "MobileStepper")
  @js.native
  private object RawComponent extends js.Object
}
