package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.jvm.internal.p;

/* compiled from: Point.kt */
public final class Point implements Parcelable {
    public static final Parcelable.Creator<Point> CREATOR = new Creator();
    @SerializedName("icon_url")
    private final String iconUrl;
    @SerializedName("message")
    private final String message;

    /* compiled from: Point.kt */
    public static final class Creator implements Parcelable.Creator<Point> {
        public final Point createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new Point(parcel.readString(), parcel.readString());
        }

        public final Point[] newArray(int i11) {
            return new Point[i11];
        }
    }

    public Point(String str, String str2) {
        p.j(str, "iconUrl");
        p.j(str2, HexAttribute.HEX_ATTR_MESSAGE);
        this.iconUrl = str;
        this.message = str2;
    }

    public static /* synthetic */ Point copy$default(Point point, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = point.iconUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = point.message;
        }
        return point.copy(str, str2);
    }

    public final String component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.message;
    }

    public final Point copy(String str, String str2) {
        p.j(str, "iconUrl");
        p.j(str2, HexAttribute.HEX_ATTR_MESSAGE);
        return new Point(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return p.e(this.iconUrl, point.iconUrl) && p.e(this.message, point.message);
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.iconUrl.hashCode() * 31) + this.message.hashCode();
    }

    public String toString() {
        return "Point(iconUrl=" + this.iconUrl + ", message=" + this.message + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.message);
    }
}
