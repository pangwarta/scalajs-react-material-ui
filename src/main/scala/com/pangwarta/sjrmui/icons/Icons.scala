/** Heavily and shamefully based off of https://goo.gl/Gu1nxL **/
package com.pangwarta.sjrmui.icons

import com.pangwarta.sjrmui._
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{ Children, JsComponent, ReactMouseEventFromHtml }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait MuiSvgIconProps extends js.Object {
  var key: js.UndefOr[String] = js.native
  var ref: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var onMouseEnter: OnJSEv1[ReactMouseEventFromHtml] = js.native
  var onMouseLeave: OnJSEv1[ReactMouseEventFromHtml] = js.native
  var style: js.UndefOr[CssProperties] = js.native
  var viewBox: js.UndefOr[String] = js.native
}

object MuiSvgIcon {
  implicit class SvgIconApply(icon: MuiSvgIcon) {
    private def props(
        key:          js.UndefOr[String],
        ref:          js.UndefOr[String],
        color:        js.UndefOr[String],
        hoverColor:   js.UndefOr[String],
        onMouseEnter: OnJSEv1[ReactMouseEventFromHtml],
        onMouseLeave: OnJSEv1[ReactMouseEventFromHtml],
        style:        js.UndefOr[CssProperties],
        viewBox:      js.UndefOr[String]
    ): MuiSvgIconProps = {
      val p = js.Dynamic.literal()
      key.foreach(p.updateDynamic("key")(_))
      ref.foreach(p.updateDynamic("ref")(_))
      color.foreach(p.updateDynamic("color")(_))
      hoverColor.foreach(p.updateDynamic("hoverColor")(_))
      onMouseEnter.foreach(p.updateDynamic("onMouseEnter")(_))
      onMouseLeave.foreach(p.updateDynamic("onMouseLeave")(_))
      style.foreach(p.updateDynamic("style")(_))
      viewBox.foreach(p.updateDynamic("viewBox")(_))
      p.asInstanceOf[MuiSvgIconProps]
    }

    def apply(
        key:          js.UndefOr[String]                     = js.undefined,
        ref:          js.UndefOr[String]                     = js.undefined,
        color:        js.UndefOr[String]                     = js.undefined,
        hoverColor:   js.UndefOr[String]                     = js.undefined,
        onMouseEnter: ReactHandler1[ReactMouseEventFromHtml] = js.undefined,
        onMouseLeave: ReactHandler1[ReactMouseEventFromHtml] = js.undefined,
        style:        js.UndefOr[CssProperties]              = js.undefined,
        viewBox:      js.UndefOr[String]                     = js.undefined
    )(children: VdomNode*): UnmountedWithRawType[MuiSvgIconProps, Null, RawMounted] = {
      val p = props(
        key,
        ref,
        color,
        hoverColor,
        onMouseEnter,
        onMouseLeave,
        style,
        viewBox
      )
      val svgProps: MuiSvgIconProps = p.asInstanceOf[MuiSvgIconProps]
      val Component = JsComponent[MuiSvgIconProps, Children.Varargs, Null](icon)
      Component(svgProps)(children: _*)
    }
  }
}

@js.native
trait MuiSvgIcon extends js.Any

