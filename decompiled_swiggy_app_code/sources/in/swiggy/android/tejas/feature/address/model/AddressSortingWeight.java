package in.swiggy.android.tejas.feature.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AddressSortingWeight.kt */
public final class AddressSortingWeight implements Parcelable {
    public static final Parcelable.Creator<AddressSortingWeight> CREATOR = new Creator();
    @SerializedName("address_weight")
    private final Double addressWeight;
    @SerializedName("location_weight")
    private final Double locationWeight;

    /* compiled from: AddressSortingWeight.kt */
    public static final class Creator implements Parcelable.Creator<AddressSortingWeight> {
        public final AddressSortingWeight createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            Double d11 = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                d11 = Double.valueOf(parcel.readDouble());
            }
            return new AddressSortingWeight(valueOf, d11);
        }

        public final AddressSortingWeight[] newArray(int i11) {
            return new AddressSortingWeight[i11];
        }
    }

    public AddressSortingWeight() {
        this((Double) null, (Double) null, 3, (i) null);
    }

    public AddressSortingWeight(Double d11, Double d12) {
        this.locationWeight = d11;
        this.addressWeight = d12;
    }

    public int describeContents() {
        return 0;
    }

    public final Double getAddressWeight() {
        return this.addressWeight;
    }

    public final Double getLocationWeight() {
        return this.locationWeight;
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        Double d11 = this.locationWeight;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        Double d12 = this.addressWeight;
        if (d12 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d12.doubleValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSortingWeight(Double d11, Double d12, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12);
    }
}
