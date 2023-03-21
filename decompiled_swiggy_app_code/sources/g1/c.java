package g1;

import bs.a;
import kotlin.jvm.internal.i;
import t0.f;

/* compiled from: VelocityTracker.kt */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f14714a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14715b;

    private c(long j, long j11) {
        this.f14714a = j;
        this.f14715b = j11;
    }

    public /* synthetic */ c(long j, long j11, i iVar) {
        this(j, j11);
    }

    public final long a() {
        return this.f14714a;
    }

    public final long b() {
        return this.f14715b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.j(this.f14714a, cVar.f14714a) && this.f14715b == cVar.f14715b;
    }

    public int hashCode() {
        return (f.o(this.f14714a) * 31) + a.a(this.f14715b);
    }

    public String toString() {
        return "PointAtTime(point=" + f.t(this.f14714a) + ", time=" + this.f14715b + ')';
    }
}
