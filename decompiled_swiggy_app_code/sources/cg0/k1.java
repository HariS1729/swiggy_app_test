package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class k1 {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18166a;
    @SerializedName("old-address-tag")

    /* renamed from: b  reason: collision with root package name */
    private String f18167b;
    @SerializedName("new-address-tag")

    /* renamed from: c  reason: collision with root package name */
    private String f18168c;

    public k1() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public k1(String str, String str2, String str3) {
        this.f18166a = str;
        this.f18167b = str2;
        this.f18168c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return p.e(this.f18166a, k1Var.f18166a) && p.e(this.f18167b, k1Var.f18167b) && p.e(this.f18168c, k1Var.f18168c);
    }

    public int hashCode() {
        String str = this.f18166a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18167b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18168c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "SelectedAddressTagEventData(addressUid=" + this.f18166a + ", oldAddressTag=" + this.f18167b + ", newAddressTag=" + this.f18168c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
