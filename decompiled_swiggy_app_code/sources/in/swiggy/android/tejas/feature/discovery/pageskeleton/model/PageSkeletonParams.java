package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

import kotlin.jvm.internal.p;

/* compiled from: PageSkeletonParams.kt */
public final class PageSkeletonParams {
    private final double latitude;
    private final double longitude;

    public PageSkeletonParams(double d11, double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    public static /* synthetic */ PageSkeletonParams copy$default(PageSkeletonParams pageSkeletonParams, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = pageSkeletonParams.latitude;
        }
        if ((i11 & 2) != 0) {
            d12 = pageSkeletonParams.longitude;
        }
        return pageSkeletonParams.copy(d11, d12);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final PageSkeletonParams copy(double d11, double d12) {
        return new PageSkeletonParams(d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageSkeletonParams)) {
            return false;
        }
        PageSkeletonParams pageSkeletonParams = (PageSkeletonParams) obj;
        return p.e(Double.valueOf(this.latitude), Double.valueOf(pageSkeletonParams.latitude)) && p.e(Double.valueOf(this.longitude), Double.valueOf(pageSkeletonParams.longitude));
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.latitude) * 31) + Double.doubleToLongBits(this.longitude);
    }

    public String toString() {
        return "PageSkeletonParams(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }
}
