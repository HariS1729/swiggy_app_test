package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AllAddress.kt */
public final class AllAddress {
    @SerializedName("addresses")
    private ArrayList<Address> addresses;

    public AllAddress() {
        this((ArrayList) null, 1, (i) null);
    }

    public AllAddress(ArrayList<Address> arrayList) {
        p.j(arrayList, "addresses");
        this.addresses = arrayList;
    }

    public static /* synthetic */ AllAddress copy$default(AllAddress allAddress, ArrayList<Address> arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            arrayList = allAddress.addresses;
        }
        return allAddress.copy(arrayList);
    }

    public final ArrayList<Address> component1() {
        return this.addresses;
    }

    public final AllAddress copy(ArrayList<Address> arrayList) {
        p.j(arrayList, "addresses");
        return new AllAddress(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllAddress) && p.e(this.addresses, ((AllAddress) obj).addresses);
    }

    public final ArrayList<Address> getAddresses() {
        return this.addresses;
    }

    public int hashCode() {
        return this.addresses.hashCode();
    }

    public final void setAddresses(ArrayList<Address> arrayList) {
        p.j(arrayList, "<set-?>");
        this.addresses = arrayList;
    }

    public String toString() {
        return "AllAddress(addresses=" + this.addresses + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AllAddress(ArrayList arrayList, int i11, i iVar) {
        this((i11 & 1) != 0 ? new ArrayList() : arrayList);
    }
}
