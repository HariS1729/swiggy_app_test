package in.swiggy.android.tejas.feature.home.grid.model.stores;

import kotlin.jvm.internal.p;

/* compiled from: StoreOrderability.kt */
public final class StoreOrderability {
    private final boolean isOrderable;
    private final StoreServiceabilityInfo serviceabilityInfo;
    private final String storeId;

    public StoreOrderability(String str, boolean z11, StoreServiceabilityInfo storeServiceabilityInfo) {
        p.j(str, "storeId");
        this.storeId = str;
        this.isOrderable = z11;
        this.serviceabilityInfo = storeServiceabilityInfo;
    }

    public static /* synthetic */ StoreOrderability copy$default(StoreOrderability storeOrderability, String str, boolean z11, StoreServiceabilityInfo storeServiceabilityInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storeOrderability.storeId;
        }
        if ((i11 & 2) != 0) {
            z11 = storeOrderability.isOrderable;
        }
        if ((i11 & 4) != 0) {
            storeServiceabilityInfo = storeOrderability.serviceabilityInfo;
        }
        return storeOrderability.copy(str, z11, storeServiceabilityInfo);
    }

    public final String component1() {
        return this.storeId;
    }

    public final boolean component2() {
        return this.isOrderable;
    }

    public final StoreServiceabilityInfo component3() {
        return this.serviceabilityInfo;
    }

    public final StoreOrderability copy(String str, boolean z11, StoreServiceabilityInfo storeServiceabilityInfo) {
        p.j(str, "storeId");
        return new StoreOrderability(str, z11, storeServiceabilityInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreOrderability)) {
            return false;
        }
        StoreOrderability storeOrderability = (StoreOrderability) obj;
        return p.e(this.storeId, storeOrderability.storeId) && this.isOrderable == storeOrderability.isOrderable && p.e(this.serviceabilityInfo, storeOrderability.serviceabilityInfo);
    }

    public final StoreServiceabilityInfo getServiceabilityInfo() {
        return this.serviceabilityInfo;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        int hashCode = this.storeId.hashCode() * 31;
        boolean z11 = this.isOrderable;
        if (z11) {
            z11 = true;
        }
        int i11 = (hashCode + (z11 ? 1 : 0)) * 31;
        StoreServiceabilityInfo storeServiceabilityInfo = this.serviceabilityInfo;
        return i11 + (storeServiceabilityInfo == null ? 0 : storeServiceabilityInfo.hashCode());
    }

    public final boolean isOrderable() {
        return this.isOrderable;
    }

    public String toString() {
        return "StoreOrderability(storeId=" + this.storeId + ", isOrderable=" + this.isOrderable + ", serviceabilityInfo=" + this.serviceabilityInfo + ')';
    }
}
