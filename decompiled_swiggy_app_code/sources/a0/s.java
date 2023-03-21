package a0;

import i1.m;
import kotlin.jvm.internal.p;
import p1.y;
import t0.f;
import t0.g;

/* compiled from: TextLayoutResultProxy.kt */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final y f865a;

    /* renamed from: b  reason: collision with root package name */
    private m f866b;

    /* renamed from: c  reason: collision with root package name */
    private m f867c;

    public s(y yVar) {
        p.j(yVar, "value");
        this.f865a = yVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long a(long r6) {
        /*
            r5 = this;
            i1.m r0 = r5.f866b
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.D()
            r2 = 0
            if (r1 == 0) goto L_0x0016
            i1.m r1 = r5.f867c
            if (r1 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            t0.h r2 = i1.l.a(r1, r0, r3, r4, r2)
            goto L_0x001c
        L_0x0016:
            t0.h$a r0 = t0.h.f16667e
            t0.h r2 = r0.a()
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            t0.h$a r0 = t0.h.f16667e
            t0.h r2 = r0.a()
        L_0x0024:
            long r6 = a0.t.b(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s.a(long):long");
    }

    public static /* synthetic */ int e(s sVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return sVar.d(i11, z11);
    }

    public static /* synthetic */ int h(s sVar, long j, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return sVar.g(j, z11);
    }

    private final long k(long j) {
        f fVar;
        m mVar = this.f866b;
        if (mVar == null) {
            return j;
        }
        m mVar2 = this.f867c;
        if (mVar2 != null) {
            fVar = f.d((!mVar.D() || !mVar2.D()) ? j : mVar.r(mVar2, j));
        } else {
            fVar = null;
        }
        return fVar != null ? fVar.u() : j;
    }

    public final m b() {
        return this.f867c;
    }

    public final m c() {
        return this.f866b;
    }

    public final int d(int i11, boolean z11) {
        return this.f865a.n(i11, z11);
    }

    public final int f(float f11) {
        return this.f865a.q(f.n(k(a(g.a(0.0f, f11)))));
    }

    public final int g(long j, boolean z11) {
        if (z11) {
            j = a(j);
        }
        return this.f865a.w(k(j));
    }

    public final y i() {
        return this.f865a;
    }

    public final boolean j(long j) {
        long k = k(a(j));
        int q = this.f865a.q(f.n(k));
        return f.m(k) >= this.f865a.r(q) && f.m(k) <= this.f865a.s(q);
    }

    public final void l(m mVar) {
        this.f867c = mVar;
    }

    public final void m(m mVar) {
        this.f866b = mVar;
    }
}
