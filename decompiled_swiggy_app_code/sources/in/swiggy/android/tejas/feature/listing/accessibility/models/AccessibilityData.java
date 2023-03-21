package in.swiggy.android.tejas.feature.listing.accessibility.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* compiled from: AccessibilityData.kt */
public final class AccessibilityData implements Serializable {
    @SerializedName("altText")
    private final String altText;
    @SerializedName("altTextCta")
    private final String altTextCta;

    public AccessibilityData(String str, String str2) {
        p.j(str, "altText");
        p.j(str2, "altTextCta");
        this.altText = str;
        this.altTextCta = str2;
    }

    public static /* synthetic */ AccessibilityData copy$default(AccessibilityData accessibilityData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accessibilityData.altText;
        }
        if ((i11 & 2) != 0) {
            str2 = accessibilityData.altTextCta;
        }
        return accessibilityData.copy(str, str2);
    }

    public final String component1() {
        return this.altText;
    }

    public final String component2() {
        return this.altTextCta;
    }

    public final AccessibilityData copy(String str, String str2) {
        p.j(str, "altText");
        p.j(str2, "altTextCta");
        return new AccessibilityData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityData)) {
            return false;
        }
        AccessibilityData accessibilityData = (AccessibilityData) obj;
        return p.e(this.altText, accessibilityData.altText) && p.e(this.altTextCta, accessibilityData.altTextCta);
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getAltTextCta() {
        return this.altTextCta;
    }

    public int hashCode() {
        return (this.altText.hashCode() * 31) + this.altTextCta.hashCode();
    }

    public String toString() {
        return "AccessibilityData(altText=" + this.altText + ", altTextCta=" + this.altTextCta + ')';
    }
}
