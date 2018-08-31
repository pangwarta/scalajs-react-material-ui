package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.styles.Breakpoint
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Hidden {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    className: js.UndefOr[String] = js.undefined,
    implementation: js.UndefOr[Implementation] = js.undefined,
    initialWidth: js.UndefOr[Double] = js.undefined,
    lgDown: js.UndefOr[Boolean] = js.undefined,
    lgUp: js.UndefOr[Boolean] = js.undefined,
    mdDown: js.UndefOr[Boolean] = js.undefined,
    mdUp: js.UndefOr[Boolean] = js.undefined,
    only: js.UndefOr[Breakpoint | List[Breakpoint]] = js.undefined,
    smDown: js.UndefOr[Boolean] = js.undefined,
    smUp: js.UndefOr[Boolean] = js.undefined,
    xlDown: js.UndefOr[Boolean] = js.undefined,
    xlUp: js.UndefOr[Boolean] = js.undefined,
    xsDown: js.UndefOr[Boolean] = js.undefined,
    xsUp: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*)(implicit ev: ClassTag[Breakpoint]) = {
    val p = props(
      className,
      implementation,
      initialWidth,
      lgDown,
      lgUp,
      mdDown,
      mdUp,
      // TODO: fix type erasure warning
      only.map {
        (_: Any) match {
          case Breakpoint(bp)       => bp
          case bps: Seq[Breakpoint] => bps.map(_.get).toJSArray
        }
      },
      smDown,
      smUp,
      xlDown,
      xlUp,
      xsDown,
      xsUp,
      otherProps: _*
    )
    component(p)(children: _*)
  }

  private def props(
    className: js.UndefOr[String],
    implementation: js.UndefOr[String],
    initialWidth: js.UndefOr[Double],
    lgDown: js.UndefOr[Boolean],
    lgUp: js.UndefOr[Boolean],
    mdDown: js.UndefOr[Boolean],
    mdUp: js.UndefOr[Boolean],
    only: js.UndefOr[String | js.Array[String]],
    smDown: js.UndefOr[Boolean],
    smUp: js.UndefOr[Boolean],
    xlDown: js.UndefOr[Boolean],
    xlUp: js.UndefOr[Boolean],
    xsDown: js.UndefOr[Boolean],
    xsUp: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    className.foreach(p.updateDynamic("className")(_))
    implementation.foreach(p.updateDynamic("implementation")(_))
    initialWidth.foreach(p.updateDynamic("initialWidth")(_))
    lgDown.foreach(p.updateDynamic("lgDown")(_))
    lgUp.foreach(p.updateDynamic("lgUp")(_))
    mdDown.foreach(p.updateDynamic("mdDown")(_))
    mdUp.foreach(p.updateDynamic("mdUp")(_))
    only.foreach(p.updateDynamic("only")(_))
    smDown.foreach(p.updateDynamic("smDown")(_))
    smUp.foreach(p.updateDynamic("smUp")(_))
    xlDown.foreach(p.updateDynamic("xlDown")(_))
    xlUp.foreach(p.updateDynamic("xlUp")(_))
    xsDown.foreach(p.updateDynamic("xsDown")(_))
    xsUp.foreach(p.updateDynamic("xsUp")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var className: js.UndefOr[String]               = js.native
    var implementation: js.UndefOr[String]          = js.native
    var initialWidth: js.UndefOr[Double]            = js.native
    var lgDown: js.UndefOr[Boolean]                 = js.native
    var lgUp: js.UndefOr[Boolean]                   = js.native
    var mdDown: js.UndefOr[Boolean]                 = js.native
    var mdUp: js.UndefOr[Boolean]                   = js.native
    var only: js.UndefOr[String | js.Array[String]] = js.native
    var smDown: js.UndefOr[Boolean]                 = js.native
    var smUp: js.UndefOr[Boolean]                   = js.native
    var xlDown: js.UndefOr[Boolean]                 = js.native
    var xlUp: js.UndefOr[Boolean]                   = js.native
    var xsDown: js.UndefOr[Boolean]                 = js.native
    var xsUp: js.UndefOr[Boolean]                   = js.native
  }

  sealed abstract case class Implementation(get: String) extends StringType
  object Implementation {
    object js  extends Implementation("js")
    object css extends Implementation("css")
  }

  @JSImport("@material-ui/core", "Hidden")
  @js.native
  private object RawComponent extends js.Object
}
