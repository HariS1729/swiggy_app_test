package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.model;

import kotlin.jvm.internal.p;

/* compiled from: TimeBoundOffer.kt */
public final class TimeBoundOffer {
    private final String description;
    private final String expiryColor;
    private final String expiryText;
    private final String header;
    private final String imageId;

    public TimeBoundOffer(String str, String str2, String str3, String str4, String str5) {
        p.j(str, "header");
        p.j(str2, "description");
        p.j(str3, "imageId");
        p.j(str4, "expiryText");
        p.j(str5, "expiryColor");
        this.header = str;
        this.description = str2;
        this.imageId = str3;
        this.expiryText = str4;
        this.expiryColor = str5;
    }

    public static /* synthetic */ TimeBoundOffer copy$default(TimeBoundOffer timeBoundOffer, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = timeBoundOffer.header;
        }
        if ((i11 & 2) != 0) {
            str2 = timeBoundOffer.description;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = timeBoundOffer.imageId;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = timeBoundOffer.expiryText;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = timeBoundOffer.expiryColor;
        }
        return timeBoundOffer.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.header;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.imageId;
    }

    public final String component4() {
        return this.expiryText;
    }

    public final String component5() {
        return this.expiryColor;
    }

    public final TimeBoundOffer copy(String str, String str2, String str3, String str4, String str5) {
        p.j(str, "header");
        p.j(str2, "description");
        p.j(str3, "imageId");
        p.j(str4, "expiryText");
        p.j(str5, "expiryColor");
        return new TimeBoundOffer(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeBoundOffer)) {
            return false;
        }
        TimeBoundOffer timeBoundOffer = (TimeBoundOffer) obj;
        return p.e(this.header, timeBoundOffer.header) && p.e(this.description, timeBoundOffer.description) && p.e(this.imageId, timeBoundOffer.imageId) && p.e(this.expiryText, timeBoundOffer.expiryText) && p.e(this.expiryColor, timeBoundOffer.expiryColor);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExpiryColor() {
        return this.expiryColor;
    }

    public final String getExpiryText() {
        return this.expiryText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public int hashCode() {
        return (((((((this.header.hashCode() * 31) + this.description.hashCode()) * 31) + this.imageId.hashCode()) * 31) + this.expiryText.hashCode()) * 31) + this.expiryColor.hashCode();
    }

    public String toString() {
        return "TimeBoundOffer(header=" + this.header + ", description=" + this.description + ", imageId=" + this.imageId + ", expiryText=" + this.expiryText + ", expiryColor=" + this.expiryColor + ')';
    }
}
