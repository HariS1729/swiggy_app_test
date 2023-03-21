package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: Offer.kt */
public final class Offer {
    @SerializedName("color")
    private final String color;
    @SerializedName("icon")
    private final String icon;
    @SerializedName("text")
    private final String text;

    public Offer(String str, String str2, String str3) {
        this.icon = str;
        this.text = str2;
        this.color = str3;
    }

    public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offer.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = offer.text;
        }
        if ((i11 & 4) != 0) {
            str3 = offer.color;
        }
        return offer.copy(str, str2, str3);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.color;
    }

    public final Offer copy(String str, String str2, String str3) {
        return new Offer(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return p.e(this.icon, offer.icon) && p.e(this.text, offer.text) && p.e(this.color, offer.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.icon;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.color;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "Offer(icon=" + this.icon + ", text=" + this.text + ", color=" + this.color + ')';
    }
}
