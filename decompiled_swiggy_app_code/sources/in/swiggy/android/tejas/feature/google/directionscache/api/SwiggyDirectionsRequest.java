package in.swiggy.android.tejas.feature.google.directionscache.api;

import com.google.gson.annotations.SerializedName;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsReqResponse.kt */
public final class SwiggyDirectionsRequest {
    @SerializedName("clientId")
    private final String clientId;
    @SerializedName("destination")
    private final DirectionsLocationInfo destination;
    @SerializedName("origin")
    private final DirectionsLocationInfo origin;
    @SerializedName("wayPoints")
    private final List<DirectionsLocationInfo> wayPoints;

    public SwiggyDirectionsRequest(String str, DirectionsLocationInfo directionsLocationInfo, DirectionsLocationInfo directionsLocationInfo2, List<DirectionsLocationInfo> list) {
        p.j(str, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(directionsLocationInfo, "origin");
        p.j(directionsLocationInfo2, "destination");
        p.j(list, "wayPoints");
        this.clientId = str;
        this.origin = directionsLocationInfo;
        this.destination = directionsLocationInfo2;
        this.wayPoints = list;
    }

    public static /* synthetic */ SwiggyDirectionsRequest copy$default(SwiggyDirectionsRequest swiggyDirectionsRequest, String str, DirectionsLocationInfo directionsLocationInfo, DirectionsLocationInfo directionsLocationInfo2, List<DirectionsLocationInfo> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = swiggyDirectionsRequest.clientId;
        }
        if ((i11 & 2) != 0) {
            directionsLocationInfo = swiggyDirectionsRequest.origin;
        }
        if ((i11 & 4) != 0) {
            directionsLocationInfo2 = swiggyDirectionsRequest.destination;
        }
        if ((i11 & 8) != 0) {
            list = swiggyDirectionsRequest.wayPoints;
        }
        return swiggyDirectionsRequest.copy(str, directionsLocationInfo, directionsLocationInfo2, list);
    }

    public final String component1() {
        return this.clientId;
    }

    public final DirectionsLocationInfo component2() {
        return this.origin;
    }

    public final DirectionsLocationInfo component3() {
        return this.destination;
    }

    public final List<DirectionsLocationInfo> component4() {
        return this.wayPoints;
    }

    public final SwiggyDirectionsRequest copy(String str, DirectionsLocationInfo directionsLocationInfo, DirectionsLocationInfo directionsLocationInfo2, List<DirectionsLocationInfo> list) {
        p.j(str, PaymentConstants.CLIENT_ID_CAMEL);
        p.j(directionsLocationInfo, "origin");
        p.j(directionsLocationInfo2, "destination");
        p.j(list, "wayPoints");
        return new SwiggyDirectionsRequest(str, directionsLocationInfo, directionsLocationInfo2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwiggyDirectionsRequest)) {
            return false;
        }
        SwiggyDirectionsRequest swiggyDirectionsRequest = (SwiggyDirectionsRequest) obj;
        return p.e(this.clientId, swiggyDirectionsRequest.clientId) && p.e(this.origin, swiggyDirectionsRequest.origin) && p.e(this.destination, swiggyDirectionsRequest.destination) && p.e(this.wayPoints, swiggyDirectionsRequest.wayPoints);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final DirectionsLocationInfo getDestination() {
        return this.destination;
    }

    public final DirectionsLocationInfo getOrigin() {
        return this.origin;
    }

    public final List<DirectionsLocationInfo> getWayPoints() {
        return this.wayPoints;
    }

    public int hashCode() {
        return (((((this.clientId.hashCode() * 31) + this.origin.hashCode()) * 31) + this.destination.hashCode()) * 31) + this.wayPoints.hashCode();
    }

    public String toString() {
        return "SwiggyDirectionsRequest(clientId=" + this.clientId + ", origin=" + this.origin + ", destination=" + this.destination + ", wayPoints=" + this.wayPoints + ')';
    }
}
