package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import bp0.k;
import c0.j;
import c0.q;
import d2.h;
import e0.g;
import e0.n0;
import e0.s0;
import lp0.p;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import p0.d;
import s.b;
import u0.d0;
import u0.j1;

/* compiled from: Surface.kt */
public final class SurfaceKt {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(lp0.a<bp0.k> r32, p0.d r33, u0.j1 r34, long r35, long r37, s.b r39, float r40, u.k r41, s.h r42, boolean r43, java.lang.String r44, n1.g r45, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r46, e0.g r47, int r48, int r49, int r50) {
        /*
            r1 = r32
            r15 = r46
            r14 = r48
            r13 = r49
            r12 = r50
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.p.j(r1, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r15, r0)
            r0 = -750962911(0xffffffffd33d3721, float:-8.1267373E11)
            r2 = r47
            e0.g r0 = r2.t(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0024
            r2 = r14 | 6
            goto L_0x0034
        L_0x0024:
            r2 = r14 & 14
            if (r2 != 0) goto L_0x0033
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0030
            r2 = 4
            goto L_0x0031
        L_0x0030:
            r2 = 2
        L_0x0031:
            r2 = r2 | r14
            goto L_0x0034
        L_0x0033:
            r2 = r14
        L_0x0034:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x003b
            r2 = r2 | 48
            goto L_0x004e
        L_0x003b:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r33
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x004a
            r9 = 32
            goto L_0x004c
        L_0x004a:
            r9 = 16
        L_0x004c:
            r2 = r2 | r9
            goto L_0x0050
        L_0x004e:
            r8 = r33
        L_0x0050:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0057
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x0057:
            r3 = r14 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006b
            r3 = r34
            boolean r16 = r0.k(r3)
            if (r16 == 0) goto L_0x0066
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r2 = r2 | r16
            goto L_0x006d
        L_0x006b:
            r3 = r34
        L_0x006d:
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0085
            r4 = r12 & 8
            r6 = r35
            if (r4 != 0) goto L_0x0080
            boolean r18 = r0.q(r6)
            if (r18 == 0) goto L_0x0080
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r2 = r2 | r18
            goto L_0x0087
        L_0x0085:
            r6 = r35
        L_0x0087:
            r18 = 57344(0xe000, float:8.0356E-41)
            r19 = r14 & r18
            if (r19 != 0) goto L_0x00a2
            r19 = r12 & 16
            r10 = r37
            if (r19 != 0) goto L_0x009d
            boolean r21 = r0.q(r10)
            if (r21 == 0) goto L_0x009d
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r2 = r2 | r21
            goto L_0x00a4
        L_0x00a2:
            r10 = r37
        L_0x00a4:
            r21 = r12 & 32
            r22 = 458752(0x70000, float:6.42848E-40)
            if (r21 == 0) goto L_0x00b1
            r23 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r23
            r4 = r39
            goto L_0x00c4
        L_0x00b1:
            r23 = r14 & r22
            r4 = r39
            if (r23 != 0) goto L_0x00c4
            boolean r24 = r0.k(r4)
            if (r24 == 0) goto L_0x00c0
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r2 = r2 | r24
        L_0x00c4:
            r24 = r12 & 64
            if (r24 == 0) goto L_0x00cf
            r25 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r25
            r1 = r40
            goto L_0x00e4
        L_0x00cf:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r14 & r25
            r1 = r40
            if (r25 != 0) goto L_0x00e4
            boolean r25 = r0.n(r1)
            if (r25 == 0) goto L_0x00e0
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r2 = r2 | r25
        L_0x00e4:
            r1 = r12 & 128(0x80, float:1.794E-43)
            r25 = 29360128(0x1c00000, float:7.052966E-38)
            if (r1 == 0) goto L_0x00f1
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r26
            r3 = r41
            goto L_0x0104
        L_0x00f1:
            r26 = r14 & r25
            r3 = r41
            if (r26 != 0) goto L_0x0104
            boolean r26 = r0.k(r3)
            if (r26 == 0) goto L_0x0100
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r2 = r2 | r26
        L_0x0104:
            r26 = 234881024(0xe000000, float:1.5777218E-30)
            r26 = r14 & r26
            if (r26 != 0) goto L_0x0120
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0119
            r3 = r42
            boolean r26 = r0.k(r3)
            if (r26 == 0) goto L_0x011b
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011d
        L_0x0119:
            r3 = r42
        L_0x011b:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011d:
            r2 = r2 | r26
            goto L_0x0122
        L_0x0120:
            r3 = r42
        L_0x0122:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x012d
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r26
            r4 = r43
            goto L_0x0142
        L_0x012d:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r14 & r26
            r4 = r43
            if (r26 != 0) goto L_0x0142
            boolean r26 = r0.m(r4)
            if (r26 == 0) goto L_0x013e
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0140
        L_0x013e:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0140:
            r2 = r2 | r26
        L_0x0142:
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x014b
            r16 = r13 | 6
            r6 = r44
            goto L_0x0161
        L_0x014b:
            r26 = r13 & 14
            r6 = r44
            if (r26 != 0) goto L_0x015f
            boolean r7 = r0.k(r6)
            if (r7 == 0) goto L_0x015a
            r16 = 4
            goto L_0x015c
        L_0x015a:
            r16 = 2
        L_0x015c:
            r16 = r13 | r16
            goto L_0x0161
        L_0x015f:
            r16 = r13
        L_0x0161:
            r7 = r12 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0168
            r16 = r16 | 48
            goto L_0x017b
        L_0x0168:
            r26 = r13 & 112(0x70, float:1.57E-43)
            r6 = r45
            if (r26 != 0) goto L_0x017b
            boolean r26 = r0.k(r6)
            if (r26 == 0) goto L_0x0177
            r17 = 32
            goto L_0x0179
        L_0x0177:
            r17 = 16
        L_0x0179:
            r16 = r16 | r17
        L_0x017b:
            r6 = r16
            r8 = r12 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0184
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0195
        L_0x0184:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0195
            boolean r8 = r0.k(r15)
            if (r8 == 0) goto L_0x0191
            r19 = 256(0x100, float:3.59E-43)
            goto L_0x0193
        L_0x0191:
            r19 = 128(0x80, float:1.794E-43)
        L_0x0193:
            r6 = r6 | r19
        L_0x0195:
            r8 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r8 & r2
            r16 = 306783378(0x12492492, float:6.3469493E-28)
            r8 = r8 ^ r16
            if (r8 != 0) goto L_0x01c7
            r8 = r6 & 731(0x2db, float:1.024E-42)
            r8 = r8 ^ 146(0x92, float:2.05E-43)
            if (r8 != 0) goto L_0x01c7
            boolean r8 = r0.b()
            if (r8 != 0) goto L_0x01ad
            goto L_0x01c7
        L_0x01ad:
            r0.h()
            r2 = r33
            r3 = r34
            r4 = r35
            r8 = r39
            r9 = r40
            r16 = r43
            r17 = r44
            r19 = r45
            r6 = r10
            r10 = r41
            r11 = r42
            goto L_0x032d
        L_0x01c7:
            r0.H()
            r8 = r14 & 1
            r16 = 0
            if (r8 == 0) goto L_0x0208
            boolean r8 = r0.i()
            if (r8 == 0) goto L_0x01d7
            goto L_0x0208
        L_0x01d7:
            r0.h()
            r1 = r12 & 8
            if (r1 == 0) goto L_0x01e0
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x01e0:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x01e8
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = r2 & r1
        L_0x01e8:
            r1 = r12 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01f0
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r2 & r1
        L_0x01f0:
            r1 = r33
            r8 = r35
            r3 = r39
            r4 = r40
            r5 = r41
            r7 = r42
            r16 = r43
            r17 = r44
            r19 = r45
            r20 = r2
            r2 = r34
            goto L_0x02cb
        L_0x0208:
            if (r5 == 0) goto L_0x020d
            p0.d$a r5 = p0.d.f16037h0
            goto L_0x020f
        L_0x020d:
            r5 = r33
        L_0x020f:
            if (r9 == 0) goto L_0x0216
            u0.j1 r8 = u0.c1.a()
            goto L_0x0218
        L_0x0216:
            r8 = r34
        L_0x0218:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0230
            c0.q r9 = c0.q.f12737a
            r33 = r5
            r5 = 6
            c0.c r5 = r9.a(r0, r5)
            long r19 = r5.n()
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
            r34 = r8
            r8 = r19
            goto L_0x0236
        L_0x0230:
            r33 = r5
            r34 = r8
            r8 = r35
        L_0x0236:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x0246
            int r5 = r2 >> 9
            r5 = r5 & 14
            long r10 = androidx.compose.material.ColorsKt.b(r8, r0, r5)
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = r2 & r5
        L_0x0246:
            if (r21 == 0) goto L_0x024b
            r5 = r16
            goto L_0x024d
        L_0x024b:
            r5 = r39
        L_0x024d:
            r35 = r5
            if (r24 == 0) goto L_0x0258
            r5 = 0
            float r5 = (float) r5
            float r5 = d2.h.n(r5)
            goto L_0x025a
        L_0x0258:
            r5 = r40
        L_0x025a:
            if (r1 == 0) goto L_0x027d
            r1 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r0.E(r1)
            java.lang.Object r1 = r0.F()
            e0.g$a r17 = e0.g.f14172a
            r36 = r5
            java.lang.Object r5 = r17.a()
            if (r1 != r5) goto L_0x0277
            u.k r1 = u.j.a()
            r0.y(r1)
        L_0x0277:
            r0.P()
            u.k r1 = (u.k) r1
            goto L_0x0281
        L_0x027d:
            r36 = r5
            r1 = r41
        L_0x0281:
            r5 = r12 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0295
            e0.m0 r5 = androidx.compose.foundation.IndicationKt.a()
            java.lang.Object r5 = r0.z(r5)
            s.h r5 = (s.h) r5
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r2 = r2 & r17
            goto L_0x0297
        L_0x0295:
            r5 = r42
        L_0x0297:
            if (r3 == 0) goto L_0x029b
            r3 = 1
            goto L_0x029d
        L_0x029b:
            r3 = r43
        L_0x029d:
            if (r4 == 0) goto L_0x02a2
            r4 = r16
            goto L_0x02a4
        L_0x02a2:
            r4 = r44
        L_0x02a4:
            if (r7 == 0) goto L_0x02b9
            r20 = r2
            r17 = r4
            r7 = r5
            r19 = r16
            r2 = r34
            r4 = r36
            r5 = r1
            r16 = r3
            r1 = r33
            r3 = r35
            goto L_0x02cb
        L_0x02b9:
            r19 = r45
            r20 = r2
            r16 = r3
            r17 = r4
            r7 = r5
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r1
            r1 = r33
        L_0x02cb:
            r0.A()
            p0.d r21 = androidx.compose.material.TouchTargetKt.b(r1)
            p0.d$a r23 = p0.d.f16037h0
            r33 = r23
            r34 = r5
            r35 = r7
            r36 = r16
            r37 = r17
            r38 = r19
            r39 = r32
            p0.d r23 = androidx.compose.foundation.ClickableKt.b(r33, r34, r35, r36, r37, r38, r39)
            r45 = r1
            int r1 = r20 >> 3
            r20 = r1 & 112(0x70, float:1.57E-43)
            r47 = r5
            r5 = r1 & 896(0x380, float:1.256E-42)
            r5 = r20 | r5
            r20 = r7
            r7 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r7
            r7 = r1 & r18
            r5 = r5 | r7
            r1 = r1 & r22
            r1 = r1 | r5
            int r5 = r6 << 15
            r5 = r5 & r25
            r1 = r1 | r5
            r33 = r21
            r34 = r2
            r35 = r8
            r37 = r10
            r39 = r3
            r40 = r4
            r41 = r23
            r42 = r46
            r43 = r0
            r44 = r1
            c(r33, r34, r35, r37, r39, r40, r41, r42, r43, r44)
            r6 = r10
            r11 = r20
            r10 = r47
            r28 = r2
            r2 = r45
            r29 = r3
            r3 = r28
            r30 = r8
            r8 = r29
            r9 = r4
            r4 = r30
        L_0x032d:
            e0.s0 r1 = r0.v()
            if (r1 != 0) goto L_0x0334
            goto L_0x0354
        L_0x0334:
            androidx.compose.material.SurfaceKt$Surface$5 r0 = new androidx.compose.material.SurfaceKt$Surface$5
            r33 = r0
            r27 = r1
            r1 = r32
            r12 = r16
            r13 = r17
            r14 = r19
            r15 = r46
            r16 = r48
            r17 = r49
            r18 = r50
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r33
            r0 = r27
            r0.a(r1)
        L_0x0354:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.a(lp0.a, p0.d, u0.j1, long, long, s.b, float, u.k, s.h, boolean, java.lang.String, n1.g, lp0.p, e0.g, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(p0.d r25, u0.j1 r26, long r27, long r29, s.b r31, float r32, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r33, e0.g r34, int r35, int r36) {
        /*
            r12 = r33
            r13 = r35
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r12, r0)
            r0 = -750968235(0xffffffffd33d2255, float:-8.1232481E11)
            r1 = r34
            e0.g r14 = r1.t(r0)
            r0 = r36 & 1
            if (r0 == 0) goto L_0x001c
            r1 = r13 | 6
            r2 = r1
            r1 = r25
            goto L_0x0030
        L_0x001c:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002d
            r1 = r25
            boolean r2 = r14.k(r1)
            if (r2 == 0) goto L_0x002a
            r2 = 4
            goto L_0x002b
        L_0x002a:
            r2 = 2
        L_0x002b:
            r2 = r2 | r13
            goto L_0x0030
        L_0x002d:
            r1 = r25
            r2 = r13
        L_0x0030:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0037
            r2 = r2 | 48
            goto L_0x004a
        L_0x0037:
            r4 = r13 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r26
            boolean r5 = r14.k(r4)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r2 = r2 | r5
            goto L_0x004c
        L_0x004a:
            r4 = r26
        L_0x004c:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r36 & 4
            if (r5 != 0) goto L_0x005f
            r5 = r27
            boolean r7 = r14.q(r5)
            if (r7 == 0) goto L_0x0061
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r5 = r27
        L_0x0061:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r7
            goto L_0x0067
        L_0x0065:
            r5 = r27
        L_0x0067:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0080
            r7 = r36 & 8
            if (r7 != 0) goto L_0x007a
            r7 = r29
            boolean r9 = r14.q(r7)
            if (r9 == 0) goto L_0x007c
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r7 = r29
        L_0x007c:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r2 = r2 | r9
            goto L_0x0082
        L_0x0080:
            r7 = r29
        L_0x0082:
            r9 = r36 & 16
            r10 = 57344(0xe000, float:8.0356E-41)
            if (r9 == 0) goto L_0x008c
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008c:
            r11 = r13 & r10
            if (r11 != 0) goto L_0x009f
            r11 = r31
            boolean r15 = r14.k(r11)
            if (r15 == 0) goto L_0x009b
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r2 = r2 | r15
            goto L_0x00a1
        L_0x009f:
            r11 = r31
        L_0x00a1:
            r15 = r36 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00ae
            r17 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r17
            r10 = r32
            goto L_0x00c1
        L_0x00ae:
            r17 = r13 & r16
            r10 = r32
            if (r17 != 0) goto L_0x00c1
            boolean r17 = r14.n(r10)
            if (r17 == 0) goto L_0x00bd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r2 = r2 | r17
        L_0x00c1:
            r17 = r36 & 64
            if (r17 == 0) goto L_0x00ca
            r17 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c7:
            r2 = r2 | r17
            goto L_0x00dc
        L_0x00ca:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r17
            if (r17 != 0) goto L_0x00dc
            boolean r17 = r14.k(r12)
            if (r17 == 0) goto L_0x00d9
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00d9:
            r17 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c7
        L_0x00dc:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r17 = r2 & r17
            r18 = 599186(0x92492, float:8.39638E-40)
            r17 = r17 ^ r18
            if (r17 != 0) goto L_0x00f9
            boolean r17 = r14.b()
            if (r17 != 0) goto L_0x00ef
            goto L_0x00f9
        L_0x00ef:
            r14.h()
            r2 = r4
            r3 = r5
            r5 = r7
            r8 = r10
            r7 = r11
            goto L_0x01b4
        L_0x00f9:
            r14.H()
            r17 = r13 & 1
            r1 = 0
            if (r17 == 0) goto L_0x0124
            boolean r17 = r14.i()
            if (r17 == 0) goto L_0x0108
            goto L_0x0124
        L_0x0108:
            r14.h()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0111
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0111:
            r0 = r36 & 8
            if (r0 == 0) goto L_0x0117
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0117:
            r15 = r25
        L_0x0119:
            r17 = r4
            r19 = r5
            r21 = r7
            r24 = r10
        L_0x0121:
            r23 = r11
            goto L_0x0167
        L_0x0124:
            if (r0 == 0) goto L_0x0129
            p0.d$a r0 = p0.d.f16037h0
            goto L_0x012b
        L_0x0129:
            r0 = r25
        L_0x012b:
            if (r3 == 0) goto L_0x0132
            u0.j1 r3 = u0.c1.a()
            r4 = r3
        L_0x0132:
            r3 = r36 & 4
            if (r3 == 0) goto L_0x0143
            c0.q r3 = c0.q.f12737a
            r5 = 6
            c0.c r3 = r3.a(r14, r5)
            long r5 = r3.n()
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0143:
            r3 = r36 & 8
            if (r3 == 0) goto L_0x0151
            int r3 = r2 >> 6
            r3 = r3 & 14
            long r7 = androidx.compose.material.ColorsKt.b(r5, r14, r3)
            r2 = r2 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0151:
            if (r9 == 0) goto L_0x0154
            r11 = 0
        L_0x0154:
            if (r15 == 0) goto L_0x0165
            float r3 = (float) r1
            float r3 = d2.h.n(r3)
            r15 = r0
            r24 = r3
            r17 = r4
            r19 = r5
            r21 = r7
            goto L_0x0121
        L_0x0165:
            r15 = r0
            goto L_0x0119
        L_0x0167:
            r14.A()
            p0.d$a r0 = p0.d.f16037h0
            androidx.compose.material.SurfaceKt$Surface$1 r3 = androidx.compose.material.SurfaceKt$Surface$1.f5417a
            p0.d r0 = androidx.compose.ui.semantics.SemanticsModifierKt.b(r0, r1, r3)
            bp0.k r1 = bp0.k.f22762a
            androidx.compose.material.SurfaceKt$Surface$2 r3 = new androidx.compose.material.SurfaceKt$Surface$2
            r4 = 0
            r3.<init>(r4)
            p0.d r8 = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.c(r0, r1, r3)
            r0 = r2 & 14
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r1 = r2 & r16
            r0 = r0 | r1
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            int r2 = r2 << 3
            r1 = r1 & r2
            r11 = r0 | r1
            r0 = r15
            r1 = r17
            r2 = r19
            r4 = r21
            r6 = r23
            r7 = r24
            r9 = r33
            r10 = r14
            c(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11)
            r1 = r15
            r2 = r17
            r3 = r19
            r5 = r21
            r7 = r23
            r8 = r24
        L_0x01b4:
            e0.s0 r14 = r14.v()
            if (r14 != 0) goto L_0x01bb
            goto L_0x01ca
        L_0x01bb:
            androidx.compose.material.SurfaceKt$Surface$3 r15 = new androidx.compose.material.SurfaceKt$Surface$3
            r0 = r15
            r9 = r33
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r14.a(r15)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.b(p0.d, u0.j1, long, long, s.b, float, lp0.p, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void c(d dVar, j1 j1Var, long j, long j11, b bVar, float f11, d dVar2, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        g gVar2;
        long j12 = j;
        float f12 = f11;
        int i13 = i11;
        g t = gVar.t(-750961828);
        d dVar3 = dVar;
        if ((i13 & 14) == 0) {
            i12 = (t.k(dVar3) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        j1 j1Var2 = j1Var;
        if ((i13 & 112) == 0) {
            i12 |= t.k(j1Var2) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i12 |= t.q(j12) ? 256 : 128;
        }
        long j13 = j11;
        if ((i13 & 7168) == 0) {
            i12 |= t.q(j13) ? 2048 : 1024;
        }
        b bVar2 = bVar;
        if ((57344 & i13) == 0) {
            i12 |= t.k(bVar2) ? 16384 : 8192;
        }
        if ((458752 & i13) == 0) {
            i12 |= t.n(f12) ? PDChoice.FLAG_COMBO : PDButton.FLAG_PUSHBUTTON;
        }
        d dVar4 = dVar2;
        if ((3670016 & i13) == 0) {
            i12 |= t.k(dVar4) ? 1048576 : 524288;
        }
        p<? super g, ? super Integer, k> pVar2 = pVar;
        if ((29360128 & i13) == 0) {
            i12 |= t.k(pVar2) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if (((i14 & 23967451) ^ 4793490) != 0 || !t.b()) {
            j jVar = (j) t.z(ElevationOverlayKt.d());
            float n = h.n(((h) t.z(ElevationOverlayKt.c())).s() + f12);
            t.E(-750961449);
            long a11 = (!d0.n(j12, q.f12737a.a(t, 6).n()) || jVar == null) ? j12 : jVar.a(j, n, t, (i14 >> 6) & 14);
            t.P();
            gVar2 = t;
            CompositionLocalKt.a(new n0[]{ContentColorKt.a().c(d0.h(j11)), ElevationOverlayKt.c().c(h.k(n))}, l0.b.b(gVar2, -819902018, true, new SurfaceKt$Surface$6(dVar, f11, j1Var, bVar, a11, dVar2, pVar, i14)), gVar2, 56);
        } else {
            t.h();
            gVar2 = t;
        }
        s0 v = gVar2.v();
        if (v != null) {
            v.a(new SurfaceKt$Surface$7(dVar, j1Var, j, j11, bVar, f11, dVar2, pVar, i11));
        }
    }
}
