package in.swiggy.android.tejas.feature.google.directions.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GoogleDirection.kt */
public final class GoogleDirection {
    @SerializedName("overview_polyline")
    private GoogleDirectionPolyline directionPolyline;

    public GoogleDirection() {
        this((GoogleDirectionPolyline) null, 1, (i) null);
    }

    public GoogleDirection(GoogleDirectionPolyline googleDirectionPolyline) {
        this.directionPolyline = googleDirectionPolyline;
    }

    public static /* synthetic */ GoogleDirection copy$default(GoogleDirection googleDirection, GoogleDirectionPolyline googleDirectionPolyline, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            googleDirectionPolyline = googleDirection.directionPolyline;
        }
        return googleDirection.copy(googleDirectionPolyline);
    }

    public final GoogleDirectionPolyline component1() {
        return this.directionPolyline;
    }

    public final GoogleDirection copy(GoogleDirectionPolyline googleDirectionPolyline) {
        return new GoogleDirection(googleDirectionPolyline);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GoogleDirection) && p.e(this.directionPolyline, ((GoogleDirection) obj).directionPolyline);
    }

    public final GoogleDirectionPolyline getDirectionPolyline() {
        return this.directionPolyline;
    }

    public int hashCode() {
        GoogleDirectionPolyline googleDirectionPolyline = this.directionPolyline;
        if (googleDirectionPolyline == null) {
            return 0;
        }
        return googleDirectionPolyline.hashCode();
    }

    public final void setDirectionPolyline(GoogleDirectionPolyline googleDirectionPolyline) {
        this.directionPolyline = googleDirectionPolyline;
    }

    public String toString() {
        return "GoogleDirection(directionPolyline=" + this.directionPolyline + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoogleDirection(GoogleDirectionPolyline googleDirectionPolyline, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : googleDirectionPolyline);
    }
}
