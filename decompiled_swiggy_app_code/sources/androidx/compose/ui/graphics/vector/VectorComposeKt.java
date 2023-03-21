package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Updater;
import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.f;
import e0.g;
import e0.s0;
import java.util.List;
import kotlin.jvm.internal.p;
import u0.l1;
import u0.m1;
import u0.u;
import u0.y0;
import y0.d;
import y0.i;
import y0.m;

/* compiled from: VectorCompose.kt */
public final class VectorComposeKt {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.String r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, java.util.List<? extends y0.d> r27, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r28, e0.g r29, int r30, int r31) {
        /*
            r10 = r28
            r11 = r30
            r12 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r10, r0)
            r0 = -213417674(0xfffffffff3478136, float:-1.5806393E31)
            r1 = r29
            e0.g r0 = r1.t(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001e
            r2 = r11 | 6
            r3 = r2
            r2 = r19
            goto L_0x0032
        L_0x001e:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002f
            r2 = r19
            boolean r3 = r0.k(r2)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r11
            goto L_0x0032
        L_0x002f:
            r2 = r19
            r3 = r11
        L_0x0032:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x004c
        L_0x0039:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004c
            r5 = r20
            boolean r6 = r0.n(r5)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
            goto L_0x004e
        L_0x004c:
            r5 = r20
        L_0x004e:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r11 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r21
            boolean r9 = r0.n(r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r21
        L_0x006a:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r13 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0084
            r13 = r22
            boolean r14 = r0.n(r13)
            if (r14 == 0) goto L_0x0080
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r14
            goto L_0x0086
        L_0x0084:
            r13 = r22
        L_0x0086:
            r14 = r12 & 16
            if (r14 == 0) goto L_0x008d
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x008d:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r11
            if (r15 != 0) goto L_0x00a3
            r15 = r23
            boolean r16 = r0.n(r15)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r16
            goto L_0x00a5
        L_0x00a3:
            r15 = r23
        L_0x00a5:
            r16 = r12 & 32
            if (r16 == 0) goto L_0x00b0
            r17 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r17
            r7 = r24
            goto L_0x00c5
        L_0x00b0:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r11 & r17
            r7 = r24
            if (r17 != 0) goto L_0x00c5
            boolean r17 = r0.n(r7)
            if (r17 == 0) goto L_0x00c1
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r3 = r3 | r17
        L_0x00c5:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x00d0
            r18 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r18
            r2 = r25
            goto L_0x00e5
        L_0x00d0:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r11 & r18
            r2 = r25
            if (r18 != 0) goto L_0x00e5
            boolean r18 = r0.n(r2)
            if (r18 == 0) goto L_0x00e1
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r3 = r3 | r18
        L_0x00e5:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00f0
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r18
            r5 = r26
            goto L_0x0105
        L_0x00f0:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r11 & r18
            r5 = r26
            if (r18 != 0) goto L_0x0105
            boolean r18 = r0.n(r5)
            if (r18 == 0) goto L_0x0101
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0103
        L_0x0101:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x0103:
            r3 = r3 | r18
        L_0x0105:
            r5 = r12 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x010d
            r18 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r18
        L_0x010d:
            r7 = r12 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0115
            r7 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0113:
            r3 = r3 | r7
            goto L_0x0126
        L_0x0115:
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r11
            if (r7 != 0) goto L_0x0126
            boolean r7 = r0.k(r10)
            if (r7 == 0) goto L_0x0123
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0113
        L_0x0123:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0113
        L_0x0126:
            r7 = 256(0x100, float:3.59E-43)
            if (r5 != r7) goto L_0x014f
            r7 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r7 = r7 & r3
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r8) goto L_0x014f
            boolean r7 = r0.b()
            if (r7 != 0) goto L_0x013a
            goto L_0x014f
        L_0x013a:
            r0.h()
            r1 = r19
            r2 = r20
            r3 = r21
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r4 = r13
            r5 = r15
            goto L_0x0242
        L_0x014f:
            r0.H()
            r7 = r11 & 1
            r8 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r7 == 0) goto L_0x0175
            boolean r7 = r0.i()
            if (r7 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            r0.h()
            if (r5 == 0) goto L_0x0166
            r3 = r3 & r8
        L_0x0166:
            r1 = r19
            r4 = r20
            r6 = r21
            r9 = r24
            r14 = r25
            r7 = r26
        L_0x0172:
            r2 = r27
            goto L_0x01a9
        L_0x0175:
            if (r1 == 0) goto L_0x017a
            java.lang.String r1 = ""
            goto L_0x017c
        L_0x017a:
            r1 = r19
        L_0x017c:
            r7 = 0
            if (r4 == 0) goto L_0x0181
            r4 = 0
            goto L_0x0183
        L_0x0181:
            r4 = r20
        L_0x0183:
            if (r6 == 0) goto L_0x0187
            r6 = 0
            goto L_0x0189
        L_0x0187:
            r6 = r21
        L_0x0189:
            if (r9 == 0) goto L_0x018c
            r13 = 0
        L_0x018c:
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x0192
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x0192:
            if (r16 == 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r9 = r24
        L_0x0197:
            if (r17 == 0) goto L_0x019b
            r14 = 0
            goto L_0x019d
        L_0x019b:
            r14 = r25
        L_0x019d:
            if (r2 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r7 = r26
        L_0x01a2:
            if (r5 == 0) goto L_0x0172
            java.util.List r2 = y0.m.e()
            r3 = r3 & r8
        L_0x01a9:
            r0.A()
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1 r5 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$1.f6528a
            r8 = -548224868(0xffffffffdf52c09c, float:-1.518631E19)
            r0.E(r8)
            e0.e r8 = r0.u()
            boolean r8 = r8 instanceof y0.i
            if (r8 != 0) goto L_0x01bf
            e0.f.c()
        L_0x01bf:
            r0.w()
            boolean r8 = r0.s()
            if (r8 == 0) goto L_0x01cc
            r0.K(r5)
            goto L_0x01cf
        L_0x01cc:
            r0.c()
        L_0x01cf:
            e0.g r5 = androidx.compose.runtime.Updater.a(r0)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1.f6529a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r4)
            r16 = r1
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2 r1 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2.f6530a
            androidx.compose.runtime.Updater.c(r5, r8, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r6)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3.f6531a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r13)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4.f6532a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r15)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5.f6533a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6.f6534a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r14)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7.f6535a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8 r8 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8.f6536a
            androidx.compose.runtime.Updater.c(r5, r1, r8)
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9 r1 = androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9.f6537a
            androidx.compose.runtime.Updater.c(r5, r2, r1)
            r1 = -983907633(0xffffffffc55ac2cf, float:-3500.1755)
            r0.E(r1)
            int r1 = r3 >> 27
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.invoke(r0, r1)
            r0.P()
            r0.d()
            r0.P()
            r3 = r6
            r8 = r7
            r6 = r9
            r7 = r14
            r5 = r15
            r1 = r16
            r9 = r2
            r2 = r4
            r4 = r13
        L_0x0242:
            e0.s0 r13 = r0.v()
            if (r13 != 0) goto L_0x0249
            goto L_0x0258
        L_0x0249:
            androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4 r14 = new androidx.compose.ui.graphics.vector.VectorComposeKt$Group$4
            r0 = r14
            r10 = r28
            r11 = r30
            r12 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.a(java.lang.String, float, float, float, float, float, float, float, java.util.List, lp0.p, e0.g, int, int):void");
    }

    public static final void b(List<? extends d> list, int i11, String str, u uVar, float f11, u uVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, g gVar, int i14, int i15, int i16) {
        List<? extends d> list2 = list;
        int i17 = i16;
        p.j(list2, "pathData");
        g t = gVar.t(-1478270750);
        int b11 = (i17 & 2) != 0 ? m.b() : i11;
        String str2 = (i17 & 4) != 0 ? "" : str;
        u uVar3 = (i17 & 8) != 0 ? null : uVar;
        float f18 = (i17 & 16) != 0 ? 1.0f : f11;
        u uVar4 = (i17 & 32) != 0 ? null : uVar2;
        float f19 = (i17 & 64) != 0 ? 1.0f : f12;
        float f21 = (i17 & 128) != 0 ? 0.0f : f13;
        int c11 = (i17 & 256) != 0 ? m.c() : i12;
        int d11 = (i17 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? m.d() : i13;
        float f22 = (i17 & 1024) != 0 ? 4.0f : f14;
        float f23 = (i17 & 2048) != 0 ? 0.0f : f15;
        float f24 = (i17 & 4096) != 0 ? 1.0f : f16;
        float f25 = (i17 & 8192) != 0 ? 0.0f : f17;
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.f6548a;
        t.E(1886828752);
        if (!(t.u() instanceof i)) {
            f.c();
        }
        t.w();
        if (t.s()) {
            t.K(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
        } else {
            t.c();
        }
        g a11 = Updater.a(t);
        Updater.c(a11, str2, VectorComposeKt$Path$2$1.f6549a);
        Updater.c(a11, list2, VectorComposeKt$Path$2$2.f6555a);
        Updater.c(a11, y0.c(b11), VectorComposeKt$Path$2$3.f6556a);
        Updater.c(a11, uVar3, VectorComposeKt$Path$2$4.f6557a);
        Updater.c(a11, Float.valueOf(f18), VectorComposeKt$Path$2$5.f6558a);
        Updater.c(a11, uVar4, VectorComposeKt$Path$2$6.f6559a);
        Updater.c(a11, Float.valueOf(f19), VectorComposeKt$Path$2$7.f6560a);
        Updater.c(a11, Float.valueOf(f21), VectorComposeKt$Path$2$8.f6561a);
        Updater.c(a11, m1.d(d11), VectorComposeKt$Path$2$9.f6562a);
        Updater.c(a11, l1.d(c11), VectorComposeKt$Path$2$10.f6550a);
        Updater.c(a11, Float.valueOf(f22), VectorComposeKt$Path$2$11.f6551a);
        Updater.c(a11, Float.valueOf(f23), VectorComposeKt$Path$2$12.f6552a);
        Updater.c(a11, Float.valueOf(f24), VectorComposeKt$Path$2$13.f6553a);
        Updater.c(a11, Float.valueOf(f25), VectorComposeKt$Path$2$14.f6554a);
        t.d();
        t.P();
        s0 v = t.v();
        if (v != null) {
            int i18 = c11;
            s0 s0Var = v;
            int i19 = d11;
            VectorComposeKt$Path$3 vectorComposeKt$Path$3 = r0;
            VectorComposeKt$Path$3 vectorComposeKt$Path$32 = new VectorComposeKt$Path$3(list, b11, str2, uVar3, f18, uVar4, f19, f21, i18, i19, f22, f23, f24, f25, i14, i15, i16);
            s0Var.a(vectorComposeKt$Path$3);
        }
    }
}
