package androidx.compose.material;

import c0.r;
import d2.h;
import defpackage.v1;
import e0.d1;
import t0.g;
import t0.m;
import u0.e0;
import w0.e;
import w0.f;
import w0.l;

/* compiled from: ProgressIndicator.kt */
public final class ProgressIndicatorKt {

    /* renamed from: a  reason: collision with root package name */
    private static final float f5203a = r.f12738a.a();

    /* renamed from: b  reason: collision with root package name */
    private static final float f5204b = h.n((float) 240);

    /* renamed from: c  reason: collision with root package name */
    private static final float f5205c = h.n((float) 40);

    /* renamed from: d  reason: collision with root package name */
    private static final v1.s f5206d = new v1.s(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e  reason: collision with root package name */
    private static final v1.s f5207e = new v1.s(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    private static final v1.s f5208f = new v1.s(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    private static final v1.s f5209g = new v1.s(0.1f, 0.0f, 0.45f, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final v1.s f5210h = new v1.s(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p0.d r30, long r31, float r33, e0.g r34, int r35, int r36) {
        /*
            r5 = r35
            r0 = 1769711363(0x697ba703, float:1.9014317E25)
            r1 = r34
            e0.g r0 = r1.t(r0)
            r1 = r36 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0016
            r3 = r5 | 6
            r4 = r3
            r3 = r30
            goto L_0x002a
        L_0x0016:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0027
            r3 = r30
            boolean r4 = r0.k(r3)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r5
            goto L_0x002a
        L_0x0027:
            r3 = r30
            r4 = r5
        L_0x002a:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r36 & 2
            if (r6 != 0) goto L_0x003d
            r6 = r31
            boolean r8 = r0.q(r6)
            if (r8 == 0) goto L_0x003f
            r8 = 32
            goto L_0x0041
        L_0x003d:
            r6 = r31
        L_0x003f:
            r8 = 16
        L_0x0041:
            r4 = r4 | r8
            goto L_0x0045
        L_0x0043:
            r6 = r31
        L_0x0045:
            r8 = r36 & 4
            if (r8 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r9 = r5 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r33
            boolean r10 = r0.n(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r33
        L_0x0061:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r4 = r4 ^ 146(0x92, float:2.05E-43)
            if (r4 != 0) goto L_0x0076
            boolean r4 = r0.b()
            if (r4 != 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            r0.h()
            r1 = r3
            r2 = r6
            r4 = r9
            goto L_0x0198
        L_0x0076:
            r0.H()
            r4 = r5 & 1
            if (r4 == 0) goto L_0x008b
            boolean r4 = r0.i()
            if (r4 == 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r0.h()
            r1 = r3
            r3 = r6
        L_0x0089:
            r15 = r9
            goto L_0x00ab
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x0091
        L_0x0090:
            r1 = r3
        L_0x0091:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x00a1
            c0.q r3 = c0.q.f12737a
            r4 = 6
            c0.c r3 = r3.a(r0, r4)
            long r3 = r3.j()
            goto L_0x00a2
        L_0x00a1:
            r3 = r6
        L_0x00a2:
            if (r8 == 0) goto L_0x0089
            c0.r r6 = c0.r.f12738a
            float r6 = r6.a()
            r15 = r6
        L_0x00ab:
            r0.A()
            e0.m0 r6 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r6 = r0.z(r6)
            d2.e r6 = (d2.e) r6
            w0.l r16 = new w0.l
            float r8 = r6.v0(r15)
            r9 = 0
            u0.l1$a r6 = u0.l1.f16824b
            int r10 = r6.c()
            r11 = 0
            r12 = 0
            r13 = 26
            r14 = 0
            r7 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            androidx.compose.animation.core.InfiniteTransition r13 = androidx.compose.animation.core.InfiniteTransitionKt.c(r0, r14)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r6 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            kotlin.jvm.internal.o r6 = kotlin.jvm.internal.o.f25689a
            v1$q0 r9 = androidx.compose.animation.core.VectorConvertersKt.g(r6)
            r6 = 6660(0x1a04, float:9.333E-42)
            v1$y r10 = defpackage.v1.z.c()
            v1$p0 r17 = defpackage.v1.h.i(r6, r14, r10, r2, r12)
            r18 = 0
            r19 = 0
            r21 = 6
            r22 = 0
            v1$f0 r10 = defpackage.v1.h.d(r17, r18, r19, r21, r22)
            int r11 = androidx.compose.animation.core.InfiniteTransition.f2655e
            r6 = r11 | 4528(0x11b0, float:6.345E-42)
            int r17 = defpackage.v1.f0.f17092d
            int r18 = r17 << 12
            r18 = r6 | r18
            r6 = r13
            r23 = r11
            r11 = r0
            r5 = r12
            r12 = r18
            e0.d1 r12 = androidx.compose.animation.core.InfiniteTransitionKt.b(r6, r7, r8, r9, r10, r11, r12)
            r7 = 0
            r8 = 1133445120(0x438f0000, float:286.0)
            r6 = 1332(0x534, float:1.867E-42)
            v1$y r9 = defpackage.v1.z.c()
            v1$p0 r24 = defpackage.v1.h.i(r6, r14, r9, r2, r5)
            r25 = 0
            r26 = 0
            r28 = 6
            r29 = 0
            v1$f0 r9 = defpackage.v1.h.d(r24, r25, r26, r28, r29)
            r2 = r23
            r5 = r2 | 432(0x1b0, float:6.05E-43)
            int r6 = r17 << 9
            r11 = r5 | r6
            r6 = r13
            r10 = r0
            e0.d1 r5 = androidx.compose.animation.core.InfiniteTransitionKt.a(r6, r7, r8, r9, r10, r11)
            r8 = 1133576192(0x43910000, float:290.0)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2 r6 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2.f5223a
            v1$g0 r18 = defpackage.v1.h.e(r6)
            r19 = 0
            r20 = 0
            r22 = 6
            r23 = 0
            v1$f0 r9 = defpackage.v1.h.d(r18, r19, r20, r22, r23)
            r6 = r2 | 432(0x1b0, float:6.05E-43)
            int r10 = r17 << 9
            r11 = r6 | r10
            r6 = r13
            r10 = r0
            e0.d1 r18 = androidx.compose.animation.core.InfiniteTransitionKt.a(r6, r7, r8, r9, r10, r11)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2 r6 = androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2.f5224a
            v1$g0 r19 = defpackage.v1.h.e(r6)
            r20 = 0
            r21 = 0
            r23 = 6
            r24 = 0
            v1$f0 r9 = defpackage.v1.h.d(r19, r20, r21, r23, r24)
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            int r6 = r17 << 9
            r11 = r2 | r6
            r6 = r13
            e0.d1 r13 = androidx.compose.animation.core.InfiniteTransitionKt.a(r6, r7, r8, r9, r10, r11)
            p0.d r2 = androidx.compose.foundation.ProgressSemanticsKt.a(r1)
            float r6 = f5205c
            p0.d r2 = androidx.compose.foundation.layout.SizeKt.t(r2, r6)
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3 r11 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
            r6 = r11
            r7 = r15
            r8 = r3
            r10 = r16
            r30 = r1
            r1 = r11
            r11 = r12
            r12 = r18
            r31 = r3
            r3 = 0
            r14 = r5
            r6.<init>(r7, r8, r10, r11, r12, r13, r14)
            androidx.compose.foundation.CanvasKt.a(r2, r1, r0, r3)
            r1 = r30
            r2 = r31
            r4 = r15
        L_0x0198:
            e0.s0 r7 = r0.v()
            if (r7 != 0) goto L_0x019f
            goto L_0x01ac
        L_0x019f:
            androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4 r8 = new androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
            r0 = r8
            r5 = r35
            r6 = r36
            r0.<init>(r1, r2, r4, r5, r6)
            r7.a(r8)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.a(p0.d, long, float, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float b(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float c(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final int d(d1<Integer> d1Var) {
        return d1Var.getValue().intValue();
    }

    /* access modifiers changed from: private */
    public static final float e(d1<Float> d1Var) {
        return d1Var.getValue().floatValue();
    }

    private static final void l(f fVar, float f11, float f12, long j, l lVar) {
        float f13 = (float) 2;
        float f14 = lVar.f() / f13;
        float i11 = t0.l.i(fVar.d()) - (f13 * f14);
        e.e(fVar, j, f11, f12, false, g.a(f14, f14), m.a(i11, i11), 0.0f, lVar, (e0) null, 0, 832, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void m(f fVar, float f11, float f12, float f13, long j, l lVar) {
        l(fVar, f11 + (((f12 / h.n(f5205c / ((float) 2))) * 57.29578f) / 2.0f), Math.max(f13, 0.1f), j, lVar);
    }
}
