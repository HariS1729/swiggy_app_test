package in.swiggy.android.tejas.feature.google.directions.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyDirectionsResponse.kt */
public final class SwiggyDirection {
    @SerializedName("overview_polyline")
    private GoogleDirectionPolyline directionPolyline;
    @SerializedName("routeId")
    private final String routeId;

    public SwiggyDirection() {
        this((String) null, (GoogleDirectionPolyline) null, 3, (i) null);
    }

    public SwiggyDirection(String str, GoogleDirectionPolyline googleDirectionPolyline) {
        this.routeId = str;
        this.directionPolyline = googleDirectionPolyline;
    }

    public static /* synthetic */ SwiggyDirection copy$default(SwiggyDirection swiggyDirection, String str, GoogleDirectionPolyline googleDirectionPolyline, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = swiggyDirection.routeId;
        }
        if ((i11 & 2) != 0) {
            googleDirectionPolyline = swiggyDirection.directionPolyline;
        }
        return swiggyDirection.copy(str, googleDirectionPolyline);
    }

    public final String component1() {
        return this.routeId;
    }

    public final GoogleDirectionPolyline component2() {
        return this.directionPolyline;
    }

    public final SwiggyDirection copy(String str, GoogleDirectionPolyline googleDirectionPolyline) {
        return new SwiggyDirection(str, googleDirectionPolyline);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwiggyDirection)) {
            return false;
        }
        SwiggyDirection swiggyDirection = (SwiggyDirection) obj;
        return p.e(this.routeId, swiggyDirection.routeId) && p.e(this.directionPolyline, swiggyDirection.directionPolyline);
    }

    public final GoogleDirectionPolyline getDirectionPolyline() {
        return this.directionPolyline;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public int hashCode() {
        String str = this.routeId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        GoogleDirectionPolyline googleDirectionPolyline = this.directionPolyline;
        if (googleDirectionPolyline != null) {
            i11 = googleDirectionPolyline.hashCode();
        }
        return hashCode + i11;
    }

    public final void setDirectionPolyline(GoogleDirectionPolyline googleDirectionPolyline) {
        this.directionPolyline = googleDirectionPolyline;
    }

    public String toString() {
        return "SwiggyDirection(routeId=" + this.routeId + ", directionPolyline=" + this.directionPolyline + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwiggyDirection(String str, GoogleDirectionPolyline googleDirectionPolyline, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : googleDirectionPolyline);
    }
}
