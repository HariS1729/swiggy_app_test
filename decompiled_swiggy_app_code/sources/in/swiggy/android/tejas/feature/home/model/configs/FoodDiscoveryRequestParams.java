package in.swiggy.android.tejas.feature.home.model.configs;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FoodDiscoveryRequestParams.kt */
public final class FoodDiscoveryRequestParams {
    private final boolean clearCache;
    private boolean isDefaultPage;
    private boolean isFoodPageVisit;
    private double lat;
    private double lng;
    private Object requestBody;
    private final long ttl;

    public FoodDiscoveryRequestParams(double d11, double d12, Object obj, long j, boolean z11, boolean z12, boolean z13) {
        p.j(obj, "requestBody");
        this.lat = d11;
        this.lng = d12;
        this.requestBody = obj;
        this.ttl = j;
        this.clearCache = z11;
        this.isFoodPageVisit = z12;
        this.isDefaultPage = z13;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FoodDiscoveryRequestParams)) {
            return false;
        }
        FoodDiscoveryRequestParams foodDiscoveryRequestParams = (FoodDiscoveryRequestParams) obj;
        if (!(foodDiscoveryRequestParams.lat == this.lat)) {
            return false;
        }
        if (!(foodDiscoveryRequestParams.lng == this.lng) || !p.e(foodDiscoveryRequestParams.requestBody, this.requestBody)) {
            return false;
        }
        return true;
    }

    public final boolean getClearCache() {
        return this.clearCache;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public final Object getRequestBody() {
        return this.requestBody;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.lat) * 31) + Double.doubleToLongBits(this.lng)) * 31) + this.requestBody.hashCode();
    }

    public final boolean isDefaultPage() {
        return this.isDefaultPage;
    }

    public final boolean isFoodPageVisit() {
        return this.isFoodPageVisit;
    }

    public final void setDefaultPage(boolean z11) {
        this.isDefaultPage = z11;
    }

    public final void setFoodPageVisit(boolean z11) {
        this.isFoodPageVisit = z11;
    }

    public final void setLat(double d11) {
        this.lat = d11;
    }

    public final void setLng(double d11) {
        this.lng = d11;
    }

    public final void setRequestBody(Object obj) {
        p.j(obj, "<set-?>");
        this.requestBody = obj;
    }

    public String toString() {
        return "lat=" + this.lat + ", lng=" + this.lng + ", requestBody=" + this.requestBody + ", ttl=" + this.ttl;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FoodDiscoveryRequestParams(double d11, double d12, Object obj, long j, boolean z11, boolean z12, boolean z13, int i11, i iVar) {
        this(d11, d12, obj, j, z11, (i11 & 32) != 0 ? false : z12, (i11 & 64) != 0 ? false : z13);
    }
}
