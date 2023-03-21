package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.g;
import bp0.k;
import e0.m0;
import e0.n0;
import e0.s0;
import lp0.p;
import p1.c0;

/* compiled from: Text.kt */
public final class TextKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<c0> f5728a = CompositionLocalKt.b(g.o(), TextKt$LocalTextStyle$1.f5729a);

    public static final void a(c0 c0Var, p<? super e0.g, ? super Integer, k> pVar, e0.g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(c0Var, "value");
        kotlin.jvm.internal.p.j(pVar, "content");
        e0.g t = gVar.t(1919620829);
        if ((i11 & 14) == 0) {
            i12 = (t.k(c0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(pVar) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) != 0 || !t.b()) {
            m0 m0Var = f5728a;
            CompositionLocalKt.a(new n0[]{m0Var.c(((c0) t.z(m0Var)).C(c0Var))}, pVar, t, (i12 & 112) | 8);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new TextKt$ProvideTextStyle$1(c0Var, pVar, i11));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(p1.b r59, p0.d r60, long r61, long r63, u1.s r65, u1.v r66, u1.i r67, long r68, a2.e r70, a2.d r71, long r72, int r74, boolean r75, int r76, java.util.Map<java.lang.String, a0.a> r77, lp0.l<? super p1.y, bp0.k> r78, p1.c0 r79, e0.g r80, int r81, int r82, int r83) {
        /*
            r1 = r59
            r14 = r81
            r15 = r82
            r13 = r83
            java.lang.String r0 = "text"
            kotlin.jvm.internal.p.j(r1, r0)
            r0 = 1557617449(0x5cd75b29, float:4.84938813E17)
            r2 = r80
            e0.g r0 = r2.t(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r2 = r14 & 14
            if (r2 != 0) goto L_0x002c
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0029
            r2 = 4
            goto L_0x002a
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r14
            goto L_0x002d
        L_0x002c:
            r2 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0034
            r2 = r2 | 48
            goto L_0x0047
        L_0x0034:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0047
            r8 = r60
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r2 = r2 | r9
            goto L_0x0049
        L_0x0047:
            r8 = r60
        L_0x0049:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            r3 = r61
            goto L_0x0065
        L_0x0052:
            r12 = r14 & 896(0x380, float:1.256E-42)
            r3 = r61
            if (r12 != 0) goto L_0x0065
            boolean r16 = r0.q(r3)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r16
        L_0x0065:
            r16 = r13 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0072
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r7 = r63
            goto L_0x0085
        L_0x0072:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            r7 = r63
            if (r6 != 0) goto L_0x0085
            boolean r20 = r0.q(r7)
            if (r20 == 0) goto L_0x0081
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r2 = r2 | r20
        L_0x0085:
            r20 = r13 & 16
            if (r20 == 0) goto L_0x008e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r10 = r65
            goto L_0x00a4
        L_0x008e:
            r22 = 57344(0xe000, float:8.0356E-41)
            r22 = r14 & r22
            r10 = r65
            if (r22 != 0) goto L_0x00a4
            boolean r23 = r0.k(r10)
            if (r23 == 0) goto L_0x00a0
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00a2:
            r2 = r2 | r23
        L_0x00a4:
            r23 = r13 & 32
            r24 = 458752(0x70000, float:6.42848E-40)
            r25 = 65536(0x10000, float:9.18355E-41)
            if (r23 == 0) goto L_0x00b3
            r26 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r26
            r11 = r66
            goto L_0x00c6
        L_0x00b3:
            r26 = r14 & r24
            r11 = r66
            if (r26 != 0) goto L_0x00c6
            boolean r27 = r0.k(r11)
            if (r27 == 0) goto L_0x00c2
            r27 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r2 = r2 | r27
        L_0x00c6:
            r27 = r13 & 64
            r28 = 3670016(0x380000, float:5.142788E-39)
            if (r27 == 0) goto L_0x00d3
            r29 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r29
            r12 = r67
            goto L_0x00e6
        L_0x00d3:
            r29 = r14 & r28
            r12 = r67
            if (r29 != 0) goto L_0x00e6
            boolean r30 = r0.k(r12)
            if (r30 == 0) goto L_0x00e2
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e4
        L_0x00e2:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00e4:
            r2 = r2 | r30
        L_0x00e6:
            r6 = r13 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00f1
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r31
            r3 = r68
            goto L_0x0106
        L_0x00f1:
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r31 = r14 & r31
            r3 = r68
            if (r31 != 0) goto L_0x0106
            boolean r31 = r0.q(r3)
            if (r31 == 0) goto L_0x0102
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r2 = r2 | r31
        L_0x0106:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0111
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r31
            r3 = r70
            goto L_0x0125
        L_0x0111:
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r31 = r14 & r31
            r3 = r70
            if (r31 != 0) goto L_0x0125
            boolean r4 = r0.k(r3)
            if (r4 == 0) goto L_0x0122
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0124
        L_0x0122:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0124:
            r2 = r2 | r4
        L_0x0125:
            r4 = r13 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0130
            r31 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r31
            r3 = r71
            goto L_0x0145
        L_0x0130:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r14 & r31
            r3 = r71
            if (r31 != 0) goto L_0x0145
            boolean r31 = r0.k(r3)
            if (r31 == 0) goto L_0x0141
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0143
        L_0x0141:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0143:
            r2 = r2 | r31
        L_0x0145:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x014e
            r29 = r15 | 6
            r7 = r72
            goto L_0x0164
        L_0x014e:
            r31 = r15 & 14
            r7 = r72
            if (r31 != 0) goto L_0x0162
            boolean r31 = r0.q(r7)
            if (r31 == 0) goto L_0x015d
            r29 = 4
            goto L_0x015f
        L_0x015d:
            r29 = 2
        L_0x015f:
            r29 = r15 | r29
            goto L_0x0164
        L_0x0162:
            r29 = r15
        L_0x0164:
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x016b
            r29 = r29 | 48
            goto L_0x0181
        L_0x016b:
            r8 = r15 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x017f
            r8 = r74
            boolean r31 = r0.p(r8)
            if (r31 == 0) goto L_0x017a
            r19 = 32
            goto L_0x017c
        L_0x017a:
            r19 = 16
        L_0x017c:
            r29 = r29 | r19
            goto L_0x0181
        L_0x017f:
            r8 = r74
        L_0x0181:
            r8 = r29
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x018a
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x019e
        L_0x018a:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x019e
            r11 = r75
            boolean r19 = r0.m(r11)
            if (r19 == 0) goto L_0x0199
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019b
        L_0x0199:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019b:
            r8 = r8 | r26
            goto L_0x01a0
        L_0x019e:
            r11 = r75
        L_0x01a0:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01a7
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b9
        L_0x01a7:
            r12 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x01b9
            r12 = r76
            boolean r19 = r0.p(r12)
            if (r19 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01b6:
            r8 = r8 | r17
            goto L_0x01bb
        L_0x01b9:
            r12 = r76
        L_0x01bb:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x01c1
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x01c1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x01cd
            r18 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 | r18
            goto L_0x01e3
        L_0x01cd:
            r18 = r15 & r24
            if (r18 != 0) goto L_0x01e3
            r18 = r11
            r11 = r78
            boolean r19 = r0.k(r11)
            if (r19 == 0) goto L_0x01de
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e0
        L_0x01de:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x01e0:
            r8 = r8 | r19
            goto L_0x01e7
        L_0x01e3:
            r18 = r11
            r11 = r78
        L_0x01e7:
            r19 = r15 & r28
            if (r19 != 0) goto L_0x01ff
            r19 = r13 & r25
            r11 = r79
            if (r19 != 0) goto L_0x01fa
            boolean r19 = r0.k(r11)
            if (r19 == 0) goto L_0x01fa
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fc
        L_0x01fa:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x01fc:
            r8 = r8 | r19
            goto L_0x0201
        L_0x01ff:
            r11 = r79
        L_0x0201:
            int r11 = ~r13
            r15 = 16384(0x4000, float:2.2959E-41)
            r11 = r11 & r15
            if (r11 != 0) goto L_0x0247
            r11 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r11 & r2
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r11 = r11 ^ r15
            if (r11 != 0) goto L_0x0247
            r11 = 2995931(0x2db6db, float:4.198194E-39)
            r11 = r11 & r8
            r15 = 599186(0x92492, float:8.39638E-40)
            r11 = r11 ^ r15
            if (r11 != 0) goto L_0x0247
            boolean r11 = r0.b()
            if (r11 != 0) goto L_0x0222
            goto L_0x0247
        L_0x0222:
            r0.h()
            r2 = r60
            r3 = r61
            r5 = r63
            r7 = r65
            r8 = r66
            r9 = r67
            r10 = r68
            r12 = r70
            r13 = r71
            r15 = r72
            r17 = r74
            r18 = r75
            r19 = r76
            r20 = r77
            r21 = r78
            r22 = r79
            goto L_0x0429
        L_0x0247:
            r0.H()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x028a
            boolean r11 = r0.i()
            if (r11 == 0) goto L_0x0255
            goto L_0x028a
        L_0x0255:
            r0.h()
            if (r12 == 0) goto L_0x025e
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r1
        L_0x025e:
            r1 = r13 & r25
            if (r1 == 0) goto L_0x0266
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r1
        L_0x0266:
            r5 = r60
            r21 = r61
            r3 = r63
            r11 = r65
            r16 = r66
            r19 = r67
            r26 = r68
            r1 = r70
            r9 = r71
            r6 = r72
            r10 = r75
            r12 = r76
            r15 = r77
            r17 = r78
            r71 = r79
            r18 = r8
            r8 = r74
            goto L_0x032e
        L_0x028a:
            if (r5 == 0) goto L_0x028f
            p0.d$a r5 = p0.d.f16037h0
            goto L_0x0291
        L_0x028f:
            r5 = r60
        L_0x0291:
            if (r9 == 0) goto L_0x029a
            u0.d0$a r9 = u0.d0.f16756b
            long r21 = r9.f()
            goto L_0x029c
        L_0x029a:
            r21 = r61
        L_0x029c:
            if (r16 == 0) goto L_0x02a5
            d2.r$a r9 = d2.r.f14022b
            long r29 = r9.a()
            goto L_0x02a7
        L_0x02a5:
            r29 = r63
        L_0x02a7:
            r9 = 0
            if (r20 == 0) goto L_0x02ac
            r11 = r9
            goto L_0x02ae
        L_0x02ac:
            r11 = r65
        L_0x02ae:
            if (r23 == 0) goto L_0x02b3
            r16 = r9
            goto L_0x02b5
        L_0x02b3:
            r16 = r66
        L_0x02b5:
            if (r27 == 0) goto L_0x02ba
            r19 = r9
            goto L_0x02bc
        L_0x02ba:
            r19 = r67
        L_0x02bc:
            if (r6 == 0) goto L_0x02c5
            d2.r$a r6 = d2.r.f14022b
            long r26 = r6.a()
            goto L_0x02c7
        L_0x02c5:
            r26 = r68
        L_0x02c7:
            if (r1 == 0) goto L_0x02cb
            r1 = r9
            goto L_0x02cd
        L_0x02cb:
            r1 = r70
        L_0x02cd:
            if (r4 == 0) goto L_0x02d0
            goto L_0x02d2
        L_0x02d0:
            r9 = r71
        L_0x02d2:
            if (r3 == 0) goto L_0x02db
            d2.r$a r3 = d2.r.f14022b
            long r3 = r3.a()
            goto L_0x02dd
        L_0x02db:
            r3 = r72
        L_0x02dd:
            if (r7 == 0) goto L_0x02e6
            a2.l$a r6 = a2.l.f950a
            int r6 = r6.a()
            goto L_0x02e8
        L_0x02e6:
            r6 = r74
        L_0x02e8:
            if (r10 == 0) goto L_0x02ec
            r7 = 1
            goto L_0x02ee
        L_0x02ec:
            r7 = r75
        L_0x02ee:
            if (r18 == 0) goto L_0x02f4
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02f6
        L_0x02f4:
            r10 = r76
        L_0x02f6:
            if (r12 == 0) goto L_0x0302
            java.util.Map r12 = kotlin.collections.x.f()
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r8 = r8 & r18
            goto L_0x0304
        L_0x0302:
            r12 = r77
        L_0x0304:
            if (r17 == 0) goto L_0x0309
            androidx.compose.material.TextKt$Text$3 r17 = androidx.compose.material.TextKt$Text$3.f5749a
            goto L_0x030b
        L_0x0309:
            r17 = r78
        L_0x030b:
            r18 = r13 & r25
            if (r18 == 0) goto L_0x0323
            e0.m0<p1.c0> r15 = f5728a
            java.lang.Object r15 = r0.z(r15)
            p1.c0 r15 = (p1.c0) r15
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r8 = r8 & r18
            r18 = r8
            r71 = r15
            r8 = r6
            r15 = r12
            goto L_0x0329
        L_0x0323:
            r71 = r79
            r18 = r8
            r15 = r12
            r8 = r6
        L_0x0329:
            r12 = r10
            r10 = r7
            r6 = r3
            r3 = r29
        L_0x032e:
            r0.A()
            r13 = 1557618192(0x5cd75e10, float:4.84964342E17)
            r0.E(r13)
            u0.d0$a r13 = u0.d0.f16756b
            long r29 = r13.f()
            int r20 = (r21 > r29 ? 1 : (r21 == r29 ? 0 : -1))
            if (r20 == 0) goto L_0x0344
            r20 = 1
            goto L_0x0346
        L_0x0344:
            r20 = 0
        L_0x0346:
            if (r20 == 0) goto L_0x034b
            r30 = r21
            goto L_0x0397
        L_0x034b:
            long r29 = r71.g()
            long r31 = r13.f()
            int r13 = (r29 > r31 ? 1 : (r29 == r31 ? 0 : -1))
            if (r13 == 0) goto L_0x0359
            r13 = 1
            goto L_0x035a
        L_0x0359:
            r13 = 0
        L_0x035a:
            if (r13 == 0) goto L_0x035d
            goto L_0x0395
        L_0x035d:
            e0.m0 r13 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r13 = r0.z(r13)
            u0.d0 r13 = (u0.d0) r13
            long r29 = r13.v()
            e0.m0 r13 = androidx.compose.material.ContentAlphaKt.a()
            java.lang.Object r13 = r0.z(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r20 = 0
            r23 = 0
            r25 = 0
            r31 = 14
            r32 = 0
            r60 = r29
            r62 = r13
            r63 = r20
            r64 = r23
            r65 = r25
            r66 = r31
            r67 = r32
            long r29 = u0.d0.l(r60, r62, r63, r64, r65, r66, r67)
        L_0x0395:
            r30 = r29
        L_0x0397:
            r0.P()
            p1.c0 r13 = new p1.c0
            r29 = r13
            r36 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r47 = 0
            r49 = 0
            r52 = 0
            r53 = 175952(0x2af50, float:2.46561E-40)
            r54 = 0
            r32 = r3
            r34 = r16
            r35 = r11
            r37 = r19
            r39 = r26
            r46 = r1
            r48 = r9
            r50 = r6
            r29.<init>(r30, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r46, r47, r48, r49, r50, r52, r53, r54)
            r72 = r1
            r1 = r71
            p1.c0 r13 = r1.C(r13)
            r20 = 16777216(0x1000000, float:2.3509887E-38)
            r23 = r2 & 14
            r20 = r23 | r20
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r20 | r2
            r20 = r1
            int r1 = r18 >> 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            int r18 = r18 << 9
            r2 = r18 & r2
            r1 = r1 | r2
            r2 = r18 & r24
            r1 = r1 | r2
            r2 = r18 & r28
            r1 = r1 | r2
            r2 = 0
            r60 = r59
            r61 = r5
            r62 = r13
            r63 = r17
            r64 = r8
            r65 = r10
            r66 = r12
            r67 = r15
            r68 = r0
            r69 = r1
            r70 = r2
            androidx.compose.foundation.text.BasicTextKt.a(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r2 = r5
            r13 = r9
            r18 = r10
            r9 = r19
            r19 = r12
            r12 = r72
            r56 = r17
            r17 = r8
            r8 = r16
            r57 = r6
            r7 = r11
            r5 = r3
            r3 = r21
            r10 = r26
            r21 = r56
            r22 = r20
            r20 = r15
            r15 = r57
        L_0x0429:
            e0.s0 r1 = r0.v()
            if (r1 != 0) goto L_0x0430
            goto L_0x0455
        L_0x0430:
            androidx.compose.material.TextKt$Text$4 r0 = new androidx.compose.material.TextKt$Text$4
            r60 = r0
            r55 = r1
            r1 = r59
            r14 = r15
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r81
            r23 = r82
            r24 = r83
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r60
            r0 = r55
            r0.a(r1)
        L_0x0455:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.b(p1.b, p0.d, long, long, u1.s, u1.v, u1.i, long, a2.e, a2.d, long, int, boolean, int, java.util.Map, lp0.l, p1.c0, e0.g, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.String r61, p0.d r62, long r63, long r65, u1.s r67, u1.v r68, u1.i r69, long r70, a2.e r72, a2.d r73, long r74, int r76, boolean r77, int r78, lp0.l<? super p1.y, bp0.k> r79, p1.c0 r80, e0.g r81, int r82, int r83, int r84) {
        /*
            r1 = r61
            r14 = r82
            r15 = r83
            r13 = r84
            java.lang.String r0 = "text"
            kotlin.jvm.internal.p.j(r1, r0)
            r0 = 1557612414(0x5cd7477e, float:4.84765812E17)
            r2 = r81
            e0.g r0 = r2.t(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r2 = r14 & 14
            if (r2 != 0) goto L_0x002c
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0029
            r2 = 4
            goto L_0x002a
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r14
            goto L_0x002d
        L_0x002c:
            r2 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0034
            r2 = r2 | 48
            goto L_0x0047
        L_0x0034:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0047
            r8 = r62
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r2 = r2 | r9
            goto L_0x0049
        L_0x0047:
            r8 = r62
        L_0x0049:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            r3 = r63
            goto L_0x0065
        L_0x0052:
            r12 = r14 & 896(0x380, float:1.256E-42)
            r3 = r63
            if (r12 != 0) goto L_0x0065
            boolean r16 = r0.q(r3)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r16
        L_0x0065:
            r16 = r13 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0072
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r7 = r65
            goto L_0x0085
        L_0x0072:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            r7 = r65
            if (r6 != 0) goto L_0x0085
            boolean r20 = r0.q(r7)
            if (r20 == 0) goto L_0x0081
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r2 = r2 | r20
        L_0x0085:
            r20 = r13 & 16
            r21 = 16384(0x4000, float:2.2959E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 57344(0xe000, float:8.0356E-41)
            if (r20 == 0) goto L_0x0095
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r6 = r67
            goto L_0x00a8
        L_0x0095:
            r24 = r14 & r23
            r6 = r67
            if (r24 != 0) goto L_0x00a8
            boolean r25 = r0.k(r6)
            if (r25 == 0) goto L_0x00a4
            r25 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r25 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r2 = r2 | r25
        L_0x00a8:
            r25 = r13 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            if (r25 == 0) goto L_0x00b5
            r27 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r27
            r10 = r68
            goto L_0x00c8
        L_0x00b5:
            r27 = r14 & r26
            r10 = r68
            if (r27 != 0) goto L_0x00c8
            boolean r28 = r0.k(r10)
            if (r28 == 0) goto L_0x00c4
            r28 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r2 = r2 | r28
        L_0x00c8:
            r28 = r13 & 64
            if (r28 == 0) goto L_0x00d3
            r29 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r29
            r11 = r69
            goto L_0x00e8
        L_0x00d3:
            r29 = 3670016(0x380000, float:5.142788E-39)
            r29 = r14 & r29
            r11 = r69
            if (r29 != 0) goto L_0x00e8
            boolean r30 = r0.k(r11)
            if (r30 == 0) goto L_0x00e4
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r2 = r2 | r30
        L_0x00e8:
            r12 = r13 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00f3
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r31
            r3 = r70
            goto L_0x0108
        L_0x00f3:
            r31 = 29360128(0x1c00000, float:7.052966E-38)
            r31 = r14 & r31
            r3 = r70
            if (r31 != 0) goto L_0x0108
            boolean r31 = r0.q(r3)
            if (r31 == 0) goto L_0x0104
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r2 = r2 | r31
        L_0x0108:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0113
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r31
            r3 = r72
            goto L_0x0127
        L_0x0113:
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r31 = r14 & r31
            r3 = r72
            if (r31 != 0) goto L_0x0127
            boolean r4 = r0.k(r3)
            if (r4 == 0) goto L_0x0124
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0126
        L_0x0124:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0126:
            r2 = r2 | r4
        L_0x0127:
            r4 = r13 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0132
            r31 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r31
            r3 = r73
            goto L_0x0147
        L_0x0132:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r14 & r31
            r3 = r73
            if (r31 != 0) goto L_0x0147
            boolean r31 = r0.k(r3)
            if (r31 == 0) goto L_0x0143
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r2 = r2 | r31
        L_0x0147:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0150
            r30 = r15 | 6
            r6 = r74
            goto L_0x0166
        L_0x0150:
            r31 = r15 & 14
            r6 = r74
            if (r31 != 0) goto L_0x0164
            boolean r8 = r0.q(r6)
            if (r8 == 0) goto L_0x015f
            r30 = 4
            goto L_0x0161
        L_0x015f:
            r30 = 2
        L_0x0161:
            r30 = r15 | r30
            goto L_0x0166
        L_0x0164:
            r30 = r15
        L_0x0166:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x016f
            r30 = r30 | 48
            r6 = r76
            goto L_0x0182
        L_0x016f:
            r31 = r15 & 112(0x70, float:1.57E-43)
            r6 = r76
            if (r31 != 0) goto L_0x0182
            boolean r7 = r0.p(r6)
            if (r7 == 0) goto L_0x017e
            r24 = 32
            goto L_0x0180
        L_0x017e:
            r24 = 16
        L_0x0180:
            r30 = r30 | r24
        L_0x0182:
            r7 = r30
            r6 = r13 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x018b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019f
        L_0x018b:
            r10 = r15 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x019f
            r10 = r77
            boolean r19 = r0.m(r10)
            if (r19 == 0) goto L_0x019a
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x019c
        L_0x019a:
            r27 = 128(0x80, float:1.794E-43)
        L_0x019c:
            r7 = r7 | r27
            goto L_0x01a1
        L_0x019f:
            r10 = r77
        L_0x01a1:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a8
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01ba
        L_0x01a8:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01ba
            r11 = r78
            boolean r19 = r0.p(r11)
            if (r19 == 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01b7:
            r7 = r7 | r17
            goto L_0x01bc
        L_0x01ba:
            r11 = r78
        L_0x01bc:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c3
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01d7
        L_0x01c3:
            r17 = r15 & r23
            if (r17 != 0) goto L_0x01d7
            r17 = r11
            r11 = r79
            boolean r18 = r0.k(r11)
            if (r18 == 0) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x01d4:
            r7 = r7 | r21
            goto L_0x01db
        L_0x01d7:
            r17 = r11
            r11 = r79
        L_0x01db:
            r18 = r15 & r26
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01f6
            r18 = r13 & r19
            r11 = r80
            if (r18 != 0) goto L_0x01f1
            boolean r18 = r0.k(r11)
            if (r18 == 0) goto L_0x01f1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f3
        L_0x01f1:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f3:
            r7 = r7 | r18
            goto L_0x01f8
        L_0x01f6:
            r11 = r80
        L_0x01f8:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r18 = r2 & r18
            r21 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = r18 ^ r21
            if (r18 != 0) goto L_0x023a
            r18 = 374491(0x5b6db, float:5.24774E-40)
            r18 = r7 & r18
            r21 = 74898(0x12492, float:1.04954E-40)
            r18 = r18 ^ r21
            if (r18 != 0) goto L_0x023a
            boolean r18 = r0.b()
            if (r18 != 0) goto L_0x0217
            goto L_0x023a
        L_0x0217:
            r0.h()
            r2 = r62
            r3 = r63
            r5 = r65
            r7 = r67
            r8 = r68
            r9 = r69
            r12 = r72
            r13 = r73
            r16 = r74
            r18 = r76
            r19 = r77
            r20 = r78
            r21 = r79
            r22 = r11
            r10 = r70
            goto L_0x03fa
        L_0x023a:
            r0.H()
            r18 = r14 & 1
            r21 = 1
            if (r18 == 0) goto L_0x0277
            boolean r18 = r0.i()
            if (r18 == 0) goto L_0x024a
            goto L_0x0277
        L_0x024a:
            r0.h()
            r1 = r13 & r19
            if (r1 == 0) goto L_0x0255
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r1
        L_0x0255:
            r5 = r62
            r29 = r63
            r3 = r65
            r16 = r67
            r18 = r68
            r20 = r69
            r24 = r70
            r1 = r72
            r9 = r73
            r8 = r76
            r10 = r77
            r12 = r79
            r17 = r7
            r72 = r11
            r6 = r74
            r11 = r78
            goto L_0x0305
        L_0x0277:
            if (r5 == 0) goto L_0x027c
            p0.d$a r5 = p0.d.f16037h0
            goto L_0x027e
        L_0x027c:
            r5 = r62
        L_0x027e:
            if (r9 == 0) goto L_0x0287
            u0.d0$a r9 = u0.d0.f16756b
            long r29 = r9.f()
            goto L_0x0289
        L_0x0287:
            r29 = r63
        L_0x0289:
            if (r16 == 0) goto L_0x0292
            d2.r$a r9 = d2.r.f14022b
            long r31 = r9.a()
            goto L_0x0294
        L_0x0292:
            r31 = r65
        L_0x0294:
            r9 = 0
            if (r20 == 0) goto L_0x029a
            r16 = r9
            goto L_0x029c
        L_0x029a:
            r16 = r67
        L_0x029c:
            if (r25 == 0) goto L_0x02a1
            r18 = r9
            goto L_0x02a3
        L_0x02a1:
            r18 = r68
        L_0x02a3:
            if (r28 == 0) goto L_0x02a8
            r20 = r9
            goto L_0x02aa
        L_0x02a8:
            r20 = r69
        L_0x02aa:
            if (r12 == 0) goto L_0x02b3
            d2.r$a r12 = d2.r.f14022b
            long r24 = r12.a()
            goto L_0x02b5
        L_0x02b3:
            r24 = r70
        L_0x02b5:
            if (r1 == 0) goto L_0x02b9
            r1 = r9
            goto L_0x02bb
        L_0x02b9:
            r1 = r72
        L_0x02bb:
            if (r4 == 0) goto L_0x02be
            goto L_0x02c0
        L_0x02be:
            r9 = r73
        L_0x02c0:
            if (r3 == 0) goto L_0x02c9
            d2.r$a r3 = d2.r.f14022b
            long r3 = r3.a()
            goto L_0x02cb
        L_0x02c9:
            r3 = r74
        L_0x02cb:
            if (r8 == 0) goto L_0x02d4
            a2.l$a r8 = a2.l.f950a
            int r8 = r8.a()
            goto L_0x02d6
        L_0x02d4:
            r8 = r76
        L_0x02d6:
            if (r6 == 0) goto L_0x02da
            r6 = 1
            goto L_0x02dc
        L_0x02da:
            r6 = r77
        L_0x02dc:
            if (r10 == 0) goto L_0x02e2
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02e4
        L_0x02e2:
            r10 = r78
        L_0x02e4:
            if (r17 == 0) goto L_0x02e9
            androidx.compose.material.TextKt$Text$1 r12 = androidx.compose.material.TextKt$Text$1.f5733a
            goto L_0x02eb
        L_0x02e9:
            r12 = r79
        L_0x02eb:
            r17 = r13 & r19
            if (r17 == 0) goto L_0x02fc
            e0.m0<p1.c0> r11 = f5728a
            java.lang.Object r11 = r0.z(r11)
            p1.c0 r11 = (p1.c0) r11
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r17
        L_0x02fc:
            r17 = r7
            r72 = r11
            r11 = r10
            r10 = r6
            r6 = r3
            r3 = r31
        L_0x0305:
            r0.A()
            r13 = 1557613088(0x5cd74a20, float:4.8478897E17)
            r0.E(r13)
            u0.d0$a r13 = u0.d0.f16756b
            long r27 = r13.f()
            int r19 = (r29 > r27 ? 1 : (r29 == r27 ? 0 : -1))
            if (r19 == 0) goto L_0x031b
            r19 = 1
            goto L_0x031d
        L_0x031b:
            r19 = 0
        L_0x031d:
            if (r19 == 0) goto L_0x0322
            r32 = r29
            goto L_0x036e
        L_0x0322:
            long r27 = r72.g()
            long r31 = r13.f()
            int r13 = (r27 > r31 ? 1 : (r27 == r31 ? 0 : -1))
            if (r13 == 0) goto L_0x032f
            goto L_0x0331
        L_0x032f:
            r21 = 0
        L_0x0331:
            if (r21 == 0) goto L_0x0334
            goto L_0x036c
        L_0x0334:
            e0.m0 r13 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r13 = r0.z(r13)
            u0.d0 r13 = (u0.d0) r13
            long r21 = r13.v()
            e0.m0 r13 = androidx.compose.material.ContentAlphaKt.a()
            java.lang.Object r13 = r0.z(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r19 = 0
            r27 = 0
            r28 = 0
            r31 = 14
            r32 = 0
            r62 = r21
            r64 = r13
            r65 = r19
            r66 = r27
            r67 = r28
            r68 = r31
            r69 = r32
            long r27 = u0.d0.l(r62, r64, r65, r66, r67, r68, r69)
        L_0x036c:
            r32 = r27
        L_0x036e:
            r0.P()
            p1.c0 r13 = new p1.c0
            r31 = r13
            r38 = 0
            r40 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r49 = 0
            r51 = 0
            r54 = 0
            r55 = 175952(0x2af50, float:2.46561E-40)
            r56 = 0
            r34 = r3
            r36 = r18
            r37 = r16
            r39 = r20
            r41 = r24
            r48 = r1
            r50 = r9
            r52 = r6
            r31.<init>(r32, r34, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r51, r52, r54, r55, r56)
            r73 = r1
            r1 = r72
            p1.c0 r13 = r1.C(r13)
            r19 = r2 & 14
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r19 | r2
            r19 = r1
            int r1 = r17 >> 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r2 = r17 << 9
            r17 = r2 & r23
            r1 = r1 | r17
            r17 = r2 & r26
            r1 = r1 | r17
            r17 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r17
            r1 = r1 | r2
            r2 = 0
            r62 = r61
            r63 = r5
            r64 = r13
            r65 = r12
            r66 = r8
            r67 = r10
            r68 = r11
            r69 = r0
            r70 = r1
            r71 = r2
            androidx.compose.foundation.text.BasicTextKt.b(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r2 = r5
            r13 = r9
            r21 = r12
            r22 = r19
            r9 = r20
            r12 = r73
            r19 = r10
            r20 = r11
            r10 = r24
            r58 = r18
            r18 = r8
            r8 = r58
            r59 = r6
            r7 = r16
            r5 = r3
            r16 = r59
            r3 = r29
        L_0x03fa:
            e0.s0 r1 = r0.v()
            if (r1 != 0) goto L_0x0401
            goto L_0x0425
        L_0x0401:
            androidx.compose.material.TextKt$Text$2 r0 = new androidx.compose.material.TextKt$Text$2
            r62 = r0
            r57 = r1
            r1 = r61
            r14 = r16
            r16 = r18
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r22
            r21 = r82
            r22 = r83
            r23 = r84
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r62
            r0 = r57
            r0.a(r1)
        L_0x0425:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.c(java.lang.String, p0.d, long, long, u1.s, u1.v, u1.i, long, a2.e, a2.d, long, int, boolean, int, lp0.l, p1.c0, e0.g, int, int, int):void");
    }

    public static final m0<c0> d() {
        return f5728a;
    }
}
