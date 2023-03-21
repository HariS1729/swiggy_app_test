package in.swiggy.android.tejas.feature.home.model.configs;

import kotlin.jvm.internal.p;

/* compiled from: HomeRequestParams.kt */
public final class HomeRequestParams {
    private final boolean clearCache;
    private double lat;
    private double lng;
    private Integer pageLimit;
    private String pageOffset;
    private final String segmentDomain;
    private final String segmentId;
    private final long ttl;

    public HomeRequestParams(double d11, double d12, Integer num, String str, long j, boolean z11, String str2, String str3) {
        this.lat = d11;
        this.lng = d12;
        this.pageLimit = num;
        this.pageOffset = str;
        this.ttl = j;
        this.clearCache = z11;
        this.segmentId = str2;
        this.segmentDomain = str3;
    }

    public static /* synthetic */ HomeRequestParams copy$default(HomeRequestParams homeRequestParams, double d11, double d12, Integer num, String str, long j, boolean z11, String str2, String str3, int i11, Object obj) {
        HomeRequestParams homeRequestParams2 = homeRequestParams;
        int i12 = i11;
        return homeRequestParams.copy((i12 & 1) != 0 ? homeRequestParams2.lat : d11, (i12 & 2) != 0 ? homeRequestParams2.lng : d12, (i12 & 4) != 0 ? homeRequestParams2.pageLimit : num, (i12 & 8) != 0 ? homeRequestParams2.pageOffset : str, (i12 & 16) != 0 ? homeRequestParams2.ttl : j, (i12 & 32) != 0 ? homeRequestParams2.clearCache : z11, (i12 & 64) != 0 ? homeRequestParams2.segmentId : str2, (i12 & 128) != 0 ? homeRequestParams2.segmentDomain : str3);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lng;
    }

    public final Integer component3() {
        return this.pageLimit;
    }

    public final String component4() {
        return this.pageOffset;
    }

    public final long component5() {
        return this.ttl;
    }

    public final boolean component6() {
        return this.clearCache;
    }

    public final String component7() {
        return this.segmentId;
    }

    public final String component8() {
        return this.segmentDomain;
    }

    public final HomeRequestParams copy(double d11, double d12, Integer num, String str, long j, boolean z11, String str2, String str3) {
        return new HomeRequestParams(d11, d12, num, str, j, z11, str2, str3);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof HomeRequestParams)) {
            return false;
        }
        HomeRequestParams homeRequestParams = (HomeRequestParams) obj;
        if (!(homeRequestParams.lat == this.lat)) {
            return false;
        }
        if (!(homeRequestParams.lng == this.lng) || !p.e(homeRequestParams.pageLimit, this.pageLimit) || !p.e(homeRequestParams.pageOffset, this.pageOffset) || !p.e(homeRequestParams.segmentId, this.segmentId) || !p.e(homeRequestParams.segmentDomain, this.segmentDomain)) {
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

    public final Integer getPageLimit() {
        return this.pageLimit;
    }

    public final String getPageOffset() {
        return this.pageOffset;
    }

    public final String getSegmentDomain() {
        return this.segmentDomain;
    }

    public final String getSegmentId() {
        return this.segmentId;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        int a11 = ((Double.doubleToLongBits(this.lat) * 31) + Double.doubleToLongBits(this.lng)) * 31;
        Integer num = this.pageLimit;
        int i11 = 0;
        int intValue = (a11 + (num == null ? 0 : num.intValue())) * 31;
        String str = this.pageOffset;
        int hashCode = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.segmentId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.segmentDomain;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public final void setLat(double d11) {
        this.lat = d11;
    }

    public final void setLng(double d11) {
        this.lng = d11;
    }

    public final void setPageLimit(Integer num) {
        this.pageLimit = num;
    }

    public final void setPageOffset(String str) {
        this.pageOffset = str;
    }

    public String toString() {
        return "lat=" + this.lat + ", lng=" + this.lng + ", pageLimit=" + this.pageLimit + ", pageOffset=" + this.pageOffset + ", ttl=" + this.ttl + ", segmentId=" + this.segmentId + ", segmentDomain=" + this.segmentDomain;
    }
}
