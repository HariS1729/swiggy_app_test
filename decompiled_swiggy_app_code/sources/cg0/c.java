package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class c {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18142a;
    @SerializedName("old-address-line-1")

    /* renamed from: b  reason: collision with root package name */
    private String f18143b;
    @SerializedName("new-address-line-1")

    /* renamed from: c  reason: collision with root package name */
    private String f18144c;

    public c() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public c(String str, String str2, String str3) {
        this.f18142a = str;
        this.f18143b = str2;
        this.f18144c = str3;
    }

    public final void a(String str) {
        this.f18144c = str;
    }

    public final void b(String str) {
        this.f18143b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p.e(this.f18142a, cVar.f18142a) && p.e(this.f18143b, cVar.f18143b) && p.e(this.f18144c, cVar.f18144c);
    }

    public int hashCode() {
        String str = this.f18142a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18143b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18144c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "AddressLine1ChangeEventData(addressUid=" + this.f18142a + ", oldAddressLine1=" + this.f18143b + ", newAddressLine1=" + this.f18144c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
