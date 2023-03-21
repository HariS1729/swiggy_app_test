package androidx.compose.foundation.text;

/* compiled from: ClickableText.kt */
public final class ClickableTextKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: lp0.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: p0.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p1.b r24, p0.d r25, p1.c0 r26, boolean r27, int r28, int r29, lp0.l<? super p1.y, bp0.k> r30, lp0.l<? super java.lang.Integer, bp0.k> r31, e0.g r32, int r33, int r34) {
        /*
            r11 = r24
            r12 = r31
            r13 = r33
            r14 = r34
            java.lang.String r0 = "text"
            kotlin.jvm.internal.p.j(r11, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.p.j(r12, r0)
            r0 = -246609449(0xfffffffff14d09d7, float:-1.0153012E30)
            r1 = r32
            e0.g r15 = r1.t(r0)
            r0 = r14 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r15.k(r11)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r13
            goto L_0x0032
        L_0x0031:
            r0 = r13
        L_0x0032:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r25
            boolean r4 = r15.k(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r0 = r0 | r4
            goto L_0x004e
        L_0x004c:
            r3 = r25
        L_0x004e:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r26
            boolean r6 = r15.k(r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r6
            goto L_0x006a
        L_0x0068:
            r5 = r26
        L_0x006a:
            r6 = r14 & 8
            if (r6 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0084
            r7 = r27
            boolean r8 = r15.m(r7)
            if (r8 == 0) goto L_0x0080
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r8
            goto L_0x0086
        L_0x0084:
            r7 = r27
        L_0x0086:
            r8 = r14 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 == 0) goto L_0x0090
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a4
        L_0x0090:
            r10 = r13 & r9
            if (r10 != 0) goto L_0x00a4
            r10 = r28
            boolean r16 = r15.p(r10)
            if (r16 == 0) goto L_0x009f
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r0 = r0 | r16
            goto L_0x00a6
        L_0x00a4:
            r10 = r28
        L_0x00a6:
            r16 = r14 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00b3
            r18 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r18
            r9 = r29
            goto L_0x00c6
        L_0x00b3:
            r18 = r13 & r17
            r9 = r29
            if (r18 != 0) goto L_0x00c6
            boolean r18 = r15.p(r9)
            if (r18 == 0) goto L_0x00c2
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r0 = r0 | r18
        L_0x00c6:
            r18 = r14 & 64
            r19 = 3670016(0x380000, float:5.142788E-39)
            if (r18 == 0) goto L_0x00d3
            r20 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r20
            r1 = r30
            goto L_0x00e6
        L_0x00d3:
            r20 = r13 & r19
            r1 = r30
            if (r20 != 0) goto L_0x00e6
            boolean r21 = r15.k(r1)
            if (r21 == 0) goto L_0x00e2
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r0 = r0 | r21
        L_0x00e6:
            r1 = r14 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00ee
            r1 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00ec:
            r0 = r0 | r1
            goto L_0x00ff
        L_0x00ee:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00ff
            boolean r1 = r15.k(r12)
            if (r1 == 0) goto L_0x00fc
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00fc:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00ec
        L_0x00ff:
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r0
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r3) goto L_0x011c
            boolean r1 = r15.b()
            if (r1 != 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            r15.h()
            r2 = r25
            r3 = r5
            r4 = r7
            r6 = r9
            r5 = r10
            r7 = r30
            goto L_0x0209
        L_0x011c:
            if (r2 == 0) goto L_0x0122
            p0.d$a r1 = p0.d.f16037h0
            r3 = r1
            goto L_0x0124
        L_0x0122:
            r3 = r25
        L_0x0124:
            if (r4 == 0) goto L_0x012f
            p1.c0$a r1 = p1.c0.f16065d
            p1.c0 r1 = r1.a()
            r21 = r1
            goto L_0x0131
        L_0x012f:
            r21 = r5
        L_0x0131:
            if (r6 == 0) goto L_0x0137
            r1 = 1
            r22 = 1
            goto L_0x0139
        L_0x0137:
            r22 = r7
        L_0x0139:
            if (r8 == 0) goto L_0x0144
            a2.l$a r1 = a2.l.f950a
            int r1 = r1.a()
            r23 = r1
            goto L_0x0146
        L_0x0144:
            r23 = r10
        L_0x0146:
            if (r16 == 0) goto L_0x014f
            r1 = 2147483647(0x7fffffff, float:NaN)
            r16 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0151
        L_0x014f:
            r16 = r9
        L_0x0151:
            if (r18 == 0) goto L_0x0157
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$1 r1 = androidx.compose.foundation.text.ClickableTextKt$ClickableText$1.f4295a
            r10 = r1
            goto L_0x0159
        L_0x0157:
            r10 = r30
        L_0x0159:
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.E(r1)
            java.lang.Object r1 = r15.F()
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r4 = r2.a()
            r5 = 0
            if (r1 != r4) goto L_0x0174
            r4 = 2
            e0.h0 r1 = androidx.compose.runtime.j.e(r5, r5, r4, r5)
            r15.y(r1)
        L_0x0174:
            r15.P()
            e0.h0 r1 = (e0.h0) r1
            p0.d$a r4 = p0.d.f16037h0
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.E(r6)
            boolean r7 = r15.k(r1)
            boolean r8 = r15.k(r12)
            r7 = r7 | r8
            java.lang.Object r8 = r15.F()
            if (r7 != 0) goto L_0x0196
            java.lang.Object r7 = r2.a()
            if (r8 != r7) goto L_0x019e
        L_0x0196:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1 r8 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
            r8.<init>(r1, r12, r5)
            r15.y(r8)
        L_0x019e:
            r15.P()
            lp0.p r8 = (lp0.p) r8
            p0.d r4 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r4, r12, r8)
            p0.d r4 = r3.N(r4)
            r15.E(r6)
            boolean r5 = r15.k(r1)
            boolean r6 = r15.k(r10)
            r5 = r5 | r6
            java.lang.Object r6 = r15.F()
            if (r5 != 0) goto L_0x01c3
            java.lang.Object r2 = r2.a()
            if (r6 != r2) goto L_0x01cb
        L_0x01c3:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1 r6 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
            r6.<init>(r1, r10)
            r15.y(r6)
        L_0x01cb:
            r15.P()
            r5 = r6
            lp0.l r5 = (lp0.l) r5
            r7 = 0
            r1 = r0 & 14
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            int r2 = r0 << 6
            r2 = r2 & r17
            r1 = r1 | r2
            int r0 = r0 << 3
            r0 = r0 & r19
            r9 = r1 | r0
            r17 = 128(0x80, float:1.794E-43)
            r0 = r24
            r1 = r4
            r2 = r21
            r18 = r3
            r3 = r5
            r4 = r23
            r5 = r22
            r6 = r16
            r8 = r15
            r19 = r10
            r10 = r17
            androidx.compose.foundation.text.BasicTextKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r18
            r7 = r19
            r3 = r21
            r4 = r22
            r5 = r23
        L_0x0209:
            e0.s0 r15 = r15.v()
            if (r15 != 0) goto L_0x0210
            goto L_0x0222
        L_0x0210:
            androidx.compose.foundation.text.ClickableTextKt$ClickableText$3 r10 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
            r0 = r10
            r1 = r24
            r8 = r31
            r9 = r33
            r11 = r10
            r10 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r15.a(r11)
        L_0x0222:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.a(p1.b, p0.d, p1.c0, boolean, int, int, lp0.l, lp0.l, e0.g, int, int):void");
    }
}
