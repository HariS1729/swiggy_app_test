package in.swiggy.android.tejas.feature.google.directionscache.api;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsReqResponse.kt */
public final class DirectionsLocationInfo {
    @SerializedName("location")
    private final LocationInfo location;

    public DirectionsLocationInfo(LocationInfo locationInfo) {
        p.j(locationInfo, "location");
        this.location = locationInfo;
    }

    public static /* synthetic */ DirectionsLocationInfo copy$default(DirectionsLocationInfo directionsLocationInfo, LocationInfo locationInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locationInfo = directionsLocationInfo.location;
        }
        return directionsLocationInfo.copy(locationInfo);
    }

    public final LocationInfo component1() {
        return this.location;
    }

    public final DirectionsLocationInfo copy(LocationInfo locationInfo) {
        p.j(locationInfo, "location");
        return new DirectionsLocationInfo(locationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DirectionsLocationInfo) && p.e(this.location, ((DirectionsLocationInfo) obj).location);
    }

    public final LocationInfo getLocation() {
        return this.location;
    }

    public int hashCode() {
        return this.location.hashCode();
    }

    public String toString() {
        return "DirectionsLocationInfo(location=" + this.location + ')';
    }
}
