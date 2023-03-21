package in.swiggy.android.tejas.feature.crosssell.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CrossSellRequestItem.kt */
public final class CrossSellRequestItem {
    @SerializedName("id")
    private final String itemId;
    @SerializedName("price")
    private final Double price;

    public CrossSellRequestItem() {
        this((String) null, (Double) null, 3, (i) null);
    }

    public CrossSellRequestItem(String str, Double d11) {
        this.itemId = str;
        this.price = d11;
    }

    public static /* synthetic */ CrossSellRequestItem copy$default(CrossSellRequestItem crossSellRequestItem, String str, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = crossSellRequestItem.itemId;
        }
        if ((i11 & 2) != 0) {
            d11 = crossSellRequestItem.price;
        }
        return crossSellRequestItem.copy(str, d11);
    }

    public final String component1() {
        return this.itemId;
    }

    public final Double component2() {
        return this.price;
    }

    public final CrossSellRequestItem copy(String str, Double d11) {
        return new CrossSellRequestItem(str, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossSellRequestItem)) {
            return false;
        }
        CrossSellRequestItem crossSellRequestItem = (CrossSellRequestItem) obj;
        return p.e(this.itemId, crossSellRequestItem.itemId) && p.e(this.price, crossSellRequestItem.price);
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Double getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.itemId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.price;
        if (d11 != null) {
            i11 = d11.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "CrossSellRequestItem(itemId=" + this.itemId + ", price=" + this.price + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossSellRequestItem(String str, Double d11, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? Double.valueOf(0.0d) : d11);
    }
}
