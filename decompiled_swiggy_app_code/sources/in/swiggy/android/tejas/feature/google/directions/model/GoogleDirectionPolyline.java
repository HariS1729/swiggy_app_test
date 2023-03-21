package in.swiggy.android.tejas.feature.google.directions.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GoogleDirectionPolyline.kt */
public final class GoogleDirectionPolyline {
    @SerializedName("points")
    private String encodedPolyline;

    public GoogleDirectionPolyline() {
        this((String) null, 1, (i) null);
    }

    public GoogleDirectionPolyline(String str) {
        this.encodedPolyline = str;
    }

    public static /* synthetic */ GoogleDirectionPolyline copy$default(GoogleDirectionPolyline googleDirectionPolyline, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googleDirectionPolyline.encodedPolyline;
        }
        return googleDirectionPolyline.copy(str);
    }

    public final String component1() {
        return this.encodedPolyline;
    }

    public final GoogleDirectionPolyline copy(String str) {
        return new GoogleDirectionPolyline(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GoogleDirectionPolyline) && p.e(this.encodedPolyline, ((GoogleDirectionPolyline) obj).encodedPolyline);
    }

    public final String getEncodedPolyline() {
        return this.encodedPolyline;
    }

    public int hashCode() {
        String str = this.encodedPolyline;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setEncodedPolyline(String str) {
        this.encodedPolyline = str;
    }

    public String toString() {
        return "GoogleDirectionPolyline(encodedPolyline=" + this.encodedPolyline + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GoogleDirectionPolyline(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
