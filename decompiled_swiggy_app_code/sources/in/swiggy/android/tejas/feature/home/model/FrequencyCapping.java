package in.swiggy.android.tejas.feature.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: FrequencyCapping.kt */
public final class FrequencyCapping implements Parcelable {
    public static final Parcelable.Creator<FrequencyCapping> CREATOR = new Creator();
    private final boolean cappingEnabled;
    private final String cappingMode;

    /* compiled from: FrequencyCapping.kt */
    public static final class Creator implements Parcelable.Creator<FrequencyCapping> {
        public final FrequencyCapping createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new FrequencyCapping(parcel.readInt() != 0, parcel.readString());
        }

        public final FrequencyCapping[] newArray(int i11) {
            return new FrequencyCapping[i11];
        }
    }

    public FrequencyCapping(boolean z11, String str) {
        p.j(str, "cappingMode");
        this.cappingEnabled = z11;
        this.cappingMode = str;
    }

    public static /* synthetic */ FrequencyCapping copy$default(FrequencyCapping frequencyCapping, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = frequencyCapping.cappingEnabled;
        }
        if ((i11 & 2) != 0) {
            str = frequencyCapping.cappingMode;
        }
        return frequencyCapping.copy(z11, str);
    }

    public final boolean component1() {
        return this.cappingEnabled;
    }

    public final String component2() {
        return this.cappingMode;
    }

    public final FrequencyCapping copy(boolean z11, String str) {
        p.j(str, "cappingMode");
        return new FrequencyCapping(z11, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyCapping)) {
            return false;
        }
        FrequencyCapping frequencyCapping = (FrequencyCapping) obj;
        return this.cappingEnabled == frequencyCapping.cappingEnabled && p.e(this.cappingMode, frequencyCapping.cappingMode);
    }

    public final boolean getCappingEnabled() {
        return this.cappingEnabled;
    }

    public final String getCappingMode() {
        return this.cappingMode;
    }

    public int hashCode() {
        boolean z11 = this.cappingEnabled;
        if (z11) {
            z11 = true;
        }
        return ((z11 ? 1 : 0) * true) + this.cappingMode.hashCode();
    }

    public String toString() {
        return "FrequencyCapping(cappingEnabled=" + this.cappingEnabled + ", cappingMode=" + this.cappingMode + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeInt(this.cappingEnabled ? 1 : 0);
        parcel.writeString(this.cappingMode);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrequencyCapping(boolean z11, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? false : z11, str);
    }
}
