package androidx.compose.material;

import c0.a;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import u0.d0;

/* compiled from: Button.kt */
final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final long f5779a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5780b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5781c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5782d;

    private b(long j, long j11, long j12, long j13) {
        this.f5779a = j;
        this.f5780b = j11;
        this.f5781c = j12;
        this.f5782d = j13;
    }

    public /* synthetic */ b(long j, long j11, long j12, long j13, i iVar) {
        this(j, j11, j12, j13);
    }

    public d1<d0> a(boolean z11, g gVar, int i11) {
        gVar.E(1290127909);
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(z11 ? this.f5779a : this.f5781c), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> b(boolean z11, g gVar, int i11) {
        gVar.E(1464785127);
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(z11 ? this.f5780b : this.f5782d), gVar, 0);
        gVar.P();
        return m11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(s.b(b.class), s.b(obj.getClass()))) {
            return false;
        }
        b bVar = (b) obj;
        return d0.n(this.f5779a, bVar.f5779a) && d0.n(this.f5780b, bVar.f5780b) && d0.n(this.f5781c, bVar.f5781c) && d0.n(this.f5782d, bVar.f5782d);
    }

    public int hashCode() {
        return (((((d0.t(this.f5779a) * 31) + d0.t(this.f5780b)) * 31) + d0.t(this.f5781c)) * 31) + d0.t(this.f5782d);
    }
}
