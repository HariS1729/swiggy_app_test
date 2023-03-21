package in.swiggy.android.tejas.feature.detipping.dataType;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: DeTipPostOrderResponse.kt */
public final class DeTipPostOrderResponse {
    @SerializedName("cart_key")
    private final String cartKey;

    public DeTipPostOrderResponse() {
        this((String) null, 1, (i) null);
    }

    public DeTipPostOrderResponse(String str) {
        this.cartKey = str;
    }

    public static /* synthetic */ DeTipPostOrderResponse copy$default(DeTipPostOrderResponse deTipPostOrderResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deTipPostOrderResponse.cartKey;
        }
        return deTipPostOrderResponse.copy(str);
    }

    public final String component1() {
        return this.cartKey;
    }

    public final DeTipPostOrderResponse copy(String str) {
        return new DeTipPostOrderResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeTipPostOrderResponse) && p.e(this.cartKey, ((DeTipPostOrderResponse) obj).cartKey);
    }

    public final String getCartKey() {
        return this.cartKey;
    }

    public int hashCode() {
        String str = this.cartKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "DeTipPostOrderResponse(cartKey=" + this.cartKey + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeTipPostOrderResponse(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
