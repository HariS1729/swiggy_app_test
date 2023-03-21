package in.swiggy.android.tejas.feature.google.directions.model;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.oldapi.models.googleplace.GoogleDirectionResponse;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GoogleDirectionsResponse.kt */
public final class GoogleDirectionsResponse {
    @SerializedName("routes")
    private List<GoogleDirection> directions;
    @SerializedName("status")
    private String status;

    public GoogleDirectionsResponse(String str, List<GoogleDirection> list) {
        p.j(str, "status");
        this.status = str;
        this.directions = list;
    }

    public static /* synthetic */ GoogleDirectionsResponse copy$default(GoogleDirectionsResponse googleDirectionsResponse, String str, List<GoogleDirection> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googleDirectionsResponse.status;
        }
        if ((i11 & 2) != 0) {
            list = googleDirectionsResponse.directions;
        }
        return googleDirectionsResponse.copy(str, list);
    }

    public final String component1() {
        return this.status;
    }

    public final List<GoogleDirection> component2() {
        return this.directions;
    }

    public final GoogleDirectionsResponse copy(String str, List<GoogleDirection> list) {
        p.j(str, "status");
        return new GoogleDirectionsResponse(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleDirectionsResponse)) {
            return false;
        }
        GoogleDirectionsResponse googleDirectionsResponse = (GoogleDirectionsResponse) obj;
        return p.e(this.status, googleDirectionsResponse.status) && p.e(this.directions, googleDirectionsResponse.directions);
    }

    public final List<GoogleDirection> getDirections() {
        return this.directions;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        List<GoogleDirection> list = this.directions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final boolean isOkResponse() {
        return p.e(GoogleDirectionResponse.OK_RESPONSE, this.status);
    }

    public final void setDirections(List<GoogleDirection> list) {
        this.directions = list;
    }

    public final void setStatus(String str) {
        p.j(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        return "GoogleDirectionsResponse(status=" + this.status + ", directions=" + this.directions + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoogleDirectionsResponse(String str, List list, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? k.j() : list);
    }
}
