package androidx.compose.material;

/* compiled from: MaterialTheme.kt */
public final class MaterialThemeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ae, code lost:
        if ((r49 & 4) != 0) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(c0.c r43, c0.g0 r44, c0.u r45, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r46, e0.g r47, int r48, int r49) {
        /*
            r4 = r46
            r5 = r48
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r4, r0)
            r0 = -1505114095(0xffffffffa649c811, float:-7.0007024E-16)
            r1 = r47
            e0.g r0 = r1.t(r0)
            r1 = r5 & 14
            r3 = 2
            if (r1 != 0) goto L_0x002a
            r1 = r49 & 1
            if (r1 != 0) goto L_0x0025
            r1 = r43
            boolean r6 = r0.k(r1)
            if (r6 == 0) goto L_0x0027
            r6 = 4
            goto L_0x0028
        L_0x0025:
            r1 = r43
        L_0x0027:
            r6 = 2
        L_0x0028:
            r6 = r6 | r5
            goto L_0x002d
        L_0x002a:
            r1 = r43
            r6 = r5
        L_0x002d:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0046
            r7 = r49 & 2
            if (r7 != 0) goto L_0x0040
            r7 = r44
            boolean r8 = r0.k(r7)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0044
        L_0x0040:
            r7 = r44
        L_0x0042:
            r8 = 16
        L_0x0044:
            r6 = r6 | r8
            goto L_0x0048
        L_0x0046:
            r7 = r44
        L_0x0048:
            r8 = r5 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0061
            r8 = r49 & 4
            if (r8 != 0) goto L_0x005b
            r8 = r45
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x005d
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005b:
            r8 = r45
        L_0x005d:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r6 = r6 | r9
            goto L_0x0063
        L_0x0061:
            r8 = r45
        L_0x0063:
            r9 = r49 & 8
            if (r9 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r0.k(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r6 = r6 | r9
        L_0x007a:
            r9 = r6 & 5851(0x16db, float:8.199E-42)
            r9 = r9 ^ 1170(0x492, float:1.64E-42)
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.b()
            if (r9 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            r0.h()
            r2 = r7
            r3 = r8
            goto L_0x01a2
        L_0x008e:
            r0.H()
            r9 = r5 & 1
            r13 = 6
            if (r9 == 0) goto L_0x00b1
            boolean r9 = r0.i()
            if (r9 == 0) goto L_0x009d
            goto L_0x00b1
        L_0x009d:
            r0.h()
            r9 = r49 & 1
            if (r9 == 0) goto L_0x00a6
            r6 = r6 & -15
        L_0x00a6:
            r9 = r49 & 2
            if (r9 == 0) goto L_0x00ac
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ac:
            r9 = r49 & 4
            if (r9 == 0) goto L_0x00d5
            goto L_0x00d3
        L_0x00b1:
            r9 = r49 & 1
            if (r9 == 0) goto L_0x00bd
            c0.q r1 = c0.q.f12737a
            c0.c r1 = r1.a(r0, r13)
            r6 = r6 & -15
        L_0x00bd:
            r9 = r49 & 2
            if (r9 == 0) goto L_0x00c9
            c0.q r7 = c0.q.f12737a
            c0.g0 r7 = r7.c(r0, r13)
            r6 = r6 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c9:
            r9 = r49 & 4
            if (r9 == 0) goto L_0x00d5
            c0.q r8 = c0.q.f12737a
            c0.u r8 = r8.b(r0, r13)
        L_0x00d3:
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00d5:
            r10 = r6
            r12 = r7
            r11 = r8
            r0.A()
            r6 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r6)
            java.lang.Object r6 = r0.F()
            e0.g$a r7 = e0.g.f14172a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x0113
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r40 = 8191(0x1fff, float:1.1478E-41)
            r41 = 0
            r14 = r1
            c0.c r6 = c0.c.b(r14, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r40, r41)
            r0.y(r6)
        L_0x0113:
            r0.P()
            r14 = r6
            c0.c r14 = (c0.c) r14
            androidx.compose.material.ColorsKt.f(r14, r1)
            r6 = 0
            r7 = 0
            r8 = 0
            r15 = 0
            r16 = 7
            r42 = r10
            r10 = r0
            r2 = r11
            r11 = r15
            r15 = r12
            r12 = r16
            s.h r6 = d0.h.e(r6, r7, r8, r10, r11, r12)
            r7 = 0
            b0.o r8 = c0.p.e(r14, r0, r7)
            r9 = 7
            e0.n0[] r9 = new e0.n0[r9]
            e0.m0 r10 = androidx.compose.material.ColorsKt.c()
            e0.n0 r10 = r10.c(r14)
            r9[r7] = r10
            e0.m0 r7 = androidx.compose.material.ContentAlphaKt.a()
            c0.d r10 = c0.d.f12682a
            float r10 = r10.c(r0, r13)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            e0.n0 r7 = r7.c(r10)
            r10 = 1
            r9[r10] = r7
            e0.m0 r7 = androidx.compose.foundation.IndicationKt.a()
            e0.n0 r6 = r7.c(r6)
            r9[r3] = r6
            r3 = 3
            e0.m0 r6 = androidx.compose.material.ripple.RippleThemeKt.d()
            androidx.compose.material.g r7 = androidx.compose.material.g.f5790b
            e0.n0 r6 = r6.c(r7)
            r9[r3] = r6
            e0.m0 r3 = androidx.compose.material.ShapesKt.a()
            e0.n0 r3 = r3.c(r2)
            r6 = 4
            r9[r6] = r3
            r3 = 5
            e0.m0 r6 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            e0.n0 r6 = r6.c(r8)
            r9[r3] = r6
            e0.m0 r3 = androidx.compose.material.TypographyKt.b()
            e0.n0 r3 = r3.c(r15)
            r9[r13] = r3
            r3 = -819894159(0xffffffffcf216871, float:-2.70797645E9)
            androidx.compose.material.MaterialThemeKt$MaterialTheme$1 r6 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$1
            r7 = r42
            r6.<init>(r15, r4, r7)
            l0.a r3 = l0.b.b(r0, r3, r10, r6)
            r6 = 56
            androidx.compose.runtime.CompositionLocalKt.a(r9, r3, r0, r6)
            r3 = r2
            r2 = r15
        L_0x01a2:
            e0.s0 r7 = r0.v()
            if (r7 != 0) goto L_0x01a9
            goto L_0x01b8
        L_0x01a9:
            androidx.compose.material.MaterialThemeKt$MaterialTheme$2 r8 = new androidx.compose.material.MaterialThemeKt$MaterialTheme$2
            r0 = r8
            r4 = r46
            r5 = r48
            r6 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MaterialThemeKt.a(c0.c, c0.g0, c0.u, lp0.p, e0.g, int, int):void");
    }
}
