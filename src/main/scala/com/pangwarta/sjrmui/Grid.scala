package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Grid {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    alignContent: js.UndefOr[AlignContent] = js.undefined,
    alignItems: js.UndefOr[AlignItems] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    container: js.UndefOr[Boolean] = js.undefined,
    direction: js.UndefOr[Direction] = js.undefined,
    hidden: js.UndefOr[Hidden.Props] = js.undefined,
    item: js.UndefOr[Boolean] = js.undefined,
    justify: js.UndefOr[Justify] = js.undefined,
    lg: js.UndefOr[Boolean | Int] = js.undefined,
    md: js.UndefOr[Boolean | Int] = js.undefined,
    sm: js.UndefOr[Boolean | Int] = js.undefined,
    spacing: js.UndefOr[Int] = js.undefined,
    wrap: js.UndefOr[Wrap] = js.undefined,
    xl: js.UndefOr[Boolean | Int] = js.undefined,
    xs: js.UndefOr[Boolean | Int] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      alignContent,
      alignItems,
      classes,
      component,
      container,
      direction,
      hidden,
      item,
      justify,
      lg,
      md,
      sm,
      spacing,
      wrap,
      xl,
      xs,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    alignContent: js.UndefOr[String],
    alignItems: js.UndefOr[String],
    classes: js.Dictionary[String],
    component: js.UndefOr[String | ReactElement],
    container: js.UndefOr[Boolean],
    direction: js.UndefOr[String],
    hidden: js.UndefOr[Hidden.Props],
    item: js.UndefOr[Boolean],
    justify: js.UndefOr[String],
    lg: js.UndefOr[Boolean | Int],
    md: js.UndefOr[Boolean | Int],
    sm: js.UndefOr[Boolean | Int],
    spacing: js.UndefOr[Int],
    wrap: js.UndefOr[String],
    xl: js.UndefOr[Boolean | Int],
    xs: js.UndefOr[Boolean | Int],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    alignContent.foreach(p.updateDynamic("alignContent")(_))
    alignItems.foreach(p.updateDynamic("alignItems")(_))
    component.foreach(p.updateDynamic("component")(_))
    container.foreach(p.updateDynamic("container")(_))
    direction.foreach(p.updateDynamic("direction")(_))
    hidden.foreach(p.updateDynamic("hidden")(_))
    item.foreach(p.updateDynamic("item")(_))
    justify.foreach(p.updateDynamic("justify")(_))
    lg.foreach(p.updateDynamic("lg")(_))
    md.foreach(p.updateDynamic("md")(_))
    sm.foreach(p.updateDynamic("sm")(_))
    spacing.foreach(p.updateDynamic("spacing")(_))
    wrap.foreach(p.updateDynamic("wrap")(_))
    xl.foreach(p.updateDynamic("xl")(_))
    xs.foreach(p.updateDynamic("xs")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var alignContent: js.UndefOr[String]             = js.native
    var alignItems: js.UndefOr[String]               = js.native
    var classes: js.Dictionary[String]               = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var container: js.UndefOr[Boolean]               = js.native
    var direction: js.UndefOr[String]                = js.native
    var hidden: js.UndefOr[Hidden.Props]             = js.native
    var item: js.UndefOr[Boolean]                    = js.native
    var justify: js.UndefOr[String]                  = js.native
    var lg: js.UndefOr[Boolean | Int]                = js.native
    var md: js.UndefOr[Boolean | Int]                = js.native
    var sm: js.UndefOr[Boolean | Int]                = js.native
    var spacing: js.UndefOr[Int]                     = js.native
    var wrap: js.UndefOr[String]                     = js.native
    var xl: js.UndefOr[Boolean | Int]                = js.native
    var xs: js.UndefOr[Boolean | Int]                = js.native
  }

  sealed abstract case class AlignContent(get: String) extends StringType

  sealed abstract case class AlignItems(get: String) extends StringType

  sealed abstract case class Direction(get: String) extends StringType

  sealed abstract case class Justify(get: String) extends StringType

  sealed abstract case class Wrap(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object AlignContent {
    object stretch      extends AlignContent("stretch")
    object center       extends AlignContent("center")
    object flexStart    extends AlignContent("flex-start")
    object flexEnd      extends AlignContent("flex-end")
    object spaceBetween extends AlignContent("space-between")
    object spaceAround  extends AlignContent("space-around")
  }

  object AlignItems {
    object flexStart extends AlignItems("flex-start")
    object center    extends AlignItems("center")
    object flexEnd   extends AlignItems("flex-end")
    object stretch   extends AlignItems("stretch")
    object baseline  extends AlignItems("baseline")
  }

  object Direction {
    object row           extends Direction("row")
    object rowReverse    extends Direction("row-reverse")
    object column        extends Direction("column")
    object columnReverse extends Direction("column-reverse")
  }

  object Justify {
    object flexStart    extends Justify("FlexStart")
    object center       extends Justify("Center")
    object flexEnd      extends Justify("FlexEnd")
    object spaceBetween extends Justify("SpaceBetween")
    object spaceAround  extends Justify("SpaceAround")
  }

  object Wrap {
    object nowrap      extends Wrap("nowrap")
    object wrap        extends Wrap("wrap")
    object wrapReverse extends Wrap("wrap-reverse")
  }

  object typeContainer                             extends ClassKey("typeContainer")

  object typeItem                                  extends ClassKey("typeItem")

  object directionXsColumn                         extends ClassKey("direction-xs-column")

  object directionXsColumnReverse                  extends ClassKey("direction-xs-column-reverse")

  object directionXsRowReverse                     extends ClassKey("direction-xs-row-reverse")

  object wrapXsNowrap                              extends ClassKey("wrap-xs-nowrap")

  object wrapXsWrapReverse                         extends ClassKey("wrap-xs-wrap-reverse")

  object alignItemsXsCenter                        extends ClassKey("align-items-xs-center")

  object alignItemsXsFlexStart                     extends ClassKey("align-items-xs-flex-start")

  object alignItemsXsFlexEnd                       extends ClassKey("align-items-xs-flex-end")

  object alignItemsXsBaseline                      extends ClassKey("align-items-xs-baseline")

  object alignContentXsCenter                      extends ClassKey("align-content-xs-center")

  object alignContentXsFlexStart                   extends ClassKey("align-content-xs-flex-start")

  object alignContentXsFlexEnd                     extends ClassKey("align-content-xs-flex-end")

  object alignContentXsSpaceBetween                extends ClassKey("align-content-xs-space-between")

  object alignContentXsSpaceAround                 extends ClassKey("align-content-xs-space-around")

  object justifyXsCenter                           extends ClassKey("justify-xs-center")

  object justifyXsFlexEnd                          extends ClassKey("justify-xs-flex-end")

  object justifyXsSpaceBetween                     extends ClassKey("justify-xs-space-between")

  object justifyXsSpaceAround                      extends ClassKey("justify-xs-space-around")

  object spacingXs8                                extends ClassKey("spacing-xs-8")

  object spacingXs16                               extends ClassKey("spacing-xs-16")

  object spacingXs24                               extends ClassKey("spacing-xs-24")

  object spacingXs40                               extends ClassKey("spacing-xs-40")

  object gridXs                                    extends ClassKey("grid-xs")

  object gridXs1                                   extends ClassKey("grid-xs-1")

  object gridXs2                                   extends ClassKey("grid-xs-2")

  object gridXs3                                   extends ClassKey("grid-xs-3")

  object gridXs4                                   extends ClassKey("grid-xs-4")

  object gridXs5                                   extends ClassKey("grid-xs-5")

  object gridXs6                                   extends ClassKey("grid-xs-6")

  object gridXs7                                   extends ClassKey("grid-xs-7")

  object gridXs8                                   extends ClassKey("grid-xs-8")

  object gridXs9                                   extends ClassKey("grid-xs-9")

  object gridXs10                                  extends ClassKey("grid-xs-10")

  object gridXs11                                  extends ClassKey("grid-xs-11")

  object gridXs12                                  extends ClassKey("grid-xs-12")

  @JSImport("@material-ui/core", "Grid")
  @js.native
  private object RawComponent extends js.Object
}
