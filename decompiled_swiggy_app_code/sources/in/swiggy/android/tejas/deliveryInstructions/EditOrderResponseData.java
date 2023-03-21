package in.swiggy.android.tejas.deliveryInstructions;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: EditOrderModels.kt */
public final class EditOrderResponseData {
    @SerializedName("order_data")
    private final EditOrderData orderData;

    public EditOrderResponseData(EditOrderData editOrderData) {
        p.j(editOrderData, "orderData");
        this.orderData = editOrderData;
    }

    public static /* synthetic */ EditOrderResponseData copy$default(EditOrderResponseData editOrderResponseData, EditOrderData editOrderData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            editOrderData = editOrderResponseData.orderData;
        }
        return editOrderResponseData.copy(editOrderData);
    }

    public final EditOrderData component1() {
        return this.orderData;
    }

    public final EditOrderResponseData copy(EditOrderData editOrderData) {
        p.j(editOrderData, "orderData");
        return new EditOrderResponseData(editOrderData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditOrderResponseData) && p.e(this.orderData, ((EditOrderResponseData) obj).orderData);
    }

    public final EditOrderData getOrderData() {
        return this.orderData;
    }

    public int hashCode() {
        return this.orderData.hashCode();
    }

    public String toString() {
        return "EditOrderResponseData(orderData=" + this.orderData + ')';
    }
}
