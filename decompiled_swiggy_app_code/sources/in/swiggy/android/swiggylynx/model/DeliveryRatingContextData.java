package in.swiggy.android.swiggylynx.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: DeliveryRatingContextData.kt */
public final class DeliveryRatingContextData implements Parcelable {
    public static final Parcelable.Creator<DeliveryRatingContextData> CREATOR = new a();
    @SerializedName("source")

    /* renamed from: a  reason: collision with root package name */
    private final String f18960a;
    @SerializedName("title")

    /* renamed from: b  reason: collision with root package name */
    private final String f18961b;

    /* compiled from: DeliveryRatingContextData.kt */
    public static final class a implements Parcelable.Creator<DeliveryRatingContextData> {
        /* renamed from: a */
        public final DeliveryRatingContextData createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new DeliveryRatingContextData(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DeliveryRatingContextData[] newArray(int i11) {
            return new DeliveryRatingContextData[i11];
        }
    }

    public DeliveryRatingContextData(String str, String str2) {
        p.j(str, "source");
        this.f18960a = str;
        this.f18961b = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryRatingContextData)) {
            return false;
        }
        DeliveryRatingContextData deliveryRatingContextData = (DeliveryRatingContextData) obj;
        return p.e(this.f18960a, deliveryRatingContextData.f18960a) && p.e(this.f18961b, deliveryRatingContextData.f18961b);
    }

    public int hashCode() {
        int hashCode = this.f18960a.hashCode() * 31;
        String str = this.f18961b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeliveryRatingContextData(source=" + this.f18960a + ", title=" + this.f18961b + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.f18960a);
        parcel.writeString(this.f18961b);
    }
}
