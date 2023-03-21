package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class z0 {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18213a;

    public z0() {
        this((String) null, 1, (i) null);
    }

    public z0(String str) {
        this.f18213a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && p.e(this.f18213a, ((z0) obj).f18213a);
    }

    public int hashCode() {
        String str = this.f18213a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "MapsAddressEventData(addressUid=" + this.f18213a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
