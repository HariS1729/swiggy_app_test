package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GooglePlaceAddress.kt */
public final class GooglePlaceAddress {
    @SerializedName("long_name")
    private String longName;
    @SerializedName("short_name")
    private String shortName;
    @SerializedName("types")
    private List<String> types;

    public GooglePlaceAddress() {
        this((String) null, (String) null, (List) null, 7, (i) null);
    }

    public GooglePlaceAddress(String str, String str2, List<String> list) {
        this.longName = str;
        this.shortName = str2;
        this.types = list;
    }

    public static /* synthetic */ GooglePlaceAddress copy$default(GooglePlaceAddress googlePlaceAddress, String str, String str2, List<String> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePlaceAddress.longName;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePlaceAddress.shortName;
        }
        if ((i11 & 4) != 0) {
            list = googlePlaceAddress.types;
        }
        return googlePlaceAddress.copy(str, str2, list);
    }

    public final String component1() {
        return this.longName;
    }

    public final String component2() {
        return this.shortName;
    }

    public final List<String> component3() {
        return this.types;
    }

    public final GooglePlaceAddress copy(String str, String str2, List<String> list) {
        return new GooglePlaceAddress(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlaceAddress)) {
            return false;
        }
        GooglePlaceAddress googlePlaceAddress = (GooglePlaceAddress) obj;
        return p.e(this.longName, googlePlaceAddress.longName) && p.e(this.shortName, googlePlaceAddress.shortName) && p.e(this.types, googlePlaceAddress.types);
    }

    public final String getLongName() {
        return this.longName;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public int hashCode() {
        String str = this.longName;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shortName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.types;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode2 + i11;
    }

    public final void setLongName(String str) {
        this.longName = str;
    }

    public final void setShortName(String str) {
        this.shortName = str;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }

    public String toString() {
        return "GooglePlaceAddress(longName=" + this.longName + ", shortName=" + this.shortName + ", types=" + this.types + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePlaceAddress(String str, String str2, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list);
    }
}
