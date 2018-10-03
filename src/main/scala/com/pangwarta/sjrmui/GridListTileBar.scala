package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Node => ReactNode}
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object GridListTileBar {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
    actionIcon: js.UndefOr[ReactNode] = js.undefined,
    actionPosition: js.UndefOr[ActionPosition] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    subtitle: js.UndefOr[ReactNode] = js.undefined,
    title: js.UndefOr[ReactNode] = js.undefined,
    titlePosition: js.UndefOr[TitlePosition] = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      actionIcon,
      actionPosition,
      classes,
      className,
      subtitle,
      title,
      titlePosition,
      otherProps: _*
    )
    this.component(p)
  }

  private def props(
    actionIcon: js.UndefOr[ReactNode],
    actionPosition: js.UndefOr[String],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    subtitle: js.UndefOr[ReactNode],
    title: js.UndefOr[ReactNode],
    titlePosition: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    actionIcon.foreach(p.updateDynamic("actionIcon")(_))
    actionPosition.foreach(p.updateDynamic("actionPosition")(_))
    className.foreach(p.updateDynamic("className")(_))
    subtitle.foreach(p.updateDynamic("subtitle")(_))
    title.foreach(p.updateDynamic("title")(_))
    titlePosition.foreach(p.updateDynamic("titlePosition")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var actionIcon: js.UndefOr[ReactNode]  = js.native
    var actionPosition: js.UndefOr[String] = js.native
    var classes: js.Dictionary[String]     = js.native
    var className: js.UndefOr[String]      = js.native
    var subtitle: js.UndefOr[ReactNode]    = js.native
    var title: js.UndefOr[ReactNode]       = js.native
    var titlePosition: js.UndefOr[String]  = js.native
  }

  sealed abstract case class ActionPosition(get: String) extends StringType

  sealed abstract case class TitlePosition(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object left                                            extends ActionPosition("left")

  object right                                           extends ActionPosition("right")

  object top                                            extends TitlePosition("top")

  object bottom                                         extends TitlePosition("bottom")

  object root                                      extends ClassKey("root")
  object rootBottom                                extends ClassKey("rootBottom")
  object rootTop                                   extends ClassKey("rootTop")
  object rootWithSubtitle                          extends ClassKey("rootWithSubtitle")
  object titleWrap                                 extends ClassKey("titleWrap")
  object titleWrapActionLeft                       extends ClassKey("titleWrapActionLeft")
  object titleWrapActionRight                      extends ClassKey("titleWrapActionRight")
  object title                                     extends ClassKey("title")
  object subtitle                                  extends ClassKey("subtitle")
  object actionIconPositionLeft                    extends ClassKey("actionIconPositionLeft")
  object childImg                                  extends ClassKey("childImg")

  @JSImport("@material-ui/core", "GridListTileBar")
  @js.native
  private object RawComponent extends js.Object
}