object MuiSvgIcons {
  @js.native @JSImport("material-ui-icons", "AccessAlarm")
  object AccessAlarmIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AccessAlarms")
  object AccessAlarmsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Accessibility")
  object AccessibilityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Accessible")
  object AccessibleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AccessTime")
  object AccessTimeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AccountBalance")
  object AccountBalanceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AccountBalanceWallet")
  object AccountBalanceWalletIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AccountBox")
  object AccountBoxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AccountCircle")
  object AccountCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AcUnit")
  object AcUnitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Adb")
  object AdbIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Add")
  object AddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddAlarm")
  object AddAlarmIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddAlert")
  object AddAlertIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddAPhoto")
  object AddAPhotoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddBox")
  object AddBoxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddCircle")
  object AddCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddCircleOutline")
  object AddCircleOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddLocation")
  object AddLocationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddShoppingCart")
  object AddShoppingCartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddToPhotos")
  object AddToPhotosIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AddToQueue")
  object AddToQueueIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Adjust")
  object AdjustIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatFlat")
  object AirlineSeatFlatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatFlatAngled")
  object AirlineSeatFlatAngledIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatIndividualSuite")
  object AirlineSeatIndividualSuiteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatLegroomExtra")
  object AirlineSeatLegroomExtraIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatLegroomNormal")
  object AirlineSeatLegroomNormalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatLegroomReduced")
  object AirlineSeatLegroomReducedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatReclineExtra")
  object AirlineSeatReclineExtraIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirlineSeatReclineNormal")
  object AirlineSeatReclineNormalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirplanemodeActive")
  object AirplanemodeActiveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirplanemodeInactive")
  object AirplanemodeInactiveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Airplay")
  object AirplayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AirportShuttle")
  object AirportShuttleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Alarm")
  object AlarmIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AlarmAdd")
  object AlarmAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AlarmOff")
  object AlarmOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AlarmOn")
  object AlarmOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Album")
  object AlbumIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AllInclusive")
  object AllInclusiveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AllOut")
  object AllOutIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Android")
  object AndroidIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Announcement")
  object AnnouncementIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Apps")
  object AppsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Archive")
  object ArchiveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowBack")
  object ArrowBackIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowDownward")
  object ArrowDownwardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowDropDown")
  object ArrowDropDownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowDropDownCircle")
  object ArrowDropDownCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowDropUp")
  object ArrowDropUpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowForward")
  object ArrowForwardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArrowUpward")
  object ArrowUpwardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ArtTrack")
  object ArtTrackIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AspectRatio")
  object AspectRatioIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Assessment")
  object AssessmentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Assignment")
  object AssignmentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AssignmentInd")
  object AssignmentIndIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AssignmentLate")
  object AssignmentLateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AssignmentReturn")
  object AssignmentReturnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AssignmentReturned")
  object AssignmentReturnedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AssignmentTurnedIn")
  object AssignmentTurnedInIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Assistant")
  object AssistantIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AssistantPhoto")
  object AssistantPhotoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AttachFile")
  object AttachFileIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Attachment")
  object AttachmentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AttachMoney")
  object AttachMoneyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Audiotrack")
  object AudiotrackIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Autorenew")
  object AutorenewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "AvTimer")
  object AvTimerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Backspace")
  object BackspaceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Backup")
  object BackupIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Battery20")
  object Battery20Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Battery30")
  object Battery30Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Battery50")
  object Battery50Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Battery60")
  object Battery60Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Battery80")
  object Battery80Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Battery90")
  object Battery90Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryAlert")
  object BatteryAlertIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryCharging20")
  object BatteryCharging20Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryCharging30")
  object BatteryCharging30Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryCharging50")
  object BatteryCharging50Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryCharging60")
  object BatteryCharging60Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryCharging80")
  object BatteryCharging80Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryCharging90")
  object BatteryCharging90Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryChargingFull")
  object BatteryChargingFullIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryFull")
  object BatteryFullIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryStd")
  object BatteryStdIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BatteryUnknown")
  object BatteryUnknownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BeachAccess")
  object BeachAccessIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Beenhere")
  object BeenhereIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Block")
  object BlockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Bluetooth")
  object BluetoothIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BluetoothAudio")
  object BluetoothAudioIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BluetoothConnected")
  object BluetoothConnectedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BluetoothDisabled")
  object BluetoothDisabledIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BluetoothSearching")
  object BluetoothSearchingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BlurCircular")
  object BlurCircularIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BlurLinear")
  object BlurLinearIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BlurOff")
  object BlurOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BlurOn")
  object BlurOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Book")
  object BookIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Bookmark")
  object BookmarkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BookmarkBorder")
  object BookmarkBorderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderAll")
  object BorderAllIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderBottom")
  object BorderBottomIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderClear")
  object BorderClearIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderColor")
  object BorderColorIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderHorizontal")
  object BorderHorizontalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderInner")
  object BorderInnerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderLeft")
  object BorderLeftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderOuter")
  object BorderOuterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderRight")
  object BorderRightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderStyle")
  object BorderStyleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderTop")
  object BorderTopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BorderVertical")
  object BorderVerticalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BrandingWatermark")
  object BrandingWatermarkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness1")
  object Brightness1Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness2")
  object Brightness2Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness3")
  object Brightness3Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness4")
  object Brightness4Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness5")
  object Brightness5Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness6")
  object Brightness6Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brightness7")
  object Brightness7Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BrightnessAuto")
  object BrightnessAutoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BrightnessHigh")
  object BrightnessHighIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BrightnessLow")
  object BrightnessLowIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BrightnessMedium")
  object BrightnessMediumIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BrokenImage")
  object BrokenImageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Brush")
  object BrushIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BubbleChart")
  object BubbleChartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BugReport")
  object BugReportIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Build")
  object BuildIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BurstMode")
  object BurstModeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Business")
  object BusinessIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "BusinessCenter")
  object BusinessCenterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Cached")
  object CachedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Cake")
  object CakeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Call")
  object CallIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallEnd")
  object CallEndIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallMade")
  object CallMadeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallMerge")
  object CallMergeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallMissed")
  object CallMissedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallMissedOutgoing")
  object CallMissedOutgoingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallReceived")
  object CallReceivedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallSplit")
  object CallSplitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CallToAction")
  object CallToActionIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Camera")
  object CameraIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CameraAlt")
  object CameraAltIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CameraEnhance")
  object CameraEnhanceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CameraFront")
  object CameraFrontIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CameraRear")
  object CameraRearIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CameraRoll")
  object CameraRollIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Cancel")
  object CancelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CardGiftcard")
  object CardGiftcardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CardMembership")
  object CardMembershipIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CardTravel")
  object CardTravelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Casino")
  object CasinoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Cast")
  object CastIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CastConnected")
  object CastConnectedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CenterFocusStrong")
  object CenterFocusStrongIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CenterFocusWeak")
  object CenterFocusWeakIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChangeHistory")
  object ChangeHistoryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Chat")
  object ChatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChatBubble")
  object ChatBubbleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChatBubbleOutline")
  object ChatBubbleOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Check")
  object CheckIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CheckBox")
  object CheckBoxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CheckBoxOutlineBlank")
  object CheckBoxOutlineBlankIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CheckCircle")
  object CheckCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChevronLeft")
  object ChevronLeftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChevronRight")
  object ChevronRightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChildCare")
  object ChildCareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChildFriendly")
  object ChildFriendlyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ChromeReaderMode")
  object ChromeReaderModeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Class")
  object ClassIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Clear")
  object ClearIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ClearAll")
  object ClearAllIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Close")
  object CloseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ClosedCaption")
  object ClosedCaptionIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Cloud")
  object CloudIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CloudCircle")
  object CloudCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CloudDone")
  object CloudDoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CloudDownload")
  object CloudDownloadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CloudOff")
  object CloudOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CloudQueue")
  object CloudQueueIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CloudUpload")
  object CloudUploadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Code")
  object CodeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Collections")
  object CollectionsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CollectionsBookmark")
  object CollectionsBookmarkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Colorize")
  object ColorizeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ColorLens")
  object ColorLensIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Comment")
  object CommentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Compare")
  object CompareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CompareArrows")
  object CompareArrowsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Computer")
  object ComputerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ConfirmationNumber")
  object ConfirmationNumberIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ContactMail")
  object ContactMailIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ContactPhone")
  object ContactPhoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Contacts")
  object ContactsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ContentCopy")
  object ContentCopyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ContentCut")
  object ContentCutIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ContentPaste")
  object ContentPasteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ControlPoint")
  object ControlPointIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ControlPointDuplicate")
  object ControlPointDuplicateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Copyright")
  object CopyrightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Create")
  object CreateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CreateNewFolder")
  object CreateNewFolderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CreditCard")
  object CreditCardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Crop")
  object CropIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Crop169")
  object Crop169Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Crop32")
  object Crop32Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Crop54")
  object Crop54Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Crop75")
  object Crop75Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropDin")
  object CropDinIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropFree")
  object CropFreeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropLandscape")
  object CropLandscapeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropOriginal")
  object CropOriginalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropPortrait")
  object CropPortraitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropRotate")
  object CropRotateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "CropSquare")
  object CropSquareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Dashboard")
  object DashboardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DataUsage")
  object DataUsageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DateRange")
  object DateRangeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Dehaze")
  object DehazeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Delete")
  object DeleteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DeleteForever")
  object DeleteForeverIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DeleteSweep")
  object DeleteSweepIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Description")
  object DescriptionIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DesktopMac")
  object DesktopMacIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DesktopWindows")
  object DesktopWindowsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Details")
  object DetailsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DeveloperBoard")
  object DeveloperBoardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DeveloperMode")
  object DeveloperModeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DeviceHub")
  object DeviceHubIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Devices")
  object DevicesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DevicesOther")
  object DevicesOtherIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DialerSip")
  object DialerSipIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Dialpad")
  object DialpadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Directions")
  object DirectionsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsBike")
  object DirectionsBikeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsBoat")
  object DirectionsBoatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsBus")
  object DirectionsBusIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsCar")
  object DirectionsCarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsRailway")
  object DirectionsRailwayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsRun")
  object DirectionsRunIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsSubway")
  object DirectionsSubwayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsTransit")
  object DirectionsTransitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DirectionsWalk")
  object DirectionsWalkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DiscFull")
  object DiscFullIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Dns")
  object DnsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Dock")
  object DockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Domain")
  object DomainIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Done")
  object DoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DoneAll")
  object DoneAllIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DoNotDisturb")
  object DoNotDisturbIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DoNotDisturbAlt")
  object DoNotDisturbAltIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DoNotDisturbOff")
  object DoNotDisturbOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DoNotDisturbOn")
  object DoNotDisturbOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DonutLarge")
  object DonutLargeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DonutSmall")
  object DonutSmallIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Drafts")
  object DraftsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DragHandle")
  object DragHandleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "DriveEta")
  object DriveEtaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Dvr")
  object DvrIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Edit")
  object EditIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EditLocation")
  object EditLocationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Eject")
  object EjectIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Email")
  object EmailIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EnhancedEncryption")
  object EnhancedEncryptionIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Equalizer")
  object EqualizerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Error")
  object ErrorIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ErrorOutline")
  object ErrorOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EuroSymbol")
  object EuroSymbolIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Event")
  object EventIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EventAvailable")
  object EventAvailableIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EventBusy")
  object EventBusyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EventNote")
  object EventNoteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EventSeat")
  object EventSeatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "EvStation")
  object EvStationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExitToApp")
  object ExitToAppIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExpandLess")
  object ExpandLessIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExpandMore")
  object ExpandMoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Explicit")
  object ExplicitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Explore")
  object ExploreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Exposure")
  object ExposureIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExposureNeg1")
  object ExposureNeg1Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExposureNeg2")
  object ExposureNeg2Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExposurePlus1")
  object ExposurePlus1Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExposurePlus2")
  object ExposurePlus2Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ExposureZero")
  object ExposureZeroIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Extension")
  object ExtensionIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Face")
  object FaceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FastForward")
  object FastForwardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FastRewind")
  object FastRewindIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Favorite")
  object FavoriteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FavoriteBorder")
  object FavoriteBorderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FeaturedPlayList")
  object FeaturedPlayListIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FeaturedVideo")
  object FeaturedVideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Feedback")
  object FeedbackIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FiberDvr")
  object FiberDvrIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FiberManualRecord")
  object FiberManualRecordIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FiberNew")
  object FiberNewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FiberPin")
  object FiberPinIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FiberSmartRecord")
  object FiberSmartRecordIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FileDownload")
  object FileDownloadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FileUpload")
  object FileUploadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter")
  object FilterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter1")
  object Filter1Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter2")
  object Filter2Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter3")
  object Filter3Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter4")
  object Filter4Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter5")
  object Filter5Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter6")
  object Filter6Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter7")
  object Filter7Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter8")
  object Filter8Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter9")
  object Filter9Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Filter9Plus")
  object Filter9PlusIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterBAndW")
  object FilterBAndWIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterCenterFocus")
  object FilterCenterFocusIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterDrama")
  object FilterDramaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterFrames")
  object FilterFramesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterHdr")
  object FilterHdrIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterList")
  object FilterListIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterNone")
  object FilterNoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterTiltShift")
  object FilterTiltShiftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FilterVintage")
  object FilterVintageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FindInPage")
  object FindInPageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FindReplace")
  object FindReplaceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Fingerprint")
  object FingerprintIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FirstPage")
  object FirstPageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FitnessCenter")
  object FitnessCenterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Flag")
  object FlagIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Flare")
  object FlareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlashAuto")
  object FlashAutoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlashOff")
  object FlashOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlashOn")
  object FlashOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Flight")
  object FlightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlightLand")
  object FlightLandIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlightTakeoff")
  object FlightTakeoffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Flip")
  object FlipIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlipToBack")
  object FlipToBackIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FlipToFront")
  object FlipToFrontIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Folder")
  object FolderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FolderOpen")
  object FolderOpenIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FolderShared")
  object FolderSharedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FolderSpecial")
  object FolderSpecialIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FontDownload")
  object FontDownloadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatAlignCenter")
  object FormatAlignCenterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatAlignJustify")
  object FormatAlignJustifyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatAlignLeft")
  object FormatAlignLeftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatAlignRight")
  object FormatAlignRightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatBold")
  object FormatBoldIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatClear")
  object FormatClearIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatColorFill")
  object FormatColorFillIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatColorReset")
  object FormatColorResetIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatColorText")
  object FormatColorTextIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatIndentDecrease")
  object FormatIndentDecreaseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatIndentIncrease")
  object FormatIndentIncreaseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatItalic")
  object FormatItalicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatLineSpacing")
  object FormatLineSpacingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatListBulleted")
  object FormatListBulletedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatListNumbered")
  object FormatListNumberedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatPaint")
  object FormatPaintIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatQuote")
  object FormatQuoteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatShapes")
  object FormatShapesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatSize")
  object FormatSizeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatStrikethrough")
  object FormatStrikethroughIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatTextdirectionLToR")
  object FormatTextdirectionLToRIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatTextdirectionRToL")
  object FormatTextdirectionRToLIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FormatUnderlined")
  object FormatUnderlinedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Forum")
  object ForumIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Forward")
  object ForwardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Forward10")
  object Forward10Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Forward30")
  object Forward30Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Forward5")
  object Forward5Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FreeBreakfast")
  object FreeBreakfastIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Fullscreen")
  object FullscreenIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "FullscreenExit")
  object FullscreenExitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Functions")
  object FunctionsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Gamepad")
  object GamepadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Games")
  object GamesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Gavel")
  object GavelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Gesture")
  object GestureIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GetApp")
  object GetAppIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Gif")
  object GifIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GolfCourse")
  object GolfCourseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GpsFixed")
  object GpsFixedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GpsNotFixed")
  object GpsNotFixedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GpsOff")
  object GpsOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Grade")
  object GradeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Gradient")
  object GradientIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Grain")
  object GrainIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GraphicEq")
  object GraphicEqIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GridOff")
  object GridOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GridOn")
  object GridOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Group")
  object GroupIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GroupAdd")
  object GroupAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GroupWork")
  object GroupWorkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "GTranslate")
  object GTranslateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Hd")
  object HdIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HdrOff")
  object HdrOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HdrOn")
  object HdrOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HdrStrong")
  object HdrStrongIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HdrWeak")
  object HdrWeakIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Headset")
  object HeadsetIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HeadsetMic")
  object HeadsetMicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Healing")
  object HealingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Hearing")
  object HearingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Help")
  object HelpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HelpOutline")
  object HelpOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Highlight")
  object HighlightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HighlightOff")
  object HighlightOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HighQuality")
  object HighQualityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "History")
  object HistoryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Home")
  object HomeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Hotel")
  object HotelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HotTub")
  object HotTubIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HourglassEmpty")
  object HourglassEmptyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "HourglassFull")
  object HourglassFullIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Http")
  object HttpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Https")
  object HttpsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Image")
  object ImageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ImageAspectRatio")
  object ImageAspectRatioIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ImportantDevices")
  object ImportantDevicesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ImportContacts")
  object ImportContactsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ImportExport")
  object ImportExportIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Inbox")
  object InboxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "IndeterminateCheckBox")
  object IndeterminateCheckBoxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "index")
  object indexIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Info")
  object InfoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InfoOutline")
  object InfoOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Input")
  object InputIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertChart")
  object InsertChartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertComment")
  object InsertCommentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertDriveFile")
  object InsertDriveFileIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertEmoticon")
  object InsertEmoticonIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertInvitation")
  object InsertInvitationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertLink")
  object InsertLinkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InsertPhoto")
  object InsertPhotoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InvertColors")
  object InvertColorsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "InvertColorsOff")
  object InvertColorsOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Iso")
  object IsoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Keyboard")
  object KeyboardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardArrowDown")
  object KeyboardArrowDownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardArrowLeft")
  object KeyboardArrowLeftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardArrowRight")
  object KeyboardArrowRightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardArrowUp")
  object KeyboardArrowUpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardBackspace")
  object KeyboardBackspaceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardCapslock")
  object KeyboardCapslockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardHide")
  object KeyboardHideIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardReturn")
  object KeyboardReturnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardTab")
  object KeyboardTabIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "KeyboardVoice")
  object KeyboardVoiceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Kitchen")
  object KitchenIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Label")
  object LabelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LabelOutline")
  object LabelOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Landscape")
  object LandscapeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Language")
  object LanguageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Laptop")
  object LaptopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LaptopChromebook")
  object LaptopChromebookIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LaptopMac")
  object LaptopMacIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LaptopWindows")
  object LaptopWindowsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LastPage")
  object LastPageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Launch")
  object LaunchIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Layers")
  object LayersIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LayersClear")
  object LayersClearIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LeakAdd")
  object LeakAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LeakRemove")
  object LeakRemoveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Lens")
  object LensIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LibraryAdd")
  object LibraryAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LibraryBooks")
  object LibraryBooksIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LibraryMusic")
  object LibraryMusicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LightbulbOutline")
  object LightbulbOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LinearScale")
  object LinearScaleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LineStyle")
  object LineStyleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LineWeight")
  object LineWeightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Link")
  object LinkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LinkedCamera")
  object LinkedCameraIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "List")
  object ListIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LiveHelp")
  object LiveHelpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LiveTv")
  object LiveTvIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalActivity")
  object LocalActivityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalAirport")
  object LocalAirportIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalAtm")
  object LocalAtmIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalBar")
  object LocalBarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalCafe")
  object LocalCafeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalCarWash")
  object LocalCarWashIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalConvenienceStore")
  object LocalConvenienceStoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalDining")
  object LocalDiningIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalDrink")
  object LocalDrinkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalFlorist")
  object LocalFloristIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalGasStation")
  object LocalGasStationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalGroceryStore")
  object LocalGroceryStoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalHospital")
  object LocalHospitalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalHotel")
  object LocalHotelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalLaundryService")
  object LocalLaundryServiceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalLibrary")
  object LocalLibraryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalMall")
  object LocalMallIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalMovies")
  object LocalMoviesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalOffer")
  object LocalOfferIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalParking")
  object LocalParkingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalPharmacy")
  object LocalPharmacyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalPhone")
  object LocalPhoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalPizza")
  object LocalPizzaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalPlay")
  object LocalPlayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalPostOffice")
  object LocalPostOfficeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalPrintshop")
  object LocalPrintshopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalSee")
  object LocalSeeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalShipping")
  object LocalShippingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocalTaxi")
  object LocalTaxiIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocationCity")
  object LocationCityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocationDisabled")
  object LocationDisabledIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocationOff")
  object LocationOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocationOn")
  object LocationOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LocationSearching")
  object LocationSearchingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Lock")
  object LockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LockOpen")
  object LockOpenIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LockOutline")
  object LockOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Looks")
  object LooksIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Looks3")
  object Looks3Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Looks4")
  object Looks4Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Looks5")
  object Looks5Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Looks6")
  object Looks6Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LooksOne")
  object LooksOneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LooksTwo")
  object LooksTwoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Loop")
  object LoopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Loupe")
  object LoupeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "LowPriority")
  object LowPriorityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Loyalty")
  object LoyaltyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Mail")
  object MailIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MailOutline")
  object MailOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Map")
  object MapIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Markunread")
  object MarkunreadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MarkunreadMailbox")
  object MarkunreadMailboxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Memory")
  object MemoryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Menu")
  object MenuIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MergeType")
  object MergeTypeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Message")
  object MessageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Mic")
  object MicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MicNone")
  object MicNoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MicOff")
  object MicOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Mms")
  object MmsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ModeComment")
  object ModeCommentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ModeEdit")
  object ModeEditIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MonetizationOn")
  object MonetizationOnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MoneyOff")
  object MoneyOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MonochromePhotos")
  object MonochromePhotosIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Mood")
  object MoodIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MoodBad")
  object MoodBadIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "More")
  object MoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MoreHoriz")
  object MoreHorizIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MoreVert")
  object MoreVertIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Motorcycle")
  object MotorcycleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Mouse")
  object MouseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MoveToInbox")
  object MoveToInboxIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Movie")
  object MovieIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MovieCreation")
  object MovieCreationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MovieFilter")
  object MovieFilterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MultilineChart")
  object MultilineChartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MusicNote")
  object MusicNoteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MusicVideo")
  object MusicVideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "MyLocation")
  object MyLocationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Nature")
  object NatureIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NaturePeople")
  object NaturePeopleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NavigateBefore")
  object NavigateBeforeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NavigateNext")
  object NavigateNextIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Navigation")
  object NavigationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NearMe")
  object NearMeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NetworkCell")
  object NetworkCellIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NetworkCheck")
  object NetworkCheckIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NetworkLocked")
  object NetworkLockedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NetworkWifi")
  object NetworkWifiIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NewReleases")
  object NewReleasesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NextWeek")
  object NextWeekIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Nfc")
  object NfcIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NoEncryption")
  object NoEncryptionIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NoSim")
  object NoSimIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Note")
  object NoteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NoteAdd")
  object NoteAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Notifications")
  object NotificationsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NotificationsActive")
  object NotificationsActiveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NotificationsNone")
  object NotificationsNoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NotificationsOff")
  object NotificationsOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NotificationsPaused")
  object NotificationsPausedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "NotInterested")
  object NotInterestedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "OfflinePin")
  object OfflinePinIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "OndemandVideo")
  object OndemandVideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Opacity")
  object OpacityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "OpenInBrowser")
  object OpenInBrowserIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "OpenInNew")
  object OpenInNewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "OpenWith")
  object OpenWithIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Pages")
  object PagesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Pageview")
  object PageviewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Palette")
  object PaletteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Panorama")
  object PanoramaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PanoramaFishEye")
  object PanoramaFishEyeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PanoramaHorizontal")
  object PanoramaHorizontalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PanoramaVertical")
  object PanoramaVerticalIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PanoramaWideAngle")
  object PanoramaWideAngleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PanTool")
  object PanToolIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PartyMode")
  object PartyModeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Pause")
  object PauseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PauseCircleFilled")
  object PauseCircleFilledIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PauseCircleOutline")
  object PauseCircleOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Payment")
  object PaymentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "People")
  object PeopleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PeopleOutline")
  object PeopleOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermCameraMic")
  object PermCameraMicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermContactCalendar")
  object PermContactCalendarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermDataSetting")
  object PermDataSettingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermDeviceInformation")
  object PermDeviceInformationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermIdentity")
  object PermIdentityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermMedia")
  object PermMediaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermPhoneMsg")
  object PermPhoneMsgIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PermScanWifi")
  object PermScanWifiIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Person")
  object PersonIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PersonAdd")
  object PersonAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PersonalVideo")
  object PersonalVideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PersonOutline")
  object PersonOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PersonPin")
  object PersonPinIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PersonPinCircle")
  object PersonPinCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Pets")
  object PetsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Phone")
  object PhoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneAndroid")
  object PhoneAndroidIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneBluetoothSpeaker")
  object PhoneBluetoothSpeakerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneForwarded")
  object PhoneForwardedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneInTalk")
  object PhoneInTalkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneIphone")
  object PhoneIphoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Phonelink")
  object PhonelinkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhonelinkErase")
  object PhonelinkEraseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhonelinkLock")
  object PhonelinkLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhonelinkOff")
  object PhonelinkOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhonelinkRing")
  object PhonelinkRingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhonelinkSetup")
  object PhonelinkSetupIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneLocked")
  object PhoneLockedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhoneMissed")
  object PhoneMissedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhonePaused")
  object PhonePausedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Photo")
  object PhotoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoAlbum")
  object PhotoAlbumIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoCamera")
  object PhotoCameraIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoFilter")
  object PhotoFilterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoLibrary")
  object PhotoLibraryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoSizeSelectActual")
  object PhotoSizeSelectActualIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoSizeSelectLarge")
  object PhotoSizeSelectLargeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PhotoSizeSelectSmall")
  object PhotoSizeSelectSmallIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PictureAsPdf")
  object PictureAsPdfIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PictureInPicture")
  object PictureInPictureIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PictureInPictureAlt")
  object PictureInPictureAltIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PieChart")
  object PieChartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PieChartOutlined")
  object PieChartOutlinedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PinDrop")
  object PinDropIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Place")
  object PlaceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlayArrow")
  object PlayArrowIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlayCircleFilled")
  object PlayCircleFilledIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlayCircleOutline")
  object PlayCircleOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlayForWork")
  object PlayForWorkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlaylistAdd")
  object PlaylistAddIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlaylistAddCheck")
  object PlaylistAddCheckIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlaylistPlay")
  object PlaylistPlayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PlusOne")
  object PlusOneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Poll")
  object PollIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Polymer")
  object PolymerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Pool")
  object PoolIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PortableWifiOff")
  object PortableWifiOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Portrait")
  object PortraitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Power")
  object PowerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PowerInput")
  object PowerInputIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PowerSettingsNew")
  object PowerSettingsNewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PregnantWoman")
  object PregnantWomanIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PresentToAll")
  object PresentToAllIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Print")
  object PrintIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "PriorityHigh")
  object PriorityHighIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Public")
  object PublicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Publish")
  object PublishIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "QueryBuilder")
  object QueryBuilderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "QuestionAnswer")
  object QuestionAnswerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Queue")
  object QueueIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "QueueMusic")
  object QueueMusicIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "QueuePlayNext")
  object QueuePlayNextIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Radio")
  object RadioIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RadioButtonChecked")
  object RadioButtonCheckedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RadioButtonUnchecked")
  object RadioButtonUncheckedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RateReview")
  object RateReviewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Receipt")
  object ReceiptIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RecentActors")
  object RecentActorsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RecordVoiceOver")
  object RecordVoiceOverIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Redeem")
  object RedeemIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Redo")
  object RedoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Refresh")
  object RefreshIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Remove")
  object RemoveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RemoveCircle")
  object RemoveCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RemoveCircleOutline")
  object RemoveCircleOutlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RemoveFromQueue")
  object RemoveFromQueueIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RemoveRedEye")
  object RemoveRedEyeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RemoveShoppingCart")
  object RemoveShoppingCartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Reorder")
  object ReorderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Repeat")
  object RepeatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RepeatOne")
  object RepeatOneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Replay")
  object ReplayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Replay10")
  object Replay10Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Replay30")
  object Replay30Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Replay5")
  object Replay5Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Reply")
  object ReplyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ReplyAll")
  object ReplyAllIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Report")
  object ReportIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ReportProblem")
  object ReportProblemIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Restaurant")
  object RestaurantIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RestaurantMenu")
  object RestaurantMenuIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Restore")
  object RestoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RestorePage")
  object RestorePageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RingVolume")
  object RingVolumeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Room")
  object RoomIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RoomService")
  object RoomServiceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Rotate90DegreesCcw")
  object Rotate90DegreesCcwIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RotateLeft")
  object RotateLeftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RotateRight")
  object RotateRightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RoundedCorner")
  object RoundedCornerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Router")
  object RouterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Rowing")
  object RowingIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RssFeed")
  object RssFeedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "RvHookup")
  object RvHookupIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Satellite")
  object SatelliteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Save")
  object SaveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Scanner")
  object ScannerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Schedule")
  object ScheduleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "School")
  object SchoolIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ScreenLockLandscape")
  object ScreenLockLandscapeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ScreenLockPortrait")
  object ScreenLockPortraitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ScreenLockRotation")
  object ScreenLockRotationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ScreenRotation")
  object ScreenRotationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ScreenShare")
  object ScreenShareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SdCard")
  object SdCardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SdStorage")
  object SdStorageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Search")
  object SearchIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Security")
  object SecurityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SelectAll")
  object SelectAllIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Send")
  object SendIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SentimentDissatisfied")
  object SentimentDissatisfiedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SentimentNeutral")
  object SentimentNeutralIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SentimentSatisfied")
  object SentimentSatisfiedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SentimentVeryDissatisfied")
  object SentimentVeryDissatisfiedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SentimentVerySatisfied")
  object SentimentVerySatisfiedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Settings")
  object SettingsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsApplications")
  object SettingsApplicationsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsBackupRestore")
  object SettingsBackupRestoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsBluetooth")
  object SettingsBluetoothIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsBrightness")
  object SettingsBrightnessIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsCell")
  object SettingsCellIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsEthernet")
  object SettingsEthernetIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsInputAntenna")
  object SettingsInputAntennaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsInputComponent")
  object SettingsInputComponentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsInputComposite")
  object SettingsInputCompositeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsInputHdmi")
  object SettingsInputHdmiIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsInputSvideo")
  object SettingsInputSvideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsOverscan")
  object SettingsOverscanIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsPhone")
  object SettingsPhoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsPower")
  object SettingsPowerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsRemote")
  object SettingsRemoteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsSystemDaydream")
  object SettingsSystemDaydreamIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SettingsVoice")
  object SettingsVoiceIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Share")
  object ShareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Shop")
  object ShopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ShoppingBasket")
  object ShoppingBasketIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ShoppingCart")
  object ShoppingCartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ShopTwo")
  object ShopTwoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ShortText")
  object ShortTextIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ShowChart")
  object ShowChartIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Shuffle")
  object ShuffleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellular0Bar")
  object SignalCellular0BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellular1Bar")
  object SignalCellular1BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellular2Bar")
  object SignalCellular2BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellular3Bar")
  object SignalCellular3BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellular4Bar")
  object SignalCellular4BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularConnectedNoInternet0Bar")
  object SignalCellularConnectedNoInternet0BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularConnectedNoInternet1Bar")
  object SignalCellularConnectedNoInternet1BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularConnectedNoInternet2Bar")
  object SignalCellularConnectedNoInternet2BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularConnectedNoInternet3Bar")
  object SignalCellularConnectedNoInternet3BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularConnectedNoInternet4Bar")
  object SignalCellularConnectedNoInternet4BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularNoSim")
  object SignalCellularNoSimIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularNull")
  object SignalCellularNullIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalCellularOff")
  object SignalCellularOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi0Bar")
  object SignalWifi0BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi1Bar")
  object SignalWifi1BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi1BarLock")
  object SignalWifi1BarLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi2Bar")
  object SignalWifi2BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi2BarLock")
  object SignalWifi2BarLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi3Bar")
  object SignalWifi3BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi3BarLock")
  object SignalWifi3BarLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi4Bar")
  object SignalWifi4BarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifi4BarLock")
  object SignalWifi4BarLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SignalWifiOff")
  object SignalWifiOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SimCard")
  object SimCardIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SimCardAlert")
  object SimCardAlertIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SkipNext")
  object SkipNextIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SkipPrevious")
  object SkipPreviousIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Slideshow")
  object SlideshowIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SlowMotionVideo")
  object SlowMotionVideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Smartphone")
  object SmartphoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SmokeFree")
  object SmokeFreeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SmokingRooms")
  object SmokingRoomsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Sms")
  object SmsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SmsFailed")
  object SmsFailedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Snooze")
  object SnoozeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Sort")
  object SortIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SortByAlpha")
  object SortByAlphaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Spa")
  object SpaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SpaceBar")
  object SpaceBarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Speaker")
  object SpeakerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SpeakerGroup")
  object SpeakerGroupIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SpeakerNotes")
  object SpeakerNotesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SpeakerNotesOff")
  object SpeakerNotesOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SpeakerPhone")
  object SpeakerPhoneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Spellcheck")
  object SpellcheckIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Star")
  object StarIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StarBorder")
  object StarBorderIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StarHalf")
  object StarHalfIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Stars")
  object StarsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StayCurrentLandscape")
  object StayCurrentLandscapeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StayCurrentPortrait")
  object StayCurrentPortraitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StayPrimaryLandscape")
  object StayPrimaryLandscapeIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StayPrimaryPortrait")
  object StayPrimaryPortraitIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Stop")
  object StopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StopScreenShare")
  object StopScreenShareIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Storage")
  object StorageIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Store")
  object StoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StoreMallDirectory")
  object StoreMallDirectoryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Straighten")
  object StraightenIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Streetview")
  object StreetviewIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "StrikethroughS")
  object StrikethroughSIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Style")
  object StyleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SubdirectoryArrowLeft")
  object SubdirectoryArrowLeftIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SubdirectoryArrowRight")
  object SubdirectoryArrowRightIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Subject")
  object SubjectIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Subscriptions")
  object SubscriptionsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Subtitles")
  object SubtitlesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Subway")
  object SubwayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SupervisorAccount")
  object SupervisorAccountIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SurroundSound")
  object SurroundSoundIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SwapCalls")
  object SwapCallsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SwapHoriz")
  object SwapHorizIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SwapVert")
  object SwapVertIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SwapVerticalCircle")
  object SwapVerticalCircleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SwitchCamera")
  object SwitchCameraIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SwitchVideo")
  object SwitchVideoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Sync")
  object SyncIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SyncDisabled")
  object SyncDisabledIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SyncProblem")
  object SyncProblemIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SystemUpdate")
  object SystemUpdateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "SystemUpdateAlt")
  object SystemUpdateAltIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Tab")
  object TabIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Tablet")
  object TabletIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TabletAndroid")
  object TabletAndroidIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TabletMac")
  object TabletMacIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TabUnselected")
  object TabUnselectedIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TagFaces")
  object TagFacesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TapAndPlay")
  object TapAndPlayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Terrain")
  object TerrainIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TextFields")
  object TextFieldsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TextFormat")
  object TextFormatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Textsms")
  object TextsmsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Texture")
  object TextureIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Theaters")
  object TheatersIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ThreeDRotation")
  object ThreeDRotationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ThumbDown")
  object ThumbDownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ThumbsUpDown")
  object ThumbsUpDownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ThumbUp")
  object ThumbUpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Timelapse")
  object TimelapseIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Timeline")
  object TimelineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Timer")
  object TimerIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Timer10")
  object Timer10Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Timer3")
  object Timer3Icon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TimerOff")
  object TimerOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TimeToLeave")
  object TimeToLeaveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Title")
  object TitleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Toc")
  object TocIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Today")
  object TodayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Toll")
  object TollIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Tonality")
  object TonalityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TouchApp")
  object TouchAppIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Toys")
  object ToysIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TrackChanges")
  object TrackChangesIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Traffic")
  object TrafficIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Train")
  object TrainIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Tram")
  object TramIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TransferWithinAStation")
  object TransferWithinAStationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Transform")
  object TransformIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Translate")
  object TranslateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TrendingDown")
  object TrendingDownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TrendingFlat")
  object TrendingFlatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TrendingUp")
  object TrendingUpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Tune")
  object TuneIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TurnedIn")
  object TurnedInIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "TurnedInNot")
  object TurnedInNotIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Tv")
  object TvIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Unarchive")
  object UnarchiveIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Undo")
  object UndoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "UnfoldLess")
  object UnfoldLessIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "UnfoldMore")
  object UnfoldMoreIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Update")
  object UpdateIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Usb")
  object UsbIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VerifiedUser")
  object VerifiedUserIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VerticalAlignBottom")
  object VerticalAlignBottomIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VerticalAlignCenter")
  object VerticalAlignCenterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VerticalAlignTop")
  object VerticalAlignTopIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Vibration")
  object VibrationIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VideoCall")
  object VideoCallIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Videocam")
  object VideocamIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VideocamOff")
  object VideocamOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VideogameAsset")
  object VideogameAssetIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VideoLabel")
  object VideoLabelIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VideoLibrary")
  object VideoLibraryIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewAgenda")
  object ViewAgendaIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewArray")
  object ViewArrayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewCarousel")
  object ViewCarouselIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewColumn")
  object ViewColumnIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewComfy")
  object ViewComfyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewCompact")
  object ViewCompactIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewDay")
  object ViewDayIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewHeadline")
  object ViewHeadlineIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewList")
  object ViewListIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewModule")
  object ViewModuleIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewQuilt")
  object ViewQuiltIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewStream")
  object ViewStreamIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ViewWeek")
  object ViewWeekIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Vignette")
  object VignetteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Visibility")
  object VisibilityIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VisibilityOff")
  object VisibilityOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VoiceChat")
  object VoiceChatIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Voicemail")
  object VoicemailIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VolumeDown")
  object VolumeDownIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VolumeMute")
  object VolumeMuteIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VolumeOff")
  object VolumeOffIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VolumeUp")
  object VolumeUpIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VpnKey")
  object VpnKeyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "VpnLock")
  object VpnLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Wallpaper")
  object WallpaperIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Warning")
  object WarningIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Watch")
  object WatchIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WatchLater")
  object WatchLaterIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WbAuto")
  object WbAutoIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WbCloudy")
  object WbCloudyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WbIncandescent")
  object WbIncandescentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WbIridescent")
  object WbIridescentIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WbSunny")
  object WbSunnyIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Wc")
  object WcIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Web")
  object WebIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WebAsset")
  object WebAssetIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Weekend")
  object WeekendIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Whatshot")
  object WhatshotIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Widgets")
  object WidgetsIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Wifi")
  object WifiIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WifiLock")
  object WifiLockIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WifiTethering")
  object WifiTetheringIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "Work")
  object WorkIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "WrapText")
  object WrapTextIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "YoutubeSearchedFor")
  object YoutubeSearchedForIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ZoomIn")
  object ZoomInIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ZoomOut")
  object ZoomOutIcon extends MuiSvgIcon
  @js.native @JSImport("material-ui-icons", "ZoomOutMap")
  object ZoomOutMapIcon extends MuiSvgIcon
}
