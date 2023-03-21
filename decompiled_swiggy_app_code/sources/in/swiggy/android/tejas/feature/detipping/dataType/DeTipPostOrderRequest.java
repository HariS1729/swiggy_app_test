package in.swiggy.android.tejas.feature.detipping.dataType;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DeTipPostOrderRequest.kt */
public final class DeTipPostOrderRequest {
    @SerializedName("opt_in")
    private final Boolean optIn;
    @SerializedName("order_id")
    private final String orderId;
    @SerializedName("tip_amount")
    private final Double tipAmount;

    public DeTipPostOrderRequest() {
        this((String) null, (Double) null, (Boolean) null, 7, (i) null);
    }

    public DeTipPostOrderRequest(String str, Double d11, Boolean bool) {
        this.orderId = str;
        this.tipAmount = d11;
        this.optIn = bool;
    }

    public static /* synthetic */ DeTipPostOrderRequest copy$default(DeTipPostOrderRequest deTipPostOrderRequest, String str, Double d11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deTipPostOrderRequest.orderId;
        }
        if ((i11 & 2) != 0) {
            d11 = deTipPostOrderRequest.tipAmount;
        }
        if ((i11 & 4) != 0) {
            bool = deTipPostOrderRequest.optIn;
        }
        return deTipPostOrderRequest.copy(str, d11, bool);
    }

    public final String component1() {
        return this.orderId;
    }

    public final Double component2() {
        return this.tipAmount;
    }

    public final Boolean component3() {
        return this.optIn;
    }

    public final DeTipPostOrderRequest copy(String str, Double d11, Boolean bool) {
        return new DeTipPostOrderRequest(str, d11, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeTipPostOrderRequest)) {
            return false;
        }
        DeTipPostOrderRequest deTipPostOrderRequest = (DeTipPostOrderRequest) obj;
        return p.e(this.orderId, deTipPostOrderRequest.orderId) && p.e(this.tipAmount, deTipPostOrderRequest.tipAmount) && p.e(this.optIn, deTipPostOrderRequest.optIn);
    }

    public final Boolean getOptIn() {
        return this.optIn;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Double getTipAmount() {
        return this.tipAmount;
    }

    public int hashCode() {
        String str = this.orderId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.tipAmount;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Boolean bool = this.optIn;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "DeTipPostOrderRequest(orderId=" + this.orderId + ", tipAmount=" + this.tipAmount + ", optIn=" + this.optIn + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeTipPostOrderRequest(String str, Double d11, Boolean bool, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : d11, (i11 & 4) != 0 ? null : bool);
    }
}
