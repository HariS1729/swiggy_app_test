package in.swiggy.android.tejas.feature.launch.model.consumable;

import kotlin.jvm.internal.p;

/* compiled from: TrackingLaunchItem.kt */
public final class TrackingLaunchItem extends LaunchItem {
    private final Integer eta_min;
    private final String orderJobId;
    private final String orderState;
    private final String orderType;
    private final String subtitle;
    private final String title;

    public TrackingLaunchItem(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.orderJobId = str;
        this.title = str2;
        this.subtitle = str3;
        this.orderType = str4;
        this.orderState = str5;
        this.eta_min = num;
    }

    public static /* synthetic */ TrackingLaunchItem copy$default(TrackingLaunchItem trackingLaunchItem, String str, String str2, String str3, String str4, String str5, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trackingLaunchItem.orderJobId;
        }
        if ((i11 & 2) != 0) {
            str2 = trackingLaunchItem.title;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = trackingLaunchItem.subtitle;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = trackingLaunchItem.orderType;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = trackingLaunchItem.orderState;
        }
        String str9 = str5;
        if ((i11 & 32) != 0) {
            num = trackingLaunchItem.eta_min;
        }
        return trackingLaunchItem.copy(str, str6, str7, str8, str9, num);
    }

    public final String component1() {
        return this.orderJobId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.orderType;
    }

    public final String component5() {
        return this.orderState;
    }

    public final Integer component6() {
        return this.eta_min;
    }

    public final TrackingLaunchItem copy(String str, String str2, String str3, String str4, String str5, Integer num) {
        return new TrackingLaunchItem(str, str2, str3, str4, str5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingLaunchItem)) {
            return false;
        }
        TrackingLaunchItem trackingLaunchItem = (TrackingLaunchItem) obj;
        return p.e(this.orderJobId, trackingLaunchItem.orderJobId) && p.e(this.title, trackingLaunchItem.title) && p.e(this.subtitle, trackingLaunchItem.subtitle) && p.e(this.orderType, trackingLaunchItem.orderType) && p.e(this.orderState, trackingLaunchItem.orderState) && p.e(this.eta_min, trackingLaunchItem.eta_min);
    }

    public final Integer getEta_min() {
        return this.eta_min;
    }

    public final String getOrderJobId() {
        return this.orderJobId;
    }

    public final String getOrderState() {
        return this.orderState;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.orderJobId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.orderState;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.eta_min;
        if (num != null) {
            i11 = num.hashCode();
        }
        return hashCode5 + i11;
    }

    public String toString() {
        return "TrackingLaunchItem(orderJobId=" + this.orderJobId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", orderType=" + this.orderType + ", orderState=" + this.orderState + ", eta_min=" + this.eta_min + ')';
    }
}
