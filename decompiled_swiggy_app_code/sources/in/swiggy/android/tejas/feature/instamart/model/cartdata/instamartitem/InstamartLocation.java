package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.n;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartLocation.kt */
public final class InstamartLocation implements Parcelable {
    public static final Parcelable.Creator<InstamartLocation> CREATOR = new Creator();
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("longitude")
    private Double longitude;

    /* compiled from: InstamartLocation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartLocation> serializer() {
            return InstamartLocation$$serializer.INSTANCE;
        }
    }

    /* compiled from: InstamartLocation.kt */
    public static final class Creator implements Parcelable.Creator<InstamartLocation> {
        public final InstamartLocation createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            Double d11 = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                d11 = Double.valueOf(parcel.readDouble());
            }
            return new InstamartLocation(valueOf, d11);
        }

        public final InstamartLocation[] newArray(int i11) {
            return new InstamartLocation[i11];
        }
    }

    public InstamartLocation() {
        this((Double) null, (Double) null, 3, (i) null);
    }

    public /* synthetic */ InstamartLocation(int i11, Double d11, Double d12, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d11;
        }
        if ((i11 & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d12;
        }
    }

    public static /* synthetic */ InstamartLocation copy$default(InstamartLocation instamartLocation, Double d11, Double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = instamartLocation.latitude;
        }
        if ((i11 & 2) != 0) {
            d12 = instamartLocation.longitude;
        }
        return instamartLocation.copy(d11, d12);
    }

    public static /* synthetic */ void getLatitude$annotations() {
    }

    public static /* synthetic */ void getLongitude$annotations() {
    }

    public static final void write$Self(InstamartLocation instamartLocation, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartLocation, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartLocation.latitude != null) {
            dVar.E(serialDescriptor, 0, n.f23109b, instamartLocation.latitude);
        }
        if (dVar.o(serialDescriptor, 1) || instamartLocation.longitude != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, n.f23109b, instamartLocation.longitude);
        }
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final InstamartLocation copy(Double d11, Double d12) {
        return new InstamartLocation(d11, d12);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartLocation)) {
            return false;
        }
        InstamartLocation instamartLocation = (InstamartLocation) obj;
        return p.e(this.latitude, instamartLocation.latitude) && p.e(this.longitude, instamartLocation.longitude);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        Double d11 = this.latitude;
        int i11 = 0;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.longitude;
        if (d12 != null) {
            i11 = d12.hashCode();
        }
        return hashCode + i11;
    }

    public final void setLatitude(Double d11) {
        this.latitude = d11;
    }

    public final void setLongitude(Double d11) {
        this.longitude = d11;
    }

    public String toString() {
        return "InstamartLocation(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        p.j(parcel, "out");
        Double d11 = this.latitude;
        if (d11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d11.doubleValue());
        }
        Double d12 = this.longitude;
        if (d12 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d12.doubleValue());
    }

    public InstamartLocation(Double d11, Double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartLocation(Double d11, Double d12, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12);
    }
}
