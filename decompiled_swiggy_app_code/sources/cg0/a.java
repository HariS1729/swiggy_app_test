package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class a {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18131a;
    @SerializedName("old-directions-to-reach")

    /* renamed from: b  reason: collision with root package name */
    private String f18132b;
    @SerializedName("new-directions-to-reach")

    /* renamed from: c  reason: collision with root package name */
    private String f18133c;

    public a() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public a(String str, String str2, String str3) {
        this.f18131a = str;
        this.f18132b = str2;
        this.f18133c = str3;
    }

    public final void a(String str) {
        this.f18133c = str;
    }

    public final void b(String str) {
        this.f18132b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(this.f18131a, aVar.f18131a) && p.e(this.f18132b, aVar.f18132b) && p.e(this.f18133c, aVar.f18133c);
    }

    public int hashCode() {
        String str = this.f18131a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18132b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18133c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "AddressD2RChangeEventData(addressUid=" + this.f18131a + ", oldDirectionsToReach=" + this.f18132b + ", newDirectionsToReach=" + this.f18133c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
