package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TablePagination {

  @JSImport("materials-ui", "TablePagination")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props[A] extends js.Object {
    var actions: js.UndefOr[Boolean | String] = js.native
    var backIconButtonProps: js.UndefOr[Object] = js.native
    var classes: js.Dictionary[String] = js.native
    var component: js.UndefOr[Boolean | String] = js.native
    var count: js.UndefOr[Int] = js.native
    var labelDisplayedRows: OnJSEv1[ReactEvent] = js.native
    var labelRowsPerPage: js.UndefOr[String | ReactElement] = js.native
    var nextIconButtonProps: js.UndefOr[Object] = js.native
    var onChangePage: OnJSEv1[ReactEvent] = js.native
    var onChangeRowsPerPage: OnJSEv1[ReactEvent] = js.native
    var page: js.UndefOr[Int] = js.native
    var rowsPerPage: js.UndefOr[Int] = js.native
    var rowsPerPageOptions: js.UndefOr[js.Array[Int]] = js.native

  }

  private def props[A](
      actions:             js.UndefOr[Boolean | String],
      backIconButtonProps: js.UndefOr[Object],
      classes:             js.Dictionary[String],
      component:           js.UndefOr[Boolean | String],
      count:               js.UndefOr[Int],
      labelDisplayedRows:  OnJSEv1[ReactEvent],
      labelRowsPerPage:    js.UndefOr[String | ReactElement],
      nextIconButtonProps: js.UndefOr[Object],
      onChangePage:        OnJSEv1[ReactEvent],
      onChangeRowsPerPage: OnJSEv1[ReactEvent],
      page:                js.UndefOr[Int],
      rowsPerPage:         js.UndefOr[Int],
      rowsPerPageOptions:  js.UndefOr[js.Array[Int]],
      otherProps:          (String, js.Any)*

  ): Props[A] = {
    val p = js.Dynamic.literal(classes = classes)
    actions.foreach(v => p.updateDynamic("actions")(v))
    backIconButtonProps.foreach(v => p.updateDynamic("backIconButtonProps")(v.asInstanceOf[js.Any]))
    component.foreach(v => p.updateDynamic("component")(v))
    count.foreach(v => p.updateDynamic("count")(v))
    labelDisplayedRows.foreach(v => p.updateDynamic("labelDisplayedRows")(v))
    labelRowsPerPage.foreach(v => p.updateDynamic("labelRowsPerPage")(v))
    nextIconButtonProps.foreach(v => p.updateDynamic("nextIconButtonProps")(v.asInstanceOf[js.Any]))
    onChangePage.foreach(v => p.updateDynamic("onChangePage")(v))
    onChangeRowsPerPage.foreach(v => p.updateDynamic("onChangeRowsPerPage")(v))
    page.foreach(v => p.updateDynamic("page")(v))
    rowsPerPage.foreach(v => p.updateDynamic("rowsPerPage")(v))
    rowsPerPageOptions.foreach(v => p.updateDynamic("rowsPerPageOptions")(v.asInstanceOf[js.Any]))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props[A]]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object toolbar extends ClassKey("toolbar")
  object spacer extends ClassKey("spacer")
  object caption extends ClassKey("caption")
  object input extends ClassKey("input")
  object selectRoot extends ClassKey("selectRoot")
  object select extends ClassKey("select")

  private def component[A] = JsComponent[Props[A], Children.Varargs, Null](RawComponent)

  def apply[A](
      actions:             js.UndefOr[Boolean | String]      = js.undefined,
      backIconButtonProps: js.UndefOr[Object]                = js.undefined,
      classes:             Map[ClassKey, String]             = Map.empty,
      component:           js.UndefOr[Boolean | String]      = js.undefined,
      count:               js.UndefOr[Int]                   = js.undefined,
      labelDisplayedRows:  OnJSEv1[ReactEvent]               = js.undefined,
      labelRowsPerPage:    js.UndefOr[String | ReactElement] = js.undefined,
      nextIconButtonProps: js.UndefOr[Object]                = js.undefined,
      onChangePage:        OnJSEv1[ReactEvent]               = js.undefined,
      onChangeRowsPerPage: OnJSEv1[ReactEvent]               = js.undefined,
      page:                js.UndefOr[Int]                   = js.undefined,
      rowsPerPage:         js.UndefOr[Int]                   = js.undefined,
      rowsPerPageOptions:  js.UndefOr[js.Array[Int]]         = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props[A](
      actions,
      backIconButtonProps,
      classes,
      component,
      count,
      labelDisplayedRows,
      labelRowsPerPage,
      nextIconButtonProps,
      onChangePage,
      onChangeRowsPerPage,
      page,
      rowsPerPage,
      rowsPerPageOptions,
      otherProps: _*
    )
    this.component[A](p)(children: _*)
  }
}

