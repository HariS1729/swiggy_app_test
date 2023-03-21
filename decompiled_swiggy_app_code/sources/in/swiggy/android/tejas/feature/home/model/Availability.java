package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: Availability.kt */
public final class Availability {
    @SerializedName("inSlot")
    private final boolean inSlot;
    @SerializedName("nextCloseTime")
    private final String nextCloseTime;
    @SerializedName("nextOpenMessage")
    private final String nextOpenMessage;
    @SerializedName("nextOpenTime")
    private final String nextOpenTime;
    @SerializedName("opened")
    private final boolean opened;

    public Availability(boolean z11, String str, String str2, String str3, boolean z12) {
        p.j(str, "nextOpenTime");
        p.j(str2, "nextCloseTime");
        p.j(str3, "nextOpenMessage");
        this.opened = z11;
        this.nextOpenTime = str;
        this.nextCloseTime = str2;
        this.nextOpenMessage = str3;
        this.inSlot = z12;
    }

    public static /* synthetic */ Availability copy$default(Availability availability, boolean z11, String str, String str2, String str3, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = availability.opened;
        }
        if ((i11 & 2) != 0) {
            str = availability.nextOpenTime;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = availability.nextCloseTime;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = availability.nextOpenMessage;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            z12 = availability.inSlot;
        }
        return availability.copy(z11, str4, str5, str6, z12);
    }

    public final boolean component1() {
        return this.opened;
    }

    public final String component2() {
        return this.nextOpenTime;
    }

    public final String component3() {
        return this.nextCloseTime;
    }

    public final String component4() {
        return this.nextOpenMessage;
    }

    public final boolean component5() {
        return this.inSlot;
    }

    public final Availability copy(boolean z11, String str, String str2, String str3, boolean z12) {
        p.j(str, "nextOpenTime");
        p.j(str2, "nextCloseTime");
        p.j(str3, "nextOpenMessage");
        return new Availability(z11, str, str2, str3, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Availability)) {
            return false;
        }
        Availability availability = (Availability) obj;
        return this.opened == availability.opened && p.e(this.nextOpenTime, availability.nextOpenTime) && p.e(this.nextCloseTime, availability.nextCloseTime) && p.e(this.nextOpenMessage, availability.nextOpenMessage) && this.inSlot == availability.inSlot;
    }

    public final boolean getInSlot() {
        return this.inSlot;
    }

    public final String getNextCloseTime() {
        return this.nextCloseTime;
    }

    public final String getNextOpenMessage() {
        return this.nextOpenMessage;
    }

    public final String getNextOpenTime() {
        return this.nextOpenTime;
    }

    public final boolean getOpened() {
        return this.opened;
    }

    public int hashCode() {
        boolean z11 = this.opened;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int hashCode = (((((((z11 ? 1 : 0) * true) + this.nextOpenTime.hashCode()) * 31) + this.nextCloseTime.hashCode()) * 31) + this.nextOpenMessage.hashCode()) * 31;
        boolean z13 = this.inSlot;
        if (!z13) {
            z12 = z13;
        }
        return hashCode + (z12 ? 1 : 0);
    }

    public String toString() {
        return "Availability(opened=" + this.opened + ", nextOpenTime=" + this.nextOpenTime + ", nextCloseTime=" + this.nextCloseTime + ", nextOpenMessage=" + this.nextOpenMessage + ", inSlot=" + this.inSlot + ')';
    }
}
