package in.swiggy.android.tejas.feature.address.model;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import kotlin.jvm.internal.p;

/* compiled from: GetAddressDefaultingRequestParam.kt */
public final class GetAddressDefaultingRequestParam {
    private final int isGPSOn;
    private final String requestId;
    private final String source;
    private final String userId;

    public GetAddressDefaultingRequestParam(String str, int i11, String str2, String str3) {
        p.j(str, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        p.j(str2, "requestId");
        p.j(str3, "source");
        this.userId = str;
        this.isGPSOn = i11;
        this.requestId = str2;
        this.source = str3;
    }

    public static /* synthetic */ GetAddressDefaultingRequestParam copy$default(GetAddressDefaultingRequestParam getAddressDefaultingRequestParam, String str, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = getAddressDefaultingRequestParam.userId;
        }
        if ((i12 & 2) != 0) {
            i11 = getAddressDefaultingRequestParam.isGPSOn;
        }
        if ((i12 & 4) != 0) {
            str2 = getAddressDefaultingRequestParam.requestId;
        }
        if ((i12 & 8) != 0) {
            str3 = getAddressDefaultingRequestParam.source;
        }
        return getAddressDefaultingRequestParam.copy(str, i11, str2, str3);
    }

    public final String component1() {
        return this.userId;
    }

    public final int component2() {
        return this.isGPSOn;
    }

    public final String component3() {
        return this.requestId;
    }

    public final String component4() {
        return this.source;
    }

    public final GetAddressDefaultingRequestParam copy(String str, int i11, String str2, String str3) {
        p.j(str, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        p.j(str2, "requestId");
        p.j(str3, "source");
        return new GetAddressDefaultingRequestParam(str, i11, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAddressDefaultingRequestParam)) {
            return false;
        }
        GetAddressDefaultingRequestParam getAddressDefaultingRequestParam = (GetAddressDefaultingRequestParam) obj;
        return p.e(this.userId, getAddressDefaultingRequestParam.userId) && this.isGPSOn == getAddressDefaultingRequestParam.isGPSOn && p.e(this.requestId, getAddressDefaultingRequestParam.requestId) && p.e(this.source, getAddressDefaultingRequestParam.source);
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.isGPSOn) * 31) + this.requestId.hashCode()) * 31) + this.source.hashCode();
    }

    public final int isGPSOn() {
        return this.isGPSOn;
    }

    public String toString() {
        return "GetAddressDefaultingRequestParam(userId=" + this.userId + ", isGPSOn=" + this.isGPSOn + ", requestId=" + this.requestId + ", source=" + this.source + ')';
    }
}
