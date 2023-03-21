package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

public class OutOfStockItem {
    @SerializedName("id")
    public String mItemId;
    @SerializedName("quantity")
    public String mItemQuantity;

    public String toString() {
        return "OutOfStockItem{mItemId=" + this.mItemId + ", mItemQuantity=" + this.mItemQuantity + '}';
    }
}
