package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class a1 {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18134a;
    @SerializedName("old-other-string")

    /* renamed from: b  reason: collision with root package name */
    private String f18135b;
    @SerializedName("new-other-string")

    /* renamed from: c  reason: collision with root package name */
    private String f18136c;

    public a1() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public a1(String str, String str2, String str3) {
        this.f18134a = str;
        this.f18135b = str2;
        this.f18136c = str3;
    }

    public final void a(String str) {
        this.f18136c = str;
    }

    public final void b(String str) {
        this.f18135b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return p.e(this.f18134a, a1Var.f18134a) && p.e(this.f18135b, a1Var.f18135b) && p.e(this.f18136c, a1Var.f18136c);
    }

    public int hashCode() {
        String str = this.f18134a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18135b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18136c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "OthersTagEventData(addressUid=" + this.f18134a + ", oldOtherString=" + this.f18135b + ", newOtherString=" + this.f18136c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
