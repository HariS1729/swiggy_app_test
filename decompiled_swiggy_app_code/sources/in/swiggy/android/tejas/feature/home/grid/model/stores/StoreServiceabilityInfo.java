package in.swiggy.android.tejas.feature.home.grid.model.stores;

import com.swiggy.presentation.stores.v1.StoreServiceabilityInfo;
import kotlin.jvm.internal.p;

/* compiled from: StoreServiceabilityInfo.kt */
public final class StoreServiceabilityInfo {
    private final String lastMileDistanceString;
    private final StoreServiceabilityInfo.NonServiceableReason nonServiceableReason;
    private final String serviceability;
    private final String slaString;

    public StoreServiceabilityInfo(String str, StoreServiceabilityInfo.NonServiceableReason nonServiceableReason2, String str2, String str3) {
        p.j(str, "serviceability");
        p.j(nonServiceableReason2, "nonServiceableReason");
        p.j(str2, "lastMileDistanceString");
        p.j(str3, "slaString");
        this.serviceability = str;
        this.nonServiceableReason = nonServiceableReason2;
        this.lastMileDistanceString = str2;
        this.slaString = str3;
    }

    public static /* synthetic */ StoreServiceabilityInfo copy$default(StoreServiceabilityInfo storeServiceabilityInfo, String str, StoreServiceabilityInfo.NonServiceableReason nonServiceableReason2, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storeServiceabilityInfo.serviceability;
        }
        if ((i11 & 2) != 0) {
            nonServiceableReason2 = storeServiceabilityInfo.nonServiceableReason;
        }
        if ((i11 & 4) != 0) {
            str2 = storeServiceabilityInfo.lastMileDistanceString;
        }
        if ((i11 & 8) != 0) {
            str3 = storeServiceabilityInfo.slaString;
        }
        return storeServiceabilityInfo.copy(str, nonServiceableReason2, str2, str3);
    }

    public final String component1() {
        return this.serviceability;
    }

    public final StoreServiceabilityInfo.NonServiceableReason component2() {
        return this.nonServiceableReason;
    }

    public final String component3() {
        return this.lastMileDistanceString;
    }

    public final String component4() {
        return this.slaString;
    }

    public final StoreServiceabilityInfo copy(String str, StoreServiceabilityInfo.NonServiceableReason nonServiceableReason2, String str2, String str3) {
        p.j(str, "serviceability");
        p.j(nonServiceableReason2, "nonServiceableReason");
        p.j(str2, "lastMileDistanceString");
        p.j(str3, "slaString");
        return new StoreServiceabilityInfo(str, nonServiceableReason2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreServiceabilityInfo)) {
            return false;
        }
        StoreServiceabilityInfo storeServiceabilityInfo = (StoreServiceabilityInfo) obj;
        return p.e(this.serviceability, storeServiceabilityInfo.serviceability) && this.nonServiceableReason == storeServiceabilityInfo.nonServiceableReason && p.e(this.lastMileDistanceString, storeServiceabilityInfo.lastMileDistanceString) && p.e(this.slaString, storeServiceabilityInfo.slaString);
    }

    public final String getLastMileDistanceString() {
        return this.lastMileDistanceString;
    }

    public final StoreServiceabilityInfo.NonServiceableReason getNonServiceableReason() {
        return this.nonServiceableReason;
    }

    public final String getServiceability() {
        return this.serviceability;
    }

    public final String getSlaString() {
        return this.slaString;
    }

    public int hashCode() {
        return (((((this.serviceability.hashCode() * 31) + this.nonServiceableReason.hashCode()) * 31) + this.lastMileDistanceString.hashCode()) * 31) + this.slaString.hashCode();
    }

    public String toString() {
        return "StoreServiceabilityInfo(serviceability=" + this.serviceability + ", nonServiceableReason=" + this.nonServiceableReason + ", lastMileDistanceString=" + this.lastMileDistanceString + ", slaString=" + this.slaString + ')';
    }
}
