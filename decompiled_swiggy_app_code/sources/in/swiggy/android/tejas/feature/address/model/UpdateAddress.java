package in.swiggy.android.tejas.feature.address.model;

import com.swiggy.locationplatform.centraladdressservice.v1.UpdateType;
import kotlin.jvm.internal.p;

/* compiled from: SndAddressModels.kt */
public final class UpdateAddress {
    private final PostableUpdateAddress address;
    private final UpdateType updateType;

    public UpdateAddress(PostableUpdateAddress postableUpdateAddress, UpdateType updateType2) {
        p.j(postableUpdateAddress, "address");
        p.j(updateType2, "updateType");
        this.address = postableUpdateAddress;
        this.updateType = updateType2;
    }

    public static /* synthetic */ UpdateAddress copy$default(UpdateAddress updateAddress, PostableUpdateAddress postableUpdateAddress, UpdateType updateType2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            postableUpdateAddress = updateAddress.address;
        }
        if ((i11 & 2) != 0) {
            updateType2 = updateAddress.updateType;
        }
        return updateAddress.copy(postableUpdateAddress, updateType2);
    }

    public final PostableUpdateAddress component1() {
        return this.address;
    }

    public final UpdateType component2() {
        return this.updateType;
    }

    public final UpdateAddress copy(PostableUpdateAddress postableUpdateAddress, UpdateType updateType2) {
        p.j(postableUpdateAddress, "address");
        p.j(updateType2, "updateType");
        return new UpdateAddress(postableUpdateAddress, updateType2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAddress)) {
            return false;
        }
        UpdateAddress updateAddress = (UpdateAddress) obj;
        return p.e(this.address, updateAddress.address) && this.updateType == updateAddress.updateType;
    }

    public final PostableUpdateAddress getAddress() {
        return this.address;
    }

    public final UpdateType getUpdateType() {
        return this.updateType;
    }

    public int hashCode() {
        return (this.address.hashCode() * 31) + this.updateType.hashCode();
    }

    public String toString() {
        return "UpdateAddress(address=" + this.address + ", updateType=" + this.updateType + ')';
    }
}
