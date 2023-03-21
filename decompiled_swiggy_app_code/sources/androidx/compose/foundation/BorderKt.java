package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import k1.t;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.d;
import r0.c;
import r0.g;
import s.b;
import t0.f;
import t0.j;
import u0.a1;
import u0.c1;
import u0.j1;
import u0.k1;
import u0.l0;
import u0.o;
import u0.r0;
import u0.u;
import u0.w0;
import u0.x;
import u0.x0;
import w0.a;
import w0.k;
import w0.l;

/* compiled from: Border.kt */
public final class BorderKt {
    public static final d f(d dVar, b bVar, j1 j1Var) {
        p.j(dVar, "<this>");
        p.j(bVar, "border");
        p.j(j1Var, "shape");
        return j(dVar, bVar.b(), bVar.a(), j1Var);
    }

    public static /* synthetic */ d g(d dVar, b bVar, j1 j1Var, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j1Var = c1.a();
        }
        return f(dVar, bVar, j1Var);
    }

    public static final d h(d dVar, float f11, long j, j1 j1Var) {
        p.j(dVar, "$this$border");
        p.j(j1Var, "shape");
        return j(dVar, f11, new k1(j, (i) null), j1Var);
    }

    public static /* synthetic */ d i(d dVar, float f11, long j, j1 j1Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j1Var = c1.a();
        }
        return h(dVar, f11, j, j1Var);
    }

    public static final d j(d dVar, float f11, u uVar, j1 j1Var) {
        p.j(dVar, "$this$border");
        p.j(uVar, "brush");
        p.j(j1Var, "shape");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(f11, uVar, j1Var) : InspectableValueKt.a(), new BorderKt$border$2(f11, j1Var, uVar));
    }

    private static final j k(float f11, j jVar) {
        float f12 = f11;
        return new j(f11, f12, jVar.j() - f12, jVar.d() - f12, r(jVar.h(), f11), r(jVar.i(), f11), r(jVar.c(), f11), r(jVar.b(), f11), (i) null);
    }

    private static final w0 l(w0 w0Var, j jVar, float f11, boolean z11) {
        w0Var.reset();
        w0Var.f(jVar);
        if (!z11) {
            w0 a11 = o.a();
            a11.f(k(f11, jVar));
            w0Var.o(w0Var, a11, a1.f16741a.a());
        }
        return w0Var;
    }

    /* access modifiers changed from: private */
    public static final g m(c cVar) {
        return cVar.p(BorderKt$drawContentWithoutBorder$1.f2861a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b7, code lost:
        if (u0.m0.h(r13, r3) != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final r0.g n(r0.c r42, k1.t<androidx.compose.foundation.b> r43, u0.u r44, u0.r0.a r45, boolean r46, float r47) {
        /*
            r0 = r42
            r10 = r44
            if (r46 == 0) goto L_0x0013
            androidx.compose.foundation.BorderKt$drawGenericBorder$1 r1 = new androidx.compose.foundation.BorderKt$drawGenericBorder$1
            r2 = r45
            r1.<init>(r2, r10)
            r0.g r0 = r0.p(r1)
            goto L_0x026c
        L_0x0013:
            r2 = r45
            boolean r1 = r10 instanceof u0.k1
            r3 = 0
            if (r1 == 0) goto L_0x0034
            u0.m0$a r1 = u0.m0.f16830b
            int r1 = r1.a()
            u0.e0$a r4 = u0.e0.f16769b
            r5 = r10
            u0.k1 r5 = (u0.k1) r5
            long r5 = r5.b()
            r7 = 0
            r8 = 2
            r9 = 0
            u0.e0 r4 = u0.e0.a.c(r4, r5, r7, r8, r9)
            r13 = r1
            r18 = r4
            goto L_0x003d
        L_0x0034:
            u0.m0$a r1 = u0.m0.f16830b
            int r1 = r1.b()
            r13 = r1
            r18 = r3
        L_0x003d:
            u0.w0 r1 = r45.a()
            t0.h r9 = r1.a()
            androidx.compose.foundation.b r1 = q(r43)
            u0.w0 r8 = r1.g()
            r8.reset()
            r8.h(r9)
            u0.w0 r4 = r45.a()
            u0.a1$a r5 = u0.a1.f16741a
            int r5 = r5.a()
            r8.o(r8, r4, r5)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            float r4 = r9.n()
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = r9.h()
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            long r19 = d2.q.a(r4, r5)
            u0.l0 r4 = r1.f3178a
            u0.x r5 = r1.f3179b
            if (r4 == 0) goto L_0x0092
            int r6 = r4.b()
            u0.m0 r6 = u0.m0.f(r6)
            goto L_0x0093
        L_0x0092:
            r6 = r3
        L_0x0093:
            u0.m0$a r11 = u0.m0.f16830b
            int r11 = r11.b()
            r12 = 0
            if (r6 != 0) goto L_0x009e
            r6 = 0
            goto L_0x00a6
        L_0x009e:
            int r6 = r6.l()
            boolean r6 = u0.m0.i(r6, r11)
        L_0x00a6:
            r15 = 1
            if (r6 != 0) goto L_0x00b9
            if (r4 == 0) goto L_0x00b3
            int r3 = r4.b()
            u0.m0 r3 = u0.m0.f(r3)
        L_0x00b3:
            boolean r3 = u0.m0.h(r13, r3)
            if (r3 == 0) goto L_0x00ba
        L_0x00b9:
            r12 = 1
        L_0x00ba:
            if (r4 == 0) goto L_0x00e7
            if (r5 == 0) goto L_0x00e7
            long r16 = r42.d()
            float r3 = t0.l.i(r16)
            int r6 = r4.getWidth()
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00e7
            long r16 = r42.d()
            float r3 = t0.l.g(r16)
            int r6 = r4.getHeight()
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00e7
            if (r12 != 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            r11 = r4
            r12 = r5
            r6 = 1
            goto L_0x0107
        L_0x00e7:
            int r11 = d2.p.g(r19)
            int r12 = d2.p.f(r19)
            r14 = 0
            r3 = 0
            r16 = 24
            r17 = 0
            r6 = 1
            r15 = r3
            u0.l0 r4 = u0.n0.b(r11, r12, r13, r14, r15, r16, r17)
            r1.f3178a = r4
            u0.x r5 = u0.z.a(r4)
            r1.f3179b = r5
            r11 = r4
            r12 = r5
        L_0x0107:
            w0.a r3 = r1.f3180c
            if (r3 != 0) goto L_0x0115
            w0.a r3 = new w0.a
            r3.<init>()
            r1.f3180c = r3
        L_0x0115:
            r13 = r3
            long r3 = d2.q.b(r19)
            androidx.compose.ui.unit.LayoutDirection r1 = r42.getLayoutDirection()
            w0.a$a r5 = r13.D()
            d2.e r14 = r5.a()
            androidx.compose.ui.unit.LayoutDirection r15 = r5.b()
            r43 = r8
            u0.x r8 = r5.c()
            r46 = r7
            r16 = r8
            long r7 = r5.d()
            w0.a$a r5 = r13.D()
            r5.j(r0)
            r5.k(r1)
            r5.i(r12)
            r5.l(r3)
            r12.a()
            u0.d0$a r1 = u0.d0.f16756b
            long r22 = r1.a()
            r24 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            u0.s$a r17 = u0.s.f16866b
            int r31 = r17.a()
            r32 = 58
            r33 = 0
            r21 = r13
            r26 = r3
            w0.e.n(r21, r22, r24, r26, r28, r29, r30, r31, r32, r33)
            float r1 = r9.i()
            float r5 = -r1
            float r1 = r9.l()
            float r4 = -r1
            w0.d r1 = r13.O()
            w0.i r1 = r1.c()
            r1.c(r5, r4)
            u0.w0 r2 = r45.a()
            r21 = 0
            w0.l r30 = new w0.l
            r1 = 2
            float r1 = (float) r1
            float r23 = r47 * r1
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 30
            r22 = r30
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r22 = 0
            r23 = 0
            r24 = 52
            r25 = 0
            r1 = r13
            r3 = r44
            r34 = r4
            r4 = r21
            r35 = r5
            r5 = r30
            r6 = r22
            r36 = r7
            r8 = r46
            r7 = r23
            r38 = r8
            r39 = r16
            r16 = r43
            r8 = r24
            r21 = r9
            r9 = r25
            w0.e.k(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            long r1 = r13.d()
            float r1 = t0.l.i(r1)
            r2 = 1
            float r2 = (float) r2
            float r1 = r1 + r2
            long r3 = r13.d()
            float r3 = t0.l.i(r3)
            float r1 = r1 / r3
            long r3 = r13.d()
            float r3 = t0.l.g(r3)
            float r3 = r3 + r2
            long r4 = r13.d()
            float r2 = t0.l.g(r4)
            float r3 = r3 / r2
            long r4 = r13.R()
            w0.d r9 = r13.O()
            long r7 = r9.d()
            u0.x r2 = r9.a()
            r2.a()
            w0.i r2 = r9.c()
            r2.a(r1, r3, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            int r17 = r17.a()
            r22 = 28
            r23 = 0
            r1 = r13
            r2 = r16
            r3 = r44
            r40 = r7
            r7 = r17
            r8 = r22
            r10 = r9
            r9 = r23
            w0.e.k(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            u0.x r1 = r10.a()
            r1.o()
            r1 = r40
            r10.b(r1)
            w0.d r1 = r13.O()
            w0.i r1 = r1.c()
            r2 = r35
            float r2 = -r2
            r3 = r34
            float r3 = -r3
            r1.c(r2, r3)
            r12.o()
            w0.a$a r1 = r13.D()
            r1.j(r14)
            r1.k(r15)
            r2 = r39
            r1.i(r2)
            r2 = r36
            r1.l(r2)
            r11.a()
            r1 = r38
            r1.f25666a = r11
            androidx.compose.foundation.BorderKt$drawGenericBorder$3 r2 = new androidx.compose.foundation.BorderKt$drawGenericBorder$3
            r4 = r2
            r5 = r21
            r6 = r1
            r7 = r19
            r9 = r18
            r4.<init>(r5, r6, r7, r9)
            r0.g r0 = r0.p(r2)
        L_0x026c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.n(r0.c, k1.t, u0.u, u0.r0$a, boolean, float):r0.g");
    }

    /* access modifiers changed from: private */
    public static final g o(c cVar, u uVar, long j, long j11, boolean z11, float f11) {
        return cVar.p(new BorderKt$drawRectBorder$1(uVar, z11 ? f.f16662b.c() : j, z11 ? cVar.d() : j11, z11 ? k.f17436a : new l(f11, 0.0f, 0, 0, (x0) null, 30, (i) null)));
    }

    /* access modifiers changed from: private */
    public static final g p(c cVar, t<b> tVar, u uVar, r0.c cVar2, long j, long j11, boolean z11, float f11) {
        c cVar3 = cVar;
        float f12 = f11;
        if (!t0.k.d(cVar2.a())) {
            return cVar.p(new BorderKt$drawRoundRectBorder$2(l(q(tVar).g(), cVar2.a(), f12, z11), uVar));
        }
        return cVar.p(new BorderKt$drawRoundRectBorder$1(z11, uVar, cVar2.a().h(), f12 / ((float) 2), f11, j, j11, new l(f11, 0.0f, 0, 0, (x0) null, 30, (i) null)));
    }

    private static final b q(t<b> tVar) {
        b a11 = tVar.a();
        if (a11 != null) {
            return a11;
        }
        b bVar = new b((l0) null, (x) null, (a) null, (w0) null, 15, (i) null);
        tVar.b(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    public static final long r(long j, float f11) {
        return t0.b.a(Math.max(0.0f, t0.a.d(j) - f11), Math.max(0.0f, t0.a.e(j) - f11));
    }
}
