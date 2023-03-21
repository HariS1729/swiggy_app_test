package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.w;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartCoupon.kt */
public final class InstamartCoupon implements Parcelable {
    public static final Parcelable.Creator<InstamartCoupon> CREATOR = new Creator();
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("amount")
    private Integer amount;
    @SerializedName("coupon")
    private String coupon;
    @SerializedName("creativeId")
    private String creativeId;
    @SerializedName("message")
    private String message;

    /* compiled from: InstamartCoupon.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartCoupon> serializer() {
            return InstamartCoupon$$serializer.INSTANCE;
        }
    }

    /* compiled from: InstamartCoupon.kt */
    public static final class Creator implements Parcelable.Creator<InstamartCoupon> {
        public final InstamartCoupon createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new InstamartCoupon(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final InstamartCoupon[] newArray(int i11) {
            return new InstamartCoupon[i11];
        }
    }

    public InstamartCoupon() {
        this((String) null, (String) null, (String) null, (Integer) null, 15, (i) null);
    }

    public /* synthetic */ InstamartCoupon(int i11, String str, String str2, String str3, Integer num, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.coupon = null;
        } else {
            this.coupon = str;
        }
        if ((i11 & 2) == 0) {
            this.message = null;
        } else {
            this.message = str2;
        }
        if ((i11 & 4) == 0) {
            this.creativeId = null;
        } else {
            this.creativeId = str3;
        }
        if ((i11 & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = num;
        }
    }

    public static /* synthetic */ InstamartCoupon copy$default(InstamartCoupon instamartCoupon, String str, String str2, String str3, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = instamartCoupon.coupon;
        }
        if ((i11 & 2) != 0) {
            str2 = instamartCoupon.message;
        }
        if ((i11 & 4) != 0) {
            str3 = instamartCoupon.creativeId;
        }
        if ((i11 & 8) != 0) {
            num = instamartCoupon.amount;
        }
        return instamartCoupon.copy(str, str2, str3, num);
    }

    public static /* synthetic */ void getAmount$annotations() {
    }

    public static /* synthetic */ void getCoupon$annotations() {
    }

    public static /* synthetic */ void getCreativeId$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final void write$Self(InstamartCoupon instamartCoupon, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartCoupon, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartCoupon.coupon != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, instamartCoupon.coupon);
        }
        if (dVar.o(serialDescriptor, 1) || instamartCoupon.message != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartCoupon.message);
        }
        if (dVar.o(serialDescriptor, 2) || instamartCoupon.creativeId != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, instamartCoupon.creativeId);
        }
        if (dVar.o(serialDescriptor, 3) || instamartCoupon.amount != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, w.f23130b, instamartCoupon.amount);
        }
    }

    public final String component1() {
        return this.coupon;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.creativeId;
    }

    public final Integer component4() {
        return this.amount;
    }

    public final InstamartCoupon copy(String str, String str2, String str3, Integer num) {
        return new InstamartCoupon(str, str2, str3, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartCoupon)) {
            return false;
        }
        InstamartCoupon instamartCoupon = (InstamartCoupon) obj;
        return p.e(this.coupon, instamartCoupon.coupon) && p.e(this.message, instamartCoupon.message) && p.e(this.creativeId, instamartCoupon.creativeId) && p.e(this.amount, instamartCoupon.amount);
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCoupon() {
        return this.coupon;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.coupon;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creativeId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.amount;
        if (num != null) {
            i11 = num.hashCode();
        }
        return hashCode3 + i11;
    }

    public final void setAmount(Integer num) {
        this.amount = num;
    }

    public final void setCoupon(String str) {
        this.coupon = str;
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "InstamartCoupon(coupon=" + this.coupon + ", message=" + this.message + ", creativeId=" + this.creativeId + ", amount=" + this.amount + ')';
    }

    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        p.j(parcel, "out");
        parcel.writeString(this.coupon);
        parcel.writeString(this.message);
        parcel.writeString(this.creativeId);
        Integer num = this.amount;
        if (num == null) {
            i12 = 0;
        } else {
            parcel.writeInt(1);
            i12 = num.intValue();
        }
        parcel.writeInt(i12);
    }

    public InstamartCoupon(String str, String str2, String str3, Integer num) {
        this.coupon = str;
        this.message = str2;
        this.creativeId = str3;
        this.amount = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartCoupon(String str, String str2, String str3, Integer num, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num);
    }
}
