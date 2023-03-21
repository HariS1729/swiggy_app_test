package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DsDefaultingApiInstrumentationParams.kt */
public final class DsDefaultingApiInstrumentationParams {
    @SerializedName("api_retry_count")
    private final int apiRetryCount;
    @SerializedName("is_cache_updated")
    private final boolean isCacheUpdated;
    @SerializedName("Trace_id")
    private final String traceId;

    public DsDefaultingApiInstrumentationParams() {
        this(false, 0, (String) null, 7, (i) null);
    }

    public DsDefaultingApiInstrumentationParams(boolean z11, int i11, String str) {
        p.j(str, "traceId");
        this.isCacheUpdated = z11;
        this.apiRetryCount = i11;
        this.traceId = str;
    }

    public static /* synthetic */ DsDefaultingApiInstrumentationParams copy$default(DsDefaultingApiInstrumentationParams dsDefaultingApiInstrumentationParams, boolean z11, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = dsDefaultingApiInstrumentationParams.isCacheUpdated;
        }
        if ((i12 & 2) != 0) {
            i11 = dsDefaultingApiInstrumentationParams.apiRetryCount;
        }
        if ((i12 & 4) != 0) {
            str = dsDefaultingApiInstrumentationParams.traceId;
        }
        return dsDefaultingApiInstrumentationParams.copy(z11, i11, str);
    }

    public final boolean component1() {
        return this.isCacheUpdated;
    }

    public final int component2() {
        return this.apiRetryCount;
    }

    public final String component3() {
        return this.traceId;
    }

    public final DsDefaultingApiInstrumentationParams copy(boolean z11, int i11, String str) {
        p.j(str, "traceId");
        return new DsDefaultingApiInstrumentationParams(z11, i11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DsDefaultingApiInstrumentationParams)) {
            return false;
        }
        DsDefaultingApiInstrumentationParams dsDefaultingApiInstrumentationParams = (DsDefaultingApiInstrumentationParams) obj;
        return this.isCacheUpdated == dsDefaultingApiInstrumentationParams.isCacheUpdated && this.apiRetryCount == dsDefaultingApiInstrumentationParams.apiRetryCount && p.e(this.traceId, dsDefaultingApiInstrumentationParams.traceId);
    }

    public final int getApiRetryCount() {
        return this.apiRetryCount;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        boolean z11 = this.isCacheUpdated;
        if (z11) {
            z11 = true;
        }
        return ((((z11 ? 1 : 0) * true) + this.apiRetryCount) * 31) + this.traceId.hashCode();
    }

    public final boolean isCacheUpdated() {
        return this.isCacheUpdated;
    }

    public String toString() {
        return "DsDefaultingApiInstrumentationParams(isCacheUpdated=" + this.isCacheUpdated + ", apiRetryCount=" + this.apiRetryCount + ", traceId=" + this.traceId + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DsDefaultingApiInstrumentationParams(boolean z11, int i11, String str, int i12, i iVar) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str);
    }
}
