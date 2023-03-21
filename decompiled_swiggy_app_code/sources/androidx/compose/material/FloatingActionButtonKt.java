package androidx.compose.material;

import d2.h;

/* compiled from: FloatingActionButton.kt */
public final class FloatingActionButtonKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f5044a = h.n((float) 56);

    /* renamed from: b  reason: collision with root package name */
    private static final float f5045b = h.n((float) 48);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f5046c = h.n((float) 12);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f5047d = h.n((float) 20);

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r29, lp0.a<bp0.k> r30, p0.d r31, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r32, u.k r33, u0.j1 r34, long r35, long r37, c0.n r39, e0.g r40, int r41, int r42) {
        /*
            r1 = r29
            r15 = r30
            r0 = r41
            r14 = r42
            java.lang.String r2 = "text"
            kotlin.jvm.internal.p.j(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.p.j(r15, r2)
            r2 = 223642410(0xd54832a, float:6.5485427E-31)
            r3 = r40
            e0.g r13 = r3.t(r2)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r0 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r0 & 14
            if (r2 != 0) goto L_0x0031
            boolean r2 = r13.k(r1)
            if (r2 == 0) goto L_0x002e
            r2 = 4
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r0
            goto L_0x0032
        L_0x0031:
            r2 = r0
        L_0x0032:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x0039
            r2 = r2 | 48
            goto L_0x0049
        L_0x0039:
            r3 = r0 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            boolean r3 = r13.k(r15)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r2 = r2 | r3
        L_0x0049:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0050
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r0 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r31
            boolean r5 = r13.k(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r31
        L_0x0065:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x006c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            r6 = r32
            boolean r7 = r13.k(r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r2 = r2 | r7
            goto L_0x0081
        L_0x007f:
            r6 = r32
        L_0x0081:
            r7 = r14 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008b
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r9 = r0 & r8
            if (r9 != 0) goto L_0x009e
            r9 = r33
            boolean r10 = r13.k(r9)
            if (r10 == 0) goto L_0x009a
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r2 = r2 | r10
            goto L_0x00a0
        L_0x009e:
            r9 = r33
        L_0x00a0:
            r10 = 458752(0x70000, float:6.42848E-40)
            r11 = r0 & r10
            if (r11 != 0) goto L_0x00bb
            r11 = r14 & 32
            if (r11 != 0) goto L_0x00b5
            r11 = r34
            boolean r12 = r13.k(r11)
            if (r12 == 0) goto L_0x00b7
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b5:
            r11 = r34
        L_0x00b7:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r2 = r2 | r12
            goto L_0x00bd
        L_0x00bb:
            r11 = r34
        L_0x00bd:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r16 = r0 & r12
            if (r16 != 0) goto L_0x00d7
            r16 = r14 & 64
            r10 = r35
            if (r16 != 0) goto L_0x00d2
            boolean r16 = r13.q(r10)
            if (r16 == 0) goto L_0x00d2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r2 = r2 | r16
            goto L_0x00d9
        L_0x00d7:
            r10 = r35
        L_0x00d9:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r0 & r16
            if (r16 != 0) goto L_0x00f3
            r12 = r14 & 128(0x80, float:1.794E-43)
            r8 = r37
            if (r12 != 0) goto L_0x00ee
            boolean r17 = r13.q(r8)
            if (r17 == 0) goto L_0x00ee
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ee:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r2 = r2 | r17
            goto L_0x00f5
        L_0x00f3:
            r8 = r37
        L_0x00f5:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r0 & r17
            if (r17 != 0) goto L_0x0111
            r12 = r14 & 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L_0x010a
            r12 = r39
            boolean r18 = r13.k(r12)
            if (r18 == 0) goto L_0x010c
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010a:
            r12 = r39
        L_0x010c:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r2 = r2 | r18
            goto L_0x0113
        L_0x0111:
            r12 = r39
        L_0x0113:
            r18 = 191739611(0xb6db6db, float:4.5782105E-32)
            r18 = r2 & r18
            r19 = 38347922(0x2492492, float:1.4777643E-37)
            r18 = r18 ^ r19
            if (r18 != 0) goto L_0x0139
            boolean r18 = r13.b()
            if (r18 != 0) goto L_0x0126
            goto L_0x0139
        L_0x0126:
            r13.h()
            r5 = r33
            r3 = r4
            r4 = r6
            r26 = r13
            r6 = r34
            r27 = r10
            r11 = r12
            r9 = r8
            r7 = r27
            goto L_0x0297
        L_0x0139:
            r13.H()
            r18 = r0 & 1
            r19 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r20 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r21 = -3670017(0xffffffffffc7ffff, float:NaN)
            r22 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = 6
            if (r18 == 0) goto L_0x017e
            boolean r18 = r13.i()
            if (r18 == 0) goto L_0x0154
            goto L_0x017e
        L_0x0154:
            r13.h()
            r3 = r14 & 32
            if (r3 == 0) goto L_0x015d
            r2 = r2 & r22
        L_0x015d:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x0163
            r2 = r2 & r21
        L_0x0163:
            r3 = r14 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0169
            r2 = r2 & r20
        L_0x0169:
            r3 = r14 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x016f
            r2 = r2 & r19
        L_0x016f:
            r19 = r33
            r20 = r34
            r18 = r4
            r23 = r8
            r21 = r10
            r25 = r12
            r12 = r6
            goto L_0x022b
        L_0x017e:
            if (r3 == 0) goto L_0x0183
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x0184
        L_0x0183:
            r3 = r4
        L_0x0184:
            if (r5 == 0) goto L_0x0188
            r4 = 0
            goto L_0x0189
        L_0x0188:
            r4 = r6
        L_0x0189:
            if (r7 == 0) goto L_0x01aa
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r13.E(r5)
            java.lang.Object r5 = r13.F()
            e0.g$a r6 = e0.g.f14172a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x01a4
            u.k r5 = u.j.a()
            r13.y(r5)
        L_0x01a4:
            r13.P()
            u.k r5 = (u.k) r5
            goto L_0x01ac
        L_0x01aa:
            r5 = r33
        L_0x01ac:
            r6 = r14 & 32
            if (r6 == 0) goto L_0x01c7
            c0.q r6 = c0.q.f12737a
            c0.u r6 = r6.b(r13, r0)
            z.a r6 = r6.c()
            r7 = 50
            z.b r7 = z.c.a(r7)
            z.a r6 = r6.b(r7)
            r2 = r2 & r22
            goto L_0x01c9
        L_0x01c7:
            r6 = r34
        L_0x01c9:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x01d9
            c0.q r7 = c0.q.f12737a
            c0.c r7 = r7.a(r13, r0)
            long r10 = r7.l()
            r2 = r2 & r21
        L_0x01d9:
            r7 = r14 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x01e8
            int r7 = r2 >> 18
            r7 = r7 & 14
            long r7 = androidx.compose.material.ColorsKt.b(r10, r13, r7)
            r2 = r2 & r20
            goto L_0x01e9
        L_0x01e8:
            r7 = r8
        L_0x01e9:
            r9 = r14 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x021e
            androidx.compose.material.f r9 = androidx.compose.material.f.f5789a
            r12 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 24576(0x6000, float:3.4438E-41)
            r23 = 15
            r31 = r9
            r32 = r12
            r33 = r18
            r34 = r20
            r35 = r21
            r36 = r13
            r37 = r22
            r38 = r23
            c0.n r9 = r31.a(r32, r33, r34, r35, r36, r37, r38)
            r2 = r2 & r19
            r18 = r3
            r12 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            r25 = r9
            r21 = r10
            goto L_0x022b
        L_0x021e:
            r18 = r3
            r19 = r5
            r20 = r6
            r23 = r7
            r21 = r10
            r25 = r12
            r12 = r4
        L_0x022b:
            r13.A()
            float r3 = f5045b
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r31 = r18
            r32 = r3
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r6
            r37 = r7
            p0.d r3 = androidx.compose.foundation.layout.SizeKt.w(r31, r32, r33, r34, r35, r36, r37)
            r4 = -819889791(0xffffffffcf217981, float:-2.70909466E9)
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r5 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r5.<init>(r12, r2, r1)
            r6 = 1
            l0.a r11 = l0.b.b(r13, r4, r6, r5)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            int r5 = r2 >> 3
            r5 = r5 & 14
            r4 = r4 | r5
            int r0 = r2 >> 6
            r2 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r0
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r0
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r4
            r0 = r0 | r2
            r16 = 0
            r2 = r30
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r23
            r10 = r25
            r17 = r12
            r12 = r13
            r26 = r13
            r13 = r0
            r14 = r16
            b(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
            r4 = r17
            r3 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r9 = r23
            r11 = r25
        L_0x0297:
            e0.s0 r14 = r26.v()
            if (r14 != 0) goto L_0x029e
            goto L_0x02b0
        L_0x029e:
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3 r13 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            r0 = r13
            r1 = r29
            r2 = r30
            r12 = r41
            r15 = r13
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r14.a(r15)
        L_0x02b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.a(lp0.p, lp0.a, p0.d, lp0.p, u.k, u0.j1, long, long, c0.n, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:134:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(lp0.a<bp0.k> r29, p0.d r30, u.k r31, u0.j1 r32, long r33, long r35, c0.n r37, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r38, e0.g r39, int r40, int r41) {
        /*
            r15 = r29
            r9 = r38
            r5 = r40
            r6 = r41
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r9, r0)
            r0 = -2057936835(0xffffffff8556603d, float:-1.0079908E-35)
            r1 = r39
            e0.g r3 = r1.t(r0)
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r5 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r5 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r3.k(r15)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r5
            goto L_0x0032
        L_0x0031:
            r0 = r5
        L_0x0032:
            r1 = r6 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r5 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r30
            boolean r4 = r3.k(r2)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r0 = r0 | r4
            goto L_0x004e
        L_0x004c:
            r2 = r30
        L_0x004e:
            r4 = r6 & 4
            if (r4 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r31
            boolean r8 = r3.k(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r31
        L_0x006a:
            r8 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0083
            r8 = r6 & 8
            if (r8 != 0) goto L_0x007d
            r8 = r32
            boolean r10 = r3.k(r8)
            if (r10 == 0) goto L_0x007f
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r8 = r32
        L_0x007f:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r0 = r0 | r10
            goto L_0x0085
        L_0x0083:
            r8 = r32
        L_0x0085:
            r16 = 57344(0xe000, float:8.0356E-41)
            r10 = r5 & r16
            if (r10 != 0) goto L_0x00a1
            r10 = r6 & 16
            if (r10 != 0) goto L_0x009b
            r10 = r33
            boolean r12 = r3.q(r10)
            if (r12 == 0) goto L_0x009d
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r10 = r33
        L_0x009d:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r12
            goto L_0x00a3
        L_0x00a1:
            r10 = r33
        L_0x00a3:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r5
            if (r12 != 0) goto L_0x00bd
            r12 = r6 & 32
            if (r12 != 0) goto L_0x00b7
            r12 = r35
            boolean r14 = r3.q(r12)
            if (r14 == 0) goto L_0x00b9
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r12 = r35
        L_0x00b9:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r14
            goto L_0x00bf
        L_0x00bd:
            r12 = r35
        L_0x00bf:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r5
            if (r14 != 0) goto L_0x00da
            r14 = r6 & 64
            if (r14 != 0) goto L_0x00d3
            r14 = r37
            boolean r17 = r3.k(r14)
            if (r17 == 0) goto L_0x00d5
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d3:
            r14 = r37
        L_0x00d5:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r0 = r0 | r17
            goto L_0x00dc
        L_0x00da:
            r14 = r37
        L_0x00dc:
            r2 = r6 & 128(0x80, float:1.794E-43)
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            if (r2 == 0) goto L_0x00e6
            r2 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00e4:
            r0 = r0 | r2
            goto L_0x00f6
        L_0x00e6:
            r2 = r5 & r17
            if (r2 != 0) goto L_0x00f6
            boolean r2 = r3.k(r9)
            if (r2 == 0) goto L_0x00f3
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e4
        L_0x00f3:
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00e4
        L_0x00f6:
            r2 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r0
            r18 = 4793490(0x492492, float:6.71711E-39)
            r2 = r2 ^ r18
            if (r2 != 0) goto L_0x0116
            boolean r2 = r3.b()
            if (r2 != 0) goto L_0x0108
            goto L_0x0116
        L_0x0108:
            r3.h()
            r2 = r30
            r26 = r3
            r3 = r7
            r4 = r8
            r5 = r10
            r7 = r12
            r9 = r14
            goto L_0x027e
        L_0x0116:
            r3.H()
            r2 = r5 & 1
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x0157
            boolean r2 = r3.i()
            if (r2 == 0) goto L_0x012d
            goto L_0x0157
        L_0x012d:
            r3.h()
            r1 = r6 & 8
            if (r1 == 0) goto L_0x0136
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0136:
            r1 = r6 & 16
            if (r1 == 0) goto L_0x013c
            r0 = r0 & r20
        L_0x013c:
            r1 = r6 & 32
            if (r1 == 0) goto L_0x0142
            r0 = r0 & r19
        L_0x0142:
            r1 = r6 & 64
            if (r1 == 0) goto L_0x0148
            r0 = r0 & r18
        L_0x0148:
            r19 = r30
        L_0x014a:
            r4 = r7
            r20 = r8
            r21 = r10
            r1 = r12
            r28 = r14
            r14 = r0
            r0 = r28
            goto L_0x01ee
        L_0x0157:
            if (r1 == 0) goto L_0x015c
            p0.d$a r1 = p0.d.f16037h0
            goto L_0x015e
        L_0x015c:
            r1 = r30
        L_0x015e:
            if (r4 == 0) goto L_0x017f
            r2 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r3.E(r2)
            java.lang.Object r2 = r3.F()
            e0.g$a r4 = e0.g.f14172a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0179
            u.k r2 = u.j.a()
            r3.y(r2)
        L_0x0179:
            r3.P()
            u.k r2 = (u.k) r2
            r7 = r2
        L_0x017f:
            r2 = r6 & 8
            r4 = 6
            if (r2 == 0) goto L_0x019b
            c0.q r2 = c0.q.f12737a
            c0.u r2 = r2.b(r3, r4)
            z.a r2 = r2.c()
            r8 = 50
            z.b r8 = z.c.a(r8)
            z.a r2 = r2.b(r8)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            r8 = r2
        L_0x019b:
            r2 = r6 & 16
            if (r2 == 0) goto L_0x01ab
            c0.q r2 = c0.q.f12737a
            c0.c r2 = r2.a(r3, r4)
            long r10 = r2.l()
            r0 = r0 & r20
        L_0x01ab:
            r2 = r6 & 32
            if (r2 == 0) goto L_0x01b9
            int r2 = r0 >> 12
            r2 = r2 & 14
            long r12 = androidx.compose.material.ColorsKt.b(r10, r3, r2)
            r0 = r0 & r19
        L_0x01b9:
            r2 = r6 & 64
            if (r2 == 0) goto L_0x01ea
            androidx.compose.material.f r2 = androidx.compose.material.f.f5789a
            r4 = 0
            r14 = 0
            r19 = 0
            r20 = 0
            r21 = 24576(0x6000, float:3.4438E-41)
            r22 = 15
            r30 = r2
            r31 = r4
            r32 = r14
            r33 = r19
            r34 = r20
            r35 = r3
            r36 = r21
            r37 = r22
            c0.n r2 = r30.a(r31, r32, r33, r34, r35, r36, r37)
            r0 = r0 & r18
            r14 = r0
            r19 = r1
            r0 = r2
            r4 = r7
            r20 = r8
            r21 = r10
            r1 = r12
            goto L_0x01ee
        L_0x01ea:
            r19 = r1
            goto L_0x014a
        L_0x01ee:
            r3.A()
            int r7 = r14 >> 6
            r7 = r7 & 14
            int r8 = r14 >> 15
            r8 = r8 & 112(0x70, float:1.57E-43)
            r7 = r7 | r8
            e0.d1 r7 = r0.a(r4, r3, r7)
            java.lang.Object r7 = r7.getValue()
            d2.h r7 = (d2.h) r7
            float r8 = r7.s()
            n1.g$a r7 = n1.g.f15778b
            int r13 = r7.a()
            r7 = 0
            r10 = 0
            r11 = 0
            r18 = 0
            r23 = 7
            r30 = r7
            r31 = r10
            r32 = r11
            r34 = r3
            r35 = r18
            r36 = r23
            s.h r10 = d0.h.e(r30, r31, r32, r34, r35, r36)
            r7 = 0
            r11 = 0
            r12 = 0
            n1.g r13 = n1.g.g(r13)
            r7 = -819891029(0xffffffffcf2174ab, float:-2.70877773E9)
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2 r11 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
            r11.<init>(r1, r9, r14)
            r12 = 1
            l0.a r7 = l0.b.b(r3, r7, r12, r11)
            r11 = r14
            r14 = r7
            r7 = r11 & 14
            r12 = r11 & 112(0x70, float:1.57E-43)
            r7 = r7 | r12
            int r12 = r11 >> 3
            r23 = r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 | r7
            r7 = r12 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r7
            r7 = r12 & r16
            r0 = r0 | r7
            int r7 = r11 << 15
            r7 = r7 & r17
            r16 = r0 | r7
            r17 = 384(0x180, float:5.38E-43)
            r18 = 1568(0x620, float:2.197E-42)
            r0 = r29
            r24 = r1
            r1 = r19
            r2 = r20
            r26 = r3
            r27 = r4
            r3 = r21
            r5 = r24
            r9 = r27
            r15 = r26
            r7 = 0
            r11 = 0
            r12 = 0
            androidx.compose.material.SurfaceKt.a(r0, r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r19
            r4 = r20
            r5 = r21
            r9 = r23
            r7 = r24
            r3 = r27
        L_0x027e:
            e0.s0 r13 = r26.v()
            if (r13 != 0) goto L_0x0285
            goto L_0x0296
        L_0x0285:
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3 r14 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0296:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.b(lp0.a, p0.d, u.k, u0.j1, long, long, c0.n, lp0.p, e0.g, int, int):void");
    }
}
