package in.swiggy.android.tejas.feature.cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Button.kt */
public final class Meta implements Parcelable {
    public static final Parcelable.Creator<Meta> CREATOR = new Creator();
    @SerializedName("timer")
    private final Integer timer;
    @SerializedName("url")
    private final String url;

    /* compiled from: Button.kt */
    public static final class Creator implements Parcelable.Creator<Meta> {
        public final Meta createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new Meta(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final Meta[] newArray(int i11) {
            return new Meta[i11];
        }
    }

    public Meta() {
        this((String) null, (Integer) null, 3, (i) null);
    }

    public Meta(String str, Integer num) {
        this.url = str;
        this.timer = num;
    }

    public static /* synthetic */ Meta copy$default(Meta meta, String str, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = meta.url;
        }
        if ((i11 & 2) != 0) {
            num = meta.timer;
        }
        return meta.copy(str, num);
    }

    public final String component1() {
        return this.url;
    }

    public final Integer component2() {
        return this.timer;
    }

    public final Meta copy(String str, Integer num) {
        return new Meta(str, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return p.e(this.url, meta.url) && p.e(this.timer, meta.timer);
    }

    public final Integer getTimer() {
        return this.timer;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.timer;
        if (num != null) {
            i11 = num.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "Meta(url=" + this.url + ", timer=" + this.timer + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        p.j(parcel, "out");
        parcel.writeString(this.url);
        Integer num = this.timer;
        if (num == null) {
            i12 = 0;
        } else {
            parcel.writeInt(1);
            i12 = num.intValue();
        }
        parcel.writeInt(i12);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Meta(String str, Integer num, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num);
    }
}
