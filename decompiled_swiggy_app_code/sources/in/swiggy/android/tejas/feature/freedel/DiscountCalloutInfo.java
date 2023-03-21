package in.swiggy.android.tejas.feature.freedel;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.p;

/* compiled from: DiscountCalloutInfo.kt */
public final class DiscountCalloutInfo implements Serializable {
    @SerializedName("logoCtx")
    private final FreeDeliveryLogo logoCtx;
    @SerializedName("message")
    private final String message;

    public DiscountCalloutInfo(String str, FreeDeliveryLogo freeDeliveryLogo) {
        this.message = str;
        this.logoCtx = freeDeliveryLogo;
    }

    public static /* synthetic */ DiscountCalloutInfo copy$default(DiscountCalloutInfo discountCalloutInfo, String str, FreeDeliveryLogo freeDeliveryLogo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = discountCalloutInfo.message;
        }
        if ((i11 & 2) != 0) {
            freeDeliveryLogo = discountCalloutInfo.logoCtx;
        }
        return discountCalloutInfo.copy(str, freeDeliveryLogo);
    }

    public final String component1() {
        return this.message;
    }

    public final FreeDeliveryLogo component2() {
        return this.logoCtx;
    }

    public final DiscountCalloutInfo copy(String str, FreeDeliveryLogo freeDeliveryLogo) {
        return new DiscountCalloutInfo(str, freeDeliveryLogo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountCalloutInfo)) {
            return false;
        }
        DiscountCalloutInfo discountCalloutInfo = (DiscountCalloutInfo) obj;
        return p.e(this.message, discountCalloutInfo.message) && p.e(this.logoCtx, discountCalloutInfo.logoCtx);
    }

    public final FreeDeliveryLogo getLogoCtx() {
        return this.logoCtx;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FreeDeliveryLogo freeDeliveryLogo = this.logoCtx;
        if (freeDeliveryLogo != null) {
            i11 = freeDeliveryLogo.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "DiscountCalloutInfo(message=" + this.message + ", logoCtx=" + this.logoCtx + ')';
    }
}
