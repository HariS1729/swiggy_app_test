package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GooglePlaceLocation.kt */
public final class GooglePlaceLocation {
    @SerializedName("lat")
    private double latitude;
    @SerializedName("lng")
    private double longitude;

    public GooglePlaceLocation() {
        this(0.0d, 0.0d, 3, (i) null);
    }

    public GooglePlaceLocation(double d11, double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    public static /* synthetic */ GooglePlaceLocation copy$default(GooglePlaceLocation googlePlaceLocation, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = googlePlaceLocation.latitude;
        }
        if ((i11 & 2) != 0) {
            d12 = googlePlaceLocation.longitude;
        }
        return googlePlaceLocation.copy(d11, d12);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final GooglePlaceLocation copy(double d11, double d12) {
        return new GooglePlaceLocation(d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlaceLocation)) {
            return false;
        }
        GooglePlaceLocation googlePlaceLocation = (GooglePlaceLocation) obj;
        return p.e(Double.valueOf(this.latitude), Double.valueOf(googlePlaceLocation.latitude)) && p.e(Double.valueOf(this.longitude), Double.valueOf(googlePlaceLocation.longitude));
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

    public final void setLatitude(double d11) {
        this.latitude = d11;
    }

    public final void setLongitude(double d11) {
        this.longitude = d11;
    }

    public String toString() {
        return "GooglePlaceLocation(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePlaceLocation(double d11, double d12, int i11, i iVar) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12);
    }
}
