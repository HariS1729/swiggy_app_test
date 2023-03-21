package in.swiggy.android.tejas.feature.launch.model.consumable;

import kotlin.jvm.internal.p;

/* compiled from: DailyTrackLaunchItem.kt */
public final class DailyTrackLaunchItem extends LaunchItem {
    private final String orderJobId;

    public DailyTrackLaunchItem(String str) {
        p.j(str, "orderJobId");
        this.orderJobId = str;
    }

    public static /* synthetic */ DailyTrackLaunchItem copy$default(DailyTrackLaunchItem dailyTrackLaunchItem, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dailyTrackLaunchItem.orderJobId;
        }
        return dailyTrackLaunchItem.copy(str);
    }

    public final String component1() {
        return this.orderJobId;
    }

    public final DailyTrackLaunchItem copy(String str) {
        p.j(str, "orderJobId");
        return new DailyTrackLaunchItem(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DailyTrackLaunchItem) && p.e(this.orderJobId, ((DailyTrackLaunchItem) obj).orderJobId);
    }

    public final String getOrderJobId() {
        return this.orderJobId;
    }

    public int hashCode() {
        return this.orderJobId.hashCode();
    }

    public String toString() {
        return "DailyTrackLaunchItem(orderJobId=" + this.orderJobId + ')';
    }
}
