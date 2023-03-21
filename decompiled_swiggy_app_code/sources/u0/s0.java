package u0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import t0.a;
import t0.b;
import t0.h;
import t0.j;
import t0.m;
import u0.r0;
import w0.f;
import w0.g;
import w0.k;

/* compiled from: Outline.kt */
public final class s0 {
    public static final void b(f fVar, r0 r0Var, u uVar, float f11, g gVar, e0 e0Var, int i11) {
        w0 w0Var;
        r0 r0Var2 = r0Var;
        f fVar2 = fVar;
        p.j(fVar, "$this$drawOutline");
        p.j(r0Var, "outline");
        p.j(uVar, "brush");
        p.j(gVar, "style");
        if (r0Var2 instanceof r0.b) {
            h a11 = ((r0.b) r0Var2).a();
            fVar.i0(uVar, i(a11), g(a11), f11, gVar, e0Var, i11);
            return;
        }
        if (r0Var2 instanceof r0.c) {
            r0.c cVar = (r0.c) r0Var2;
            w0Var = cVar.b();
            if (w0Var == null) {
                j a12 = cVar.a();
                float d11 = a.d(a12.b());
                fVar.v(uVar, j(a12), h(a12), b.b(d11, 0.0f, 2, (Object) null), f11, gVar, e0Var, i11);
                return;
            }
        } else if (r0Var2 instanceof r0.a) {
            w0Var = ((r0.a) r0Var2).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fVar.E(w0Var, uVar, f11, gVar, e0Var, i11);
    }

    public static /* synthetic */ void c(f fVar, r0 r0Var, u uVar, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        float f12 = (i12 & 4) != 0 ? 1.0f : f11;
        if ((i12 & 8) != 0) {
            gVar = k.f17436a;
        }
        g gVar2 = gVar;
        if ((i12 & 16) != 0) {
            e0Var = null;
        }
        e0 e0Var2 = e0Var;
        if ((i12 & 32) != 0) {
            i11 = f.f17432j0.a();
        }
        b(fVar, r0Var, uVar, f12, gVar2, e0Var2, i11);
    }

    public static final void d(f fVar, r0 r0Var, long j, float f11, g gVar, e0 e0Var, int i11) {
        w0 w0Var;
        r0 r0Var2 = r0Var;
        f fVar2 = fVar;
        p.j(fVar, "$this$drawOutline");
        p.j(r0Var2, "outline");
        p.j(gVar, "style");
        if (r0Var2 instanceof r0.b) {
            h a11 = ((r0.b) r0Var2).a();
            fVar.b0(j, i(a11), g(a11), f11, gVar, e0Var, i11);
            return;
        }
        if (r0Var2 instanceof r0.c) {
            r0.c cVar = (r0.c) r0Var2;
            w0Var = cVar.b();
            if (w0Var == null) {
                j a12 = cVar.a();
                f fVar3 = fVar;
                long j11 = j;
                fVar3.Q(j11, j(a12), h(a12), b.b(a.d(a12.b()), 0.0f, 2, (Object) null), gVar, f11, e0Var, i11);
                return;
            }
        } else if (r0Var2 instanceof r0.a) {
            w0Var = ((r0.a) r0Var2).a();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fVar.X(w0Var, j, f11, gVar, e0Var, i11);
    }

    public static /* synthetic */ void e(f fVar, r0 r0Var, long j, float f11, g gVar, e0 e0Var, int i11, int i12, Object obj) {
        d(fVar, r0Var, j, (i12 & 4) != 0 ? 1.0f : f11, (i12 & 8) != 0 ? k.f17436a : gVar, (i12 & 16) != 0 ? null : e0Var, (i12 & 32) != 0 ? f.f17432j0.a() : i11);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean f(t0.j r6) {
        /*
            long r0 = r6.b()
            float r0 = t0.a.d(r0)
            long r1 = r6.c()
            float r1 = t0.a.d(r1)
            r2 = 1
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 == 0) goto L_0x004f
            long r0 = r6.c()
            float r0 = t0.a.d(r0)
            long r4 = r6.i()
            float r1 = t0.a.d(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            r0 = 1
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x004f
            long r0 = r6.i()
            float r0 = t0.a.d(r0)
            long r4 = r6.h()
            float r1 = t0.a.d(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x004f
            r0 = 1
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            long r4 = r6.b()
            float r1 = t0.a.e(r4)
            long r4 = r6.c()
            float r4 = t0.a.e(r4)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0066
            r1 = 1
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 == 0) goto L_0x009d
            long r4 = r6.c()
            float r1 = t0.a.e(r4)
            long r4 = r6.i()
            float r4 = t0.a.e(r4)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x007f
            r1 = 1
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            if (r1 == 0) goto L_0x009d
            long r4 = r6.i()
            float r1 = t0.a.e(r4)
            long r4 = r6.h()
            float r6 = t0.a.e(r4)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0098
            r6 = 1
            goto L_0x0099
        L_0x0098:
            r6 = 0
        L_0x0099:
            if (r6 == 0) goto L_0x009d
            r6 = 1
            goto L_0x009e
        L_0x009d:
            r6 = 0
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.s0.f(t0.j):boolean");
    }

    private static final long g(h hVar) {
        return m.a(hVar.n(), hVar.h());
    }

    private static final long h(j jVar) {
        return m.a(jVar.j(), jVar.d());
    }

    private static final long i(h hVar) {
        return t0.g.a(hVar.i(), hVar.l());
    }

    private static final long j(j jVar) {
        return t0.g.a(jVar.e(), jVar.g());
    }
}
