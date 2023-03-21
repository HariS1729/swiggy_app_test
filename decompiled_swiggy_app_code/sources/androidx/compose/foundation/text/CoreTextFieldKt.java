package androidx.compose.foundation.text;

import a0.n;
import a0.o;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import fp0.c;
import i1.t;
import lp0.l;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;
import p1.a0;
import p1.y;
import t0.h;
import v1.c0;
import v1.m;
import v1.s;

/* compiled from: CoreTextField.kt */
public final class CoreTextFieldKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: lp0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: lp0.q<lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, e0.g, java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x071c  */
    /* JADX WARNING: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.text.input.TextFieldValue r43, lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r44, p0.d r45, p1.c0 r46, v1.f0 r47, lp0.l<? super p1.y, bp0.k> r48, u.k r49, u0.u r50, boolean r51, int r52, v1.m r53, a0.g r54, boolean r55, boolean r56, lp0.q<? super lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k>, ? super e0.g, ? super java.lang.Integer, bp0.k> r57, e0.g r58, int r59, int r60, int r61) {
        /*
            r15 = r43
            r14 = r44
            r13 = r59
            r12 = r60
            r11 = r61
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r14, r0)
            r0 = 109313709(0x683fead, float:4.9650936E-35)
            r1 = r58
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
            r8 = r45
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
            r8 = r45
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
            r1 = r46
            boolean r18 = r10.k(r1)
            if (r18 == 0) goto L_0x0081
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r0 = r0 | r18
            goto L_0x0088
        L_0x0086:
            r1 = r46
        L_0x0088:
            r18 = r11 & 16
            r19 = 16384(0x4000, float:2.2959E-41)
            r20 = 8192(0x2000, float:1.14794E-41)
            if (r18 == 0) goto L_0x0095
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r4 = r47
            goto L_0x00ab
        L_0x0095:
            r21 = 57344(0xe000, float:8.0356E-41)
            r21 = r13 & r21
            r4 = r47
            if (r21 != 0) goto L_0x00ab
            boolean r22 = r10.k(r4)
            if (r22 == 0) goto L_0x00a7
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r0 = r0 | r22
        L_0x00ab:
            r22 = r11 & 32
            if (r22 == 0) goto L_0x00b6
            r23 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r23
            r5 = r48
            goto L_0x00cb
        L_0x00b6:
            r23 = 458752(0x70000, float:6.42848E-40)
            r23 = r13 & r23
            r5 = r48
            if (r23 != 0) goto L_0x00cb
            boolean r24 = r10.k(r5)
            if (r24 == 0) goto L_0x00c7
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r0 = r0 | r24
        L_0x00cb:
            r24 = r11 & 64
            if (r24 == 0) goto L_0x00d6
            r25 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r25
            r6 = r49
            goto L_0x00eb
        L_0x00d6:
            r25 = 3670016(0x380000, float:5.142788E-39)
            r25 = r13 & r25
            r6 = r49
            if (r25 != 0) goto L_0x00eb
            boolean r26 = r10.k(r6)
            if (r26 == 0) goto L_0x00e7
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r0 = r0 | r26
        L_0x00eb:
            r26 = 29360128(0x1c00000, float:7.052966E-38)
            r26 = r13 & r26
            if (r26 != 0) goto L_0x0107
            r7 = r11 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x0100
            r7 = r50
            boolean r27 = r10.k(r7)
            if (r27 == 0) goto L_0x0102
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0100:
            r7 = r50
        L_0x0102:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r0 = r0 | r27
            goto L_0x0109
        L_0x0107:
            r7 = r50
        L_0x0109:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0114
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r28
            r1 = r51
            goto L_0x0129
        L_0x0114:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r13 & r28
            r1 = r51
            if (r28 != 0) goto L_0x0129
            boolean r28 = r10.m(r1)
            if (r28 == 0) goto L_0x0125
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0127
        L_0x0125:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0127:
            r0 = r0 | r28
        L_0x0129:
            r1 = r11 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0134
            r28 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r28
            r4 = r52
            goto L_0x0149
        L_0x0134:
            r28 = 1879048192(0x70000000, float:1.58456325E29)
            r28 = r13 & r28
            r4 = r52
            if (r28 != 0) goto L_0x0149
            boolean r28 = r10.p(r4)
            if (r28 == 0) goto L_0x0145
            r28 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0147
        L_0x0145:
            r28 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0147:
            r0 = r0 | r28
        L_0x0149:
            r28 = r12 & 14
            if (r28 != 0) goto L_0x0163
            r4 = r11 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x015c
            r4 = r53
            boolean r28 = r10.k(r4)
            if (r28 == 0) goto L_0x015e
            r28 = 4
            goto L_0x0160
        L_0x015c:
            r4 = r53
        L_0x015e:
            r28 = 2
        L_0x0160:
            r28 = r12 | r28
            goto L_0x0167
        L_0x0163:
            r4 = r53
            r28 = r12
        L_0x0167:
            r4 = r11 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x016e
            r28 = r28 | 48
            goto L_0x0181
        L_0x016e:
            r29 = r12 & 112(0x70, float:1.57E-43)
            r5 = r54
            if (r29 != 0) goto L_0x0181
            boolean r29 = r10.k(r5)
            if (r29 == 0) goto L_0x017d
            r21 = 32
            goto L_0x017f
        L_0x017d:
            r21 = 16
        L_0x017f:
            r28 = r28 | r21
        L_0x0181:
            r5 = r28
            r6 = r11 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x018a
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x019e
        L_0x018a:
            r7 = r12 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x019e
            r7 = r55
            boolean r21 = r10.m(r7)
            if (r21 == 0) goto L_0x0199
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x019b
        L_0x0199:
            r25 = 128(0x80, float:1.794E-43)
        L_0x019b:
            r5 = r5 | r25
            goto L_0x01a0
        L_0x019e:
            r7 = r55
        L_0x01a0:
            r7 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x01a7
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b9
        L_0x01a7:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x01b9
            r8 = r56
            boolean r21 = r10.m(r8)
            if (r21 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x01b6:
            r5 = r5 | r16
            goto L_0x01bb
        L_0x01b9:
            r8 = r56
        L_0x01bb:
            r8 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x01c4
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r12 = r57
            goto L_0x01d8
        L_0x01c4:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r12 & r16
            r12 = r57
            if (r16 != 0) goto L_0x01d8
            boolean r16 = r10.k(r12)
            if (r16 == 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01d6:
            r5 = r5 | r19
        L_0x01d8:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r16
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r12) goto L_0x0211
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r0 & r5
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r12) goto L_0x0211
            boolean r0 = r10.b()
            if (r0 != 0) goto L_0x01f1
            goto L_0x0211
        L_0x01f1:
            r10.h()
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r51
            r11 = r53
            r12 = r54
            r13 = r55
            r14 = r56
            r15 = r57
            r0 = r10
            r10 = r52
            goto L_0x0715
        L_0x0211:
            r10.H()
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0262
            boolean r0 = r10.i()
            if (r0 == 0) goto L_0x021f
            goto L_0x0262
        L_0x021f:
            r10.h()
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0245
            r0 = r5 & -15
            r14 = r45
            r18 = r46
            r13 = r47
            r20 = r48
            r12 = r49
            r21 = r50
            r22 = r51
            r9 = r52
            r8 = r53
            r23 = r54
            r7 = r55
            r24 = r56
            r25 = r57
            r2 = r0
            goto L_0x030e
        L_0x0245:
            r14 = r45
            r18 = r46
            r13 = r47
            r20 = r48
            r12 = r49
            r21 = r50
            r22 = r51
            r9 = r52
            r8 = r53
            r23 = r54
            r7 = r55
            r24 = r56
            r25 = r57
            r2 = r5
            goto L_0x030e
        L_0x0262:
            if (r3 == 0) goto L_0x0267
            p0.d$a r0 = p0.d.f16037h0
            goto L_0x0269
        L_0x0267:
            r0 = r45
        L_0x0269:
            if (r9 == 0) goto L_0x0272
            p1.c0$a r3 = p1.c0.f16065d
            p1.c0 r3 = r3.a()
            goto L_0x0274
        L_0x0272:
            r3 = r46
        L_0x0274:
            if (r18 == 0) goto L_0x027d
            v1.f0$a r9 = v1.f0.f17091a
            v1.f0 r9 = r9.c()
            goto L_0x027f
        L_0x027d:
            r9 = r47
        L_0x027f:
            if (r22 == 0) goto L_0x0284
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1 r17 = androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$1.f4327a
            goto L_0x0286
        L_0x0284:
            r17 = r48
        L_0x0286:
            if (r24 == 0) goto L_0x028b
            r18 = 0
            goto L_0x028d
        L_0x028b:
            r18 = r49
        L_0x028d:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x02a0
            u0.k1 r12 = new u0.k1
            u0.d0$a r20 = u0.d0.f16756b
            long r13 = r20.f()
            r45 = r0
            r0 = 0
            r12.<init>(r13, r0)
            goto L_0x02a4
        L_0x02a0:
            r45 = r0
            r12 = r50
        L_0x02a4:
            if (r2 == 0) goto L_0x02a8
            r0 = 1
            goto L_0x02aa
        L_0x02a8:
            r0 = r51
        L_0x02aa:
            if (r1 == 0) goto L_0x02b0
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02b2
        L_0x02b0:
            r1 = r52
        L_0x02b2:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x02bf
            v1.m$a r2 = v1.m.f17149f
            v1.m r2 = r2.a()
            r5 = r5 & -15
            goto L_0x02c1
        L_0x02bf:
            r2 = r53
        L_0x02c1:
            if (r4 == 0) goto L_0x02ca
            a0.g$a r4 = a0.g.f823g
            a0.g r4 = r4.a()
            goto L_0x02cc
        L_0x02ca:
            r4 = r54
        L_0x02cc:
            if (r6 == 0) goto L_0x02d0
            r6 = 1
            goto L_0x02d2
        L_0x02d0:
            r6 = r55
        L_0x02d2:
            if (r7 == 0) goto L_0x02d6
            r7 = 0
            goto L_0x02d8
        L_0x02d6:
            r7 = r56
        L_0x02d8:
            if (r8 == 0) goto L_0x02f7
            androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt r8 = androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.f4321a
            lp0.q r8 = r8.a()
            r14 = r45
            r22 = r0
            r23 = r4
            r24 = r7
            r25 = r8
            r13 = r9
            r21 = r12
            r20 = r17
            r12 = r18
            r9 = r1
            r8 = r2
            r18 = r3
            r2 = r5
            goto L_0x030d
        L_0x02f7:
            r14 = r45
            r25 = r57
            r22 = r0
            r8 = r2
            r23 = r4
            r2 = r5
            r24 = r7
            r13 = r9
            r21 = r12
            r20 = r17
            r12 = r18
            r9 = r1
            r18 = r3
        L_0x030d:
            r7 = r6
        L_0x030e:
            r10.A()
            s0.o r0 = new s0.o
            r0.<init>()
            r1 = -55013392(0xfffffffffcb88ff0, float:-7.666416E36)
            r10.E(r1)
            if (r7 == 0) goto L_0x032c
            if (r24 == 0) goto L_0x0321
            goto L_0x032c
        L_0x0321:
            e0.m0 r1 = androidx.compose.ui.platform.CompositionLocalsKt.l()
            java.lang.Object r1 = r10.z(r1)
            v1.a0 r1 = (v1.a0) r1
            goto L_0x032d
        L_0x032c:
            r1 = 0
        L_0x032d:
            r10.P()
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r3 = r10.z(r3)
            d2.e r3 = (d2.e) r3
            e0.m0 r4 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r4 = r10.z(r4)
            u1.i$b r4 = (u1.i.b) r4
            e0.m0 r5 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            java.lang.Object r5 = r10.z(r5)
            b0.o r5 = (b0.o) r5
            long r5 = r5.a()
            e0.m0 r11 = androidx.compose.ui.platform.CompositionLocalsKt.f()
            java.lang.Object r11 = r10.z(r11)
            s0.f r11 = (s0.f) r11
            r17 = r14
            r14 = 1
            if (r9 != r14) goto L_0x036b
            if (r22 != 0) goto L_0x036b
            boolean r14 = r8.f()
            if (r14 == 0) goto L_0x036b
            r14 = 1
            goto L_0x036c
        L_0x036b:
            r14 = 0
        L_0x036c:
            if (r14 == 0) goto L_0x0371
            androidx.compose.foundation.gestures.Orientation r14 = androidx.compose.foundation.gestures.Orientation.Horizontal
            goto L_0x0373
        L_0x0371:
            androidx.compose.foundation.gestures.Orientation r14 = androidx.compose.foundation.gestures.Orientation.Vertical
        L_0x0373:
            r56 = r2
            r26 = r9
            r9 = 1
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r9 = 0
            r2[r9] = r14
            androidx.compose.foundation.text.TextFieldScrollerPosition$a r9 = androidx.compose.foundation.text.TextFieldScrollerPosition.f4614f
            m0.c r9 = r9.a()
            r28 = 0
            r57 = r7
            r7 = 1157296644(0x44faf204, float:2007.563)
            r10.E(r7)
            boolean r7 = r10.k(r14)
            r29 = r12
            java.lang.Object r12 = r10.F()
            if (r7 != 0) goto L_0x03a1
            e0.g$a r7 = e0.g.f14172a
            java.lang.Object r7 = r7.a()
            if (r12 != r7) goto L_0x03a9
        L_0x03a1:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 r12 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
            r12.<init>(r14)
            r10.y(r12)
        L_0x03a9:
            r10.P()
            r7 = r12
            lp0.a r7 = (lp0.a) r7
            r12 = 72
            r14 = 4
            r45 = r2
            r46 = r9
            r47 = r28
            r48 = r7
            r49 = r10
            r50 = r12
            r51 = r14
            java.lang.Object r2 = androidx.compose.runtime.saveable.RememberSaveableKt.b(r45, r46, r47, r48, r49, r50, r51)
            r7 = r2
            androidx.compose.foundation.text.TextFieldScrollerPosition r7 = (androidx.compose.foundation.text.TextFieldScrollerPosition) r7
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.E(r2)
            boolean r2 = r10.k(r15)
            boolean r9 = r10.k(r13)
            r2 = r2 | r9
            java.lang.Object r9 = r10.F()
            if (r2 != 0) goto L_0x03e8
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r9 != r2) goto L_0x03e5
            goto L_0x03e8
        L_0x03e5:
            r14 = r7
            r12 = r8
            goto L_0x040b
        L_0x03e8:
            p1.b r2 = r43.e()
            v1.d0 r2 = r13.a(r2)
            p1.a0 r9 = r43.f()
            r14 = r7
            r12 = r8
            if (r9 == 0) goto L_0x0407
            long r7 = r9.r()
            androidx.compose.foundation.text.TextFieldDelegate$Companion r9 = androidx.compose.foundation.text.TextFieldDelegate.f4538a
            v1.d0 r7 = r9.b(r7, r2)
            if (r7 != 0) goto L_0x0405
            goto L_0x0407
        L_0x0405:
            r9 = r7
            goto L_0x0408
        L_0x0407:
            r9 = r2
        L_0x0408:
            r10.y(r9)
        L_0x040b:
            r10.P()
            r2 = r9
            v1.d0 r2 = (v1.d0) r2
            p1.b r7 = r2.b()
            v1.s r8 = r2.a()
            r28 = r14
            r9 = 0
            e0.o0 r14 = e0.f.b(r10, r9)
            r9 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r9)
            java.lang.Object r9 = r10.F()
            e0.g$a r31 = e0.g.f14172a
            r32 = r2
            java.lang.Object r2 = r31.a()
            if (r9 != r2) goto L_0x0461
            androidx.compose.foundation.text.TextFieldState r9 = new androidx.compose.foundation.text.TextFieldState
            a0.n r2 = new a0.n
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 148(0x94, float:2.07E-43)
            r37 = 0
            r45 = r2
            r46 = r7
            r47 = r18
            r48 = r33
            r49 = r22
            r50 = r34
            r51 = r3
            r52 = r4
            r53 = r35
            r54 = r36
            r55 = r37
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r9.<init>(r2, r14)
            r10.y(r9)
        L_0x0461:
            r10.P()
            r14 = r9
            androidx.compose.foundation.text.TextFieldState r14 = (androidx.compose.foundation.text.TextFieldState) r14
            r45 = r14
            r46 = r7
            r47 = r18
            r48 = r22
            r49 = r3
            r50 = r4
            r51 = r44
            r52 = r23
            r53 = r11
            r54 = r5
            r45.A(r46, r47, r48, r49, r50, r51, r52, r53, r54)
            v1.f r2 = r14.j()
            v1.c0 r3 = r14.e()
            r2.b(r15, r3)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r2)
            java.lang.Object r2 = r10.F()
            java.lang.Object r3 = r31.a()
            if (r2 != r3) goto L_0x04a4
            a0.w r2 = new a0.w
            r3 = 0
            r4 = 0
            r5 = 1
            r2.<init>(r4, r5, r3)
            r10.y(r2)
        L_0x04a4:
            r10.P()
            a0.w r2 = (a0.w) r2
            r3 = 0
            r5 = 2
            r6 = 0
            r45 = r2
            r46 = r43
            r47 = r3
            r49 = r5
            r50 = r6
            a0.w.f(r45, r46, r47, r49, r50)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r3)
            java.lang.Object r3 = r10.F()
            java.lang.Object r4 = r31.a()
            if (r3 != r4) goto L_0x04d2
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r3 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager
            r3.<init>(r2)
            r10.y(r3)
        L_0x04d2:
            r10.P()
            r11 = r3
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r11 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r11
            r11.U(r8)
            r11.Z(r13)
            lp0.l r3 = r14.i()
            r11.V(r3)
            r11.W(r14)
            r11.Y(r15)
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.d()
            java.lang.Object r3 = r10.z(r3)
            androidx.compose.ui.platform.e0 r3 = (androidx.compose.ui.platform.e0) r3
            r11.N(r3)
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r3 = r10.z(r3)
            androidx.compose.ui.platform.g1 r3 = (androidx.compose.ui.platform.g1) r3
            r11.X(r3)
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.h()
            java.lang.Object r3 = r10.z(r3)
            a1.a r3 = (a1.a) r3
            r11.T(r3)
            r11.R(r0)
            r3 = r24 ^ 1
            r11.Q(r3)
            r3 = 773894976(0x2e20b340, float:3.6538994E-11)
            r10.E(r3)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r3)
            java.lang.Object r3 = r10.F()
            java.lang.Object r4 = r31.a()
            if (r3 != r4) goto L_0x053f
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f25631a
            wp0.j0 r3 = e0.u.i(r3, r10)
            e0.m r4 = new e0.m
            r4.<init>(r3)
            r10.y(r4)
            r3 = r4
        L_0x053f:
            r10.P()
            e0.m r3 = (e0.m) r3
            wp0.j0 r3 = r3.a()
            r10.P()
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r4)
            java.lang.Object r4 = r10.F()
            java.lang.Object r5 = r31.a()
            if (r4 != r5) goto L_0x0562
            y.d r4 = androidx.compose.foundation.relocation.BringIntoViewRequesterKt.a()
            r10.y(r4)
        L_0x0562:
            r10.P()
            r30 = r4
            y.d r30 = (y.d) r30
            p0.d$a r4 = p0.d.f16037h0
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1
            r45 = r5
            r46 = r14
            r47 = r1
            r48 = r43
            r49 = r12
            r50 = r11
            r51 = r3
            r52 = r30
            r53 = r8
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53)
            r7 = r57
            r9 = r29
            p0.d r3 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.c(r4, r7, r0, r9, r5)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2 r5 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2
            r5.<init>(r14)
            r6 = 8
            e0.u.b(r14, r5, r10, r6)
            boolean r5 = a0.v.a()
            if (r5 == 0) goto L_0x05c3
            a0.o r5 = r11.G()
            p0.d r5 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.a(r4, r5, r7)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1
            r45 = r6
            r46 = r14
            r47 = r0
            r48 = r24
            r49 = r11
            r50 = r8
            r45.<init>(r46, r47, r48, r49, r50)
            p0.d r6 = androidx.compose.foundation.text.TextFieldPressGestureFilterKt.a(r4, r9, r7, r6)
            p0.d r5 = r6.N(r5)
            r58 = r3
            r16 = r9
            r29 = r13
            r3 = 0
            goto L_0x05dc
        L_0x05c3:
            b0.c r5 = r11.B()
            p0.d r5 = androidx.compose.foundation.text.TextFieldGestureModifiersKt.b(r4, r5, r7)
            f1.r r6 = a0.u.a()
            r58 = r3
            r16 = r9
            r29 = r13
            r3 = 0
            r9 = 0
            r13 = 2
            p0.d r5 = androidx.compose.ui.input.pointer.PointerIconKt.b(r5, r6, r3, r13, r9)
        L_0x05dc:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1
            r6.<init>(r14, r15, r8)
            p0.d r9 = androidx.compose.ui.draw.DrawModifierKt.a(r4, r6)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1 r6 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1
            r6.<init>(r14, r7, r11)
            p0.d r13 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r4, r6)
            r6 = 0
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1 r3 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1
            r45 = r3
            r46 = r12
            r47 = r32
            r48 = r43
            r49 = r7
            r50 = r6
            r51 = r24
            r52 = r14
            r53 = r8
            r54 = r11
            r55 = r0
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r0 = 1
            p0.d r3 = androidx.compose.ui.semantics.SemanticsModifierKt.b(r4, r0, r3)
            if (r7 == 0) goto L_0x0615
            if (r24 != 0) goto L_0x0615
            r0 = 1
            goto L_0x0616
        L_0x0615:
            r0 = 0
        L_0x0616:
            r45 = r4
            r46 = r14
            r47 = r43
            r48 = r8
            r49 = r21
            r50 = r0
            p0.d r31 = androidx.compose.foundation.text.TextFieldCursorKt.b(r45, r46, r47, r48, r49, r50)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3
            r0.<init>(r11)
            r6 = 8
            e0.u.b(r11, r0, r10, r6)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4
            r0.<init>(r1, r14, r15, r12)
            r1 = r56 & 14
            e0.u.b(r12, r0, r10, r1)
            lp0.l r0 = r14.i()
            r1 = r24 ^ 1
            r19 = r12
            r6 = r26
            r12 = 1
            if (r6 != r12) goto L_0x064a
            r26 = 1
            goto L_0x064c
        L_0x064a:
            r26 = 0
        L_0x064c:
            r45 = r4
            r46 = r14
            r47 = r11
            r48 = r43
            r49 = r0
            r50 = r1
            r51 = r26
            r52 = r8
            r53 = r2
            p0.d r0 = androidx.compose.foundation.text.TextFieldKeyInputKt.a(r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r1 = r58
            r8 = r17
            p0.d r1 = r8.N(r1)
            p0.d r1 = m(r1, r14, r11)
            p0.d r0 = r1.N(r0)
            r1 = r16
            r2 = r28
            p0.d r0 = androidx.compose.foundation.text.TextFieldScrollKt.d(r0, r2, r1, r7)
            p0.d r0 = r0.N(r5)
            p0.d r0 = r0.N(r3)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 r3 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
            r3.<init>(r14)
            p0.d r5 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r0, r3)
            if (r7 == 0) goto L_0x069c
            boolean r0 = r14.d()
            if (r0 == 0) goto L_0x069c
            boolean r0 = a0.v.a()
            if (r0 == 0) goto L_0x069c
            r27 = 1
            goto L_0x069e
        L_0x069c:
            r27 = 0
        L_0x069e:
            if (r27 == 0) goto L_0x06a7
            p0.d r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.b(r4, r11)
            r16 = r0
            goto L_0x06a9
        L_0x06a7:
            r16 = r4
        L_0x06a9:
            r4 = -1885146845(0xffffffff8fa2f123, float:-1.6067316E-29)
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5 r3 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5
            r0 = r3
            r17 = r1
            r1 = r25
            r26 = r2
            r2 = r56
            r38 = r3
            r3 = r6
            r4 = r18
            r39 = r5
            r5 = r26
            r26 = r6
            r6 = r43
            r28 = r7
            r7 = r29
            r32 = r8
            r8 = r31
            r40 = r10
            r10 = r13
            r13 = r11
            r11 = r16
            r31 = r17
            r12 = r30
            r45 = r13
            r13 = r14
            r30 = r32
            r14 = r45
            r15 = r27
            r16 = r24
            r17 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = r38
            r0 = r40
            r1 = -1885146845(0xffffffff8fa2f123, float:-1.6067316E-29)
            r3 = 1
            l0.a r1 = l0.b.b(r0, r1, r3, r2)
            r2 = 448(0x1c0, float:6.28E-43)
            r3 = r45
            r4 = r39
            b(r4, r3, r1, r0, r2)
            r4 = r18
            r11 = r19
            r6 = r20
            r8 = r21
            r9 = r22
            r12 = r23
            r14 = r24
            r15 = r25
            r10 = r26
            r13 = r28
            r5 = r29
            r3 = r30
            r7 = r31
        L_0x0715:
            e0.s0 r2 = r0.v()
            if (r2 != 0) goto L_0x071c
            goto L_0x0737
        L_0x071c:
            androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6 r1 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$6
            r0 = r1
            r41 = r1
            r1 = r43
            r42 = r2
            r2 = r44
            r16 = r59
            r17 = r60
            r18 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r41
            r0 = r42
            r0.a(r1)
        L_0x0737:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, lp0.l, p0.d, p1.c0, v1.f0, lp0.l, u.k, u0.u, boolean, int, v1.m, a0.g, boolean, boolean, lp0.q, e0.g, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(d dVar, TextFieldSelectionManager textFieldSelectionManager, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        g t = gVar.t(-20551815);
        int i12 = (i11 & 14) | 384;
        t.E(733328855);
        int i13 = i12 >> 3;
        t h11 = BoxKt.h(a.f16019a.o(), true, t, (i13 & 112) | (i13 & 14));
        t.E(-1323940314);
        e eVar = (e) t.z(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
        n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
        ComposeUiNode.Companion companion = ComposeUiNode.J;
        lp0.a<ComposeUiNode> a11 = companion.a();
        q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(dVar);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(t.u() instanceof e0.e)) {
            f.c();
        }
        t.f();
        if (t.s()) {
            t.K(a11);
        } else {
            t.c();
        }
        t.J();
        g a12 = Updater.a(t);
        Updater.c(a12, h11, companion.d());
        Updater.c(a12, eVar, companion.b());
        Updater.c(a12, layoutDirection, companion.c());
        Updater.c(a12, n1Var, companion.f());
        t.o();
        b11.invoke(t0.a(t0.b(t)), t, Integer.valueOf((i14 >> 3) & 112));
        t.E(2058660585);
        t.E(-2137368960);
        if (((i14 >> 9) & 14 & 11) != 2 || !t.b()) {
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
            t.E(1524757375);
            if (((((i12 >> 6) & 112) | 6) & 81) != 16 || !t.b()) {
                ContextMenu_androidKt.a(textFieldSelectionManager, pVar, t, ((i11 >> 3) & 112) | 8);
            } else {
                t.h();
            }
            t.P();
        } else {
            t.h();
        }
        t.P();
        t.P();
        t.d();
        t.P();
        t.P();
        s0 v = t.v();
        if (v != null) {
            v.a(new CoreTextFieldKt$CoreTextFieldRootBox$2(dVar, textFieldSelectionManager, pVar, i11));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = r0.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.foundation.text.selection.TextFieldSelectionManager r6, boolean r7, e0.g r8, int r9) {
        /*
            r0 = 626339208(0x25552d88, float:1.8490232E-16)
            e0.g r8 = r8.t(r0)
            if (r7 == 0) goto L_0x00b9
            androidx.compose.foundation.text.TextFieldState r0 = r6.E()
            if (r0 == 0) goto L_0x001a
            a0.s r0 = r0.g()
            if (r0 == 0) goto L_0x001a
            p1.y r0 = r0.i()
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x001f
            goto L_0x00bc
        L_0x001f:
            androidx.compose.ui.text.input.TextFieldValue r1 = r6.H()
            long r1 = r1.g()
            boolean r1 = p1.a0.h(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0096
            v1.s r1 = r6.C()
            androidx.compose.ui.text.input.TextFieldValue r3 = r6.H()
            long r3 = r3.g()
            int r3 = p1.a0.n(r3)
            int r1 = r1.b(r3)
            v1.s r3 = r6.C()
            androidx.compose.ui.text.input.TextFieldValue r4 = r6.H()
            long r4 = r4.g()
            int r4 = p1.a0.i(r4)
            int r3 = r3.b(r4)
            androidx.compose.ui.text.style.ResolvedTextDirection r1 = r0.b(r1)
            r4 = 1
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r3, r2)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = r0.b(r3)
            r3 = -498396421(0xffffffffe24b12fb, float:-9.365142E20)
            r8.E(r3)
            androidx.compose.foundation.text.TextFieldState r3 = r6.E()
            if (r3 == 0) goto L_0x0078
            boolean r3 = r3.p()
            if (r3 != r4) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            r5 = 518(0x206, float:7.26E-43)
            if (r3 == 0) goto L_0x0080
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.a(r4, r1, r6, r8, r5)
        L_0x0080:
            r8.P()
            androidx.compose.foundation.text.TextFieldState r1 = r6.E()
            if (r1 == 0) goto L_0x0090
            boolean r1 = r1.o()
            if (r1 != r4) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r4 = 0
        L_0x0091:
            if (r4 == 0) goto L_0x0096
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.a(r2, r0, r6, r8, r5)
        L_0x0096:
            androidx.compose.foundation.text.TextFieldState r0 = r6.E()
            if (r0 == 0) goto L_0x00bc
            boolean r1 = r6.K()
            if (r1 == 0) goto L_0x00a5
            r0.x(r2)
        L_0x00a5:
            boolean r1 = r0.d()
            if (r1 == 0) goto L_0x00bc
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x00b5
            r6.a0()
            goto L_0x00bc
        L_0x00b5:
            r6.J()
            goto L_0x00bc
        L_0x00b9:
            r6.J()
        L_0x00bc:
            e0.s0 r8 = r8.v()
            if (r8 != 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
            r0.<init>(r6, r7, r9)
            r8.a(r0)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.c(androidx.compose.foundation.text.selection.TextFieldSelectionManager, boolean, e0.g, int):void");
    }

    public static final void d(TextFieldSelectionManager textFieldSelectionManager, g gVar, int i11) {
        kotlin.jvm.internal.p.j(textFieldSelectionManager, "manager");
        g t = gVar.t(-1436003720);
        TextFieldState E = textFieldSelectionManager.E();
        if (E != null && E.m()) {
            t.E(1157296644);
            boolean k = t.k(textFieldSelectionManager);
            Object F = t.F();
            if (k || F == g.f14172a.a()) {
                F = textFieldSelectionManager.n();
                t.y(F);
            }
            t.P();
            o oVar = (o) F;
            long v = textFieldSelectionManager.v((e) t.z(CompositionLocalsKt.e()));
            d c11 = SuspendingPointerInputFilterKt.c(d.f16037h0, oVar, new CoreTextFieldKt$TextFieldCursorHandle$1(oVar, (c<? super CoreTextFieldKt$TextFieldCursorHandle$1>) null));
            t0.f d11 = t0.f.d(v);
            t.E(1157296644);
            boolean k11 = t.k(d11);
            Object F2 = t.F();
            if (k11 || F2 == g.f14172a.a()) {
                F2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(v);
                t.y(F2);
            }
            t.P();
            AndroidCursorHandle_androidKt.a(v, SemanticsModifierKt.c(c11, false, (l) F2, 1, (Object) null), (p<? super g, ? super Integer, k>) null, t, 384);
        }
        s0 v11 = t.v();
        if (v11 != null) {
            v11.a(new CoreTextFieldKt$TextFieldCursorHandle$3(textFieldSelectionManager, i11));
        }
    }

    public static final Object j(y.d dVar, TextFieldValue textFieldValue, n nVar, y yVar, s sVar, c<? super k> cVar) {
        h hVar;
        int b11 = sVar.b(a0.k(textFieldValue.g()));
        if (b11 < yVar.k().j().length()) {
            hVar = yVar.c(b11);
        } else if (b11 != 0) {
            hVar = yVar.c(b11 - 1);
        } else {
            hVar = new h(0.0f, 0.0f, 1.0f, (float) d2.p.f(a0.p.b(nVar.j(), nVar.a(), nVar.b(), (String) null, 0, 24, (Object) null)));
        }
        Object a11 = dVar.a(hVar, cVar);
        return a11 == b.d() ? a11 : k.f22762a;
    }

    /* access modifiers changed from: private */
    public static final void k(v1.a0 a0Var, TextFieldState textFieldState, TextFieldValue textFieldValue, m mVar) {
        if (textFieldState.d()) {
            textFieldState.t(TextFieldDelegate.f4538a.g(a0Var, textFieldValue, textFieldState.j(), mVar, textFieldState.i(), textFieldState.h()));
            return;
        }
        l(textFieldState);
    }

    /* access modifiers changed from: private */
    public static final void l(TextFieldState textFieldState) {
        c0 e11 = textFieldState.e();
        if (e11 != null) {
            TextFieldDelegate.f4538a.e(e11, textFieldState.j(), textFieldState.i());
        }
        textFieldState.t((c0) null);
    }

    private static final d m(d dVar, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.c(dVar, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* access modifiers changed from: private */
    public static final void n(TextFieldState textFieldState, s0.o oVar, boolean z11) {
        c0 e11;
        if (!textFieldState.d()) {
            oVar.c();
        } else if (z11 && (e11 = textFieldState.e()) != null) {
            e11.c();
        }
    }
}
