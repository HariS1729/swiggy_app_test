package in.swiggy.android.tejas.feature.google.googlereversegeocode.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GooglePlaceList.kt */
public final class GooglePlaceList {
    @SerializedName("error_message")
    private String error;
    @SerializedName("results")
    private List<GooglePlace> places;
    @SerializedName("status")
    private String status;

    public GooglePlaceList() {
        this((String) null, (String) null, (List) null, 7, (i) null);
    }

    public GooglePlaceList(String str, String str2, List<GooglePlace> list) {
        this.status = str;
        this.error = str2;
        this.places = list;
    }

    public static /* synthetic */ GooglePlaceList copy$default(GooglePlaceList googlePlaceList, String str, String str2, List<GooglePlace> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePlaceList.status;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePlaceList.error;
        }
        if ((i11 & 4) != 0) {
            list = googlePlaceList.places;
        }
        return googlePlaceList.copy(str, str2, list);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.error;
    }

    public final List<GooglePlace> component3() {
        return this.places;
    }

    public final GooglePlaceList copy(String str, String str2, List<GooglePlace> list) {
        return new GooglePlaceList(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlaceList)) {
            return false;
        }
        GooglePlaceList googlePlaceList = (GooglePlaceList) obj;
        return p.e(this.status, googlePlaceList.status) && p.e(this.error, googlePlaceList.error) && p.e(this.places, googlePlaceList.places);
    }

    public final String getError() {
        return this.error;
    }

    public final List<GooglePlace> getPlaces() {
        return this.places;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GooglePlace> list = this.places;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode2 + i11;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setPlaces(List<GooglePlace> list) {
        this.places = list;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "GooglePlaceList(status=" + this.status + ", error=" + this.error + ", places=" + this.places + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePlaceList(String str, String str2, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list);
    }
}
