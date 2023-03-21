package in.swiggy.android.tejas.feature.google.directionscache.api;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsReqResponse.kt */
public final class LocationInfo {
    @SerializedName("lat")
    private final double lat;
    @SerializedName("lng")
    private final double lng;

    public LocationInfo(double d11, double d12) {
        this.lat = d11;
        this.lng = d12;
    }

    public static /* synthetic */ LocationInfo copy$default(LocationInfo locationInfo, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = locationInfo.lat;
        }
        if ((i11 & 2) != 0) {
            d12 = locationInfo.lng;
        }
        return locationInfo.copy(d11, d12);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.lng;
    }

    public final LocationInfo copy(double d11, double d12) {
        return new LocationInfo(d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationInfo)) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) obj;
        return p.e(Double.valueOf(this.lat), Double.valueOf(locationInfo.lat)) && p.e(Double.valueOf(this.lng), Double.valueOf(locationInfo.lng));
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLng() {
        return this.lng;
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.lat) * 31) + Double.doubleToLongBits(this.lng);
    }

    public String toString() {
        return "LocationInfo(lat=" + this.lat + ", lng=" + this.lng + ')';
    }
}
