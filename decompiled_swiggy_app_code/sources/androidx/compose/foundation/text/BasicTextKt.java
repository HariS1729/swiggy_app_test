package androidx.compose.foundation.text;

import androidx.compose.runtime.saveable.SaverKt;
import b0.k;
import m0.c;

/* compiled from: BasicText.kt */
public final class BasicTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(p1.b r34, p0.d r35, p1.c0 r36, lp0.l<? super p1.y, bp0.k> r37, int r38, boolean r39, int r40, java.util.Map<java.lang.String, a0.a> r41, e0.g r42, int r43, int r44) {
        /*
            r10 = r34
            r11 = r43
            r12 = r44
            java.lang.String r0 = "text"
            kotlin.jvm.internal.p.j(r10, r0)
            r0 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            r1 = r42
            e0.g r13 = r1.t(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r11 | 6
            goto L_0x002b
        L_0x001b:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x002a
            boolean r0 = r13.k(r10)
            if (r0 == 0) goto L_0x0027
            r0 = 4
            goto L_0x0028
        L_0x0027:
            r0 = 2
        L_0x0028:
            r0 = r0 | r11
            goto L_0x002b
        L_0x002a:
            r0 = r11
        L_0x002b:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0032
            r0 = r0 | 48
            goto L_0x0045
        L_0x0032:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r35
            boolean r4 = r13.k(r3)
            if (r4 == 0) goto L_0x0041
            r4 = 32
            goto L_0x0043
        L_0x0041:
            r4 = 16
        L_0x0043:
            r0 = r0 | r4
            goto L_0x0047
        L_0x0045:
            r3 = r35
        L_0x0047:
            r4 = r12 & 4
            if (r4 == 0) goto L_0x004e
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r36
            boolean r7 = r13.k(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r0 = r0 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r36
        L_0x0063:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x006a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r37
            boolean r9 = r13.k(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r9
            goto L_0x007f
        L_0x007d:
            r8 = r37
        L_0x007f:
            r9 = r12 & 16
            if (r9 == 0) goto L_0x0086
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009b
            r14 = r38
            boolean r15 = r13.p(r14)
            if (r15 == 0) goto L_0x0097
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r15
            goto L_0x009d
        L_0x009b:
            r14 = r38
        L_0x009d:
            r15 = r12 & 32
            if (r15 == 0) goto L_0x00a8
            r16 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r16
            r1 = r39
            goto L_0x00bd
        L_0x00a8:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r1 = r39
            if (r16 != 0) goto L_0x00bd
            boolean r16 = r13.m(r1)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r16
        L_0x00bd:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00c8
            r17 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r17
            r5 = r40
            goto L_0x00dd
        L_0x00c8:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r11 & r17
            r5 = r40
            if (r17 != 0) goto L_0x00dd
            boolean r18 = r13.p(r5)
            if (r18 == 0) goto L_0x00d9
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r0 = r0 | r18
        L_0x00dd:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e5
            r18 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 | r18
        L_0x00e5:
            r3 = 128(0x80, float:1.794E-43)
            if (r1 != r3) goto L_0x0109
            r3 = 23967451(0x16db6db, float:4.3661218E-38)
            r3 = r3 & r0
            r5 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r5) goto L_0x0109
            boolean r3 = r13.b()
            if (r3 != 0) goto L_0x00f9
            goto L_0x0109
        L_0x00f9:
            r13.h()
            r2 = r35
            r7 = r40
            r3 = r6
            r4 = r8
            r5 = r14
            r6 = r39
            r8 = r41
            goto L_0x035e
        L_0x0109:
            r13.H()
            r3 = r11 & 1
            r5 = 1
            if (r3 == 0) goto L_0x012f
            boolean r3 = r13.i()
            if (r3 == 0) goto L_0x0118
            goto L_0x012f
        L_0x0118:
            r13.h()
            if (r1 == 0) goto L_0x0121
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r1
        L_0x0121:
            r17 = r39
            r18 = r40
            r7 = r0
            r15 = r6
            r9 = r8
            r16 = r14
            r14 = r35
            r8 = r41
            goto L_0x017c
        L_0x012f:
            if (r2 == 0) goto L_0x0134
            p0.d$a r2 = p0.d.f16037h0
            goto L_0x0136
        L_0x0134:
            r2 = r35
        L_0x0136:
            if (r4 == 0) goto L_0x013f
            p1.c0$a r3 = p1.c0.f16065d
            p1.c0 r3 = r3.a()
            r6 = r3
        L_0x013f:
            if (r7 == 0) goto L_0x0144
            androidx.compose.foundation.text.BasicTextKt$BasicText$4 r3 = androidx.compose.foundation.text.BasicTextKt$BasicText$4.f4278a
            r8 = r3
        L_0x0144:
            if (r9 == 0) goto L_0x014d
            a2.l$a r3 = a2.l.f950a
            int r3 = r3.a()
            r14 = r3
        L_0x014d:
            if (r15 == 0) goto L_0x0151
            r3 = 1
            goto L_0x0153
        L_0x0151:
            r3 = r39
        L_0x0153:
            if (r16 == 0) goto L_0x0159
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x015b
        L_0x0159:
            r4 = r40
        L_0x015b:
            if (r1 == 0) goto L_0x0170
            java.util.Map r1 = kotlin.collections.x.f()
            r7 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r7
            r7 = r0
            r17 = r3
            r18 = r4
            r15 = r6
            r9 = r8
            r16 = r14
            r8 = r1
            goto L_0x017b
        L_0x0170:
            r7 = r0
            r17 = r3
            r18 = r4
            r15 = r6
            r9 = r8
            r16 = r14
            r8 = r41
        L_0x017b:
            r14 = r2
        L_0x017c:
            r13.A()
            r19 = 0
            if (r18 <= 0) goto L_0x0185
            r0 = 1
            goto L_0x0186
        L_0x0185:
            r0 = 0
        L_0x0186:
            if (r0 == 0) goto L_0x0375
            e0.m0 r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.a()
            java.lang.Object r0 = r13.z(r0)
            r6 = r0
            b0.k r6 = (b0.k) r6
            e0.m0 r0 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r0 = r13.z(r0)
            r20 = r0
            d2.e r20 = (d2.e) r20
            e0.m0 r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r13.z(r0)
            r21 = r0
            u1.i$b r21 = (u1.i.b) r21
            e0.m0 r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            java.lang.Object r0 = r13.z(r0)
            b0.o r0 = (b0.o) r0
            long r3 = r0.a()
            kotlin.Pair r0 = androidx.compose.foundation.text.CoreTextKt.b(r10, r8)
            java.lang.Object r1 = r0.a()
            r22 = r1
            java.util.List r22 = (java.util.List) r22
            java.lang.Object r0 = r0.b()
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r19] = r10
            r0[r5] = r6
            m0.c r1 = c(r6)
            r23 = 0
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2 r5 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
            r5.<init>(r6)
            r24 = 72
            r25 = 4
            r35 = r0
            r36 = r1
            r37 = r23
            r38 = r5
            r39 = r13
            r40 = r24
            r41 = r25
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.b(r35, r36, r37, r38, r39, r40, r41)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.E(r5)
            java.lang.Object r5 = r13.F()
            e0.g$a r23 = e0.g.f14172a
            r35 = r0
            java.lang.Object r0 = r23.a()
            if (r5 != r0) goto L_0x0250
            androidx.compose.foundation.text.TextController r5 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r1 = new androidx.compose.foundation.text.TextState
            a0.n r0 = new a0.n
            r23 = 0
            r26 = r35
            r35 = r0
            r28 = r1
            r1 = r34
            r36 = r2
            r2 = r15
            r29 = r3
            r3 = r18
            r4 = r17
            r31 = r5
            r5 = r16
            r32 = r6
            r6 = r20
            r33 = r7
            r7 = r21
            r24 = r8
            r8 = r22
            r11 = r9
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r35
            r0 = r26
            r2 = r28
            r2.<init>(r3, r0)
            r0 = r31
            r0.<init>(r2)
            r13.y(r0)
            r5 = r0
            goto L_0x025b
        L_0x0250:
            r36 = r2
            r29 = r3
            r32 = r6
            r33 = r7
            r24 = r8
            r11 = r9
        L_0x025b:
            r13.P()
            r9 = r5
            androidx.compose.foundation.text.TextController r9 = (androidx.compose.foundation.text.TextController) r9
            androidx.compose.foundation.text.TextState r8 = r9.k()
            boolean r0 = r13.s()
            if (r0 != 0) goto L_0x0287
            a0.n r0 = r8.h()
            r1 = r34
            r2 = r15
            r3 = r20
            r4 = r21
            r5 = r17
            r6 = r16
            r7 = r18
            r12 = r8
            r8 = r22
            a0.n r0 = androidx.compose.foundation.text.CoreTextKt.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r9.n(r0)
            goto L_0x0288
        L_0x0287:
            r12 = r8
        L_0x0288:
            r12.l(r11)
            r0 = r29
            r12.o(r0)
            r0 = r32
            r9.o(r0)
            boolean r0 = r36.isEmpty()
            if (r0 == 0) goto L_0x02a2
            androidx.compose.foundation.text.ComposableSingletons$BasicTextKt r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextKt.f4318a
            lp0.p r0 = r0.a()
            goto L_0x02b3
        L_0x02a2:
            r0 = 1892283635(0x70c9f4f3, float:5.000209E29)
            androidx.compose.foundation.text.BasicTextKt$BasicText$6 r1 = new androidx.compose.foundation.text.BasicTextKt$BasicText$6
            r2 = r36
            r3 = r33
            r1.<init>(r10, r2, r3)
            r2 = 1
            l0.a r0 = l0.b.b(r13, r0, r2, r1)
        L_0x02b3:
            p0.d r1 = r9.j()
            p0.d r1 = r14.N(r1)
            i1.t r2 = r9.i()
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r13.E(r3)
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r3 = r13.z(r3)
            d2.e r3 = (d2.e) r3
            e0.m0 r4 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r4 = r13.z(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            e0.m0 r5 = androidx.compose.ui.platform.CompositionLocalsKt.n()
            java.lang.Object r5 = r13.z(r5)
            androidx.compose.ui.platform.n1 r5 = (androidx.compose.ui.platform.n1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r7 = r6.a()
            lp0.q r1 = androidx.compose.ui.layout.LayoutKt.b(r1)
            e0.e r8 = r13.u()
            boolean r8 = r8 instanceof e0.e
            if (r8 != 0) goto L_0x02f8
            e0.f.c()
        L_0x02f8:
            r13.f()
            boolean r8 = r13.s()
            if (r8 == 0) goto L_0x0305
            r13.K(r7)
            goto L_0x0308
        L_0x0305:
            r13.c()
        L_0x0308:
            r13.J()
            e0.g r7 = androidx.compose.runtime.Updater.a(r13)
            lp0.p r8 = r6.d()
            androidx.compose.runtime.Updater.c(r7, r2, r8)
            lp0.p r2 = r6.b()
            androidx.compose.runtime.Updater.c(r7, r3, r2)
            lp0.p r2 = r6.c()
            androidx.compose.runtime.Updater.c(r7, r4, r2)
            lp0.p r2 = r6.f()
            androidx.compose.runtime.Updater.c(r7, r5, r2)
            r13.o()
            e0.g r2 = e0.t0.b(r13)
            e0.t0 r2 = e0.t0.a(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r1.invoke(r2, r13, r3)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.E(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0.invoke(r13, r1)
            r13.P()
            r13.d()
            r13.P()
            r4 = r11
            r2 = r14
            r3 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r24
        L_0x035e:
            e0.s0 r11 = r13.v()
            if (r11 != 0) goto L_0x0365
            goto L_0x0374
        L_0x0365:
            androidx.compose.foundation.text.BasicTextKt$BasicText$7 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText$7
            r0 = r12
            r1 = r34
            r9 = r43
            r10 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0374:
            return
        L_0x0375:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.a(p1.b, p0.d, p1.c0, lp0.l, int, boolean, int, java.util.Map, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r28, p0.d r29, p1.c0 r30, lp0.l<? super p1.y, bp0.k> r31, int r32, boolean r33, int r34, e0.g r35, int r36, int r37) {
        /*
            r8 = r28
            r9 = r36
            java.lang.String r0 = "text"
            kotlin.jvm.internal.p.j(r8, r0)
            r0 = 1022429478(0x3cf10926, float:0.029423308)
            r1 = r35
            e0.g r10 = r1.t(r0)
            r0 = r37 & 1
            if (r0 == 0) goto L_0x0019
            r0 = r9 | 6
            goto L_0x0029
        L_0x0019:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x0028
            boolean r0 = r10.k(r8)
            if (r0 == 0) goto L_0x0025
            r0 = 4
            goto L_0x0026
        L_0x0025:
            r0 = 2
        L_0x0026:
            r0 = r0 | r9
            goto L_0x0029
        L_0x0028:
            r0 = r9
        L_0x0029:
            r2 = r37 & 2
            if (r2 == 0) goto L_0x0030
            r0 = r0 | 48
            goto L_0x0043
        L_0x0030:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0043
            r3 = r29
            boolean r4 = r10.k(r3)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r0 = r0 | r4
            goto L_0x0045
        L_0x0043:
            r3 = r29
        L_0x0045:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r5 = r9 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x005f
            r5 = r30
            boolean r6 = r10.k(r5)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r6
            goto L_0x0061
        L_0x005f:
            r5 = r30
        L_0x0061:
            r6 = r37 & 8
            if (r6 == 0) goto L_0x0068
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r7 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007b
            r7 = r31
            boolean r11 = r10.k(r7)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r0 = r0 | r11
            goto L_0x007d
        L_0x007b:
            r7 = r31
        L_0x007d:
            r11 = r37 & 16
            if (r11 == 0) goto L_0x0084
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0084:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x0099
            r12 = r32
            boolean r13 = r10.p(r12)
            if (r13 == 0) goto L_0x0095
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r0 = r0 | r13
            goto L_0x009b
        L_0x0099:
            r12 = r32
        L_0x009b:
            r13 = r37 & 32
            if (r13 == 0) goto L_0x00a3
            r14 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r14
            goto L_0x00b7
        L_0x00a3:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r9
            if (r14 != 0) goto L_0x00b7
            r14 = r33
            boolean r15 = r10.m(r14)
            if (r15 == 0) goto L_0x00b3
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r0 = r0 | r15
            goto L_0x00b9
        L_0x00b7:
            r14 = r33
        L_0x00b9:
            r15 = r37 & 64
            if (r15 == 0) goto L_0x00c4
            r16 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r16
            r1 = r34
            goto L_0x00d9
        L_0x00c4:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            r1 = r34
            if (r16 != 0) goto L_0x00d9
            boolean r16 = r10.p(r1)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r0 = r0 | r16
        L_0x00d9:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r0 = r0 & r16
            r1 = 599186(0x92492, float:8.39638E-40)
            if (r0 != r1) goto L_0x00f6
            boolean r0 = r10.b()
            if (r0 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r10.h()
            r2 = r3
            r3 = r5
            r4 = r7
            r5 = r12
            r6 = r14
            r7 = r34
            goto L_0x02ba
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            p0.d$a r0 = p0.d.f16037h0
            r3 = r0
        L_0x00fb:
            if (r4 == 0) goto L_0x0106
            p1.c0$a r0 = p1.c0.f16065d
            p1.c0 r0 = r0.a()
            r27 = r0
            goto L_0x0108
        L_0x0106:
            r27 = r5
        L_0x0108:
            if (r6 == 0) goto L_0x010d
            androidx.compose.foundation.text.BasicTextKt$BasicText$1 r0 = androidx.compose.foundation.text.BasicTextKt$BasicText$1.f4268a
            r7 = r0
        L_0x010d:
            if (r11 == 0) goto L_0x0116
            a2.l$a r0 = a2.l.f950a
            int r0 = r0.a()
            r12 = r0
        L_0x0116:
            r0 = 1
            if (r13 == 0) goto L_0x011a
            r14 = 1
        L_0x011a:
            if (r15 == 0) goto L_0x0123
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0125
        L_0x0123:
            r11 = r34
        L_0x0125:
            r1 = 0
            if (r11 <= 0) goto L_0x012a
            r2 = 1
            goto L_0x012b
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 == 0) goto L_0x02d1
            e0.m0 r2 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.a()
            java.lang.Object r2 = r10.z(r2)
            r13 = r2
            b0.k r13 = (b0.k) r13
            e0.m0 r2 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r2 = r10.z(r2)
            r4 = r2
            d2.e r4 = (d2.e) r4
            e0.m0 r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r10.z(r2)
            r5 = r2
            u1.i$b r5 = (u1.i.b) r5
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r8
            r2[r0] = r13
            m0.c r0 = c(r13)
            r1 = 0
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1 r6 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
            r6.<init>(r13)
            r15 = 72
            r16 = 4
            r29 = r2
            r30 = r0
            r31 = r1
            r32 = r6
            r33 = r10
            r34 = r15
            r35 = r16
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.b(r29, r30, r31, r32, r33, r34, r35)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r2)
            java.lang.Object r2 = r10.F()
            e0.g$a r6 = e0.g.f14172a
            java.lang.Object r6 = r6.a()
            if (r2 != r6) goto L_0x01cb
            androidx.compose.foundation.text.TextController r2 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r6 = new androidx.compose.foundation.text.TextState
            p1.b r17 = new p1.b
            r15 = 0
            r16 = 0
            r18 = 6
            r19 = 0
            r29 = r17
            r30 = r28
            r31 = r15
            r32 = r16
            r33 = r18
            r34 = r19
            r29.<init>(r30, r31, r32, r33, r34)
            a0.n r15 = new a0.n
            r24 = 0
            r25 = 128(0x80, float:1.794E-43)
            r26 = 0
            r16 = r15
            r18 = r27
            r19 = r11
            r20 = r14
            r21 = r12
            r22 = r4
            r23 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r6.<init>(r15, r0)
            r2.<init>(r6)
            r10.y(r2)
        L_0x01cb:
            r10.P()
            r15 = r2
            androidx.compose.foundation.text.TextController r15 = (androidx.compose.foundation.text.TextController) r15
            androidx.compose.foundation.text.TextState r6 = r15.k()
            boolean r0 = r10.s()
            if (r0 != 0) goto L_0x01f5
            a0.n r0 = r6.h()
            r1 = r28
            r2 = r27
            r8 = r3
            r3 = r4
            r4 = r5
            r5 = r14
            r9 = r6
            r6 = r12
            r29 = r12
            r12 = r7
            r7 = r11
            a0.n r0 = androidx.compose.foundation.text.CoreTextKt.e(r0, r1, r2, r3, r4, r5, r6, r7)
            r15.n(r0)
            goto L_0x01fa
        L_0x01f5:
            r8 = r3
            r9 = r6
            r29 = r12
            r12 = r7
        L_0x01fa:
            r9.l(r12)
            r15.o(r13)
            r0 = 959239573(0x392cd595, float:1.6482764E-4)
            r10.E(r0)
            if (r13 == 0) goto L_0x0219
            e0.m0 r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.b()
            java.lang.Object r0 = r10.z(r0)
            b0.o r0 = (b0.o) r0
            long r0 = r0.a()
            r9.o(r0)
        L_0x0219:
            r10.P()
            p0.d r0 = r15.j()
            p0.d r0 = r8.N(r0)
            i1.t r1 = r15.i()
            r2 = 544976794(0x207baf9a, float:2.1318629E-19)
            r10.E(r2)
            e0.m0 r2 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r2 = r10.z(r2)
            d2.e r2 = (d2.e) r2
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r3 = r10.z(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.ui.unit.LayoutDirection) r3
            e0.m0 r4 = androidx.compose.ui.platform.CompositionLocalsKt.n()
            java.lang.Object r4 = r10.z(r4)
            androidx.compose.ui.platform.n1 r4 = (androidx.compose.ui.platform.n1) r4
            p0.d r0 = androidx.compose.ui.ComposedModifierKt.e(r10, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r6 = r5.a()
            r7 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r10.E(r7)
            e0.e r7 = r10.u()
            boolean r7 = r7 instanceof e0.e
            if (r7 != 0) goto L_0x0267
            e0.f.c()
        L_0x0267:
            r10.f()
            boolean r7 = r10.s()
            if (r7 == 0) goto L_0x0279
            androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1 r7 = new androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
            r7.<init>(r6)
            r10.K(r7)
            goto L_0x027c
        L_0x0279:
            r10.c()
        L_0x027c:
            r10.J()
            e0.g r6 = androidx.compose.runtime.Updater.a(r10)
            lp0.p r7 = r5.d()
            androidx.compose.runtime.Updater.c(r6, r1, r7)
            lp0.p r1 = r5.b()
            androidx.compose.runtime.Updater.c(r6, r2, r1)
            lp0.p r1 = r5.c()
            androidx.compose.runtime.Updater.c(r6, r3, r1)
            lp0.p r1 = r5.f()
            androidx.compose.runtime.Updater.c(r6, r4, r1)
            lp0.p r1 = r5.e()
            androidx.compose.runtime.Updater.c(r6, r0, r1)
            r10.o()
            r10.d()
            r10.P()
            r10.P()
            r5 = r29
            r2 = r8
            r7 = r11
            r4 = r12
            r6 = r14
            r3 = r27
        L_0x02ba:
            e0.s0 r10 = r10.v()
            if (r10 != 0) goto L_0x02c1
            goto L_0x02d0
        L_0x02c1:
            androidx.compose.foundation.text.BasicTextKt$BasicText$3 r11 = new androidx.compose.foundation.text.BasicTextKt$BasicText$3
            r0 = r11
            r1 = r28
            r8 = r36
            r9 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x02d0:
            return
        L_0x02d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.b(java.lang.String, p0.d, p1.c0, lp0.l, int, boolean, int, e0.g, int, int):void");
    }

    private static final c<Long, Long> c(k kVar) {
        return SaverKt.a(new BasicTextKt$selectionIdSaver$1(kVar), BasicTextKt$selectionIdSaver$2.f4294a);
    }
}
