package androidx.compose.material;

/* compiled from: Divider.kt */
public final class DividerKt {
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p0.d r21, long r22, float r24, float r25, e0.g r26, int r27, int r28) {
        /*
            r6 = r27
            r0 = 1228913847(0x493fbcb7, float:785355.44)
            r1 = r26
            e0.g r0 = r1.t(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x0015
            r2 = r6 | 6
            r3 = r2
            r2 = r21
            goto L_0x0029
        L_0x0015:
            r2 = r6 & 14
            if (r2 != 0) goto L_0x0026
            r2 = r21
            boolean r3 = r0.k(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0026:
            r2 = r21
            r3 = r6
        L_0x0029:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0042
            r4 = r28 & 2
            if (r4 != 0) goto L_0x003c
            r4 = r22
            boolean r7 = r0.q(r4)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003c:
            r4 = r22
        L_0x003e:
            r7 = 16
        L_0x0040:
            r3 = r3 | r7
            goto L_0x0044
        L_0x0042:
            r4 = r22
        L_0x0044:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x004b
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004b:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005e
            r8 = r24
            boolean r9 = r0.n(r8)
            if (r9 == 0) goto L_0x005a
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r3 = r3 | r9
            goto L_0x0060
        L_0x005e:
            r8 = r24
        L_0x0060:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x0067:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x007a
            r10 = r25
            boolean r11 = r0.n(r10)
            if (r11 == 0) goto L_0x0076
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r11
            goto L_0x007c
        L_0x007a:
            r10 = r25
        L_0x007c:
            r3 = r3 & 5851(0x16db, float:8.199E-42)
            r3 = r3 ^ 1170(0x492, float:1.64E-42)
            if (r3 != 0) goto L_0x0092
            boolean r3 = r0.b()
            if (r3 != 0) goto L_0x0089
            goto L_0x0092
        L_0x0089:
            r0.h()
            r1 = r2
            r2 = r4
        L_0x008e:
            r4 = r8
            r5 = r10
            goto L_0x014e
        L_0x0092:
            r0.H()
            r3 = r6 & 1
            r11 = 0
            r12 = 1
            if (r3 == 0) goto L_0x00a8
            boolean r3 = r0.i()
            if (r3 == 0) goto L_0x00a2
            goto L_0x00a8
        L_0x00a2:
            r0.h()
            r1 = r2
            r2 = r4
            goto L_0x00e0
        L_0x00a8:
            if (r1 == 0) goto L_0x00ad
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x00ae
        L_0x00ad:
            r1 = r2
        L_0x00ae:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x00cf
            c0.q r2 = c0.q.f12737a
            r3 = 6
            c0.c r2 = r2.a(r0, r3)
            long r13 = r2.i()
            r15 = 1039516303(0x3df5c28f, float:0.12)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 14
            r20 = 0
            long r2 = u0.d0.l(r13, r15, r16, r17, r18, r19, r20)
            goto L_0x00d0
        L_0x00cf:
            r2 = r4
        L_0x00d0:
            if (r7 == 0) goto L_0x00d8
            float r4 = (float) r12
            float r4 = d2.h.n(r4)
            r8 = r4
        L_0x00d8:
            if (r9 == 0) goto L_0x00e0
            float r4 = (float) r11
            float r4 = d2.h.n(r4)
            r10 = r4
        L_0x00e0:
            r0.A()
            r4 = 0
            int r5 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r5 != 0) goto L_0x00ea
            r5 = 1
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            if (r5 != 0) goto L_0x00fe
            p0.d$a r13 = p0.d.f16037h0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r19 = 0
            r14 = r10
            p0.d r5 = androidx.compose.foundation.layout.PaddingKt.m(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0100
        L_0x00fe:
            p0.d$a r5 = p0.d.f16037h0
        L_0x0100:
            r7 = 1228914189(0x493fbe0d, float:785376.8)
            r0.E(r7)
            d2.h$a r7 = d2.h.f13997b
            float r7 = r7.a()
            boolean r7 = d2.h.p(r8, r7)
            if (r7 == 0) goto L_0x0128
            r7 = 1065353216(0x3f800000, float:1.0)
            e0.m0 r9 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r9 = r0.z(r9)
            d2.e r9 = (d2.e) r9
            float r9 = r9.getDensity()
            float r7 = r7 / r9
            float r7 = d2.h.n(r7)
            goto L_0x0129
        L_0x0128:
            r7 = r8
        L_0x0129:
            r0.P()
            p0.d r5 = r1.N(r5)
            r9 = 0
            p0.d r4 = androidx.compose.foundation.layout.SizeKt.n(r5, r4, r12, r9)
            p0.d r4 = androidx.compose.foundation.layout.SizeKt.o(r4, r7)
            r5 = 0
            r7 = 2
            r21 = r4
            r22 = r2
            r24 = r5
            r25 = r7
            r26 = r9
            p0.d r4 = androidx.compose.foundation.BackgroundKt.d(r21, r22, r24, r25, r26)
            androidx.compose.foundation.layout.BoxKt.a(r4, r0, r11)
            goto L_0x008e
        L_0x014e:
            e0.s0 r8 = r0.v()
            if (r8 != 0) goto L_0x0155
            goto L_0x0162
        L_0x0155:
            androidx.compose.material.DividerKt$Divider$1 r9 = new androidx.compose.material.DividerKt$Divider$1
            r0 = r9
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DividerKt.a(p0.d, long, float, float, e0.g, int, int):void");
    }
}
