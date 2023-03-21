package in.swiggy.android.tejas.feature.google.googleplacesearch.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GooglePlaceStructuredFormatting.kt */
public final class GooglePlaceStructuredFormatting {
    @SerializedName("main_text")
    private final String mainText;
    @SerializedName("secondary_text")
    private final String secondaryText;

    public GooglePlaceStructuredFormatting() {
        this((String) null, (String) null, 3, (i) null);
    }

    public GooglePlaceStructuredFormatting(String str, String str2) {
        this.mainText = str;
        this.secondaryText = str2;
    }

    public static /* synthetic */ GooglePlaceStructuredFormatting copy$default(GooglePlaceStructuredFormatting googlePlaceStructuredFormatting, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePlaceStructuredFormatting.mainText;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePlaceStructuredFormatting.secondaryText;
        }
        return googlePlaceStructuredFormatting.copy(str, str2);
    }

    public final String component1() {
        return this.mainText;
    }

    public final String component2() {
        return this.secondaryText;
    }

    public final GooglePlaceStructuredFormatting copy(String str, String str2) {
        return new GooglePlaceStructuredFormatting(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlaceStructuredFormatting)) {
            return false;
        }
        GooglePlaceStructuredFormatting googlePlaceStructuredFormatting = (GooglePlaceStructuredFormatting) obj;
        return p.e(this.mainText, googlePlaceStructuredFormatting.mainText) && p.e(this.secondaryText, googlePlaceStructuredFormatting.secondaryText);
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        String str = this.mainText;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondaryText;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "GooglePlaceStructuredFormatting(mainText=" + this.mainText + ", secondaryText=" + this.secondaryText + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePlaceStructuredFormatting(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
