package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import e0.h0;

/* compiled from: BasicTextField.kt */
public final class BasicTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: lp0.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: lp0.q<lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, e0.g, java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b1, code lost:
        if (r10.k(r48) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.text.input.TextFieldValue r35, lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r36, p0.d r37, boolean r38, boolean r39, p1.c0 r40, a0.i r41, a0.g r42, boolean r43, int r44, v1.f0 r45, lp0.l<? super p1.y, bp0.k> r46, u.k r47, u0.u r48, lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k> r49, e0.g r50, int r51, int r52, int r53) {
        /*
            r15 = r35
            r14 = r36
            r13 = r51
            r12 = r52
            r11 = r53
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            r1 = r50
            e0.g r10 = r1.t(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.k(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            boolean r3 = r10.k(r14)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0065
            r8 = r37
            boolean r9 = r10.k(r8)
            if (r9 == 0) goto L_0x0061
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r9
            goto L_0x0067
        L_0x0065:
            r8 = r37
        L_0x0067:
            r9 = r11 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0072
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0086
            r1 = r38
            boolean r18 = r10.m(r1)
            if (r18 == 0) goto L_0x0081
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r38
        L_0x0088:
            r18 = r11 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 57344(0xe000, float:8.0356E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0098
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r2 = r39
            goto L_0x00ab
        L_0x0098:
            r22 = r13 & r20
            r2 = r39
            if (r22 != 0) goto L_0x00ab
            boolean r23 = r10.m(r2)
            if (r23 == 0) goto L_0x00a7
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r0 = r0 | r23
        L_0x00ab:
            r23 = r11 & 32
            r24 = 458752(0x70000, float:6.42848E-40)
            if (r23 == 0) goto L_0x00b8
            r25 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r25
            r4 = r40
            goto L_0x00cb
        L_0x00b8:
            r25 = r13 & r24
            r4 = r40
            if (r25 != 0) goto L_0x00cb
            boolean r26 = r10.k(r4)
            if (r26 == 0) goto L_0x00c7
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r0 = r0 | r26
        L_0x00cb:
            r26 = r11 & 64
            r27 = 3670016(0x380000, float:5.142788E-39)
            if (r26 == 0) goto L_0x00d8
            r28 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r28
            r5 = r41
            goto L_0x00eb
        L_0x00d8:
            r28 = r13 & r27
            r5 = r41
            if (r28 != 0) goto L_0x00eb
            boolean r29 = r10.k(r5)
            if (r29 == 0) goto L_0x00e7
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r0 = r0 | r29
        L_0x00eb:
            r6 = r11 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00f6
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r30
            r7 = r42
            goto L_0x010b
        L_0x00f6:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            r7 = r42
            if (r30 != 0) goto L_0x010b
            boolean r31 = r10.k(r7)
            if (r31 == 0) goto L_0x0107
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0109
        L_0x0107:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x0109:
            r0 = r0 | r31
        L_0x010b:
            r1 = r11 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0116
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r31
            r2 = r43
            goto L_0x012b
        L_0x0116:
            r31 = 234881024(0xe000000, float:1.5777218E-30)
            r31 = r13 & r31
            r2 = r43
            if (r31 != 0) goto L_0x012b
            boolean r31 = r10.m(r2)
            if (r31 == 0) goto L_0x0127
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r0 = r0 | r31
        L_0x012b:
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0136
            r31 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r31
            r4 = r44
            goto L_0x014b
        L_0x0136:
            r31 = 1879048192(0x70000000, float:1.58456325E29)
            r31 = r13 & r31
            r4 = r44
            if (r31 != 0) goto L_0x014b
            boolean r31 = r10.p(r4)
            if (r31 == 0) goto L_0x0147
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r0 = r0 | r31
        L_0x014b:
            r4 = r11 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0154
            r22 = r12 | 6
            r5 = r45
            goto L_0x016a
        L_0x0154:
            r31 = r12 & 14
            r5 = r45
            if (r31 != 0) goto L_0x0168
            boolean r31 = r10.k(r5)
            if (r31 == 0) goto L_0x0163
            r22 = 4
            goto L_0x0165
        L_0x0163:
            r22 = 2
        L_0x0165:
            r22 = r12 | r22
            goto L_0x016a
        L_0x0168:
            r22 = r12
        L_0x016a:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0171
            r22 = r22 | 48
            goto L_0x0184
        L_0x0171:
            r31 = r12 & 112(0x70, float:1.57E-43)
            r7 = r46
            if (r31 != 0) goto L_0x0184
            boolean r31 = r10.k(r7)
            if (r31 == 0) goto L_0x0180
            r25 = 32
            goto L_0x0182
        L_0x0180:
            r25 = 16
        L_0x0182:
            r22 = r22 | r25
        L_0x0184:
            r7 = r22
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018d
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x01a1
        L_0x018d:
            r14 = r12 & 896(0x380, float:1.256E-42)
            if (r14 != 0) goto L_0x01a1
            r14 = r47
            boolean r22 = r10.k(r14)
            if (r22 == 0) goto L_0x019c
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x019e
        L_0x019c:
            r29 = 128(0x80, float:1.794E-43)
        L_0x019e:
            r7 = r7 | r29
            goto L_0x01a3
        L_0x01a1:
            r14 = r47
        L_0x01a3:
            r14 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x01bb
            r14 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r14 != 0) goto L_0x01b4
            r14 = r48
            boolean r22 = r10.k(r14)
            if (r22 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b4:
            r14 = r48
        L_0x01b6:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x01b8:
            r7 = r7 | r16
            goto L_0x01bd
        L_0x01bb:
            r14 = r48
        L_0x01bd:
            r14 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x01c6
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r12 = r49
            goto L_0x01d7
        L_0x01c6:
            r16 = r12 & r20
            r12 = r49
            if (r16 != 0) goto L_0x01d7
            boolean r16 = r10.k(r12)
            if (r16 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01d5:
            r7 = r7 | r19
        L_0x01d7:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r16
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r15) goto L_0x0211
            r12 = 46811(0xb6db, float:6.5596E-41)
            r12 = r12 & r7
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r15) goto L_0x0211
            boolean r12 = r10.b()
            if (r12 != 0) goto L_0x01f0
            goto L_0x0211
        L_0x01f0:
            r10.h()
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r43
            r11 = r45
            r12 = r46
            r13 = r47
            r14 = r48
            r15 = r49
            r20 = r10
            r10 = r44
            goto L_0x03ac
        L_0x0211:
            r10.H()
            r12 = r13 & 1
            if (r12 == 0) goto L_0x0244
            boolean r12 = r10.i()
            if (r12 == 0) goto L_0x021f
            goto L_0x0244
        L_0x021f:
            r10.h()
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0228
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0228:
            r19 = r37
            r21 = r38
            r22 = r39
            r23 = r40
            r15 = r41
            r25 = r42
            r14 = r43
            r26 = r44
            r28 = r45
            r29 = r46
            r30 = r47
            r31 = r48
            r32 = r49
            goto L_0x0306
        L_0x0244:
            if (r3 == 0) goto L_0x0249
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x024b
        L_0x0249:
            r3 = r37
        L_0x024b:
            if (r9 == 0) goto L_0x024f
            r9 = 1
            goto L_0x0251
        L_0x024f:
            r9 = r38
        L_0x0251:
            if (r18 == 0) goto L_0x0255
            r12 = 0
            goto L_0x0257
        L_0x0255:
            r12 = r39
        L_0x0257:
            if (r23 == 0) goto L_0x0260
            p1.c0$a r16 = p1.c0.f16065d
            p1.c0 r16 = r16.a()
            goto L_0x0262
        L_0x0260:
            r16 = r40
        L_0x0262:
            if (r26 == 0) goto L_0x026b
            a0.i$a r17 = a0.i.f832e
            a0.i r17 = r17.a()
            goto L_0x026d
        L_0x026b:
            r17 = r41
        L_0x026d:
            if (r6 == 0) goto L_0x0276
            a0.g$a r6 = a0.g.f823g
            a0.g r6 = r6.a()
            goto L_0x0278
        L_0x0276:
            r6 = r42
        L_0x0278:
            if (r1 == 0) goto L_0x027c
            r1 = 0
            goto L_0x027e
        L_0x027c:
            r1 = r43
        L_0x027e:
            if (r2 == 0) goto L_0x0284
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0286
        L_0x0284:
            r2 = r44
        L_0x0286:
            if (r4 == 0) goto L_0x028f
            v1.f0$a r4 = v1.f0.f17091a
            v1.f0 r4 = r4.c()
            goto L_0x0291
        L_0x028f:
            r4 = r45
        L_0x0291:
            if (r5 == 0) goto L_0x0296
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5 r5 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5.f4250a
            goto L_0x0298
        L_0x0296:
            r5 = r46
        L_0x0298:
            if (r8 == 0) goto L_0x02b9
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r8)
            java.lang.Object r8 = r10.F()
            e0.g$a r18 = e0.g.f14172a
            java.lang.Object r15 = r18.a()
            if (r8 != r15) goto L_0x02b3
            u.k r8 = u.j.a()
            r10.y(r8)
        L_0x02b3:
            r10.P()
            u.k r8 = (u.k) r8
            goto L_0x02bb
        L_0x02b9:
            r8 = r47
        L_0x02bb:
            r15 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x02d5
            u0.k1 r15 = new u0.k1
            u0.d0$a r18 = u0.d0.f16756b
            r37 = r1
            r38 = r2
            long r1 = r18.a()
            r18 = r3
            r3 = 0
            r15.<init>(r1, r3)
            r1 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            r7 = r1
            goto L_0x02dd
        L_0x02d5:
            r37 = r1
            r38 = r2
            r18 = r3
            r15 = r48
        L_0x02dd:
            if (r14 == 0) goto L_0x02ec
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r1 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f4313a
            lp0.q r1 = r1.b()
            r14 = r37
            r26 = r38
            r32 = r1
            goto L_0x02f2
        L_0x02ec:
            r14 = r37
            r26 = r38
            r32 = r49
        L_0x02f2:
            r28 = r4
            r29 = r5
            r25 = r6
            r30 = r8
            r21 = r9
            r22 = r12
            r31 = r15
            r23 = r16
            r15 = r17
            r19 = r18
        L_0x0306:
            r10.A()
            v1.m r12 = r15.d(r14)
            r8 = r14 ^ 1
            if (r14 == 0) goto L_0x0313
            r9 = 1
            goto L_0x0315
        L_0x0313:
            r9 = r26
        L_0x0315:
            r2 = r0 & 14
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.E(r1)
            r6 = r35
            boolean r1 = r10.k(r6)
            r5 = r36
            boolean r3 = r10.k(r5)
            r1 = r1 | r3
            java.lang.Object r3 = r10.F()
            if (r1 != 0) goto L_0x0338
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0340
        L_0x0338:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1 r3 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
            r3.<init>(r6, r5)
            r10.y(r3)
        L_0x0340:
            r10.P()
            r1 = r3
            lp0.l r1 = (lp0.l) r1
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r0 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r7 << 12
            r4 = r3 & r20
            r2 = r2 | r4
            r4 = r3 & r24
            r2 = r2 | r4
            r4 = r3 & r27
            r2 = r2 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r16 = r2 | r3
            int r2 = r0 >> 18
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r0 = r0 >> 3
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = r7 & r20
            r17 = r0 | r2
            r18 = 0
            r0 = r35
            r2 = r19
            r3 = r23
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r20 = r10
            r10 = r12
            r11 = r25
            r12 = r21
            r13 = r22
            r24 = r14
            r14 = r32
            r27 = r15
            r15 = r20
            androidx.compose.foundation.text.CoreTextFieldKt.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r9 = r24
            r8 = r25
            r10 = r26
            r7 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = r32
        L_0x03ac:
            e0.s0 r2 = r20.v()
            if (r2 != 0) goto L_0x03b3
            goto L_0x03ce
        L_0x03b3:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8
            r0 = r1
            r33 = r1
            r1 = r35
            r34 = r2
            r2 = r36
            r16 = r51
            r17 = r52
            r18 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x03ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, lp0.l, p0.d, boolean, boolean, p1.c0, a0.i, a0.g, boolean, int, v1.f0, lp0.l, u.k, u0.u, lp0.q, e0.g, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: lp0.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v4, resolved type: lp0.q<lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, e0.g, java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v6, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01b1, code lost:
        if (r0.k(r51) != false) goto L_0x01b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r38, lp0.l<? super java.lang.String, bp0.k> r39, p0.d r40, boolean r41, boolean r42, p1.c0 r43, a0.i r44, a0.g r45, boolean r46, int r47, v1.f0 r48, lp0.l<? super p1.y, bp0.k> r49, u.k r50, u0.u r51, lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k> r52, e0.g r53, int r54, int r55, int r56) {
        /*
            r1 = r38
            r2 = r39
            r15 = r54
            r14 = r55
            r13 = r56
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r2, r0)
            r0 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            r3 = r53
            e0.g r0 = r3.t(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r15 | 6
            goto L_0x0034
        L_0x0024:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0033
            boolean r3 = r0.k(r1)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r15
            goto L_0x0034
        L_0x0033:
            r3 = r15
        L_0x0034:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004b
        L_0x003b:
            r6 = r15 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            boolean r6 = r0.k(r2)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r11 = r15 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0065
            r11 = r40
            boolean r12 = r0.k(r11)
            if (r12 == 0) goto L_0x0061
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r12
            goto L_0x0067
        L_0x0065:
            r11 = r40
        L_0x0067:
            r12 = r13 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0072
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0072:
            r4 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0086
            r4 = r41
            boolean r18 = r0.m(r4)
            if (r18 == 0) goto L_0x0081
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r3 = r3 | r18
            goto L_0x0088
        L_0x0086:
            r4 = r41
        L_0x0088:
            r18 = r13 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 57344(0xe000, float:8.0356E-41)
            r21 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0098
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r7 = r42
            goto L_0x00ab
        L_0x0098:
            r22 = r15 & r20
            r7 = r42
            if (r22 != 0) goto L_0x00ab
            boolean r23 = r0.m(r7)
            if (r23 == 0) goto L_0x00a7
            r23 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r23 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r3 = r3 | r23
        L_0x00ab:
            r23 = r13 & 32
            r24 = 458752(0x70000, float:6.42848E-40)
            if (r23 == 0) goto L_0x00b8
            r25 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r25
            r8 = r43
            goto L_0x00cb
        L_0x00b8:
            r25 = r15 & r24
            r8 = r43
            if (r25 != 0) goto L_0x00cb
            boolean r26 = r0.k(r8)
            if (r26 == 0) goto L_0x00c7
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r3 = r3 | r26
        L_0x00cb:
            r26 = r13 & 64
            if (r26 == 0) goto L_0x00d6
            r27 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r27
            r9 = r44
            goto L_0x00eb
        L_0x00d6:
            r27 = 3670016(0x380000, float:5.142788E-39)
            r27 = r15 & r27
            r9 = r44
            if (r27 != 0) goto L_0x00eb
            boolean r28 = r0.k(r9)
            if (r28 == 0) goto L_0x00e7
            r28 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r28 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r3 = r3 | r28
        L_0x00eb:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00f6
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r29
            r5 = r45
            goto L_0x010b
        L_0x00f6:
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r29 = r15 & r29
            r5 = r45
            if (r29 != 0) goto L_0x010b
            boolean r30 = r0.k(r5)
            if (r30 == 0) goto L_0x0107
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0109
        L_0x0107:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x0109:
            r3 = r3 | r30
        L_0x010b:
            r4 = r13 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0116
            r30 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r30
            r5 = r46
            goto L_0x012b
        L_0x0116:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r15 & r30
            r5 = r46
            if (r30 != 0) goto L_0x012b
            boolean r30 = r0.m(r5)
            if (r30 == 0) goto L_0x0127
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r3 = r3 | r30
        L_0x012b:
            r5 = r13 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0136
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r30
            r7 = r47
            goto L_0x014b
        L_0x0136:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r15 & r30
            r7 = r47
            if (r30 != 0) goto L_0x014b
            boolean r30 = r0.p(r7)
            if (r30 == 0) goto L_0x0147
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0149
        L_0x0147:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0149:
            r3 = r3 | r30
        L_0x014b:
            r7 = r13 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0154
            r30 = r14 | 6
            r8 = r48
            goto L_0x016a
        L_0x0154:
            r30 = r14 & 14
            r8 = r48
            if (r30 != 0) goto L_0x0168
            boolean r30 = r0.k(r8)
            if (r30 == 0) goto L_0x0163
            r30 = 4
            goto L_0x0165
        L_0x0163:
            r30 = 2
        L_0x0165:
            r30 = r14 | r30
            goto L_0x016a
        L_0x0168:
            r30 = r14
        L_0x016a:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0171
            r30 = r30 | 48
            goto L_0x0184
        L_0x0171:
            r31 = r14 & 112(0x70, float:1.57E-43)
            r9 = r49
            if (r31 != 0) goto L_0x0184
            boolean r31 = r0.k(r9)
            if (r31 == 0) goto L_0x0180
            r22 = 32
            goto L_0x0182
        L_0x0180:
            r22 = 16
        L_0x0182:
            r30 = r30 | r22
        L_0x0184:
            r9 = r30
            r11 = r13 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x018d
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x01a1
        L_0x018d:
            r2 = r14 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x01a1
            r2 = r50
            boolean r22 = r0.k(r2)
            if (r22 == 0) goto L_0x019c
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x019e
        L_0x019c:
            r27 = 128(0x80, float:1.794E-43)
        L_0x019e:
            r9 = r9 | r27
            goto L_0x01a3
        L_0x01a1:
            r2 = r50
        L_0x01a3:
            r2 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x01bb
            r2 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r2 != 0) goto L_0x01b4
            r2 = r51
            boolean r22 = r0.k(r2)
            if (r22 == 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b4:
            r2 = r51
        L_0x01b6:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x01b8:
            r9 = r9 | r16
            goto L_0x01bd
        L_0x01bb:
            r2 = r51
        L_0x01bd:
            r2 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x01c6
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r14 = r52
            goto L_0x01d7
        L_0x01c6:
            r16 = r14 & r20
            r14 = r52
            if (r16 != 0) goto L_0x01d7
            boolean r16 = r0.k(r14)
            if (r16 == 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01d5:
            r9 = r9 | r19
        L_0x01d7:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r3 & r16
            r53 = r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r3) goto L_0x0213
            r3 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r9
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r14) goto L_0x0213
            boolean r3 = r0.b()
            if (r3 != 0) goto L_0x01f2
            goto L_0x0213
        L_0x01f2:
            r0.h()
            r4 = r39
            r3 = r40
            r6 = r41
            r5 = r42
            r7 = r43
            r8 = r44
            r10 = r45
            r9 = r46
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r15 = r51
            r35 = r52
            goto L_0x041f
        L_0x0213:
            r0.H()
            r3 = r15 & 1
            r16 = 1
            if (r3 == 0) goto L_0x024a
            boolean r3 = r0.i()
            if (r3 == 0) goto L_0x0223
            goto L_0x024a
        L_0x0223:
            r0.h()
            r2 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x022c
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x022c:
            r2 = r40
            r6 = r41
            r12 = r42
            r3 = r43
            r4 = r44
            r10 = r45
            r5 = r46
            r7 = r47
            r8 = r48
            r11 = r50
            r14 = r51
            r35 = r52
            r18 = r9
            r9 = r49
            goto L_0x0306
        L_0x024a:
            if (r6 == 0) goto L_0x024f
            p0.d$a r3 = p0.d.f16037h0
            goto L_0x0251
        L_0x024f:
            r3 = r40
        L_0x0251:
            if (r12 == 0) goto L_0x0255
            r6 = 1
            goto L_0x0257
        L_0x0255:
            r6 = r41
        L_0x0257:
            if (r18 == 0) goto L_0x025b
            r12 = 0
            goto L_0x025d
        L_0x025b:
            r12 = r42
        L_0x025d:
            if (r23 == 0) goto L_0x0266
            p1.c0$a r17 = p1.c0.f16065d
            p1.c0 r17 = r17.a()
            goto L_0x0268
        L_0x0266:
            r17 = r43
        L_0x0268:
            if (r26 == 0) goto L_0x0271
            a0.i$a r18 = a0.i.f832e
            a0.i r18 = r18.a()
            goto L_0x0273
        L_0x0271:
            r18 = r44
        L_0x0273:
            if (r10 == 0) goto L_0x027c
            a0.g$a r10 = a0.g.f823g
            a0.g r10 = r10.a()
            goto L_0x027e
        L_0x027c:
            r10 = r45
        L_0x027e:
            if (r4 == 0) goto L_0x0282
            r4 = 0
            goto L_0x0284
        L_0x0282:
            r4 = r46
        L_0x0284:
            if (r5 == 0) goto L_0x028a
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x028c
        L_0x028a:
            r5 = r47
        L_0x028c:
            if (r7 == 0) goto L_0x0295
            v1.f0$a r7 = v1.f0.f17091a
            v1.f0 r7 = r7.c()
            goto L_0x0297
        L_0x0295:
            r7 = r48
        L_0x0297:
            if (r8 == 0) goto L_0x029c
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 r8 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1.f4232a
            goto L_0x029e
        L_0x029c:
            r8 = r49
        L_0x029e:
            if (r11 == 0) goto L_0x02bf
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.E(r11)
            java.lang.Object r11 = r0.F()
            e0.g$a r19 = e0.g.f14172a
            java.lang.Object r14 = r19.a()
            if (r11 != r14) goto L_0x02b9
            u.k r11 = u.j.a()
            r0.y(r11)
        L_0x02b9:
            r0.P()
            u.k r11 = (u.k) r11
            goto L_0x02c1
        L_0x02bf:
            r11 = r50
        L_0x02c1:
            r14 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x02db
            u0.k1 r14 = new u0.k1
            u0.d0$a r19 = u0.d0.f16756b
            r40 = r3
            r41 = r4
            long r3 = r19.a()
            r42 = r5
            r5 = 0
            r14.<init>(r3, r5)
            r3 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r3
            goto L_0x02e3
        L_0x02db:
            r40 = r3
            r41 = r4
            r42 = r5
            r14 = r51
        L_0x02e3:
            if (r2 == 0) goto L_0x02f6
            androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt r2 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f4313a
            lp0.q r2 = r2.a()
            r5 = r41
            r35 = r2
            r3 = r17
            r4 = r18
            r2 = r40
            goto L_0x0300
        L_0x02f6:
            r2 = r40
            r5 = r41
            r35 = r52
            r3 = r17
            r4 = r18
        L_0x0300:
            r18 = r9
            r9 = r8
            r8 = r7
            r7 = r42
        L_0x0306:
            r0.A()
            r47 = r7
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.E(r7)
            java.lang.Object r7 = r0.F()
            e0.g$a r17 = e0.g.f14172a
            java.lang.Object r13 = r17.a()
            if (r7 != r13) goto L_0x033e
            androidx.compose.ui.text.input.TextFieldValue r7 = new androidx.compose.ui.text.input.TextFieldValue
            r22 = 0
            r13 = 0
            r19 = 6
            r25 = 0
            r40 = r7
            r41 = r38
            r42 = r22
            r44 = r13
            r45 = r19
            r46 = r25
            r40.<init>((java.lang.String) r41, (long) r42, (p1.a0) r44, (int) r45, (kotlin.jvm.internal.i) r46)
            r13 = 0
            r15 = 2
            e0.h0 r7 = androidx.compose.runtime.j.e(r7, r13, r15, r13)
            r0.y(r7)
        L_0x033e:
            r0.P()
            e0.h0 r7 = (e0.h0) r7
            androidx.compose.ui.text.input.TextFieldValue r13 = c(r7)
            r22 = 0
            r15 = 0
            r19 = 6
            r25 = 0
            r40 = r13
            r41 = r38
            r42 = r22
            r44 = r15
            r45 = r19
            r46 = r25
            androidx.compose.ui.text.input.TextFieldValue r13 = androidx.compose.ui.text.input.TextFieldValue.c(r40, r41, r42, r44, r45, r46)
            r15 = 1157296644(0x44faf204, float:2007.563)
            r0.E(r15)
            boolean r15 = r0.k(r1)
            r40 = r12
            java.lang.Object r12 = r0.F()
            if (r15 != 0) goto L_0x0376
            java.lang.Object r15 = r17.a()
            if (r12 != r15) goto L_0x037f
        L_0x0376:
            r12 = 0
            r15 = 2
            e0.h0 r12 = androidx.compose.runtime.j.e(r1, r12, r15, r12)
            r0.y(r12)
        L_0x037f:
            r0.P()
            e0.h0 r12 = (e0.h0) r12
            v1.m r26 = r4.d(r5)
            r15 = r5 ^ 1
            if (r5 == 0) goto L_0x038f
            r25 = 1
            goto L_0x0391
        L_0x038f:
            r25 = r47
        L_0x0391:
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.E(r1)
            boolean r1 = r0.k(r7)
            boolean r16 = r0.k(r12)
            r1 = r1 | r16
            r41 = r4
            r4 = r39
            boolean r16 = r0.k(r4)
            r1 = r1 | r16
            r42 = r5
            java.lang.Object r5 = r0.F()
            if (r1 != 0) goto L_0x03b9
            java.lang.Object r1 = r17.a()
            if (r5 != r1) goto L_0x03c1
        L_0x03b9:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1 r5 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            r5.<init>(r4, r7, r12)
            r0.y(r5)
        L_0x03c1:
            r0.P()
            r17 = r5
            lp0.l r17 = (lp0.l) r17
            r1 = r53
            r5 = r1 & 896(0x380, float:1.256E-42)
            int r7 = r1 >> 6
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r7
            int r7 = r18 << 12
            r12 = r7 & r20
            r5 = r5 | r12
            r12 = r7 & r24
            r5 = r5 | r12
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r7
            r5 = r5 | r12
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r12
            r32 = r5 | r7
            int r5 = r1 >> 18
            r5 = r5 & 112(0x70, float:1.57E-43)
            int r1 = r1 >> 3
            r7 = r1 & 896(0x380, float:1.256E-42)
            r5 = r5 | r7
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r5
            r5 = r18 & r20
            r33 = r1 | r5
            r34 = 0
            r16 = r13
            r18 = r2
            r19 = r3
            r20 = r8
            r21 = r9
            r22 = r11
            r23 = r14
            r24 = r15
            r27 = r10
            r28 = r6
            r29 = r40
            r30 = r35
            r31 = r0
            androidx.compose.foundation.text.CoreTextFieldKt.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r5 = r40
            r7 = r3
            r12 = r8
            r13 = r9
            r15 = r14
            r8 = r41
            r9 = r42
            r3 = r2
            r14 = r11
            r11 = r47
        L_0x041f:
            e0.s0 r2 = r0.v()
            if (r2 != 0) goto L_0x0426
            goto L_0x044c
        L_0x0426:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4
            r0 = r1
            r36 = r1
            r1 = r38
            r37 = r2
            r2 = r39
            r4 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r35
            r16 = r54
            r17 = r55
            r18 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r36
            r0 = r37
            r0.a(r1)
        L_0x044c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.b(java.lang.String, lp0.l, p0.d, boolean, boolean, p1.c0, a0.i, a0.g, boolean, int, v1.f0, lp0.l, u.k, u0.u, lp0.q, e0.g, int, int, int):void");
    }

    private static final TextFieldValue c(h0<TextFieldValue> h0Var) {
        return h0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void d(h0<TextFieldValue> h0Var, TextFieldValue textFieldValue) {
        h0Var.setValue(textFieldValue);
    }

    /* access modifiers changed from: private */
    public static final String e(h0<String> h0Var) {
        return h0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void f(h0<String> h0Var, String str) {
        h0Var.setValue(str);
    }
}
