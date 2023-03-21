package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: Crouton.kt */
public final class Crouton implements Parcelable {
    public static final Parcelable.Creator<Crouton> CREATOR = new Creator();
    @SerializedName("css_properties")
    private final CssProperties cssProperties;
    @SerializedName("icon_url")
    private final String iconUrl;
    @SerializedName("title")
    private final String title;

    /* compiled from: Crouton.kt */
    public static final class Creator implements Parcelable.Creator<Crouton> {
        public final Crouton createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new Crouton(parcel.readString(), parcel.readString(), CssProperties.CREATOR.createFromParcel(parcel));
        }

        public final Crouton[] newArray(int i11) {
            return new Crouton[i11];
        }
    }

    public Crouton(String str, String str2, CssProperties cssProperties2) {
        p.j(str, "iconUrl");
        p.j(str2, "title");
        p.j(cssProperties2, "cssProperties");
        this.iconUrl = str;
        this.title = str2;
        this.cssProperties = cssProperties2;
    }

    public static /* synthetic */ Crouton copy$default(Crouton crouton, String str, String str2, CssProperties cssProperties2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = crouton.iconUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = crouton.title;
        }
        if ((i11 & 4) != 0) {
            cssProperties2 = crouton.cssProperties;
        }
        return crouton.copy(str, str2, cssProperties2);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.title;
    }

    public final CssProperties component3() {
        return this.cssProperties;
    }

    public final Crouton copy(String str, String str2, CssProperties cssProperties2) {
        p.j(str, "iconUrl");
        p.j(str2, "title");
        p.j(cssProperties2, "cssProperties");
        return new Crouton(str, str2, cssProperties2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Crouton)) {
            return false;
        }
        Crouton crouton = (Crouton) obj;
        return p.e(this.iconUrl, crouton.iconUrl) && p.e(this.title, crouton.title) && p.e(this.cssProperties, crouton.cssProperties);
    }

    public final CssProperties getCssProperties() {
        return this.cssProperties;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.iconUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.cssProperties.hashCode();
    }

    public String toString() {
        return "Crouton(iconUrl=" + this.iconUrl + ", title=" + this.title + ", cssProperties=" + this.cssProperties + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.title);
        this.cssProperties.writeToParcel(parcel, i11);
    }
}
