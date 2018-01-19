package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.styles.Breakpoint
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.scalajs.js.JSConverters._

// TODO: Warning: Material-UI: unsupported properties received {} by `<Hidden />`
object Hidden {

  @JSImport("material-ui", "Hidden")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var implementation: js.UndefOr[String] = js.native
    var initialWidth: js.UndefOr[Double] = js.native
    var lgDown: js.UndefOr[Boolean] = js.native
    var lgUp: js.UndefOr[Boolean] = js.native
    var mdDown: js.UndefOr[Boolean] = js.native
    var mdUp: js.UndefOr[Boolean] = js.native
    var only: js.UndefOr[String | js.Array[String]] = js.native
    var smDown: js.UndefOr[Boolean] = js.native
    var smUp: js.UndefOr[Boolean] = js.native
    var xlDown: js.UndefOr[Boolean] = js.native
    var xlUp: js.UndefOr[Boolean] = js.native
    var xsDown: js.UndefOr[Boolean] = js.native
    var xsUp: js.UndefOr[Boolean] = js.native
  }

  private def props(
      className:      js.UndefOr[String],
      implementation: js.UndefOr[String],
      initialWidth:   js.UndefOr[Double],
      lgDown:         js.UndefOr[Boolean],
      lgUp:           js.UndefOr[Boolean],
      mdDown:         js.UndefOr[Boolean],
      mdUp:           js.UndefOr[Boolean],
      only:           js.UndefOr[String | js.Array[String]],
      smDown:         js.UndefOr[Boolean],
      smUp:           js.UndefOr[Boolean],
      xlDown:         js.UndefOr[Boolean],
      xlUp:           js.UndefOr[Boolean],
      xsDown:         js.UndefOr[Boolean],
      xsUp:           js.UndefOr[Boolean],
      otherProps:     (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      className      = className,
      implementation = implementation,
      initialWidth   = initialWidth,
      lgDown         = lgDown,
      lgUp           = lgUp,
      mdDown         = mdDown,
      mdUp           = mdUp,
      only           = only,
      smDown         = smDown,
      smUp           = smUp,
      xlDown         = xlDown,
      xlUp           = xlUp,
      xsDown         = xsDown,
      xsUp           = xsUp
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  sealed abstract case class Implementation(get: String) extends StringType
  object Implementation {
    object js extends Implementation("js")
    object css extends Implementation("css")
  }

  def apply(
      className:      js.UndefOr[String]                        = js.undefined,
      implementation: js.UndefOr[Implementation]                = Implementation.js,
      initialWidth:   js.UndefOr[Double]                        = js.undefined,
      lgDown:         js.UndefOr[Boolean]                       = false,
      lgUp:           js.UndefOr[Boolean]                       = false,
      mdDown:         js.UndefOr[Boolean]                       = false,
      mdUp:           js.UndefOr[Boolean]                       = false,
      only:           js.UndefOr[Breakpoint | List[Breakpoint]] = js.undefined,
      smDown:         js.UndefOr[Boolean]                       = false,
      smUp:           js.UndefOr[Boolean]                       = false,
      xlDown:         js.UndefOr[Boolean]                       = false,
      xlUp:           js.UndefOr[Boolean]                       = false,
      xsDown:         js.UndefOr[Boolean]                       = false,
      xsUp:           js.UndefOr[Boolean]                       = false
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
}
