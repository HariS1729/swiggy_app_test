package in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarPopup.kt */
public final class BottomBarPopup extends HomePopup {
    private final int autoCloseTimeInSeconds;
    private final AutoscrollConfig autoscrollConfig;
    private final String backgroundColor;
    private final PopUpWidgetCrossButtonPosition crossButtonPosition;
    private final Frequency frequency;
    private final BusinessLineInfo highlightedBusinessLineInfo;

    /* renamed from: id  reason: collision with root package name */
    private final String f20249id;
    private final List<BottomBarPopupCard> items;
    private Long serverTimeStamp;

    public BottomBarPopup(String str, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, AutoscrollConfig autoscrollConfig2, List<BottomBarPopupCard> list, Frequency frequency2, String str2, int i11, BusinessLineInfo businessLineInfo) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(popUpWidgetCrossButtonPosition, "crossButtonPosition");
        p.j(autoscrollConfig2, "autoscrollConfig");
        p.j(list, "items");
        p.j(frequency2, "frequency");
        p.j(str2, "backgroundColor");
        p.j(businessLineInfo, "highlightedBusinessLineInfo");
        this.f20249id = str;
        this.crossButtonPosition = popUpWidgetCrossButtonPosition;
        this.autoscrollConfig = autoscrollConfig2;
        this.items = list;
        this.frequency = frequency2;
        this.backgroundColor = str2;
        this.autoCloseTimeInSeconds = i11;
        this.highlightedBusinessLineInfo = businessLineInfo;
    }

    public static /* synthetic */ BottomBarPopup copy$default(BottomBarPopup bottomBarPopup, String str, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, AutoscrollConfig autoscrollConfig2, List list, Frequency frequency2, String str2, int i11, BusinessLineInfo businessLineInfo, int i12, Object obj) {
        BottomBarPopup bottomBarPopup2 = bottomBarPopup;
        int i13 = i12;
        return bottomBarPopup.copy((i13 & 1) != 0 ? bottomBarPopup2.f20249id : str, (i13 & 2) != 0 ? bottomBarPopup2.crossButtonPosition : popUpWidgetCrossButtonPosition, (i13 & 4) != 0 ? bottomBarPopup2.autoscrollConfig : autoscrollConfig2, (i13 & 8) != 0 ? bottomBarPopup2.items : list, (i13 & 16) != 0 ? bottomBarPopup2.frequency : frequency2, (i13 & 32) != 0 ? bottomBarPopup2.backgroundColor : str2, (i13 & 64) != 0 ? bottomBarPopup2.autoCloseTimeInSeconds : i11, (i13 & 128) != 0 ? bottomBarPopup2.highlightedBusinessLineInfo : businessLineInfo);
    }

    public final String component1() {
        return this.f20249id;
    }

    public final PopUpWidgetCrossButtonPosition component2() {
        return this.crossButtonPosition;
    }

    public final AutoscrollConfig component3() {
        return this.autoscrollConfig;
    }

    public final List<BottomBarPopupCard> component4() {
        return this.items;
    }

    public final Frequency component5() {
        return this.frequency;
    }

    public final String component6() {
        return this.backgroundColor;
    }

    public final int component7() {
        return this.autoCloseTimeInSeconds;
    }

    public final BusinessLineInfo component8() {
        return this.highlightedBusinessLineInfo;
    }

    public final BottomBarPopup copy(String str, PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition, AutoscrollConfig autoscrollConfig2, List<BottomBarPopupCard> list, Frequency frequency2, String str2, int i11, BusinessLineInfo businessLineInfo) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(popUpWidgetCrossButtonPosition, "crossButtonPosition");
        p.j(autoscrollConfig2, "autoscrollConfig");
        p.j(list, "items");
        p.j(frequency2, "frequency");
        String str3 = str2;
        p.j(str3, "backgroundColor");
        BusinessLineInfo businessLineInfo2 = businessLineInfo;
        p.j(businessLineInfo2, "highlightedBusinessLineInfo");
        return new BottomBarPopup(str, popUpWidgetCrossButtonPosition, autoscrollConfig2, list, frequency2, str3, i11, businessLineInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBarPopup)) {
            return false;
        }
        BottomBarPopup bottomBarPopup = (BottomBarPopup) obj;
        return p.e(this.f20249id, bottomBarPopup.f20249id) && this.crossButtonPosition == bottomBarPopup.crossButtonPosition && p.e(this.autoscrollConfig, bottomBarPopup.autoscrollConfig) && p.e(this.items, bottomBarPopup.items) && p.e(this.frequency, bottomBarPopup.frequency) && p.e(this.backgroundColor, bottomBarPopup.backgroundColor) && this.autoCloseTimeInSeconds == bottomBarPopup.autoCloseTimeInSeconds && p.e(this.highlightedBusinessLineInfo, bottomBarPopup.highlightedBusinessLineInfo);
    }

    public final int getAutoCloseTimeInSeconds() {
        return this.autoCloseTimeInSeconds;
    }

    public final AutoscrollConfig getAutoscrollConfig() {
        return this.autoscrollConfig;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final PopUpWidgetCrossButtonPosition getCrossButtonPosition() {
        return this.crossButtonPosition;
    }

    public final Frequency getFrequency() {
        return this.frequency;
    }

    public final BusinessLineInfo getHighlightedBusinessLineInfo() {
        return this.highlightedBusinessLineInfo;
    }

    public final String getId() {
        return this.f20249id;
    }

    public final List<BottomBarPopupCard> getItems() {
        return this.items;
    }

    public final Long getServerTimeStamp() {
        return this.serverTimeStamp;
    }

    public int hashCode() {
        return (((((((((((((this.f20249id.hashCode() * 31) + this.crossButtonPosition.hashCode()) * 31) + this.autoscrollConfig.hashCode()) * 31) + this.items.hashCode()) * 31) + this.frequency.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.autoCloseTimeInSeconds) * 31) + this.highlightedBusinessLineInfo.hashCode();
    }

    public final void setServerTimeStamp(Long l11) {
        this.serverTimeStamp = l11;
    }

    public String toString() {
        return "BottomBarPopup(id=" + this.f20249id + ", crossButtonPosition=" + this.crossButtonPosition + ", autoscrollConfig=" + this.autoscrollConfig + ", items=" + this.items + ", frequency=" + this.frequency + ", backgroundColor=" + this.backgroundColor + ", autoCloseTimeInSeconds=" + this.autoCloseTimeInSeconds + ", highlightedBusinessLineInfo=" + this.highlightedBusinessLineInfo + ')';
    }
}
