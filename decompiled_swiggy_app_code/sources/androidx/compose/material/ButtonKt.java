package androidx.compose.material;

import e0.d1;
import u0.d0;

/* compiled from: Button.kt */
public final class ButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(lp0.a<bp0.k> r34, p0.d r35, boolean r36, u.k r37, c0.b r38, u0.j1 r39, s.b r40, c0.a r41, defpackage.a2.p r42, lp0.q<? super defpackage.a2.t, ? super e0.g, ? super java.lang.Integer, bp0.k> r43, e0.g r44, int r45, int r46) {
        /*
            r15 = r34
            r11 = r43
            r9 = r45
            r8 = r46
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r11, r0)
            r0 = -423488082(0xffffffffe6c215ae, float:-4.582695E23)
            r1 = r44
            e0.g r7 = r1.t(r0)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r9 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r7.k(r15)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r9
            goto L_0x0032
        L_0x0031:
            r0 = r9
        L_0x0032:
            r1 = r8 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r35
            boolean r3 = r7.k(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r35
        L_0x004e:
            r3 = r8 & 4
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r36
            boolean r5 = r7.m(r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r36
        L_0x006a:
            r5 = r8 & 8
            if (r5 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r37
            boolean r10 = r7.k(r6)
            if (r10 == 0) goto L_0x0080
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r10
            goto L_0x0086
        L_0x0084:
            r6 = r37
        L_0x0086:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r9
            if (r10 != 0) goto L_0x00a1
            r10 = r8 & 16
            if (r10 != 0) goto L_0x009b
            r10 = r38
            boolean r12 = r7.k(r10)
            if (r12 == 0) goto L_0x009d
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r10 = r38
        L_0x009d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r12
            goto L_0x00a3
        L_0x00a1:
            r10 = r38
        L_0x00a3:
            r28 = 458752(0x70000, float:6.42848E-40)
            r12 = r9 & r28
            if (r12 != 0) goto L_0x00be
            r12 = r8 & 32
            if (r12 != 0) goto L_0x00b8
            r12 = r39
            boolean r13 = r7.k(r12)
            if (r13 == 0) goto L_0x00ba
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00b8:
            r12 = r39
        L_0x00ba:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r0 = r0 | r13
            goto L_0x00c0
        L_0x00be:
            r12 = r39
        L_0x00c0:
            r13 = r8 & 64
            if (r13 == 0) goto L_0x00c8
            r14 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r14
            goto L_0x00dd
        L_0x00c8:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00dd
            r14 = r40
            boolean r16 = r7.k(r14)
            if (r16 == 0) goto L_0x00d8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r0 = r0 | r16
            goto L_0x00df
        L_0x00dd:
            r14 = r40
        L_0x00df:
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r9 & r29
            if (r16 != 0) goto L_0x00fb
            r2 = r8 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f4
            r2 = r41
            boolean r16 = r7.k(r2)
            if (r16 == 0) goto L_0x00f6
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f4:
            r2 = r41
        L_0x00f6:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r0 = r0 | r16
            goto L_0x00fd
        L_0x00fb:
            r2 = r41
        L_0x00fd:
            r2 = r8 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0108
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r16
            r4 = r42
            goto L_0x011d
        L_0x0108:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r9 & r16
            r4 = r42
            if (r16 != 0) goto L_0x011d
            boolean r16 = r7.k(r4)
            if (r16 == 0) goto L_0x0119
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r0 = r0 | r16
        L_0x011d:
            r4 = r8 & 512(0x200, float:7.175E-43)
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            if (r4 == 0) goto L_0x0127
            r4 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0125:
            r0 = r0 | r4
            goto L_0x0137
        L_0x0127:
            r4 = r9 & r30
            if (r4 != 0) goto L_0x0137
            boolean r4 = r7.k(r11)
            if (r4 == 0) goto L_0x0134
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0125
        L_0x0134:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0125
        L_0x0137:
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r0
            r16 = 306783378(0x12492492, float:6.3469493E-28)
            r4 = r4 ^ r16
            if (r4 != 0) goto L_0x015c
            boolean r4 = r7.b()
            if (r4 != 0) goto L_0x0149
            goto L_0x015c
        L_0x0149:
            r7.h()
            r2 = r35
            r3 = r36
            r8 = r41
            r9 = r42
            r4 = r6
            r24 = r7
            r5 = r10
            r6 = r12
            r7 = r14
            goto L_0x0329
        L_0x015c:
            r7.H()
            r4 = r9 & 1
            r31 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r25 = -458753(0xfffffffffff8ffff, float:NaN)
            r26 = -57345(0xffffffffffff1fff, float:NaN)
            r32 = 0
            r12 = 1
            if (r4 == 0) goto L_0x019a
            boolean r4 = r7.i()
            if (r4 == 0) goto L_0x0176
            goto L_0x019a
        L_0x0176:
            r7.h()
            r1 = r8 & 16
            if (r1 == 0) goto L_0x017f
            r0 = r0 & r26
        L_0x017f:
            r1 = r8 & 32
            if (r1 == 0) goto L_0x0185
            r0 = r0 & r25
        L_0x0185:
            r1 = r8 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x018b
            r0 = r0 & r31
        L_0x018b:
            r19 = r35
            r5 = r36
            r20 = r39
            r4 = r41
            r2 = r42
            r3 = r10
            r21 = r14
            goto L_0x0234
        L_0x019a:
            if (r1 == 0) goto L_0x019f
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x01a1
        L_0x019f:
            r1 = r35
        L_0x01a1:
            if (r3 == 0) goto L_0x01a5
            r3 = 1
            goto L_0x01a7
        L_0x01a5:
            r3 = r36
        L_0x01a7:
            if (r5 == 0) goto L_0x01c8
            r4 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r7.E(r4)
            java.lang.Object r4 = r7.F()
            e0.g$a r5 = e0.g.f14172a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x01c2
            u.k r4 = u.j.a()
            r7.y(r4)
        L_0x01c2:
            r7.P()
            u.k r4 = (u.k) r4
            goto L_0x01c9
        L_0x01c8:
            r4 = r6
        L_0x01c9:
            r5 = r8 & 16
            if (r5 == 0) goto L_0x01e6
            androidx.compose.material.a r16 = androidx.compose.material.a.f5770a
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 31
            r22 = r7
            c0.b r5 = r16.b(r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r0 & r26
            goto L_0x01e7
        L_0x01e6:
            r5 = r10
        L_0x01e7:
            r6 = r8 & 32
            if (r6 == 0) goto L_0x01f9
            c0.q r6 = c0.q.f12737a
            r10 = 6
            c0.u r6 = r6.b(r7, r10)
            z.a r6 = r6.c()
            r0 = r0 & r25
            goto L_0x01fb
        L_0x01f9:
            r6 = r39
        L_0x01fb:
            if (r13 == 0) goto L_0x01ff
            r14 = r32
        L_0x01ff:
            r10 = r8 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x021a
            androidx.compose.material.a r16 = androidx.compose.material.a.f5770a
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r26 = 24576(0x6000, float:3.4438E-41)
            r27 = 15
            r25 = r7
            c0.a r10 = r16.a(r17, r19, r21, r23, r25, r26, r27)
            r0 = r0 & r31
            goto L_0x021c
        L_0x021a:
            r10 = r41
        L_0x021c:
            if (r2 == 0) goto L_0x0225
            androidx.compose.material.a r2 = androidx.compose.material.a.f5770a
            a2$p r2 = r2.c()
            goto L_0x0227
        L_0x0225:
            r2 = r42
        L_0x0227:
            r19 = r1
            r20 = r6
            r21 = r14
            r6 = r4
            r4 = r10
            r33 = r5
            r5 = r3
            r3 = r33
        L_0x0234:
            r7.A()
            int r1 = r0 >> 6
            r10 = r1 & 14
            int r13 = r0 >> 18
            r13 = r13 & 112(0x70, float:1.57E-43)
            r13 = r13 | r10
            e0.d1 r14 = r4.b(r5, r7, r13)
            e0.d1 r13 = r4.a(r5, r7, r13)
            java.lang.Object r13 = r13.getValue()
            u0.d0 r13 = (u0.d0) r13
            long r22 = r13.v()
            long r16 = b(r14)
            r13 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r24 = 0
            r25 = 0
            r26 = 14
            r27 = 0
            r35 = r16
            r37 = r13
            r38 = r18
            r39 = r24
            r40 = r25
            r41 = r26
            r42 = r27
            long r24 = u0.d0.l(r35, r37, r38, r39, r40, r41, r42)
            r13 = -423487290(0xffffffffe6c218c6, float:-4.5829804E23)
            r7.E(r13)
            if (r3 != 0) goto L_0x027f
            r1 = r32
            goto L_0x0289
        L_0x027f:
            r13 = r1 & 112(0x70, float:1.57E-43)
            r10 = r10 | r13
            r1 = r1 & 896(0x380, float:1.256E-42)
            r1 = r1 | r10
            e0.d1 r1 = r3.a(r5, r6, r7, r1)
        L_0x0289:
            r7.P()
            if (r1 != 0) goto L_0x028f
            goto L_0x0297
        L_0x028f:
            java.lang.Object r1 = r1.getValue()
            r32 = r1
            d2.h r32 = (d2.h) r32
        L_0x0297:
            if (r32 != 0) goto L_0x02a0
            r1 = 0
            float r1 = (float) r1
            float r1 = d2.h.n(r1)
            goto L_0x02a4
        L_0x02a0:
            float r1 = r32.s()
        L_0x02a4:
            r26 = r1
            n1.g$a r1 = n1.g.f15778b
            int r1 = r1.a()
            r10 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r27 = 7
            r35 = r10
            r36 = r13
            r37 = r16
            r39 = r7
            r40 = r18
            r41 = r27
            s.h r10 = d0.h.e(r35, r36, r37, r39, r40, r41)
            r13 = 0
            r35 = r3
            r3 = 1
            r12 = r13
            n1.g r13 = n1.g.g(r1)
            r1 = -819891249(0xffffffffcf2173cf, float:-2.70872141E9)
            androidx.compose.material.ButtonKt$Button$2 r12 = new androidx.compose.material.ButtonKt$Button$2
            r12.<init>(r14, r2, r11, r0)
            l0.a r14 = l0.b.b(r7, r1, r3, r12)
            r1 = r0 & 14
            r3 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            int r3 = r0 >> 9
            r3 = r3 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            int r3 = r0 >> 3
            r3 = r3 & r28
            r1 = r1 | r3
            int r3 = r0 << 12
            r3 = r3 & r29
            r1 = r1 | r3
            int r0 = r0 << 21
            r0 = r0 & r30
            r16 = r1 | r0
            r17 = 384(0x180, float:5.38E-43)
            r18 = 1024(0x400, float:1.435E-42)
            r0 = r34
            r1 = r19
            r27 = r2
            r2 = r20
            r29 = r35
            r28 = r4
            r3 = r22
            r22 = r5
            r23 = r6
            r5 = r24
            r24 = r7
            r7 = r21
            r8 = r26
            r9 = r23
            r11 = r22
            r15 = r24
            r12 = 0
            androidx.compose.material.SurfaceKt.a(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r19
            r6 = r20
            r3 = r22
            r4 = r23
            r9 = r27
            r8 = r28
            r5 = r29
        L_0x0329:
            e0.s0 r13 = r24.v()
            if (r13 != 0) goto L_0x0330
            goto L_0x0341
        L_0x0330:
            androidx.compose.material.ButtonKt$Button$3 r14 = new androidx.compose.material.ButtonKt$Button$3
            r0 = r14
            r1 = r34
            r10 = r43
            r11 = r45
            r12 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.a(lp0.a, p0.d, boolean, u.k, c0.b, u0.j1, s.b, c0.a, a2$p, lp0.q, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final long b(d1<d0> d1Var) {
        return d1Var.getValue().v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(lp0.a<bp0.k> r31, p0.d r32, boolean r33, u.k r34, c0.b r35, u0.j1 r36, s.b r37, c0.a r38, defpackage.a2.p r39, lp0.q<? super defpackage.a2.t, ? super e0.g, ? super java.lang.Integer, bp0.k> r40, e0.g r41, int r42, int r43) {
        /*
            r13 = r31
            r14 = r40
            r15 = r42
            r12 = r43
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = 1048282677(0x3e7b8635, float:0.24562915)
            r1 = r41
            e0.g r11 = r1.t(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r15 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.k(r13)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r15
            goto L_0x0032
        L_0x0031:
            r0 = r15
        L_0x0032:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r32
            boolean r3 = r11.k(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r32
        L_0x004e:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r33
            boolean r5 = r11.m(r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r33
        L_0x006a:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r34
            boolean r7 = r11.k(r6)
            if (r7 == 0) goto L_0x0080
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r7
            goto L_0x0086
        L_0x0084:
            r6 = r34
        L_0x0086:
            r7 = r12 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x0090
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x0090:
            r8 = r15 & r16
            if (r8 != 0) goto L_0x00a3
            r8 = r35
            boolean r9 = r11.k(r8)
            if (r9 == 0) goto L_0x009f
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r9
            goto L_0x00a5
        L_0x00a3:
            r8 = r35
        L_0x00a5:
            r17 = 458752(0x70000, float:6.42848E-40)
            r9 = r15 & r17
            if (r9 != 0) goto L_0x00c0
            r9 = r12 & 32
            if (r9 != 0) goto L_0x00ba
            r9 = r36
            boolean r10 = r11.k(r9)
            if (r10 == 0) goto L_0x00bc
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00ba:
            r9 = r36
        L_0x00bc:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r0 = r0 | r10
            goto L_0x00c2
        L_0x00c0:
            r9 = r36
        L_0x00c2:
            r10 = r12 & 64
            r18 = 3670016(0x380000, float:5.142788E-39)
            if (r10 == 0) goto L_0x00cf
            r19 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r19
            r2 = r37
            goto L_0x00e2
        L_0x00cf:
            r19 = r15 & r18
            r2 = r37
            if (r19 != 0) goto L_0x00e2
            boolean r19 = r11.k(r2)
            if (r19 == 0) goto L_0x00de
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r0 = r0 | r19
        L_0x00e2:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r15 & r19
            if (r20 != 0) goto L_0x00fe
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f7
            r2 = r38
            boolean r20 = r11.k(r2)
            if (r20 == 0) goto L_0x00f9
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fb
        L_0x00f7:
            r2 = r38
        L_0x00f9:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fb:
            r0 = r0 | r20
            goto L_0x0100
        L_0x00fe:
            r2 = r38
        L_0x0100:
            r9 = r12 & 256(0x100, float:3.59E-43)
            r20 = 234881024(0xe000000, float:1.5777218E-30)
            if (r9 == 0) goto L_0x010b
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r21
            goto L_0x0121
        L_0x010b:
            r21 = r15 & r20
            if (r21 != 0) goto L_0x0121
            r21 = r9
            r9 = r39
            boolean r22 = r11.k(r9)
            if (r22 == 0) goto L_0x011c
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r0 = r0 | r22
            goto L_0x0125
        L_0x0121:
            r21 = r9
            r9 = r39
        L_0x0125:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r22 = 1879048192(0x70000000, float:1.58456325E29)
            if (r2 == 0) goto L_0x012f
            r2 = 805306368(0x30000000, float:4.656613E-10)
        L_0x012d:
            r0 = r0 | r2
            goto L_0x013f
        L_0x012f:
            r2 = r15 & r22
            if (r2 != 0) goto L_0x013f
            boolean r2 = r11.k(r14)
            if (r2 == 0) goto L_0x013c
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012d
        L_0x013c:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x012d
        L_0x013f:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r0
            r23 = 306783378(0x12492492, float:6.3469493E-28)
            r2 = r2 ^ r23
            if (r2 != 0) goto L_0x0163
            boolean r2 = r11.b()
            if (r2 != 0) goto L_0x0151
            goto L_0x0163
        L_0x0151:
            r11.h()
            r2 = r32
            r7 = r37
            r3 = r4
            r4 = r6
            r5 = r8
            r18 = r11
            r6 = r36
            r8 = r38
            goto L_0x027f
        L_0x0163:
            r11.H()
            r2 = r15 & 1
            r23 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r24 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r2 == 0) goto L_0x0198
            boolean r2 = r11.i()
            if (r2 == 0) goto L_0x0177
            goto L_0x0198
        L_0x0177:
            r11.h()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0180
            r0 = r0 & r24
        L_0x0180:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0186
            r0 = r0 & r23
        L_0x0186:
            r25 = r32
            r21 = r36
            r29 = r37
            r23 = r38
            r26 = r4
            r27 = r6
            r28 = r8
            r24 = r9
            goto L_0x022e
        L_0x0198:
            if (r1 == 0) goto L_0x019f
            p0.d$a r1 = p0.d.f16037h0
            r25 = r1
            goto L_0x01a1
        L_0x019f:
            r25 = r32
        L_0x01a1:
            if (r3 == 0) goto L_0x01a7
            r1 = 1
            r26 = 1
            goto L_0x01a9
        L_0x01a7:
            r26 = r4
        L_0x01a9:
            if (r5 == 0) goto L_0x01cc
            r1 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r11.E(r1)
            java.lang.Object r1 = r11.F()
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x01c4
            u.k r1 = u.j.a()
            r11.y(r1)
        L_0x01c4:
            r11.P()
            u.k r1 = (u.k) r1
            r27 = r1
            goto L_0x01ce
        L_0x01cc:
            r27 = r6
        L_0x01ce:
            r1 = 0
            if (r7 == 0) goto L_0x01d4
            r28 = r1
            goto L_0x01d6
        L_0x01d4:
            r28 = r8
        L_0x01d6:
            r2 = r12 & 32
            if (r2 == 0) goto L_0x01eb
            c0.q r2 = c0.q.f12737a
            r3 = 6
            c0.u r2 = r2.b(r11, r3)
            z.a r2 = r2.c()
            r0 = r0 & r24
            r24 = r0
            r0 = r2
            goto L_0x01ef
        L_0x01eb:
            r24 = r0
            r0 = r36
        L_0x01ef:
            if (r10 == 0) goto L_0x01f4
            r29 = r1
            goto L_0x01f6
        L_0x01f4:
            r29 = r37
        L_0x01f6:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0213
            androidx.compose.material.a r1 = androidx.compose.material.a.f5770a
            r2 = 0
            r4 = 0
            r6 = 0
            r10 = 3072(0xc00, float:4.305E-42)
            r30 = 7
            r8 = r11
            r9 = r10
            r10 = r30
            c0.a r1 = r1.g(r2, r4, r6, r8, r9, r10)
            r2 = r24 & r23
            r24 = r2
            goto L_0x0215
        L_0x0213:
            r1 = r38
        L_0x0215:
            if (r21 == 0) goto L_0x0226
            androidx.compose.material.a r2 = androidx.compose.material.a.f5770a
            a2$p r2 = r2.f()
            r21 = r0
            r23 = r1
            r0 = r24
            r24 = r2
            goto L_0x022e
        L_0x0226:
            r21 = r0
            r23 = r1
            r0 = r24
            r24 = r39
        L_0x022e:
            r11.A()
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r16
            r1 = r1 | r2
            r2 = r0 & r17
            r1 = r1 | r2
            r2 = r0 & r18
            r1 = r1 | r2
            r2 = r0 & r19
            r1 = r1 | r2
            r2 = r0 & r20
            r1 = r1 | r2
            r0 = r0 & r22
            r16 = r1 | r0
            r17 = 0
            r0 = r31
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r21
            r6 = r29
            r7 = r23
            r8 = r24
            r9 = r40
            r10 = r11
            r18 = r11
            r11 = r16
            r12 = r17
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r6 = r21
            r8 = r23
            r9 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r7 = r29
        L_0x027f:
            e0.s0 r12 = r18.v()
            if (r12 != 0) goto L_0x0286
            goto L_0x0299
        L_0x0286:
            androidx.compose.material.ButtonKt$TextButton$2 r11 = new androidx.compose.material.ButtonKt$TextButton$2
            r0 = r11
            r1 = r31
            r10 = r40
            r13 = r11
            r11 = r42
            r14 = r12
            r12 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r14.a(r13)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.c(lp0.a, p0.d, boolean, u.k, c0.b, u0.j1, s.b, c0.a, a2$p, lp0.q, e0.g, int, int):void");
    }
}
