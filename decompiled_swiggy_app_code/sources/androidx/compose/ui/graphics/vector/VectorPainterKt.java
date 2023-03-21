package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.platform.CompositionLocalsKt;
import d2.e;
import e0.g;
import lp0.r;
import t0.m;
import u0.d0;
import u0.e0;
import u0.s;
import y0.c;
import y0.j;
import y0.k;
import y0.p;

/* compiled from: VectorPainter.kt */
public final class VectorPainterKt {

    /* compiled from: VectorPainter.kt */
    public static final class a implements k {
        a() {
        }

        public /* synthetic */ Object a(p pVar, Object obj) {
            return j.a(this, pVar, obj);
        }
    }

    /* compiled from: VectorPainter.kt */
    public static final class b implements k {
        b() {
        }

        public /* synthetic */ Object a(p pVar, Object obj) {
            return j.a(this, pVar, obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(y0.l r23, java.util.Map<java.lang.String, ? extends y0.k> r24, e0.g r25, int r26, int r27) {
        /*
            r0 = r23
            r1 = r26
            r2 = r27
            java.lang.String r3 = "group"
            kotlin.jvm.internal.p.j(r0, r3)
            r3 = -446179233(0xffffffffe567d85f, float:-6.8428625E22)
            r4 = r25
            e0.g r3 = r4.t(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x002c
        L_0x001c:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002b
            boolean r4 = r3.k(r0)
            if (r4 == 0) goto L_0x0028
            r4 = 4
            goto L_0x0029
        L_0x0028:
            r4 = 2
        L_0x0029:
            r4 = r4 | r1
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0032
            r4 = r4 | 16
        L_0x0032:
            if (r6 != r5) goto L_0x0048
            r4 = r4 & 91
            r5 = 18
            if (r4 != r5) goto L_0x0048
            boolean r4 = r3.b()
            if (r4 != 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            r3.h()
            r2 = r24
            goto L_0x0257
        L_0x0048:
            r3.H()
            r4 = r1 & 1
            if (r4 == 0) goto L_0x005a
            boolean r4 = r3.i()
            if (r4 == 0) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            r3.h()
            goto L_0x0062
        L_0x005a:
            if (r6 == 0) goto L_0x0062
            java.util.Map r4 = kotlin.collections.x.f()
            r15 = r4
            goto L_0x0064
        L_0x0062:
            r15 = r24
        L_0x0064:
            r3.A()
            java.util.Iterator r22 = r23.iterator()
        L_0x006b:
            boolean r4 = r22.hasNext()
            if (r4 == 0) goto L_0x0256
            java.lang.Object r4 = r22.next()
            y0.n r4 = (y0.n) r4
            boolean r5 = r4 instanceof y0.o
            if (r5 == 0) goto L_0x0166
            r5 = -326285835(0xffffffffec8d45f5, float:-1.3663112E27)
            r3.E(r5)
            r17 = r4
            y0.o r17 = (y0.o) r17
            java.lang.String r4 = r17.g()
            java.lang.Object r4 = r15.get(r4)
            y0.k r4 = (y0.k) r4
            if (r4 != 0) goto L_0x0096
            androidx.compose.ui.graphics.vector.VectorPainterKt$a r4 = new androidx.compose.ui.graphics.vector.VectorPainterKt$a
            r4.<init>()
        L_0x0096:
            r14 = r4
            y0.p$c r4 = y0.p.c.f17995a
            java.util.List r5 = r17.h()
            java.lang.Object r4 = r14.a(r4, r5)
            java.util.List r4 = (java.util.List) r4
            int r5 = r17.i()
            java.lang.String r6 = r17.g()
            y0.p$a r7 = y0.p.a.f17993a
            u0.u r8 = r17.c()
            java.lang.Object r7 = r14.a(r7, r8)
            u0.u r7 = (u0.u) r7
            y0.p$b r8 = y0.p.b.f17994a
            float r9 = r17.f()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r8 = r14.a(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            y0.p$i r9 = y0.p.i.f18001a
            u0.u r10 = r17.k()
            java.lang.Object r9 = r14.a(r9, r10)
            u0.u r9 = (u0.u) r9
            y0.p$j r10 = y0.p.j.f18002a
            float r11 = r17.l()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r10 = r14.a(r10, r11)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            y0.p$k r11 = y0.p.k.f18003a
            float r12 = r17.p()
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Object r11 = r14.a(r11, r12)
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            int r12 = r17.m()
            int r13 = r17.n()
            float r16 = r17.o()
            r0 = r14
            r14 = r16
            r16 = r15
            y0.p$p r15 = y0.p.C0213p.f18008a
            float r18 = r17.s()
            java.lang.Float r1 = java.lang.Float.valueOf(r18)
            java.lang.Object r1 = r0.a(r15, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r15 = r1.floatValue()
            r1 = r16
            y0.p$n r2 = y0.p.n.f18006a
            float r16 = r17.q()
            r24 = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            java.lang.Object r1 = r0.a(r2, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r16 = r1.floatValue()
            y0.p$o r1 = y0.p.o.f18007a
            float r2 = r17.r()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r0.a(r1, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            float r17 = r0.floatValue()
            r19 = 8
            r20 = 0
            r21 = 0
            r18 = r3
            androidx.compose.ui.graphics.vector.VectorComposeKt.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.P()
            r0 = r23
            r15 = r24
            r1 = r26
            goto L_0x0252
        L_0x0166:
            r24 = r15
            boolean r0 = r4 instanceof y0.l
            if (r0 == 0) goto L_0x0242
            r0 = -326283977(0xffffffffec8d4d37, float:-1.3665854E27)
            r3.E(r0)
            r0 = r4
            y0.l r0 = (y0.l) r0
            java.lang.String r1 = r0.f()
            r2 = r24
            java.lang.Object r1 = r2.get(r1)
            y0.k r1 = (y0.k) r1
            if (r1 != 0) goto L_0x0188
            androidx.compose.ui.graphics.vector.VectorPainterKt$b r1 = new androidx.compose.ui.graphics.vector.VectorPainterKt$b
            r1.<init>()
        L_0x0188:
            java.lang.String r5 = r0.f()
            y0.p$f r6 = y0.p.f.f17998a
            float r7 = r0.i()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r6 = r1.a(r6, r7)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            y0.p$g r7 = y0.p.g.f17999a
            float r8 = r0.k()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r7 = r1.a(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            float r8 = r7.floatValue()
            y0.p$h r7 = y0.p.h.f18000a
            float r9 = r0.l()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r7 = r1.a(r7, r9)
            java.lang.Number r7 = (java.lang.Number) r7
            float r9 = r7.floatValue()
            y0.p$l r7 = y0.p.l.f18004a
            float r10 = r0.m()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r7 = r1.a(r7, r10)
            java.lang.Number r7 = (java.lang.Number) r7
            float r10 = r7.floatValue()
            y0.p$m r7 = y0.p.m.f18005a
            float r11 = r0.n()
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            java.lang.Object r7 = r1.a(r7, r11)
            java.lang.Number r7 = (java.lang.Number) r7
            float r11 = r7.floatValue()
            y0.p$d r7 = y0.p.d.f17996a
            float r12 = r0.g()
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            java.lang.Object r7 = r1.a(r7, r12)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            y0.p$e r12 = y0.p.e.f17997a
            float r13 = r0.h()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r12 = r1.a(r12, r13)
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            y0.p$c r13 = y0.p.c.f17995a
            java.util.List r0 = r0.c()
            java.lang.Object r0 = r1.a(r13, r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 1450046638(0x566df4ae, float:6.5408787E13)
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1 r13 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
            r13.<init>(r4, r2)
            r4 = 1
            l0.a r13 = l0.b.b(r3, r1, r4, r13)
            r15 = 939524096(0x38000000, float:3.0517578E-5)
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r12 = r0
            r14 = r3
            androidx.compose.ui.graphics.vector.VectorComposeKt.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.P()
            goto L_0x024d
        L_0x0242:
            r2 = r24
            r0 = -326282507(0xffffffffec8d52f5, float:-1.3668024E27)
            r3.E(r0)
            r3.P()
        L_0x024d:
            r0 = r23
            r1 = r26
            r15 = r2
        L_0x0252:
            r2 = r27
            goto L_0x006b
        L_0x0256:
            r2 = r15
        L_0x0257:
            e0.s0 r0 = r3.v()
            if (r0 != 0) goto L_0x025e
            goto L_0x026c
        L_0x025e:
            androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2 r1 = new androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
            r3 = r23
            r4 = r26
            r5 = r27
            r1.<init>(r3, r2, r4, r5)
            r0.a(r1)
        L_0x026c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.a(y0.l, java.util.Map, e0.g, int, int):void");
    }

    public static final VectorPainter b(c cVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(cVar, "image");
        gVar.E(1413834416);
        VectorPainter c11 = c(cVar.c(), cVar.b(), cVar.i(), cVar.h(), cVar.d(), cVar.g(), cVar.f(), cVar.a(), l0.b.b(gVar, 1873274766, true, new VectorPainterKt$rememberVectorPainter$3(cVar)), gVar, 100663296, 0);
        gVar.P();
        return c11;
    }

    public static final VectorPainter c(float f11, float f12, float f13, float f14, String str, long j, int i11, boolean z11, r<? super Float, ? super Float, ? super g, ? super Integer, bp0.k> rVar, g gVar, int i12, int i13) {
        g gVar2 = gVar;
        int i14 = i13;
        kotlin.jvm.internal.p.j(rVar, "content");
        gVar2.E(1068590786);
        float f15 = Float.NaN;
        float f16 = (i14 & 4) != 0 ? Float.NaN : f13;
        if ((i14 & 8) == 0) {
            f15 = f14;
        }
        String str2 = (i14 & 16) != 0 ? "VectorRootGroup" : str;
        long f17 = (i14 & 32) != 0 ? d0.f16756b.f() : j;
        int z12 = (i14 & 64) != 0 ? s.f16866b.z() : i11;
        boolean z13 = (i14 & 128) != 0 ? false : z11;
        e eVar = (e) gVar2.z(CompositionLocalsKt.e());
        float f18 = f11;
        float v02 = eVar.v0(f11);
        float v03 = eVar.v0(f12);
        if (Float.isNaN(f16)) {
            f16 = v02;
        }
        if (Float.isNaN(f15)) {
            f15 = v03;
        }
        d0 h11 = d0.h(f17);
        s D = s.D(z12);
        int i15 = i12 >> 15;
        gVar2.E(511388516);
        boolean k = gVar2.k(h11) | gVar2.k(D);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = !d0.n(f17, d0.f16756b.f()) ? e0.f16769b.b(f17, z12) : null;
            gVar2.y(F);
        }
        gVar.P();
        e0 e0Var = (e0) F;
        gVar2.E(-492369756);
        Object F2 = gVar.F();
        if (F2 == g.f14172a.a()) {
            F2 = new VectorPainter();
            gVar2.y(F2);
        }
        gVar.P();
        VectorPainter vectorPainter = (VectorPainter) F2;
        vectorPainter.x(m.a(v02, v03));
        vectorPainter.u(z13);
        vectorPainter.w(e0Var);
        vectorPainter.n(str2, f16, f15, rVar, gVar, 32768 | ((i12 >> 12) & 14) | (i15 & 7168));
        gVar.P();
        return vectorPainter;
    }
}
