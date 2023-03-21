package in.swiggy.android.swiggylynx.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Keep
/* compiled from: DeliveryRatingClickEventNavArgs.kt */
public final class DeliveryRatingClickEventNavArgs implements Parcelable {
    public static final Parcelable.Creator<DeliveryRatingClickEventNavArgs> CREATOR = new a();
    private final String orderId;
    private final String pnTitle;
    private final String ratingSource;

    /* compiled from: DeliveryRatingClickEventNavArgs.kt */
    public static final class a implements Parcelable.Creator<DeliveryRatingClickEventNavArgs> {
        /* renamed from: a */
        public final DeliveryRatingClickEventNavArgs createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new DeliveryRatingClickEventNavArgs(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DeliveryRatingClickEventNavArgs[] newArray(int i11) {
            return new DeliveryRatingClickEventNavArgs[i11];
        }
    }

    public DeliveryRatingClickEventNavArgs() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public DeliveryRatingClickEventNavArgs(String str, String str2, String str3) {
        this.ratingSource = str;
        this.pnTitle = str2;
        this.orderId = str3;
    }

    public static /* synthetic */ DeliveryRatingClickEventNavArgs copy$default(DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deliveryRatingClickEventNavArgs.ratingSource;
        }
        if ((i11 & 2) != 0) {
            str2 = deliveryRatingClickEventNavArgs.pnTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = deliveryRatingClickEventNavArgs.orderId;
        }
        return deliveryRatingClickEventNavArgs.copy(str, str2, str3);
    }

    public final String component1() {
        return this.ratingSource;
    }

    public final String component2() {
        return this.pnTitle;
    }

    public final String component3() {
        return this.orderId;
    }

    public final DeliveryRatingClickEventNavArgs copy(String str, String str2, String str3) {
        return new DeliveryRatingClickEventNavArgs(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryRatingClickEventNavArgs)) {
            return false;
        }
        DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs = (DeliveryRatingClickEventNavArgs) obj;
        return p.e(this.ratingSource, deliveryRatingClickEventNavArgs.ratingSource) && p.e(this.pnTitle, deliveryRatingClickEventNavArgs.pnTitle) && p.e(this.orderId, deliveryRatingClickEventNavArgs.orderId);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPnTitle() {
        return this.pnTitle;
    }

    public final String getRatingSource() {
        return this.ratingSource;
    }

    public int hashCode() {
        String str = this.ratingSource;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pnTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderId;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "DeliveryRatingClickEventNavArgs(ratingSource=" + this.ratingSource + ", pnTitle=" + this.pnTitle + ", orderId=" + this.orderId + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        parcel.writeString(this.ratingSource);
        parcel.writeString(this.pnTitle);
        parcel.writeString(this.orderId);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryRatingClickEventNavArgs(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
