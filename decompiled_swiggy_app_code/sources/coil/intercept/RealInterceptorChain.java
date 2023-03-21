package coil.intercept;

import java.util.List;
import m6.c;
import s6.a;
import x6.g;
import x6.i;

/* compiled from: RealInterceptorChain.kt */
public final class RealInterceptorChain implements a.C0186a {

    /* renamed from: a  reason: collision with root package name */
    private final g f13633a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f13634b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13635c;

    /* renamed from: d  reason: collision with root package name */
    private final g f13636d;

    /* renamed from: e  reason: collision with root package name */
    private final y6.g f13637e;

    /* renamed from: f  reason: collision with root package name */
    private final c f13638f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13639g;

    public RealInterceptorChain(g gVar, List<? extends a> list, int i11, g gVar2, y6.g gVar3, c cVar, boolean z11) {
        this.f13633a = gVar;
        this.f13634b = list;
        this.f13635c = i11;
        this.f13636d = gVar2;
        this.f13637e = gVar3;
        this.f13638f = cVar;
        this.f13639g = z11;
    }

    private final void b(g gVar, a aVar) {
        boolean z11 = true;
        if (gVar.l() == this.f13633a.l()) {
            if (gVar.m() != i.f17814a) {
                if (gVar.M() == this.f13633a.M()) {
                    if (gVar.z() == this.f13633a.z()) {
                        if (gVar.K() != this.f13633a.K()) {
                            z11 = false;
                        }
                        if (!z11) {
                            throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                        }
                        return;
                    }
                    throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + aVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + aVar + "' cannot modify the request's context.").toString());
    }

    private final RealInterceptorChain d(int i11, g gVar, y6.g gVar2) {
        return new RealInterceptorChain(this.f13633a, this.f13634b, i11, gVar, gVar2, this.f13638f, this.f13639g);
    }

    static /* synthetic */ RealInterceptorChain e(RealInterceptorChain realInterceptorChain, int i11, g gVar, y6.g gVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = realInterceptorChain.f13635c;
        }
        if ((i12 & 2) != 0) {
            gVar = realInterceptorChain.c();
        }
        if ((i12 & 4) != 0) {
            gVar2 = realInterceptorChain.a();
        }
        return realInterceptorChain.d(i11, gVar, gVar2);
    }

    public y6.g a() {
        return this.f13637e;
    }

    public g c() {
        return this.f13636d;
    }

    public final c f() {
        return this.f13638f;
    }

    public final int g() {
        return this.f13635c;
    }

    public final List<a> h() {
        return this.f13634b;
    }

    public final boolean i() {
        return this.f13639g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object j(x6.g r12, fp0.c<? super x6.h> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof coil.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            coil.intercept.RealInterceptorChain$proceed$1 r0 = (coil.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.f13644e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13644e = r1
            goto L_0x0018
        L_0x0013:
            coil.intercept.RealInterceptorChain$proceed$1 r0 = new coil.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f13642c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13644e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r12 = r0.f13641b
            s6.a r12 = (s6.a) r12
            java.lang.Object r0 = r0.f13640a
            coil.intercept.RealInterceptorChain r0 = (coil.intercept.RealInterceptorChain) r0
            bp0.g.b(r13)
            goto L_0x0082
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            bp0.g.b(r13)
            int r13 = r11.g()
            if (r13 <= 0) goto L_0x0054
            java.util.List r13 = r11.h()
            int r2 = r11.g()
            int r2 = r2 - r3
            java.lang.Object r13 = r13.get(r2)
            s6.a r13 = (s6.a) r13
            r11.b(r12, r13)
        L_0x0054:
            java.util.List r13 = r11.h()
            int r2 = r11.g()
            java.lang.Object r13 = r13.get(r2)
            s6.a r13 = (s6.a) r13
            int r2 = r11.g()
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            coil.intercept.RealInterceptorChain r12 = e(r4, r5, r6, r7, r8, r9)
            r0.f13640a = r11
            r0.f13641b = r13
            r0.f13644e = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L_0x007e
            return r1
        L_0x007e:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L_0x0082:
            x6.h r13 = (x6.h) r13
            x6.g r1 = r13.b()
            r0.b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.intercept.RealInterceptorChain.j(x6.g, fp0.c):java.lang.Object");
    }
}
