package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: GoogleReverseGeocodeAddress.kt */
public final class GoogleReverseGeocodeAddress {
    @SerializedName("area")
    private final String area;
    @SerializedName("city")
    private final String city;
    @SerializedName("coordinates")
    private final LatLng coordinates;
    @SerializedName("displayableAddress")
    private final String displayableAddress;

    public GoogleReverseGeocodeAddress(LatLng latLng, String str, String str2, String str3) {
        p.j(latLng, "coordinates");
        p.j(str, "displayableAddress");
        p.j(str2, "city");
        p.j(str3, "area");
        this.coordinates = latLng;
        this.displayableAddress = str;
        this.city = str2;
        this.area = str3;
    }

    public static /* synthetic */ GoogleReverseGeocodeAddress copy$default(GoogleReverseGeocodeAddress googleReverseGeocodeAddress, LatLng latLng, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            latLng = googleReverseGeocodeAddress.coordinates;
        }
        if ((i11 & 2) != 0) {
            str = googleReverseGeocodeAddress.displayableAddress;
        }
        if ((i11 & 4) != 0) {
            str2 = googleReverseGeocodeAddress.city;
        }
        if ((i11 & 8) != 0) {
            str3 = googleReverseGeocodeAddress.area;
        }
        return googleReverseGeocodeAddress.copy(latLng, str, str2, str3);
    }

    public final LatLng component1() {
        return this.coordinates;
    }

    public final String component2() {
        return this.displayableAddress;
    }

    public final String component3() {
        return this.city;
    }

    public final String component4() {
        return this.area;
    }

    public final GoogleReverseGeocodeAddress copy(LatLng latLng, String str, String str2, String str3) {
        p.j(latLng, "coordinates");
        p.j(str, "displayableAddress");
        p.j(str2, "city");
        p.j(str3, "area");
        return new GoogleReverseGeocodeAddress(latLng, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleReverseGeocodeAddress)) {
            return false;
        }
        GoogleReverseGeocodeAddress googleReverseGeocodeAddress = (GoogleReverseGeocodeAddress) obj;
        return p.e(this.coordinates, googleReverseGeocodeAddress.coordinates) && p.e(this.displayableAddress, googleReverseGeocodeAddress.displayableAddress) && p.e(this.city, googleReverseGeocodeAddress.city) && p.e(this.area, googleReverseGeocodeAddress.area);
    }

    public final String getArea() {
        return this.area;
    }

    public final String getCity() {
        return this.city;
    }

    public final LatLng getCoordinates() {
        return this.coordinates;
    }

    public final String getDisplayableAddress() {
        return this.displayableAddress;
    }

    public int hashCode() {
        return (((((this.coordinates.hashCode() * 31) + this.displayableAddress.hashCode()) * 31) + this.city.hashCode()) * 31) + this.area.hashCode();
    }

    public String toString() {
        return "GoogleReverseGeocodeAddress(coordinates=" + this.coordinates + ", displayableAddress=" + this.displayableAddress + ", city=" + this.city + ", area=" + this.area + ')';
    }
}
