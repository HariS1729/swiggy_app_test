package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import d2.c;
import d2.h;
import i1.e0;
import i1.i;
import i1.o;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: TextFieldImpl.kt */
public final class TextFieldImplKt {

    /* renamed from: a  reason: collision with root package name */
    private static final long f5542a = c.a(0, 0, 0, 0);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f5543b = h.n((float) 1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f5544c = h.n((float) 2);

    /* renamed from: d  reason: collision with root package name */
    private static final float f5545d = h.n((float) 16);

    /* renamed from: e  reason: collision with root package name */
    private static final float f5546e = h.n((float) 12);

    /* renamed from: f  reason: collision with root package name */
    private static final d f5547f;

    static {
        float f11 = (float) 48;
        f5547f = SizeKt.g(d.f16037h0, h.n(f11), h.n(f11));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(long r16, p1.c0 r18, java.lang.Float r19, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r20, e0.g r21, int r22, int r23) {
        /*
            r6 = r20
            r7 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r6, r0)
            r0 = -2009952923(0xffffffff88328d65, float:-5.3731135E-34)
            r1 = r21
            e0.g r8 = r1.t(r0)
            r0 = r23 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r7 | 6
            r9 = r16
            goto L_0x002d
        L_0x001b:
            r0 = r7 & 14
            r9 = r16
            if (r0 != 0) goto L_0x002c
            boolean r0 = r8.q(r9)
            if (r0 == 0) goto L_0x0029
            r0 = 4
            goto L_0x002a
        L_0x0029:
            r0 = 2
        L_0x002a:
            r0 = r0 | r7
            goto L_0x002d
        L_0x002c:
            r0 = r7
        L_0x002d:
            r1 = r23 & 2
            if (r1 == 0) goto L_0x0034
            r0 = r0 | 48
            goto L_0x0047
        L_0x0034:
            r2 = r7 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            r2 = r18
            boolean r3 = r8.k(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r0 = r0 | r3
            goto L_0x0049
        L_0x0047:
            r2 = r18
        L_0x0049:
            r3 = r23 & 4
            if (r3 == 0) goto L_0x0050
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r7 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r19
            boolean r5 = r8.k(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r0 = r0 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r19
        L_0x0065:
            r5 = r23 & 8
            if (r5 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r5 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            boolean r5 = r8.k(r6)
            if (r5 == 0) goto L_0x0079
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r5
        L_0x007c:
            r11 = r0
            r0 = r11 & 5851(0x16db, float:8.199E-42)
            r0 = r0 ^ 1170(0x492, float:1.64E-42)
            if (r0 != 0) goto L_0x008f
            boolean r0 = r8.b()
            if (r0 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r8.h()
            r3 = r2
            goto L_0x00d3
        L_0x008f:
            r0 = 0
            if (r1 == 0) goto L_0x0094
            r12 = r0
            goto L_0x0095
        L_0x0094:
            r12 = r2
        L_0x0095:
            if (r3 == 0) goto L_0x0099
            r13 = r0
            goto L_0x009a
        L_0x0099:
            r13 = r4
        L_0x009a:
            r14 = -819900927(0xffffffffcf214e01, float:-2.70624384E9)
            androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1 r15 = new androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
            r0 = r15
            r1 = r16
            r3 = r13
            r4 = r20
            r5 = r11
            r0.<init>(r1, r3, r4, r5)
            r0 = 1
            l0.a r0 = l0.b.b(r8, r14, r0, r15)
            if (r12 == 0) goto L_0x00c0
            r1 = -2009952190(0xffffffff88329042, float:-5.37345E-34)
            r8.E(r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            r1 = r1 | 48
            androidx.compose.material.TextKt.a(r12, r0, r8, r1)
            goto L_0x00ce
        L_0x00c0:
            r1 = -2009952138(0xffffffff88329076, float:-5.373474E-34)
            r8.E(r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r8, r1)
        L_0x00ce:
            r8.P()
            r3 = r12
            r4 = r13
        L_0x00d3:
            e0.s0 r8 = r8.v()
            if (r8 != 0) goto L_0x00da
            goto L_0x00eb
        L_0x00da:
            androidx.compose.material.TextFieldImplKt$Decoration$1 r11 = new androidx.compose.material.TextFieldImplKt$Decoration$1
            r0 = r11
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.a(r11)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.a(long, p1.c0, java.lang.Float, lp0.p, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0161  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(androidx.compose.material.TextFieldType r60, boolean r61, boolean r62, androidx.compose.ui.text.input.TextFieldValue r63, lp0.l<? super androidx.compose.ui.text.input.TextFieldValue, bp0.k> r64, p0.d r65, boolean r66, p1.c0 r67, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r68, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r69, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r70, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r71, boolean r72, v1.f0 r73, a0.i r74, a0.g r75, int r76, u.k r77, u0.j1 r78, c0.c0 r79, e0.g r80, int r81, int r82, int r83) {
        /*
            r15 = r60
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r67
            r9 = r68
            r8 = r73
            r7 = r75
            r6 = r77
            r5 = r78
            r4 = r79
            r3 = r81
            r2 = r82
            r1 = r83
            java.lang.String r0 = "type"
            kotlin.jvm.internal.p.j(r15, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r13, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.p.j(r11, r0)
            java.lang.String r0 = "textStyle"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "visualTransformation"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "keyboardActions"
            kotlin.jvm.internal.p.j(r7, r0)
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.p.j(r6, r0)
            java.lang.String r0 = "shape"
            kotlin.jvm.internal.p.j(r5, r0)
            java.lang.String r0 = "colors"
            kotlin.jvm.internal.p.j(r4, r0)
            r0 = 571807088(0x22151570, float:2.0204614E-18)
            r4 = r80
            e0.g r4 = r4.t(r0)
            r0 = r1 & 1
            r16 = 4
            r17 = 2
            if (r0 == 0) goto L_0x0064
            r0 = r3 | 6
            goto L_0x0074
        L_0x0064:
            r0 = r3 & 14
            if (r0 != 0) goto L_0x0073
            boolean r0 = r4.k(r15)
            if (r0 == 0) goto L_0x0070
            r0 = 4
            goto L_0x0071
        L_0x0070:
            r0 = 2
        L_0x0071:
            r0 = r0 | r3
            goto L_0x0074
        L_0x0073:
            r0 = r3
        L_0x0074:
            r18 = r1 & 2
            r19 = 32
            r20 = 16
            if (r18 == 0) goto L_0x007f
            r0 = r0 | 48
            goto L_0x0090
        L_0x007f:
            r18 = r3 & 112(0x70, float:1.57E-43)
            if (r18 != 0) goto L_0x0090
            boolean r18 = r4.m(r14)
            if (r18 == 0) goto L_0x008c
            r18 = 32
            goto L_0x008e
        L_0x008c:
            r18 = 16
        L_0x008e:
            r0 = r0 | r18
        L_0x0090:
            r18 = r1 & 4
            r21 = 256(0x100, float:3.59E-43)
            r22 = 128(0x80, float:1.794E-43)
            if (r18 == 0) goto L_0x009b
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x00af
        L_0x009b:
            r15 = r3 & 896(0x380, float:1.256E-42)
            if (r15 != 0) goto L_0x00af
            r15 = r62
            boolean r18 = r4.m(r15)
            if (r18 == 0) goto L_0x00aa
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x00ac
        L_0x00aa:
            r18 = 128(0x80, float:1.794E-43)
        L_0x00ac:
            r0 = r0 | r18
            goto L_0x00b1
        L_0x00af:
            r15 = r62
        L_0x00b1:
            r18 = r1 & 8
            r23 = 2048(0x800, float:2.87E-42)
            r24 = 1024(0x400, float:1.435E-42)
            if (r18 == 0) goto L_0x00bc
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x00cc
        L_0x00bc:
            r15 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x00cc
            boolean r15 = r4.k(r13)
            if (r15 == 0) goto L_0x00c9
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x00cb
        L_0x00c9:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x00cb:
            r0 = r0 | r15
        L_0x00cc:
            r15 = r1 & 16
            r18 = 8192(0x2000, float:1.14794E-41)
            r25 = 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x00d7
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00e9
        L_0x00d7:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r3
            if (r15 != 0) goto L_0x00e9
            boolean r15 = r4.k(r12)
            if (r15 == 0) goto L_0x00e6
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00e8
        L_0x00e6:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x00e8:
            r0 = r0 | r15
        L_0x00e9:
            r15 = r1 & 32
            r26 = 131072(0x20000, float:1.83671E-40)
            r27 = 65536(0x10000, float:9.18355E-41)
            if (r15 == 0) goto L_0x00f5
            r15 = 196608(0x30000, float:2.75506E-40)
        L_0x00f3:
            r0 = r0 | r15
            goto L_0x0106
        L_0x00f5:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r3
            if (r15 != 0) goto L_0x0106
            boolean r15 = r4.k(r11)
            if (r15 == 0) goto L_0x0103
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00f3
        L_0x0103:
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00f3
        L_0x0106:
            r15 = r1 & 64
            r28 = 524288(0x80000, float:7.34684E-40)
            if (r15 == 0) goto L_0x0110
            r15 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r15
            goto L_0x0125
        L_0x0110:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r3
            if (r15 != 0) goto L_0x0125
            r15 = r66
            boolean r29 = r4.m(r15)
            if (r29 == 0) goto L_0x0120
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0122
        L_0x0120:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x0122:
            r0 = r0 | r29
            goto L_0x0127
        L_0x0125:
            r15 = r66
        L_0x0127:
            r11 = r1 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x012f
            r11 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x012d:
            r0 = r0 | r11
            goto L_0x0140
        L_0x012f:
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r3
            if (r11 != 0) goto L_0x0140
            boolean r11 = r4.k(r10)
            if (r11 == 0) goto L_0x013d
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x012d
        L_0x013d:
            r11 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x012d
        L_0x0140:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0148
            r11 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0146:
            r0 = r0 | r11
            goto L_0x0159
        L_0x0148:
            r11 = 234881024(0xe000000, float:1.5777218E-30)
            r11 = r11 & r3
            if (r11 != 0) goto L_0x0159
            boolean r11 = r4.k(r9)
            if (r11 == 0) goto L_0x0156
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0146
        L_0x0156:
            r11 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0146
        L_0x0159:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0161
            r11 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r11
            goto L_0x0176
        L_0x0161:
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r3
            if (r11 != 0) goto L_0x0176
            r11 = r69
            boolean r29 = r4.k(r11)
            if (r29 == 0) goto L_0x0171
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0173
        L_0x0171:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0173:
            r0 = r0 | r29
            goto L_0x0178
        L_0x0176:
            r11 = r69
        L_0x0178:
            r29 = r0
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0185
            r0 = r2 | 6
            r16 = r0
            r0 = r70
            goto L_0x019b
        L_0x0185:
            r0 = r2 & 14
            if (r0 != 0) goto L_0x0197
            r0 = r70
            boolean r30 = r4.k(r0)
            if (r30 == 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r16 = 2
        L_0x0194:
            r16 = r2 | r16
            goto L_0x019b
        L_0x0197:
            r0 = r70
            r16 = r2
        L_0x019b:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01a2
            r16 = r16 | 48
            goto L_0x01b6
        L_0x01a2:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x01b4
            r0 = r71
            boolean r17 = r4.k(r0)
            if (r17 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r19 = 16
        L_0x01b1:
            r16 = r16 | r19
            goto L_0x01b6
        L_0x01b4:
            r0 = r71
        L_0x01b6:
            r0 = r16
            r11 = r1 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x01bf
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x01d1
        L_0x01bf:
            r11 = r2 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01d1
            r11 = r72
            boolean r16 = r4.m(r11)
            if (r16 == 0) goto L_0x01cc
            goto L_0x01ce
        L_0x01cc:
            r21 = 128(0x80, float:1.794E-43)
        L_0x01ce:
            r0 = r0 | r21
            goto L_0x01d3
        L_0x01d1:
            r11 = r72
        L_0x01d3:
            r11 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01da
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x01e9
        L_0x01da:
            r11 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01e9
            boolean r11 = r4.k(r8)
            if (r11 == 0) goto L_0x01e5
            goto L_0x01e7
        L_0x01e5:
            r23 = 1024(0x400, float:1.435E-42)
        L_0x01e7:
            r0 = r0 | r23
        L_0x01e9:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r2
            if (r11 != 0) goto L_0x0203
            r11 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r11 != 0) goto L_0x01fe
            r11 = r74
            boolean r16 = r4.k(r11)
            if (r16 == 0) goto L_0x0200
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0200
        L_0x01fe:
            r11 = r74
        L_0x0200:
            r0 = r0 | r18
            goto L_0x0205
        L_0x0203:
            r11 = r74
        L_0x0205:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L_0x0211
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x020e:
            r0 = r0 | r16
            goto L_0x0223
        L_0x0211:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r2 & r16
            if (r16 != 0) goto L_0x0223
            boolean r16 = r4.k(r7)
            if (r16 == 0) goto L_0x0220
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x020e
        L_0x0220:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x020e
        L_0x0223:
            r16 = r1 & r27
            if (r16 == 0) goto L_0x022e
            r17 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r17
            r7 = r76
            goto L_0x0243
        L_0x022e:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r2 & r17
            r7 = r76
            if (r17 != 0) goto L_0x0243
            boolean r17 = r4.p(r7)
            if (r17 == 0) goto L_0x023f
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0241
        L_0x023f:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0241:
            r0 = r0 | r17
        L_0x0243:
            r17 = r1 & r26
            if (r17 == 0) goto L_0x024c
            r17 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0249:
            r0 = r0 | r17
            goto L_0x025e
        L_0x024c:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r2 & r17
            if (r17 != 0) goto L_0x025e
            boolean r17 = r4.k(r6)
            if (r17 == 0) goto L_0x025b
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0249
        L_0x025b:
            r17 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0249
        L_0x025e:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r1 & r17
            if (r17 == 0) goto L_0x0269
            r17 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0266:
            r0 = r0 | r17
            goto L_0x027b
        L_0x0269:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r2 & r17
            if (r17 != 0) goto L_0x027b
            boolean r17 = r4.k(r5)
            if (r17 == 0) goto L_0x0278
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0266
        L_0x0278:
            r17 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0266
        L_0x027b:
            r17 = r1 & r28
            if (r17 == 0) goto L_0x0286
            r17 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r17
            r5 = r79
            goto L_0x029b
        L_0x0286:
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r2 & r17
            r5 = r79
            if (r17 != 0) goto L_0x029b
            boolean r17 = r4.k(r5)
            if (r17 == 0) goto L_0x0297
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0299
        L_0x0297:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0299:
            r0 = r0 | r17
        L_0x029b:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r17 = r29 & r17
            r18 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r17 ^ r18
            if (r17 != 0) goto L_0x02c3
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r17 = r0 & r17
            r18 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = r17 ^ r18
            if (r17 != 0) goto L_0x02c3
            boolean r17 = r4.b()
            if (r17 != 0) goto L_0x02ba
            goto L_0x02c3
        L_0x02ba:
            r4.h()
            r0 = r4
            r17 = r7
            r15 = r11
            goto L_0x04f4
        L_0x02c3:
            r4.H()
            r17 = r3 & 1
            if (r17 == 0) goto L_0x02dd
            boolean r17 = r4.i()
            if (r17 == 0) goto L_0x02d1
            goto L_0x02dd
        L_0x02d1:
            r4.h()
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x02f8
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r2
            goto L_0x02f8
        L_0x02dd:
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x02ec
            a0.i$a r2 = a0.i.f832e
            a0.i r2 = r2.a()
            r11 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r11
            r11 = r2
        L_0x02ec:
            if (r16 == 0) goto L_0x02f8
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = r0
            r25 = r11
            r26 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02fd
        L_0x02f8:
            r26 = r7
            r25 = r11
            r7 = r0
        L_0x02fd:
            r4.A()
            r0 = 571807912(0x221518a8, float:2.0206318E-18)
            r4.E(r0)
            long r16 = r67.g()
            u0.d0$a r11 = u0.d0.f16756b
            long r18 = r11.f()
            r20 = 0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0318
            r0 = 1
            goto L_0x0319
        L_0x0318:
            r0 = 0
        L_0x0319:
            if (r0 == 0) goto L_0x031c
            goto L_0x0334
        L_0x031c:
            int r0 = r29 >> 3
            r0 = r0 & 14
            int r16 = r7 >> 24
            r16 = r16 & 112(0x70, float:1.57E-43)
            r0 = r0 | r16
            e0.d1 r0 = r5.b(r14, r4, r0)
            java.lang.Object r0 = r0.getValue()
            u0.d0 r0 = (u0.d0) r0
            long r16 = r0.v()
        L_0x0334:
            r31 = r16
            r4.P()
            p1.c0 r0 = new p1.c0
            r30 = r0
            r33 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 262142(0x3fffe, float:3.67339E-40)
            r55 = 0
            r30.<init>(r31, r33, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r53, r54, r55)
            p1.c0 r17 = r10.C(r0)
            int r0 = r7 >> 21
            r0 = r0 & 14
            e0.d1 r0 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r6, r4, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            p1.b r2 = r63.e()
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r4.E(r1)
            boolean r1 = r4.k(r2)
            boolean r2 = r4.k(r8)
            r1 = r1 | r2
            java.lang.Object r2 = r4.F()
            if (r1 != 0) goto L_0x039e
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x03a9
        L_0x039e:
            p1.b r1 = r63.e()
            v1.d0 r2 = r8.a(r1)
            r4.y(r2)
        L_0x03a9:
            r4.P()
            v1.d0 r2 = (v1.d0) r2
            p1.b r16 = r2.b()
            if (r0 == 0) goto L_0x03b8
            androidx.compose.material.InputPhase r0 = androidx.compose.material.InputPhase.Focused
        L_0x03b6:
            r2 = r0
            goto L_0x03c9
        L_0x03b8:
            int r0 = r16.length()
            if (r0 != 0) goto L_0x03c0
            r0 = 1
            goto L_0x03c1
        L_0x03c0:
            r0 = 0
        L_0x03c1:
            if (r0 == 0) goto L_0x03c6
            androidx.compose.material.InputPhase r0 = androidx.compose.material.InputPhase.UnfocusedEmpty
            goto L_0x03b6
        L_0x03c6:
            androidx.compose.material.InputPhase r0 = androidx.compose.material.InputPhase.UnfocusedNotEmpty
            goto L_0x03b6
        L_0x03c9:
            androidx.compose.material.TextFieldImplKt$TextFieldImpl$labelColor$1 r1 = new androidx.compose.material.TextFieldImplKt$TextFieldImpl$labelColor$1
            r0 = r1
            r15 = r1
            r1 = r79
            r14 = r2
            r2 = r61
            r3 = r72
            r5 = r4
            r4 = r77
            r13 = r5
            r5 = r29
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            c0.q r0 = c0.q.f12737a
            r1 = 6
            c0.g0 r2 = r0.c(r13, r1)
            p1.c0 r3 = r2.k()
            p1.c0 r2 = r2.d()
            long r4 = r3.g()
            r76 = r2
            long r1 = r11.f()
            boolean r1 = u0.d0.n(r4, r1)
            if (r1 == 0) goto L_0x040b
            long r1 = r76.g()
            long r4 = r11.f()
            boolean r1 = u0.d0.n(r1, r4)
            if (r1 == 0) goto L_0x0427
        L_0x040b:
            long r1 = r3.g()
            long r3 = r11.f()
            boolean r1 = u0.d0.n(r1, r3)
            if (r1 != 0) goto L_0x042a
            long r1 = r76.g()
            long r3 = r11.f()
            boolean r1 = u0.d0.n(r1, r3)
            if (r1 == 0) goto L_0x042a
        L_0x0427:
            r24 = 1
            goto L_0x042c
        L_0x042a:
            r24 = 0
        L_0x042c:
            androidx.compose.material.TextFieldTransitionScope r27 = androidx.compose.material.TextFieldTransitionScope.f5713a
            r1 = 571809256(0x22151de8, float:2.0209098E-18)
            r13.E(r1)
            r1 = 6
            c0.g0 r2 = r0.c(r13, r1)
            p1.c0 r1 = r2.d()
            long r1 = r1.g()
            if (r24 == 0) goto L_0x045f
            long r3 = r11.f()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x044d
            r3 = 1
            goto L_0x044e
        L_0x044d:
            r3 = 0
        L_0x044e:
            if (r3 == 0) goto L_0x0451
            goto L_0x045f
        L_0x0451:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r15.invoke(r14, r13, r1)
            u0.d0 r1 = (u0.d0) r1
            long r1 = r1.v()
        L_0x045f:
            r30 = r1
            r13.P()
            r1 = 6
            c0.g0 r0 = r0.c(r13, r1)
            p1.c0 r0 = r0.k()
            long r0 = r0.g()
            if (r24 == 0) goto L_0x048f
            long r2 = r11.f()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x047d
            r2 = 1
            goto L_0x047e
        L_0x047d:
            r2 = 0
        L_0x047e:
            if (r2 == 0) goto L_0x0481
            goto L_0x048f
        L_0x0481:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r15.invoke(r14, r13, r0)
            u0.d0 r0 = (u0.d0) r0
            long r0 = r0.v()
        L_0x048f:
            r32 = r0
            if (r9 == 0) goto L_0x0496
            r28 = 1
            goto L_0x0498
        L_0x0496:
            r28 = 0
        L_0x0498:
            r11 = -819891562(0xffffffffcf217296, float:-2.70864128E9)
            androidx.compose.material.TextFieldImplKt$TextFieldImpl$3 r6 = new androidx.compose.material.TextFieldImplKt$TextFieldImpl$3
            r0 = r6
            r1 = r68
            r2 = r69
            r3 = r16
            r4 = r65
            r5 = r72
            r56 = r6
            r6 = r7
            r7 = r79
            r8 = r61
            r9 = r77
            r10 = r29
            r11 = r60
            r12 = r63
            r57 = r13
            r13 = r64
            r29 = r14
            r14 = r62
            r34 = r15
            r15 = r25
            r16 = r75
            r18 = r66
            r19 = r26
            r20 = r73
            r21 = r70
            r22 = r71
            r23 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r56
            r0 = r57
            r1 = -819891562(0xffffffffcf217296, float:-2.70864128E9)
            r3 = 1
            l0.a r9 = l0.b.b(r0, r1, r3, r2)
            r11 = 1769472(0x1b0000, float:2.479558E-39)
            r1 = r27
            r2 = r29
            r3 = r30
            r5 = r32
            r7 = r34
            r8 = r28
            r10 = r0
            r1.a(r2, r3, r5, r7, r8, r9, r10, r11)
            r17 = r26
        L_0x04f4:
            e0.s0 r14 = r0.v()
            if (r14 != 0) goto L_0x04fb
            goto L_0x0536
        L_0x04fb:
            androidx.compose.material.TextFieldImplKt$TextFieldImpl$4 r13 = new androidx.compose.material.TextFieldImplKt$TextFieldImpl$4
            r0 = r13
            r1 = r60
            r2 = r61
            r3 = r62
            r4 = r63
            r5 = r64
            r6 = r65
            r7 = r66
            r8 = r67
            r9 = r68
            r10 = r69
            r11 = r70
            r12 = r71
            r58 = r13
            r13 = r72
            r59 = r14
            r14 = r73
            r16 = r75
            r18 = r77
            r19 = r78
            r20 = r79
            r21 = r81
            r22 = r82
            r23 = r83
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r58
            r0 = r59
            r0.a(r1)
        L_0x0536:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.b(androidx.compose.material.TextFieldType, boolean, boolean, androidx.compose.ui.text.input.TextFieldValue, lp0.l, p0.d, boolean, p1.c0, lp0.p, lp0.p, lp0.p, lp0.p, boolean, v1.f0, a0.i, a0.g, int, u.k, u0.j1, c0.c0, e0.g, int, int, int):void");
    }

    public static final float e() {
        return f5546e;
    }

    public static final d f() {
        return f5547f;
    }

    public static final Object g(i iVar) {
        p.j(iVar, "<this>");
        Object p11 = iVar.p();
        o oVar = p11 instanceof o ? (o) p11 : null;
        if (oVar == null) {
            return null;
        }
        return oVar.a();
    }

    public static final float h() {
        return f5545d;
    }

    public static final long i() {
        return f5542a;
    }

    public static final int j(e0 e0Var) {
        if (e0Var == null) {
            return 0;
        }
        return e0Var.e0();
    }

    public static final int k(e0 e0Var) {
        if (e0Var == null) {
            return 0;
        }
        return e0Var.A0();
    }
}
