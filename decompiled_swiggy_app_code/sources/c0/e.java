package c0;

import e0.d1;
import e0.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import u0.d0;

/* compiled from: Switch.kt */
final class e implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f12683a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12684b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12685c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12686d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12687e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12688f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12689g;

    /* renamed from: h  reason: collision with root package name */
    private final long f12690h;

    private e(long j, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.f12683a = j;
        this.f12684b = j11;
        this.f12685c = j12;
        this.f12686d = j13;
        this.f12687e = j14;
        this.f12688f = j15;
        this.f12689g = j16;
        this.f12690h = j17;
    }

    public /* synthetic */ e(long j, long j11, long j12, long j13, long j14, long j15, long j16, long j17, i iVar) {
        this(j, j11, j12, j13, j14, j15, j16, j17);
    }

    public d1<d0> a(boolean z11, boolean z12, g gVar, int i11) {
        long j;
        gVar.E(885559414);
        if (z11) {
            j = z12 ? this.f12683a : this.f12685c;
        } else {
            j = z12 ? this.f12687e : this.f12689g;
        }
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(j), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> b(boolean z11, boolean z12, g gVar, int i11) {
        long j;
        gVar.E(-140860001);
        if (z11) {
            j = z12 ? this.f12684b : this.f12686d;
        } else {
            j = z12 ? this.f12688f : this.f12690h;
        }
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(j), gVar, 0);
        gVar.P();
        return m11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(s.b(e.class), s.b(obj.getClass()))) {
            return false;
        }
        e eVar = (e) obj;
        return d0.n(this.f12683a, eVar.f12683a) && d0.n(this.f12684b, eVar.f12684b) && d0.n(this.f12685c, eVar.f12685c) && d0.n(this.f12686d, eVar.f12686d) && d0.n(this.f12687e, eVar.f12687e) && d0.n(this.f12688f, eVar.f12688f) && d0.n(this.f12689g, eVar.f12689g) && d0.n(this.f12690h, eVar.f12690h);
    }

    public int hashCode() {
        return (((((((((((((d0.t(this.f12683a) * 31) + d0.t(this.f12684b)) * 31) + d0.t(this.f12685c)) * 31) + d0.t(this.f12686d)) * 31) + d0.t(this.f12687e)) * 31) + d0.t(this.f12688f)) * 31) + d0.t(this.f12689g)) * 31) + d0.t(this.f12690h);
    }
}
