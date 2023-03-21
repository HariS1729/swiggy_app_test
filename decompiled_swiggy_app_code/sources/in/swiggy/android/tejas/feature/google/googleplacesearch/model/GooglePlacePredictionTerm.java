package in.swiggy.android.tejas.feature.google.googleplacesearch.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GooglePlacePredictionTerm.kt */
public final class GooglePlacePredictionTerm {
    @SerializedName("offset")
    private String offset;
    @SerializedName("value")
    private String value;

    public GooglePlacePredictionTerm() {
        this((String) null, (String) null, 3, (i) null);
    }

    public GooglePlacePredictionTerm(String str, String str2) {
        this.offset = str;
        this.value = str2;
    }

    public static /* synthetic */ GooglePlacePredictionTerm copy$default(GooglePlacePredictionTerm googlePlacePredictionTerm, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePlacePredictionTerm.offset;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePlacePredictionTerm.value;
        }
        return googlePlacePredictionTerm.copy(str, str2);
    }

    public final String component1() {
        return this.offset;
    }

    public final String component2() {
        return this.value;
    }

    public final GooglePlacePredictionTerm copy(String str, String str2) {
        return new GooglePlacePredictionTerm(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlacePredictionTerm)) {
            return false;
        }
        GooglePlacePredictionTerm googlePlacePredictionTerm = (GooglePlacePredictionTerm) obj;
        return p.e(this.offset, googlePlacePredictionTerm.offset) && p.e(this.value, googlePlacePredictionTerm.value);
    }

    public final String getOffset() {
        return this.offset;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.offset;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public final void setOffset(String str) {
        this.offset = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "GooglePlacePredictionTerm(offset=" + this.offset + ", value=" + this.value + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePlacePredictionTerm(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
