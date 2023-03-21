package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class g {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18156a;
    @SerializedName("address-id")

    /* renamed from: b  reason: collision with root package name */
    private String f18157b;

    public g() {
        this((String) null, (String) null, 3, (i) null);
    }

    public g(String str, String str2) {
        this.f18156a = str;
        this.f18157b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p.e(this.f18156a, gVar.f18156a) && p.e(this.f18157b, gVar.f18157b);
    }

    public int hashCode() {
        String str = this.f18156a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18157b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "CreateAddressEventData(addressUid=" + this.f18156a + ", addressId=" + this.f18157b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
