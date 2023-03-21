package androidx.compose.foundation.lazy;

/* compiled from: LazyDsl.kt */
public final class LazyDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void a(p0.d r26, androidx.compose.foundation.lazy.LazyListState r27, defpackage.a2.p r28, boolean r29, androidx.compose.foundation.layout.Arrangement.l r30, p0.a.b r31, defpackage.y1.k r32, lp0.l r33, e0.g r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            r14 = r36
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r12, r0)
            r0 = -563353797(0xffffffffde6be73b, float:-4.24965505E18)
            r1 = r34
            e0.g r15 = r1.t(r0)
            r0 = r14 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r13 | 6
            r2 = r1
            r1 = r26
            goto L_0x0032
        L_0x001e:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r26
            boolean r2 = r15.k(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r13
            goto L_0x0032
        L_0x002f:
            r1 = r26
            r2 = r13
        L_0x0032:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r14 & 2
            if (r3 != 0) goto L_0x0045
            r3 = r27
            boolean r4 = r15.k(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0045:
            r3 = r27
        L_0x0047:
            r4 = 16
        L_0x0049:
            r2 = r2 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r27
        L_0x004d:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r28
            boolean r6 = r15.k(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r28
        L_0x0069:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r29
            boolean r8 = r15.m(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r29
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x00a1
            r9 = r14 & 16
            if (r9 != 0) goto L_0x009b
            r9 = r30
            boolean r10 = r15.k(r9)
            if (r10 == 0) goto L_0x009d
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r9 = r30
        L_0x009d:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r10
            goto L_0x00a3
        L_0x00a1:
            r9 = r30
        L_0x00a3:
            r10 = r14 & 32
            r11 = 458752(0x70000, float:6.42848E-40)
            if (r10 == 0) goto L_0x00b0
            r16 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r16
            r11 = r31
            goto L_0x00c3
        L_0x00b0:
            r16 = r13 & r11
            r11 = r31
            if (r16 != 0) goto L_0x00c3
            boolean r16 = r15.k(r11)
            if (r16 == 0) goto L_0x00bf
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r2 = r2 | r16
        L_0x00c3:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00dd
            r17 = r14 & 64
            r8 = r32
            if (r17 != 0) goto L_0x00d8
            boolean r18 = r15.k(r8)
            if (r18 == 0) goto L_0x00d8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r2 = r2 | r18
            goto L_0x00df
        L_0x00dd:
            r8 = r32
        L_0x00df:
            r1 = r14 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e8
            r2 = r2 | r18
            goto L_0x00f9
        L_0x00e8:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00f9
            boolean r1 = r15.k(r12)
            if (r1 == 0) goto L_0x00f6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r2 = r2 | r1
        L_0x00f9:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r2
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r3) goto L_0x0117
            boolean r1 = r15.b()
            if (r1 != 0) goto L_0x0109
            goto L_0x0117
        L_0x0109:
            r15.h()
            r1 = r26
            r2 = r27
            r3 = r5
            r4 = r7
            r7 = r8
            r5 = r9
            r6 = r11
            goto L_0x01f8
        L_0x0117:
            r15.H()
            r1 = r13 & 1
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 3
            if (r1 == 0) goto L_0x0150
            boolean r1 = r15.i()
            if (r1 == 0) goto L_0x0129
            goto L_0x0150
        L_0x0129:
            r15.h()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0132
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0132:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0138
            r2 = r2 & r19
        L_0x0138:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0140
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r0
        L_0x0140:
            r19 = r26
            r20 = r27
        L_0x0144:
            r21 = r5
            r22 = r7
            r25 = r8
        L_0x014a:
            r23 = r9
            r24 = r11
            goto L_0x01b2
        L_0x0150:
            if (r0 == 0) goto L_0x0155
            p0.d$a r0 = p0.d.f16037h0
            goto L_0x0157
        L_0x0155:
            r0 = r26
        L_0x0157:
            r1 = r14 & 2
            r26 = r0
            r0 = 0
            if (r1 == 0) goto L_0x0165
            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListStateKt.a(r0, r0, r15, r0, r3)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0167
        L_0x0165:
            r1 = r27
        L_0x0167:
            if (r4 == 0) goto L_0x0173
            float r4 = (float) r0
            float r4 = d2.h.n(r4)
            a2$p r4 = androidx.compose.foundation.layout.PaddingKt.a(r4)
            r5 = r4
        L_0x0173:
            if (r6 == 0) goto L_0x0176
            r7 = 0
        L_0x0176:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x018a
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f3654a
            if (r7 != 0) goto L_0x0183
            androidx.compose.foundation.layout.Arrangement$l r0 = r0.h()
            goto L_0x0187
        L_0x0183:
            androidx.compose.foundation.layout.Arrangement$l r0 = r0.a()
        L_0x0187:
            r2 = r2 & r19
            r9 = r0
        L_0x018a:
            if (r10 == 0) goto L_0x0193
            p0.a$a r0 = p0.a.f16019a
            p0.a$b r0 = r0.k()
            r11 = r0
        L_0x0193:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01ad
            androidx.compose.foundation.gestures.b r0 = androidx.compose.foundation.gestures.b.f3627a
            r4 = 6
            y1$k r0 = r0.a(r15, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r4
            r19 = r26
            r25 = r0
            r20 = r1
            r21 = r5
            r22 = r7
            goto L_0x014a
        L_0x01ad:
            r19 = r26
            r20 = r1
            goto L_0x0144
        L_0x01b2:
            r15.A()
            r7 = 1
            r0 = r2 & 14
            r0 = r0 | r18
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r2 & r16
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r2 << r3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r33
            r9 = r15
            b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
        L_0x01f8:
            e0.s0 r11 = r15.v()
            if (r11 != 0) goto L_0x01ff
            goto L_0x020e
        L_0x01ff:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2 r15 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
            r0 = r15
            r8 = r33
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r15)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.a(p0.d, androidx.compose.foundation.lazy.LazyListState, a2$p, boolean, androidx.compose.foundation.layout.Arrangement$l, p0.a$b, y1$k, lp0.l, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(p0.d r28, androidx.compose.foundation.lazy.LazyListState r29, defpackage.a2.p r30, boolean r31, androidx.compose.foundation.layout.Arrangement.l r32, p0.a.b r33, defpackage.y1.k r34, boolean r35, lp0.l<? super androidx.compose.foundation.lazy.c, bp0.k> r36, e0.g r37, int r38, int r39) {
        /*
            r15 = r36
            r14 = r38
            r13 = r39
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r15, r0)
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r1 = r37
            e0.g r12 = r1.t(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r14 | 6
            r2 = r1
            r1 = r28
            goto L_0x0032
        L_0x001e:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r28
            boolean r2 = r12.k(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r14
            goto L_0x0032
        L_0x002f:
            r1 = r28
            r2 = r14
        L_0x0032:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r13 & 2
            if (r3 != 0) goto L_0x0045
            r3 = r29
            boolean r4 = r12.k(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0045:
            r3 = r29
        L_0x0047:
            r4 = 16
        L_0x0049:
            r2 = r2 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r29
        L_0x004d:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r30
            boolean r6 = r12.k(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r30
        L_0x0069:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r31
            boolean r8 = r12.m(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r31
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00a0
            r8 = r13 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r32
            boolean r9 = r12.k(r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r32
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r2 = r2 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r32
        L_0x00a2:
            r9 = r13 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00ac
            r11 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r11
            goto L_0x00c0
        L_0x00ac:
            r11 = r14 & r10
            if (r11 != 0) goto L_0x00c0
            r11 = r33
            boolean r16 = r12.k(r11)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r2 = r2 | r16
            goto L_0x00c2
        L_0x00c0:
            r11 = r33
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00dc
            r17 = r13 & 64
            r10 = r34
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r12.k(r10)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r2 = r2 | r17
            goto L_0x00de
        L_0x00dc:
            r10 = r34
        L_0x00de:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            if (r1 == 0) goto L_0x00eb
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r18
            r3 = r35
            goto L_0x00fe
        L_0x00eb:
            r18 = r14 & r17
            r3 = r35
            if (r18 != 0) goto L_0x00fe
            boolean r18 = r12.m(r3)
            if (r18 == 0) goto L_0x00fa
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r2 = r2 | r18
        L_0x00fe:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0108
            r3 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0106:
            r2 = r2 | r3
            goto L_0x0118
        L_0x0108:
            r3 = r14 & r18
            if (r3 != 0) goto L_0x0118
            boolean r3 = r12.k(r15)
            if (r3 == 0) goto L_0x0115
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0115:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0106
        L_0x0118:
            r3 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r3 & r2
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x013b
            boolean r3 = r12.b()
            if (r3 != 0) goto L_0x0128
            goto L_0x013b
        L_0x0128:
            r12.h()
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r7
            r5 = r8
            r7 = r10
            r6 = r11
            r27 = r12
            r8 = r35
            goto L_0x024b
        L_0x013b:
            r12.H()
            r3 = r14 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x0175
            boolean r3 = r12.i()
            if (r3 == 0) goto L_0x014f
            goto L_0x0175
        L_0x014f:
            r12.h()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0158
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0158:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x015e
            r2 = r2 & r19
        L_0x015e:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0163
            r2 = r2 & r5
        L_0x0163:
            r19 = r28
            r20 = r29
            r21 = r30
            r26 = r35
            r22 = r7
            r23 = r8
            r25 = r10
            r24 = r11
            goto L_0x01f1
        L_0x0175:
            if (r0 == 0) goto L_0x017a
            p0.d$a r0 = p0.d.f16037h0
            goto L_0x017c
        L_0x017a:
            r0 = r28
        L_0x017c:
            r3 = r13 & 2
            r5 = 0
            if (r3 == 0) goto L_0x0189
            r3 = 3
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.a(r5, r5, r12, r5, r3)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x018b
        L_0x0189:
            r3 = r29
        L_0x018b:
            if (r4 == 0) goto L_0x0197
            float r4 = (float) r5
            float r4 = d2.h.n(r4)
            a2$p r4 = androidx.compose.foundation.layout.PaddingKt.a(r4)
            goto L_0x0199
        L_0x0197:
            r4 = r30
        L_0x0199:
            if (r6 == 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r5 = r7
        L_0x019d:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x01b1
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f3654a
            if (r5 != 0) goto L_0x01aa
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.h()
            goto L_0x01ae
        L_0x01aa:
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.a()
        L_0x01ae:
            r2 = r2 & r19
            goto L_0x01b2
        L_0x01b1:
            r6 = r8
        L_0x01b2:
            if (r9 == 0) goto L_0x01bb
            p0.a$a r7 = p0.a.f16019a
            p0.a$b r7 = r7.k()
            goto L_0x01bc
        L_0x01bb:
            r7 = r11
        L_0x01bc:
            r8 = r13 & 64
            if (r8 == 0) goto L_0x01cc
            androidx.compose.foundation.gestures.b r8 = androidx.compose.foundation.gestures.b.f3627a
            r9 = 6
            y1$k r8 = r8.a(r12, r9)
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r9
            goto L_0x01cd
        L_0x01cc:
            r8 = r10
        L_0x01cd:
            if (r1 == 0) goto L_0x01e1
            r1 = 1
            r19 = r0
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = 1
            goto L_0x01f1
        L_0x01e1:
            r26 = r35
            r19 = r0
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
        L_0x01f1:
            r12.A()
            r4 = 1
            r9 = 0
            r10 = 0
            r0 = r2 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r2 >> 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r1 = r1 & r16
            r0 = r0 | r1
            int r1 = r2 << 6
            r1 = r1 & r17
            r0 = r0 | r1
            int r1 = r2 << 12
            r1 = r1 & r18
            r16 = r0 | r1
            int r0 = r2 >> 21
            r17 = r0 & 112(0x70, float:1.57E-43)
            r18 = 1536(0x600, float:2.152E-42)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r25
            r6 = r26
            r7 = r24
            r8 = r23
            r11 = r36
            r27 = r12
            r13 = r16
            r14 = r17
            r15 = r18
            androidx.compose.foundation.lazy.LazyListKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
        L_0x024b:
            e0.s0 r12 = r27.v()
            if (r12 != 0) goto L_0x0252
            goto L_0x0261
        L_0x0252:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
            r0 = r13
            r9 = r36
            r10 = r38
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.b(p0.d, androidx.compose.foundation.lazy.LazyListState, a2$p, boolean, androidx.compose.foundation.layout.Arrangement$l, p0.a$b, y1$k, boolean, lp0.l, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void c(p0.d r26, androidx.compose.foundation.lazy.LazyListState r27, defpackage.a2.p r28, boolean r29, androidx.compose.foundation.layout.Arrangement.d r30, p0.a.c r31, defpackage.y1.k r32, lp0.l r33, e0.g r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            r14 = r36
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r12, r0)
            r0 = 407929823(0x185083df, float:2.6949948E-24)
            r1 = r34
            e0.g r15 = r1.t(r0)
            r0 = r14 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r13 | 6
            r2 = r1
            r1 = r26
            goto L_0x0032
        L_0x001e:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r26
            boolean r2 = r15.k(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r13
            goto L_0x0032
        L_0x002f:
            r1 = r26
            r2 = r13
        L_0x0032:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r14 & 2
            if (r3 != 0) goto L_0x0045
            r3 = r27
            boolean r4 = r15.k(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0045:
            r3 = r27
        L_0x0047:
            r4 = 16
        L_0x0049:
            r2 = r2 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r27
        L_0x004d:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r28
            boolean r6 = r15.k(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r28
        L_0x0069:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r29
            boolean r8 = r15.m(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r29
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r13 & r8
            if (r9 != 0) goto L_0x00a1
            r9 = r14 & 16
            if (r9 != 0) goto L_0x009b
            r9 = r30
            boolean r10 = r15.k(r9)
            if (r10 == 0) goto L_0x009d
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r9 = r30
        L_0x009d:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r10
            goto L_0x00a3
        L_0x00a1:
            r9 = r30
        L_0x00a3:
            r10 = r14 & 32
            r11 = 458752(0x70000, float:6.42848E-40)
            if (r10 == 0) goto L_0x00b0
            r16 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r16
            r11 = r31
            goto L_0x00c3
        L_0x00b0:
            r16 = r13 & r11
            r11 = r31
            if (r16 != 0) goto L_0x00c3
            boolean r16 = r15.k(r11)
            if (r16 == 0) goto L_0x00bf
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c1
        L_0x00bf:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00c1:
            r2 = r2 | r16
        L_0x00c3:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00dd
            r17 = r14 & 64
            r8 = r32
            if (r17 != 0) goto L_0x00d8
            boolean r18 = r15.k(r8)
            if (r18 == 0) goto L_0x00d8
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00da
        L_0x00d8:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00da:
            r2 = r2 | r18
            goto L_0x00df
        L_0x00dd:
            r8 = r32
        L_0x00df:
            r1 = r14 & 128(0x80, float:1.794E-43)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e8
            r2 = r2 | r18
            goto L_0x00f9
        L_0x00e8:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00f9
            boolean r1 = r15.k(r12)
            if (r1 == 0) goto L_0x00f6
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r1 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r2 = r2 | r1
        L_0x00f9:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r2
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r3) goto L_0x0117
            boolean r1 = r15.b()
            if (r1 != 0) goto L_0x0109
            goto L_0x0117
        L_0x0109:
            r15.h()
            r1 = r26
            r2 = r27
            r3 = r5
            r4 = r7
            r7 = r8
            r5 = r9
            r6 = r11
            goto L_0x01f8
        L_0x0117:
            r15.H()
            r1 = r13 & 1
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = 3
            if (r1 == 0) goto L_0x0150
            boolean r1 = r15.i()
            if (r1 == 0) goto L_0x0129
            goto L_0x0150
        L_0x0129:
            r15.h()
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0132
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0132:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0138
            r2 = r2 & r19
        L_0x0138:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0140
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r0
        L_0x0140:
            r19 = r26
            r20 = r27
        L_0x0144:
            r21 = r5
            r22 = r7
            r25 = r8
        L_0x014a:
            r23 = r9
            r24 = r11
            goto L_0x01b2
        L_0x0150:
            if (r0 == 0) goto L_0x0155
            p0.d$a r0 = p0.d.f16037h0
            goto L_0x0157
        L_0x0155:
            r0 = r26
        L_0x0157:
            r1 = r14 & 2
            r26 = r0
            r0 = 0
            if (r1 == 0) goto L_0x0165
            androidx.compose.foundation.lazy.LazyListState r1 = androidx.compose.foundation.lazy.LazyListStateKt.a(r0, r0, r15, r0, r3)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0167
        L_0x0165:
            r1 = r27
        L_0x0167:
            if (r4 == 0) goto L_0x0173
            float r4 = (float) r0
            float r4 = d2.h.n(r4)
            a2$p r4 = androidx.compose.foundation.layout.PaddingKt.a(r4)
            r5 = r4
        L_0x0173:
            if (r6 == 0) goto L_0x0176
            r7 = 0
        L_0x0176:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x018a
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f3654a
            if (r7 != 0) goto L_0x0183
            androidx.compose.foundation.layout.Arrangement$d r0 = r0.g()
            goto L_0x0187
        L_0x0183:
            androidx.compose.foundation.layout.Arrangement$d r0 = r0.c()
        L_0x0187:
            r2 = r2 & r19
            r9 = r0
        L_0x018a:
            if (r10 == 0) goto L_0x0193
            p0.a$a r0 = p0.a.f16019a
            p0.a$c r0 = r0.l()
            r11 = r0
        L_0x0193:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01ad
            androidx.compose.foundation.gestures.b r0 = androidx.compose.foundation.gestures.b.f3627a
            r4 = 6
            y1$k r0 = r0.a(r15, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r4
            r19 = r26
            r25 = r0
            r20 = r1
            r21 = r5
            r22 = r7
            goto L_0x014a
        L_0x01ad:
            r19 = r26
            r20 = r1
            goto L_0x0144
        L_0x01b2:
            r15.A()
            r7 = 1
            r0 = r2 & 14
            r0 = r0 | r18
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r2 & r16
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            int r2 = r2 << r3
            r1 = r1 & r2
            r10 = r0 | r1
            r11 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r33
            r9 = r15
            d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
        L_0x01f8:
            e0.s0 r11 = r15.v()
            if (r11 != 0) goto L_0x01ff
            goto L_0x020e
        L_0x01ff:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2 r15 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
            r0 = r15
            r8 = r33
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r15)
        L_0x020e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.c(p0.d, androidx.compose.foundation.lazy.LazyListState, a2$p, boolean, androidx.compose.foundation.layout.Arrangement$d, p0.a$c, y1$k, lp0.l, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(p0.d r28, androidx.compose.foundation.lazy.LazyListState r29, defpackage.a2.p r30, boolean r31, androidx.compose.foundation.layout.Arrangement.d r32, p0.a.c r33, defpackage.y1.k r34, boolean r35, lp0.l<? super androidx.compose.foundation.lazy.c, bp0.k> r36, e0.g r37, int r38, int r39) {
        /*
            r15 = r36
            r14 = r38
            r13 = r39
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r15, r0)
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r1 = r37
            e0.g r12 = r1.t(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r14 | 6
            r2 = r1
            r1 = r28
            goto L_0x0032
        L_0x001e:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r28
            boolean r2 = r12.k(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r14
            goto L_0x0032
        L_0x002f:
            r1 = r28
            r2 = r14
        L_0x0032:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r13 & 2
            if (r3 != 0) goto L_0x0045
            r3 = r29
            boolean r4 = r12.k(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0045:
            r3 = r29
        L_0x0047:
            r4 = 16
        L_0x0049:
            r2 = r2 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r29
        L_0x004d:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r30
            boolean r6 = r12.k(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r30
        L_0x0069:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r31
            boolean r8 = r12.m(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r31
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00a0
            r8 = r13 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r32
            boolean r9 = r12.k(r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r32
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r2 = r2 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r32
        L_0x00a2:
            r9 = r13 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00ac
            r11 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r11
            goto L_0x00c0
        L_0x00ac:
            r11 = r14 & r10
            if (r11 != 0) goto L_0x00c0
            r11 = r33
            boolean r16 = r12.k(r11)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r2 = r2 | r16
            goto L_0x00c2
        L_0x00c0:
            r11 = r33
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00dc
            r17 = r13 & 64
            r10 = r34
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r12.k(r10)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r2 = r2 | r17
            goto L_0x00de
        L_0x00dc:
            r10 = r34
        L_0x00de:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e9
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r17
            r3 = r35
            goto L_0x00fe
        L_0x00e9:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r14 & r17
            r3 = r35
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r12.m(r3)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r2 = r2 | r17
        L_0x00fe:
            r3 = r13 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0106
            r3 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0104:
            r2 = r2 | r3
            goto L_0x0117
        L_0x0106:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0117
            boolean r3 = r12.k(r15)
            if (r3 == 0) goto L_0x0114
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0104
        L_0x0114:
            r3 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0104
        L_0x0117:
            r3 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r3 & r2
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x013a
            boolean r3 = r12.b()
            if (r3 != 0) goto L_0x0127
            goto L_0x013a
        L_0x0127:
            r12.h()
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r7
            r5 = r8
            r7 = r10
            r6 = r11
            r27 = r12
            r8 = r35
            goto L_0x024c
        L_0x013a:
            r12.H()
            r3 = r14 & 1
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x0174
            boolean r3 = r12.i()
            if (r3 == 0) goto L_0x014e
            goto L_0x0174
        L_0x014e:
            r12.h()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0157
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0157:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x015d
            r2 = r2 & r17
        L_0x015d:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0162
            r2 = r2 & r5
        L_0x0162:
            r17 = r28
            r18 = r29
            r19 = r30
            r24 = r35
            r20 = r7
            r21 = r8
            r23 = r10
            r22 = r11
            goto L_0x01f0
        L_0x0174:
            if (r0 == 0) goto L_0x0179
            p0.d$a r0 = p0.d.f16037h0
            goto L_0x017b
        L_0x0179:
            r0 = r28
        L_0x017b:
            r3 = r13 & 2
            r5 = 0
            if (r3 == 0) goto L_0x0188
            r3 = 3
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.LazyListStateKt.a(r5, r5, r12, r5, r3)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x018a
        L_0x0188:
            r3 = r29
        L_0x018a:
            if (r4 == 0) goto L_0x0196
            float r4 = (float) r5
            float r4 = d2.h.n(r4)
            a2$p r4 = androidx.compose.foundation.layout.PaddingKt.a(r4)
            goto L_0x0198
        L_0x0196:
            r4 = r30
        L_0x0198:
            if (r6 == 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r5 = r7
        L_0x019c:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x01b0
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f3654a
            if (r5 != 0) goto L_0x01a9
            androidx.compose.foundation.layout.Arrangement$d r6 = r6.g()
            goto L_0x01ad
        L_0x01a9:
            androidx.compose.foundation.layout.Arrangement$d r6 = r6.c()
        L_0x01ad:
            r2 = r2 & r17
            goto L_0x01b1
        L_0x01b0:
            r6 = r8
        L_0x01b1:
            if (r9 == 0) goto L_0x01ba
            p0.a$a r7 = p0.a.f16019a
            p0.a$c r7 = r7.l()
            goto L_0x01bb
        L_0x01ba:
            r7 = r11
        L_0x01bb:
            r8 = r13 & 64
            if (r8 == 0) goto L_0x01cb
            androidx.compose.foundation.gestures.b r8 = androidx.compose.foundation.gestures.b.f3627a
            r9 = 6
            y1$k r8 = r8.a(r12, r9)
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r9
            goto L_0x01cc
        L_0x01cb:
            r8 = r10
        L_0x01cc:
            if (r1 == 0) goto L_0x01e0
            r1 = 1
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = 1
            goto L_0x01f0
        L_0x01e0:
            r24 = r35
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
        L_0x01f0:
            r12.A()
            r4 = 0
            r7 = 0
            r8 = 0
            r0 = r2 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r2 >> 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            int r3 = r2 << 12
            r1 = r1 & r3
            r16 = r0 | r1
            int r0 = r2 >> 12
            r0 = r0 & 14
            int r1 = r2 >> 21
            r1 = r1 & 112(0x70, float:1.57E-43)
            r25 = r0 | r1
            r26 = 384(0x180, float:5.38E-43)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r9 = r22
            r10 = r21
            r11 = r36
            r27 = r12
            r13 = r16
            r14 = r25
            r15 = r26
            androidx.compose.foundation.lazy.LazyListKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
        L_0x024c:
            e0.s0 r12 = r27.v()
            if (r12 != 0) goto L_0x0253
            goto L_0x0262
        L_0x0253:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
            r0 = r13
            r9 = r36
            r10 = r38
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.d(p0.d, androidx.compose.foundation.lazy.LazyListState, a2$p, boolean, androidx.compose.foundation.layout.Arrangement$d, p0.a$c, y1$k, boolean, lp0.l, e0.g, int, int):void");
    }
}
