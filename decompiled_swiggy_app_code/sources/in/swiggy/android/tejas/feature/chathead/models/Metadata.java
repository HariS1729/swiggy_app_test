package in.swiggy.android.tejas.feature.chathead.models;

import com.google.gson.annotations.SerializedName;

/* compiled from: Metadata.kt */
public final class Metadata {
    @SerializedName("markedAbusive")
    private final boolean markedAbusive;
    @SerializedName("orderId")
    private final int orderId;

    public Metadata(int i11, boolean z11) {
        this.orderId = i11;
        this.markedAbusive = z11;
    }

    public static /* synthetic */ Metadata copy$default(Metadata metadata, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = metadata.orderId;
        }
        if ((i12 & 2) != 0) {
            z11 = metadata.markedAbusive;
        }
        return metadata.copy(i11, z11);
    }

    public final int component1() {
        return this.orderId;
    }

    public final boolean component2() {
        return this.markedAbusive;
    }

    public final Metadata copy(int i11, boolean z11) {
        return new Metadata(i11, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metadata)) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return this.orderId == metadata.orderId && this.markedAbusive == metadata.markedAbusive;
    }

    public final boolean getMarkedAbusive() {
        return this.markedAbusive;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        int i11 = this.orderId * 31;
        boolean z11 = this.markedAbusive;
        if (z11) {
            z11 = true;
        }
        return i11 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "Metadata(orderId=" + this.orderId + ", markedAbusive=" + this.markedAbusive + ')';
    }
}
