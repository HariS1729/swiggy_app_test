package in.swiggy.android.tejas.feature.google.directions.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyDirectionsResponse.kt */
public final class SwiggyDirectionsResponse {
    @SerializedName("routes")
    private List<SwiggyDirection> directions;

    public SwiggyDirectionsResponse() {
        this((List) null, 1, (i) null);
    }

    public SwiggyDirectionsResponse(List<SwiggyDirection> list) {
        this.directions = list;
    }

    public static /* synthetic */ SwiggyDirectionsResponse copy$default(SwiggyDirectionsResponse swiggyDirectionsResponse, List<SwiggyDirection> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = swiggyDirectionsResponse.directions;
        }
        return swiggyDirectionsResponse.copy(list);
    }

    public final List<SwiggyDirection> component1() {
        return this.directions;
    }

    public final SwiggyDirectionsResponse copy(List<SwiggyDirection> list) {
        return new SwiggyDirectionsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SwiggyDirectionsResponse) && p.e(this.directions, ((SwiggyDirectionsResponse) obj).directions);
    }

    public final List<SwiggyDirection> getDirections() {
        return this.directions;
    }

    public int hashCode() {
        List<SwiggyDirection> list = this.directions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setDirections(List<SwiggyDirection> list) {
        this.directions = list;
    }

    public String toString() {
        return "SwiggyDirectionsResponse(directions=" + this.directions + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwiggyDirectionsResponse(List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? k.j() : list);
    }
}
