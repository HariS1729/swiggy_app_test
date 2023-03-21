package in.swiggy.android.tejas.feature.address.v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;

@Keep
/* compiled from: LocationGps.kt */
public final class LocationGps implements Parcelable {
    public static final Parcelable.Creator<LocationGps> CREATOR = new Creator();
    private final String accuracy;
    private final String attempts;
    private final String interval;

    /* compiled from: LocationGps.kt */
    public static final class Creator implements Parcelable.Creator<LocationGps> {
        public final LocationGps createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new LocationGps(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final LocationGps[] newArray(int i11) {
            return new LocationGps[i11];
        }
    }

    public LocationGps() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocationGps(String str) {
        this(str, (String) null, (String) null, 6, (i) null);
        p.j(str, "attempts");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocationGps(String str, String str2) {
        this(str, str2, (String) null, 4, (i) null);
        p.j(str, "attempts");
        p.j(str2, "interval");
    }

    public LocationGps(String str, String str2, String str3) {
        p.j(str, "attempts");
        p.j(str2, "interval");
        p.j(str3, "accuracy");
        this.attempts = str;
        this.interval = str2;
        this.accuracy = str3;
    }

    public static /* synthetic */ LocationGps copy$default(LocationGps locationGps, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = locationGps.attempts;
        }
        if ((i11 & 2) != 0) {
            str2 = locationGps.interval;
        }
        if ((i11 & 4) != 0) {
            str3 = locationGps.accuracy;
        }
        return locationGps.copy(str, str2, str3);
    }

    public final String component1() {
        return this.attempts;
    }

    public final String component2() {
        return this.interval;
    }

    public final String component3() {
        return this.accuracy;
    }

    public final LocationGps copy(String str, String str2, String str3) {
        p.j(str, "attempts");
        p.j(str2, "interval");
        p.j(str3, "accuracy");
        return new LocationGps(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationGps)) {
            return false;
        }
        LocationGps locationGps = (LocationGps) obj;
        return p.e(this.attempts, locationGps.attempts) && p.e(this.interval, locationGps.interval) && p.e(this.accuracy, locationGps.accuracy);
    }

    public final String getAccuracy() {
        return this.accuracy;
    }

    public final String getAttempts() {
        return this.attempts;
    }

    public final String getInterval() {
        return this.interval;
    }

    public final float getLocAccuracy() {
        return c.t(this.accuracy, -1.0f);
    }

    public final int getLocAttempts() {
        Integer valueOf = Integer.valueOf(c.u(this.attempts, 1));
        if (!(valueOf.intValue() >= 1)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 1;
        }
        return valueOf.intValue();
    }

    public final long getLocInterval() {
        Long valueOf = Long.valueOf(c.y(Float.valueOf(c.t(this.interval, 1.0f))));
        if (!(valueOf.longValue() >= 1000)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 1000;
        }
        return valueOf.longValue();
    }

    public int hashCode() {
        return (((this.attempts.hashCode() * 31) + this.interval.hashCode()) * 31) + this.accuracy.hashCode();
    }

    public String toString() {
        return "LocationGps (Attempts=" + getLocAttempts() + " Interval=" + getLocInterval() + " Accuracy=" + getLocAccuracy() + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.attempts);
        parcel.writeString(this.interval);
        parcel.writeString(this.accuracy);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationGps(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? "1" : str, (i11 & 2) != 0 ? PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES : str2, (i11 & 4) != 0 ? "-1" : str3);
    }
}
