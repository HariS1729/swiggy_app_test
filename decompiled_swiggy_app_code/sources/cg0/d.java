package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class d {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18145a;
    @SerializedName("old-address-line-2")

    /* renamed from: b  reason: collision with root package name */
    private String f18146b;
    @SerializedName("new-address-line-2")

    /* renamed from: c  reason: collision with root package name */
    private String f18147c;

    public d() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public d(String str, String str2, String str3) {
        this.f18145a = str;
        this.f18146b = str2;
        this.f18147c = str3;
    }

    public final void a(String str) {
        this.f18147c = str;
    }

    public final void b(String str) {
        this.f18146b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.e(this.f18145a, dVar.f18145a) && p.e(this.f18146b, dVar.f18146b) && p.e(this.f18147c, dVar.f18147c);
    }

    public int hashCode() {
        String str = this.f18145a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18146b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18147c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "AddressLine2ChangeEventData(addressUid=" + this.f18145a + ", oldAddressLine2=" + this.f18146b + ", newAddressLine2=" + this.f18147c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
