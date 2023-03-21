package ig0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: GpsFailedData.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final double f18419a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18420b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18421c;

    public d() {
        this(0.0d, false, false, 7, (i) null);
    }

    public d(double d11, boolean z11, boolean z12) {
        this.f18419a = d11;
        this.f18420b = z11;
        this.f18421c = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.e(Double.valueOf(this.f18419a), Double.valueOf(dVar.f18419a)) && this.f18420b == dVar.f18420b && this.f18421c == dVar.f18421c;
    }

    public int hashCode() {
        int a11 = Double.doubleToLongBits(this.f18419a) * 31;
        boolean z11 = this.f18420b;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int i11 = (a11 + (z11 ? 1 : 0)) * 31;
        boolean z13 = this.f18421c;
        if (!z13) {
            z12 = z13;
        }
        return i11 + (z12 ? 1 : 0);
    }

    public String toString() {
        return "GpsFailedData(timeTakenInMilliSecs=" + this.f18419a + ", isTimedOut=" + this.f18420b + ", isFromPN=" + this.f18421c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(double d11, boolean z11, boolean z12, int i11, i iVar) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
    }
}
