package cg0;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class y0 {
    @SerializedName("address-uid")

    /* renamed from: a  reason: collision with root package name */
    private String f18209a;
    @SerializedName("address-lat-long")

    /* renamed from: b  reason: collision with root package name */
    private String f18210b;
    @SerializedName("zoom-percentage")

    /* renamed from: c  reason: collision with root package name */
    private float f18211c;
    @SerializedName("maps_recenter_icon_revamp")

    /* renamed from: d  reason: collision with root package name */
    private String f18212d;

    public y0() {
        this((String) null, (String) null, 0.0f, (String) null, 15, (i) null);
    }

    public y0(String str, String str2, float f11, String str3) {
        this.f18209a = str;
        this.f18210b = str2;
        this.f18211c = f11;
        this.f18212d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return p.e(this.f18209a, y0Var.f18209a) && p.e(this.f18210b, y0Var.f18210b) && p.e(Float.valueOf(this.f18211c), Float.valueOf(y0Var.f18211c)) && p.e(this.f18212d, y0Var.f18212d);
    }

    public int hashCode() {
        String str = this.f18209a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18210b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Float.floatToIntBits(this.f18211c)) * 31;
        String str3 = this.f18212d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "MapZoomEventData(addressUid=" + this.f18209a + ", addressLatLong=" + this.f18210b + ", zoomPercentage=" + this.f18211c + ", mapsRecenterIconRevamp=" + this.f18212d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(String str, String str2, float f11, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? null : str3);
    }
}
