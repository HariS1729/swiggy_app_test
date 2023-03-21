package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GooglePlaceGeometry.kt */
public final class GooglePlaceGeometry {
    @SerializedName("location")
    private GooglePlaceLocation location;
    @SerializedName("location_type")
    private String locationType;

    public GooglePlaceGeometry() {
        this((GooglePlaceLocation) null, (String) null, 3, (i) null);
    }

    public GooglePlaceGeometry(GooglePlaceLocation googlePlaceLocation, String str) {
        this.location = googlePlaceLocation;
        this.locationType = str;
    }

    public static /* synthetic */ GooglePlaceGeometry copy$default(GooglePlaceGeometry googlePlaceGeometry, GooglePlaceLocation googlePlaceLocation, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            googlePlaceLocation = googlePlaceGeometry.location;
        }
        if ((i11 & 2) != 0) {
            str = googlePlaceGeometry.locationType;
        }
        return googlePlaceGeometry.copy(googlePlaceLocation, str);
    }

    public final GooglePlaceLocation component1() {
        return this.location;
    }

    public final String component2() {
        return this.locationType;
    }

    public final GooglePlaceGeometry copy(GooglePlaceLocation googlePlaceLocation, String str) {
        return new GooglePlaceGeometry(googlePlaceLocation, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlaceGeometry)) {
            return false;
        }
        GooglePlaceGeometry googlePlaceGeometry = (GooglePlaceGeometry) obj;
        return p.e(this.location, googlePlaceGeometry.location) && p.e(this.locationType, googlePlaceGeometry.locationType);
    }

    public final GooglePlaceLocation getLocation() {
        return this.location;
    }

    public final String getLocationType() {
        return this.locationType;
    }

    public int hashCode() {
        GooglePlaceLocation googlePlaceLocation = this.location;
        int i11 = 0;
        int hashCode = (googlePlaceLocation == null ? 0 : googlePlaceLocation.hashCode()) * 31;
        String str = this.locationType;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode + i11;
    }

    public final void setLocation(GooglePlaceLocation googlePlaceLocation) {
        this.location = googlePlaceLocation;
    }

    public final void setLocationType(String str) {
        this.locationType = str;
    }

    public String toString() {
        return "GooglePlaceGeometry(location=" + this.location + ", locationType=" + this.locationType + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePlaceGeometry(GooglePlaceLocation googlePlaceLocation, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : googlePlaceLocation, (i11 & 2) != 0 ? null : str);
    }
}
