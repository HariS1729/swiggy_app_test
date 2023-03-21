package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: Button.kt */
public final class Button implements Parcelable {
    public static final Parcelable.Creator<Button> CREATOR = new Creator();
    @SerializedName("css_properties")
    private final CssProperties cssProperties;
    @SerializedName("cta")
    private final String cta;
    @SerializedName("meta")
    private final Meta meta;
    @SerializedName("title")
    private final String title;
    @SerializedName("type")
    private final String type;

    /* compiled from: Button.kt */
    public static final class Creator implements Parcelable.Creator<Button> {
        public final Button createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new Button(parcel.readString(), parcel.readString(), CssProperties.CREATOR.createFromParcel(parcel), parcel.readString(), Meta.CREATOR.createFromParcel(parcel));
        }

        public final Button[] newArray(int i11) {
            return new Button[i11];
        }
    }

    public Button(String str, String str2, CssProperties cssProperties2, String str3, Meta meta2) {
        p.j(str, "type");
        p.j(str2, "title");
        p.j(cssProperties2, "cssProperties");
        p.j(str3, "cta");
        p.j(meta2, "meta");
        this.type = str;
        this.title = str2;
        this.cssProperties = cssProperties2;
        this.cta = str3;
        this.meta = meta2;
    }

    public static /* synthetic */ Button copy$default(Button button, String str, String str2, CssProperties cssProperties2, String str3, Meta meta2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = button.type;
        }
        if ((i11 & 2) != 0) {
            str2 = button.title;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            cssProperties2 = button.cssProperties;
        }
        CssProperties cssProperties3 = cssProperties2;
        if ((i11 & 8) != 0) {
            str3 = button.cta;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            meta2 = button.meta;
        }
        return button.copy(str, str4, cssProperties3, str5, meta2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final CssProperties component3() {
        return this.cssProperties;
    }

    public final String component4() {
        return this.cta;
    }

    public final Meta component5() {
        return this.meta;
    }

    public final Button copy(String str, String str2, CssProperties cssProperties2, String str3, Meta meta2) {
        p.j(str, "type");
        p.j(str2, "title");
        p.j(cssProperties2, "cssProperties");
        p.j(str3, "cta");
        p.j(meta2, "meta");
        return new Button(str, str2, cssProperties2, str3, meta2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return p.e(this.type, button.type) && p.e(this.title, button.title) && p.e(this.cssProperties, button.cssProperties) && p.e(this.cta, button.cta) && p.e(this.meta, button.meta);
    }

    public final CssProperties getCssProperties() {
        return this.cssProperties;
    }

    public final String getCta() {
        return this.cta;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + this.cssProperties.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.meta.hashCode();
    }

    public String toString() {
        return "Button(type=" + this.type + ", title=" + this.title + ", cssProperties=" + this.cssProperties + ", cta=" + this.cta + ", meta=" + this.meta + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        this.cssProperties.writeToParcel(parcel, i11);
        parcel.writeString(this.cta);
        this.meta.writeToParcel(parcel, i11);
    }
}
