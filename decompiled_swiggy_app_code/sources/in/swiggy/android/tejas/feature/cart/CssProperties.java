package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: CssProperties.kt */
public final class CssProperties implements Parcelable {
    public static final Parcelable.Creator<CssProperties> CREATOR = new Creator();
    @SerializedName("background_color")
    private final String buttonBackgroundColor;
    @SerializedName("border_color")
    private final String buttonBorderColor;
    @SerializedName("color")
    private final String buttonColor;

    /* compiled from: CssProperties.kt */
    public static final class Creator implements Parcelable.Creator<CssProperties> {
        public final CssProperties createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new CssProperties(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final CssProperties[] newArray(int i11) {
            return new CssProperties[i11];
        }
    }

    public CssProperties(String str, String str2, String str3) {
        p.j(str, "buttonBackgroundColor");
        p.j(str2, "buttonBorderColor");
        p.j(str3, "buttonColor");
        this.buttonBackgroundColor = str;
        this.buttonBorderColor = str2;
        this.buttonColor = str3;
    }

    public static /* synthetic */ CssProperties copy$default(CssProperties cssProperties, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cssProperties.buttonBackgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = cssProperties.buttonBorderColor;
        }
        if ((i11 & 4) != 0) {
            str3 = cssProperties.buttonColor;
        }
        return cssProperties.copy(str, str2, str3);
    }

    public final String component1() {
        return this.buttonBackgroundColor;
    }

    public final String component2() {
        return this.buttonBorderColor;
    }

    public final String component3() {
        return this.buttonColor;
    }

    public final CssProperties copy(String str, String str2, String str3) {
        p.j(str, "buttonBackgroundColor");
        p.j(str2, "buttonBorderColor");
        p.j(str3, "buttonColor");
        return new CssProperties(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CssProperties)) {
            return false;
        }
        CssProperties cssProperties = (CssProperties) obj;
        return p.e(this.buttonBackgroundColor, cssProperties.buttonBackgroundColor) && p.e(this.buttonBorderColor, cssProperties.buttonBorderColor) && p.e(this.buttonColor, cssProperties.buttonColor);
    }

    public final String getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public final String getButtonBorderColor() {
        return this.buttonBorderColor;
    }

    public final String getButtonColor() {
        return this.buttonColor;
    }

    public int hashCode() {
        return (((this.buttonBackgroundColor.hashCode() * 31) + this.buttonBorderColor.hashCode()) * 31) + this.buttonColor.hashCode();
    }

    public String toString() {
        return "CssProperties(buttonBackgroundColor=" + this.buttonBackgroundColor + ", buttonBorderColor=" + this.buttonBorderColor + ", buttonColor=" + this.buttonColor + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.buttonBackgroundColor);
        parcel.writeString(this.buttonBorderColor);
        parcel.writeString(this.buttonColor);
    }
}
