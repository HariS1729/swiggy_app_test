package androidx.compose.runtime;

import bp0.k;
import e0.c;
import e0.g;
import e0.h;
import e0.j;
import e0.o0;
import e0.s0;
import f0.a;
import f0.b;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Objects;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;

/* compiled from: RecomposeScopeImpl.kt */
public final class RecomposeScopeImpl implements s0, o0 {

    /* renamed from: a  reason: collision with root package name */
    private int f6029a;

    /* renamed from: b  reason: collision with root package name */
    private j f6030b;

    /* renamed from: c  reason: collision with root package name */
    private c f6031c;

    /* renamed from: d  reason: collision with root package name */
    private p<? super g, ? super Integer, k> f6032d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f6033e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a f6034f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public b<e0.p<?>, Object> f6035g;

    public RecomposeScopeImpl(j jVar) {
        this.f6030b = jVar;
    }

    private final void E(boolean z11) {
        if (z11) {
            this.f6029a |= 32;
        } else {
            this.f6029a &= -33;
        }
    }

    private final void F(boolean z11) {
        if (z11) {
            this.f6029a |= 16;
        } else {
            this.f6029a &= -17;
        }
    }

    private final boolean p() {
        return (this.f6029a & 32) != 0;
    }

    public final void A(c cVar) {
        this.f6031c = cVar;
    }

    public final void B(boolean z11) {
        if (z11) {
            this.f6029a |= 2;
        } else {
            this.f6029a &= -3;
        }
    }

    public final void C(boolean z11) {
        if (z11) {
            this.f6029a |= 4;
        } else {
            this.f6029a &= -5;
        }
    }

    public final void D(boolean z11) {
        if (z11) {
            this.f6029a |= 8;
        } else {
            this.f6029a &= -9;
        }
    }

    public final void G(boolean z11) {
        if (z11) {
            this.f6029a |= 1;
        } else {
            this.f6029a &= -2;
        }
    }

    public final void H(int i11) {
        this.f6033e = i11;
        F(false);
    }

    public void a(p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, RenderingDetails.TYPE_BLOCK);
        this.f6032d = pVar;
    }

    public final void g(j jVar) {
        kotlin.jvm.internal.p.j(jVar, "composition");
        this.f6030b = jVar;
    }

    public final void h(g gVar) {
        k kVar;
        kotlin.jvm.internal.p.j(gVar, "composer");
        p<? super g, ? super Integer, k> pVar = this.f6032d;
        if (pVar != null) {
            pVar.invoke(gVar, 1);
            kVar = k.f22762a;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final l<h, k> i(int i11) {
        a aVar = this.f6034f;
        if (aVar == null || q()) {
            return null;
        }
        int e11 = aVar.e();
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= e11) {
                break;
            }
            Objects.requireNonNull(aVar.d()[i12], "null cannot be cast to non-null type kotlin.Any");
            if (aVar.f()[i12] != i11) {
                z11 = true;
                break;
            }
            i12++;
        }
        if (z11) {
            return new RecomposeScopeImpl$end$1$2(this, i11, aVar);
        }
        return null;
    }

    public void invalidate() {
        j jVar = this.f6030b;
        if (jVar != null) {
            jVar.y(this, (Object) null);
        }
    }

    public final c j() {
        return this.f6031c;
    }

    public final boolean k() {
        return this.f6032d != null;
    }

    public final j l() {
        return this.f6030b;
    }

    public final boolean m() {
        return (this.f6029a & 2) != 0;
    }

    public final boolean n() {
        return (this.f6029a & 4) != 0;
    }

    public final boolean o() {
        return (this.f6029a & 8) != 0;
    }

    public final boolean q() {
        return (this.f6029a & 16) != 0;
    }

    public final boolean r() {
        return (this.f6029a & 1) != 0;
    }

    public final boolean s() {
        if (this.f6030b == null) {
            return false;
        }
        c cVar = this.f6031c;
        return cVar != null ? cVar.b() : false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.y(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult t(java.lang.Object r2) {
        /*
            r1 = this;
            e0.j r0 = r1.f6030b
            if (r0 == 0) goto L_0x000a
            androidx.compose.runtime.InvalidationResult r2 = r0.y(r1, r2)
            if (r2 != 0) goto L_0x000c
        L_0x000a:
            androidx.compose.runtime.InvalidationResult r2 = androidx.compose.runtime.InvalidationResult.IGNORED
        L_0x000c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.t(java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final boolean u() {
        return this.f6035g != null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(f0.c<java.lang.Object> r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            f0.b<e0.p<?>, java.lang.Object> r1 = r5.f6035g
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            boolean r2 = r6.g()
            if (r2 == 0) goto L_0x0043
            boolean r2 = r6.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x0018
        L_0x0016:
            r6 = 1
            goto L_0x0040
        L_0x0018:
            java.util.Iterator r6 = r6.iterator()
        L_0x001c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0016
            java.lang.Object r2 = r6.next()
            boolean r4 = r2 instanceof e0.p
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r1.d(r2)
            e0.p r2 = (e0.p) r2
            java.lang.Object r2 = r2.h()
            boolean r2 = kotlin.jvm.internal.p.e(r4, r2)
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 != 0) goto L_0x001c
            r6 = 0
        L_0x0040:
            if (r6 == 0) goto L_0x0043
            return r3
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.v(f0.c):boolean");
    }

    public final void w(Object obj) {
        kotlin.jvm.internal.p.j(obj, "instance");
        if (!p()) {
            a aVar = this.f6034f;
            if (aVar == null) {
                aVar = new a();
                this.f6034f = aVar;
            }
            aVar.a(obj, this.f6033e);
            if (obj instanceof e0.p) {
                b<e0.p<?>, Object> bVar = this.f6035g;
                if (bVar == null) {
                    bVar = new b<>(0, 1, (i) null);
                    this.f6035g = bVar;
                }
                bVar.j(obj, ((e0.p) obj).h());
            }
        }
    }

    public final void x() {
        this.f6030b = null;
        this.f6034f = null;
        this.f6035g = null;
    }

    public final void y() {
        a aVar;
        j jVar = this.f6030b;
        if (jVar != null && (aVar = this.f6034f) != null) {
            E(true);
            try {
                int e11 = aVar.e();
                int i11 = 0;
                while (i11 < e11) {
                    Object obj = aVar.d()[i11];
                    if (obj != null) {
                        int i12 = aVar.f()[i11];
                        jVar.l(obj);
                        i11++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                }
            } finally {
                E(false);
            }
        }
    }

    public final void z() {
        F(true);
    }
}
