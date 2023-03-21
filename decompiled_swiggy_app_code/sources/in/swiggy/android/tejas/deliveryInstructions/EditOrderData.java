package in.swiggy.android.tejas.deliveryInstructions;

import com.google.gson.annotations.SerializedName;
import in.swiggy.android.tejas.feature.address.model.Address;
import kotlin.jvm.internal.p;

/* compiled from: EditOrderModels.kt */
public final class EditOrderData {
    @SerializedName("delivery_address")
    private final Address deliveryAddress;

    public EditOrderData(Address address) {
        p.j(address, "deliveryAddress");
        this.deliveryAddress = address;
    }

    public static /* synthetic */ EditOrderData copy$default(EditOrderData editOrderData, Address address, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            address = editOrderData.deliveryAddress;
        }
        return editOrderData.copy(address);
    }

    public final Address component1() {
        return this.deliveryAddress;
    }

    public final EditOrderData copy(Address address) {
        p.j(address, "deliveryAddress");
        return new EditOrderData(address);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditOrderData) && p.e(this.deliveryAddress, ((EditOrderData) obj).deliveryAddress);
    }

    public final Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public int hashCode() {
        return this.deliveryAddress.hashCode();
    }

    public String toString() {
        return "EditOrderData(deliveryAddress=" + this.deliveryAddress + ')';
    }
}
