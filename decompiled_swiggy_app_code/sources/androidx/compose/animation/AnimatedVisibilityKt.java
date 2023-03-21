package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import e0.a1;
import e0.g;
import e0.h0;
import lp0.l;

/* compiled from: AnimatedVisibility.kt */
public final class AnimatedVisibilityKt {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void a(androidx.compose.animation.core.Transition<T> r18, lp0.l<? super T, java.lang.Boolean> r19, p0.d r20, androidx.compose.animation.a r21, androidx.compose.animation.c r22, lp0.q<? super p.b, ? super e0.g, ? super java.lang.Integer, bp0.k> r23, e0.g r24, int r25) {
        /*
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r23
            r10 = r25
            r0 = -918810774(0xffffffffc93c0f6a, float:-770294.6)
            r1 = r24
            e0.g r15 = r1.t(r0)
            r0 = r10 & 14
            r1 = 2
            if (r0 != 0) goto L_0x0023
            boolean r0 = r15.k(r6)
            if (r0 == 0) goto L_0x0020
            r0 = 4
            goto L_0x0021
        L_0x0020:
            r0 = 2
        L_0x0021:
            r0 = r0 | r10
            goto L_0x0024
        L_0x0023:
            r0 = r10
        L_0x0024:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0034
            boolean r2 = r15.k(r7)
            if (r2 == 0) goto L_0x0031
            r2 = 32
            goto L_0x0033
        L_0x0031:
            r2 = 16
        L_0x0033:
            r0 = r0 | r2
        L_0x0034:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0044
            boolean r2 = r15.k(r8)
            if (r2 == 0) goto L_0x0041
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r0 = r0 | r2
        L_0x0044:
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            r14 = r21
            if (r2 != 0) goto L_0x0056
            boolean r2 = r15.k(r14)
            if (r2 == 0) goto L_0x0053
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0055
        L_0x0053:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0055:
            r0 = r0 | r2
        L_0x0056:
            r11 = 57344(0xe000, float:8.0356E-41)
            r2 = r10 & r11
            r13 = r22
            if (r2 != 0) goto L_0x006b
            boolean r2 = r15.k(r13)
            if (r2 == 0) goto L_0x0068
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006a
        L_0x0068:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x006a:
            r0 = r0 | r2
        L_0x006b:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x007c
            boolean r2 = r15.k(r9)
            if (r2 == 0) goto L_0x0079
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007b
        L_0x0079:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x007b:
            r0 = r0 | r2
        L_0x007c:
            r12 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r12
            r2 = 74898(0x12492, float:1.04954E-40)
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0094
            boolean r0 = r15.b()
            if (r0 != 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            r15.h()
        L_0x0091:
            r2 = r15
            goto L_0x02a6
        L_0x0094:
            r0 = r12 & 14
            r5 = -3686930(0xffffffffffc7bdee, float:NaN)
            r15.E(r5)
            boolean r2 = r15.k(r6)
            java.lang.Object r3 = r15.F()
            r4 = 0
            if (r2 != 0) goto L_0x00af
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00be
        L_0x00af:
            java.lang.Object r2 = r18.g()
            java.lang.Object r2 = r7.invoke(r2)
            e0.h0 r3 = androidx.compose.runtime.j.e(r2, r4, r1, r4)
            r15.y(r3)
        L_0x00be:
            r15.P()
            e0.h0 r3 = (e0.h0) r3
            java.lang.Object r1 = r18.m()
            java.lang.Object r1 = r7.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00e5
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00e5
            boolean r1 = r18.q()
            if (r1 == 0) goto L_0x0091
        L_0x00e5:
            r1 = r0 | 48
            r2 = 1117107336(0x4295b488, float:74.8526)
            r15.E(r2)
            r2 = r1 & 14
            r15.E(r5)
            boolean r16 = r15.k(r6)
            java.lang.Object r4 = r15.F()
            if (r16 != 0) goto L_0x0104
            e0.g$a r16 = e0.g.f14172a
            java.lang.Object r5 = r16.a()
            if (r4 != r5) goto L_0x010b
        L_0x0104:
            java.lang.Object r4 = r18.g()
            r15.y(r4)
        L_0x010b:
            r15.P()
            boolean r5 = r18.q()
            if (r5 == 0) goto L_0x0118
            java.lang.Object r4 = r18.g()
        L_0x0118:
            int r5 = r1 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r11 = -174039129(0xfffffffff5a05fa7, float:-4.065955E32)
            r15.E(r11)
            r17 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 | r17
            int r5 = r5 << 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r0 = r0 | r5
            androidx.compose.animation.EnterExitState r4 = g(r6, r7, r4, r15, r0)
            r15.P()
            java.lang.Object r5 = r18.m()
            r15.E(r11)
            androidx.compose.animation.EnterExitState r5 = g(r6, r7, r5, r15, r0)
            r15.P()
            int r0 = r1 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r2 | r0
            java.lang.String r17 = "EnterExitTransition"
            r0 = r18
            r1 = r4
            r2 = r5
            r5 = r3
            r3 = r17
            r6 = 0
            r4 = r15
            r6 = r5
            r7 = -3686930(0xffffffffffc7bdee, float:NaN)
            r5 = r11
            androidx.compose.animation.core.Transition r11 = androidx.compose.animation.core.TransitionKt.a(r0, r1, r2, r3, r4, r5)
            r15.P()
            r0 = -3686552(0xffffffffffc7bf68, float:NaN)
            r15.E(r0)
            boolean r0 = r15.k(r11)
            boolean r1 = r15.k(r6)
            r0 = r0 | r1
            java.lang.Object r1 = r15.F()
            if (r0 != 0) goto L_0x017a
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0183
        L_0x017a:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 r1 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1
            r0 = 0
            r1.<init>(r11, r6, r0)
            r15.y(r1)
        L_0x0183:
            r15.P()
            lp0.p r1 = (lp0.p) r1
            r0 = 0
            e0.u.e(r11, r1, r15, r0)
            int r1 = r12 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r1 = r1 | r2
            r2 = -918809573(0xffffffffc93c141b, float:-770369.7)
            r15.E(r2)
            java.lang.Object r2 = r11.g()
            androidx.compose.animation.EnterExitState r3 = androidx.compose.animation.EnterExitState.Visible
            if (r2 == r3) goto L_0x01b3
            java.lang.Object r2 = r11.m()
            if (r2 != r3) goto L_0x01b0
            goto L_0x01b3
        L_0x01b0:
            r2 = r15
            goto L_0x02a3
        L_0x01b3:
            r2 = r1 & 14
            r15.E(r7)
            boolean r3 = r15.k(r11)
            java.lang.Object r4 = r15.F()
            if (r3 != 0) goto L_0x01ca
            e0.g$a r3 = e0.g.f14172a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01d2
        L_0x01ca:
            p.c r4 = new p.c
            r4.<init>(r11)
            r15.y(r4)
        L_0x01d2:
            r15.P()
            p.c r4 = (p.c) r4
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            int r3 = r1 >> 3
            r5 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r5
            r3 = r3 & 896(0x380, float:1.256E-42)
            r16 = r2 | r3
            java.lang.String r2 = "Built-in"
            r12 = r21
            r13 = r22
            r14 = r2
            r2 = r15
            p0.d r3 = androidx.compose.animation.EnterExitTransitionKt.g(r11, r12, r13, r14, r15, r16)
            p0.d r3 = r8.N(r3)
            r5 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r2.E(r5)
            java.lang.Object r5 = r2.F()
            e0.g$a r6 = e0.g.f14172a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x020c
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy r5 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy
            r5.<init>(r4)
            r2.y(r5)
        L_0x020c:
            r2.P()
            i1.t r5 = (i1.t) r5
            r6 = 1376089335(0x520574f7, float:1.43298249E11)
            r2.E(r6)
            e0.m0 r6 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r6 = r2.z(r6)
            d2.e r6 = (d2.e) r6
            e0.m0 r7 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r7 = r2.z(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.ui.unit.LayoutDirection) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r11 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r12 = r11.a()
            lp0.q r3 = androidx.compose.ui.layout.LayoutKt.b(r3)
            e0.e r13 = r2.u()
            boolean r13 = r13 instanceof e0.e
            if (r13 != 0) goto L_0x0240
            e0.f.c()
        L_0x0240:
            r2.f()
            boolean r13 = r2.s()
            if (r13 == 0) goto L_0x024d
            r2.K(r12)
            goto L_0x0250
        L_0x024d:
            r2.c()
        L_0x0250:
            r2.J()
            e0.g r12 = androidx.compose.runtime.Updater.a(r2)
            lp0.p r13 = r11.d()
            androidx.compose.runtime.Updater.c(r12, r5, r13)
            lp0.p r5 = r11.b()
            androidx.compose.runtime.Updater.c(r12, r6, r5)
            lp0.p r5 = r11.c()
            androidx.compose.runtime.Updater.c(r12, r7, r5)
            r2.o()
            e0.g r5 = e0.t0.b(r2)
            e0.t0 r5 = e0.t0.a(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r5, r2, r0)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r2.E(r0)
            r0 = -174037785(0xfffffffff5a064e7, float:-4.0664748E32)
            r2.E(r0)
            int r0 = r1 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.invoke(r4, r2, r0)
            r2.P()
            r2.P()
            r2.d()
            r2.P()
        L_0x02a3:
            r2.P()
        L_0x02a6:
            e0.s0 r11 = r2.v()
            if (r11 != 0) goto L_0x02ad
            goto L_0x02c4
        L_0x02ad:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
            r0 = r12
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.a(r12)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.a(androidx.compose.animation.core.Transition, lp0.l, p0.d, androidx.compose.animation.a, androidx.compose.animation.c, lp0.q, e0.g, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void b(androidx.compose.animation.core.Transition<T> r23, lp0.l<? super T, java.lang.Boolean> r24, p0.d r25, androidx.compose.animation.a r26, androidx.compose.animation.c r27, lp0.q<? super p.b, ? super e0.g, ? super java.lang.Integer, bp0.k> r28, e0.g r29, int r30, int r31) {
        /*
            r8 = r23
            r9 = r24
            r10 = r28
            r11 = r30
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "visible"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r10, r0)
            r0 = 1844997449(0x6df86d49, float:9.61055E27)
            r1 = r29
            e0.g r12 = r1.t(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r31 & r0
            if (r0 == 0) goto L_0x0029
            r0 = r11 | 6
            goto L_0x0039
        L_0x0029:
            r0 = r11 & 14
            if (r0 != 0) goto L_0x0038
            boolean r0 = r12.k(r8)
            if (r0 == 0) goto L_0x0035
            r0 = 4
            goto L_0x0036
        L_0x0035:
            r0 = 2
        L_0x0036:
            r0 = r0 | r11
            goto L_0x0039
        L_0x0038:
            r0 = r11
        L_0x0039:
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0040
            r0 = r0 | 48
            goto L_0x0050
        L_0x0040:
            r1 = r11 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0050
            boolean r1 = r12.k(r9)
            if (r1 == 0) goto L_0x004d
            r1 = 32
            goto L_0x004f
        L_0x004d:
            r1 = 16
        L_0x004f:
            r0 = r0 | r1
        L_0x0050:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0057
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0057:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r25
            boolean r3 = r12.k(r2)
            if (r3 == 0) goto L_0x0066
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r0 = r0 | r3
            goto L_0x006c
        L_0x006a:
            r2 = r25
        L_0x006c:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0086
            r4 = r26
            boolean r5 = r12.k(r4)
            if (r5 == 0) goto L_0x0082
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r0 = r0 | r5
            goto L_0x0088
        L_0x0086:
            r4 = r26
        L_0x0088:
            r5 = r31 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0092
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a5
        L_0x0092:
            r7 = r11 & r6
            if (r7 != 0) goto L_0x00a5
            r7 = r27
            boolean r13 = r12.k(r7)
            if (r13 == 0) goto L_0x00a1
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a3
        L_0x00a1:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a3:
            r0 = r0 | r13
            goto L_0x00a7
        L_0x00a5:
            r7 = r27
        L_0x00a7:
            r13 = r31 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x00b1
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x00af:
            r0 = r0 | r13
            goto L_0x00c1
        L_0x00b1:
            r13 = r11 & r14
            if (r13 != 0) goto L_0x00c1
            boolean r13 = r12.k(r10)
            if (r13 == 0) goto L_0x00be
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00be:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00af
        L_0x00c1:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r0
            r15 = 74898(0x12492, float:1.04954E-40)
            r13 = r13 ^ r15
            if (r13 != 0) goto L_0x00d9
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x00d2
            goto L_0x00d9
        L_0x00d2:
            r12.h()
            r3 = r2
            r5 = r7
            goto L_0x0142
        L_0x00d9:
            if (r1 == 0) goto L_0x00df
            p0.d$a r1 = p0.d.f16037h0
            r13 = r1
            goto L_0x00e0
        L_0x00df:
            r13 = r2
        L_0x00e0:
            r1 = 3
            r2 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0100
            androidx.compose.animation.a r3 = androidx.compose.animation.EnterExitTransitionKt.v(r15, r2, r1, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.a r4 = androidx.compose.animation.EnterExitTransitionKt.r(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.a r3 = r3.b(r4)
            r16 = r3
            goto L_0x0102
        L_0x0100:
            r16 = r4
        L_0x0102:
            if (r5 == 0) goto L_0x011e
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.c r3 = androidx.compose.animation.EnterExitTransitionKt.E(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.c r1 = androidx.compose.animation.EnterExitTransitionKt.x(r15, r2, r1, r15)
            androidx.compose.animation.c r1 = r3.b(r1)
            r15 = r1
            goto L_0x011f
        L_0x011e:
            r15 = r7
        L_0x011f:
            r1 = r0 & 14
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = r0 & r6
            r1 = r1 | r2
            r0 = r0 & r14
            r7 = r1 | r0
            r0 = r23
            r1 = r24
            r2 = r13
            r3 = r16
            r4 = r15
            r5 = r28
            r6 = r12
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = r13
            r5 = r15
            r4 = r16
        L_0x0142:
            e0.s0 r12 = r12.v()
            if (r12 != 0) goto L_0x0149
            goto L_0x015c
        L_0x0149:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            r0 = r13
            r1 = r23
            r2 = r24
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r12.a(r13)
        L_0x015c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.b(androidx.compose.animation.core.Transition, lp0.l, p0.d, androidx.compose.animation.a, androidx.compose.animation.c, lp0.q, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(defpackage.a2.h r24, boolean r25, p0.d r26, androidx.compose.animation.a r27, androidx.compose.animation.c r28, java.lang.String r29, lp0.q<? super p.b, ? super e0.g, ? super java.lang.Integer, bp0.k> r30, e0.g r31, int r32, int r33) {
        /*
            r8 = r30
            r9 = r32
            java.lang.String r0 = "<this>"
            r10 = r24
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r8, r0)
            r0 = 1844978819(0x6df82483, float:9.599553E27)
            r1 = r31
            e0.g r11 = r1.t(r0)
            r0 = r33 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r9 | 48
            r12 = r25
            goto L_0x0036
        L_0x0022:
            r0 = r9 & 112(0x70, float:1.57E-43)
            r12 = r25
            if (r0 != 0) goto L_0x0035
            boolean r0 = r11.m(r12)
            if (r0 == 0) goto L_0x0031
            r0 = 32
            goto L_0x0033
        L_0x0031:
            r0 = 16
        L_0x0033:
            r0 = r0 | r9
            goto L_0x0036
        L_0x0035:
            r0 = r9
        L_0x0036:
            r1 = r33 & 2
            if (r1 == 0) goto L_0x003d
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0050
        L_0x003d:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0050
            r2 = r26
            boolean r3 = r11.k(r2)
            if (r3 == 0) goto L_0x004c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r0 = r0 | r3
            goto L_0x0052
        L_0x0050:
            r2 = r26
        L_0x0052:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x0059
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x006c
        L_0x0059:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006c
            r4 = r27
            boolean r5 = r11.k(r4)
            if (r5 == 0) goto L_0x0068
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r0 = r0 | r5
            goto L_0x006e
        L_0x006c:
            r4 = r27
        L_0x006e:
            r5 = r33 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0078
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x0078:
            r7 = r9 & r6
            if (r7 != 0) goto L_0x008b
            r7 = r28
            boolean r13 = r11.k(r7)
            if (r13 == 0) goto L_0x0087
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r0 = r0 | r13
            goto L_0x008d
        L_0x008b:
            r7 = r28
        L_0x008d:
            r13 = r33 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x0097
            r15 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r15
            goto L_0x00ab
        L_0x0097:
            r15 = r9 & r14
            if (r15 != 0) goto L_0x00ab
            r15 = r29
            boolean r16 = r11.k(r15)
            if (r16 == 0) goto L_0x00a6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r0 = r0 | r16
            goto L_0x00ad
        L_0x00ab:
            r15 = r29
        L_0x00ad:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b3:
            r0 = r0 | r16
            goto L_0x00c8
        L_0x00b6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r11.k(r8)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b3
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b3
        L_0x00c8:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r16 = r0 & r16
            r17 = 599184(0x92490, float:8.39636E-40)
            r16 = r16 ^ r17
            if (r16 != 0) goto L_0x00e3
            boolean r16 = r11.b()
            if (r16 != 0) goto L_0x00db
            goto L_0x00e3
        L_0x00db:
            r11.h()
            r3 = r2
            r5 = r7
            r6 = r15
            goto L_0x0165
        L_0x00e3:
            if (r1 == 0) goto L_0x00ea
            p0.d$a r1 = p0.d.f16037h0
            r16 = r1
            goto L_0x00ec
        L_0x00ea:
            r16 = r2
        L_0x00ec:
            r1 = 0
            r2 = 3
            r14 = 0
            if (r3 == 0) goto L_0x010c
            androidx.compose.animation.a r3 = androidx.compose.animation.EnterExitTransitionKt.v(r14, r1, r2, r14)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.a r4 = androidx.compose.animation.EnterExitTransitionKt.t(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.a r3 = r3.b(r4)
            r17 = r3
            goto L_0x010e
        L_0x010c:
            r17 = r4
        L_0x010e:
            if (r5 == 0) goto L_0x012a
            androidx.compose.animation.c r1 = androidx.compose.animation.EnterExitTransitionKt.x(r14, r1, r2, r14)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.c r2 = androidx.compose.animation.EnterExitTransitionKt.G(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.c r1 = r1.b(r2)
            r14 = r1
            goto L_0x012b
        L_0x012a:
            r14 = r7
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            java.lang.String r1 = "AnimatedVisibility"
            r15 = r1
        L_0x0130:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            int r2 = r0 >> 3
            r3 = r2 & 14
            int r4 = r0 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.d(r1, r15, r11, r3, r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5.f2502a
            r4 = r0 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r0 = r0 & r6
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r0 | r2
            r0 = r1
            r1 = r3
            r2 = r16
            r3 = r17
            r4 = r14
            r5 = r30
            r6 = r11
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            r5 = r14
            r6 = r15
            r3 = r16
            r4 = r17
        L_0x0165:
            e0.s0 r11 = r11.v()
            if (r11 != 0) goto L_0x016c
            goto L_0x017f
        L_0x016c:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r13)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.c(a2$h, boolean, p0.d, androidx.compose.animation.a, androidx.compose.animation.c, java.lang.String, lp0.q, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(defpackage.a2.t r24, boolean r25, p0.d r26, androidx.compose.animation.a r27, androidx.compose.animation.c r28, java.lang.String r29, lp0.q<? super p.b, ? super e0.g, ? super java.lang.Integer, bp0.k> r30, e0.g r31, int r32, int r33) {
        /*
            r8 = r30
            r9 = r32
            java.lang.String r0 = "<this>"
            r10 = r24
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r8, r0)
            r0 = 1844974544(0x6df813d0, float:9.597029E27)
            r1 = r31
            e0.g r11 = r1.t(r0)
            r0 = r33 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r9 | 48
            r12 = r25
            goto L_0x0036
        L_0x0022:
            r0 = r9 & 112(0x70, float:1.57E-43)
            r12 = r25
            if (r0 != 0) goto L_0x0035
            boolean r0 = r11.m(r12)
            if (r0 == 0) goto L_0x0031
            r0 = 32
            goto L_0x0033
        L_0x0031:
            r0 = 16
        L_0x0033:
            r0 = r0 | r9
            goto L_0x0036
        L_0x0035:
            r0 = r9
        L_0x0036:
            r1 = r33 & 2
            if (r1 == 0) goto L_0x003d
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0050
        L_0x003d:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0050
            r2 = r26
            boolean r3 = r11.k(r2)
            if (r3 == 0) goto L_0x004c
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x004e
        L_0x004c:
            r3 = 128(0x80, float:1.794E-43)
        L_0x004e:
            r0 = r0 | r3
            goto L_0x0052
        L_0x0050:
            r2 = r26
        L_0x0052:
            r3 = r33 & 4
            if (r3 == 0) goto L_0x0059
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x006c
        L_0x0059:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x006c
            r4 = r27
            boolean r5 = r11.k(r4)
            if (r5 == 0) goto L_0x0068
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x006a
        L_0x0068:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006a:
            r0 = r0 | r5
            goto L_0x006e
        L_0x006c:
            r4 = r27
        L_0x006e:
            r5 = r33 & 8
            r6 = 57344(0xe000, float:8.0356E-41)
            if (r5 == 0) goto L_0x0078
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008b
        L_0x0078:
            r7 = r9 & r6
            if (r7 != 0) goto L_0x008b
            r7 = r28
            boolean r13 = r11.k(r7)
            if (r13 == 0) goto L_0x0087
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r0 = r0 | r13
            goto L_0x008d
        L_0x008b:
            r7 = r28
        L_0x008d:
            r13 = r33 & 16
            r14 = 458752(0x70000, float:6.42848E-40)
            if (r13 == 0) goto L_0x0097
            r15 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r15
            goto L_0x00ab
        L_0x0097:
            r15 = r9 & r14
            if (r15 != 0) goto L_0x00ab
            r15 = r29
            boolean r16 = r11.k(r15)
            if (r16 == 0) goto L_0x00a6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r0 = r0 | r16
            goto L_0x00ad
        L_0x00ab:
            r15 = r29
        L_0x00ad:
            r16 = r33 & 32
            if (r16 == 0) goto L_0x00b6
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00b3:
            r0 = r0 | r16
            goto L_0x00c8
        L_0x00b6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r9 & r16
            if (r16 != 0) goto L_0x00c8
            boolean r16 = r11.k(r8)
            if (r16 == 0) goto L_0x00c5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00b3
        L_0x00c5:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00b3
        L_0x00c8:
            r16 = 2995921(0x2db6d1, float:4.19818E-39)
            r16 = r0 & r16
            r17 = 599184(0x92490, float:8.39636E-40)
            r16 = r16 ^ r17
            if (r16 != 0) goto L_0x00e3
            boolean r16 = r11.b()
            if (r16 != 0) goto L_0x00db
            goto L_0x00e3
        L_0x00db:
            r11.h()
            r3 = r2
            r5 = r7
            r6 = r15
            goto L_0x0165
        L_0x00e3:
            if (r1 == 0) goto L_0x00ea
            p0.d$a r1 = p0.d.f16037h0
            r16 = r1
            goto L_0x00ec
        L_0x00ea:
            r16 = r2
        L_0x00ec:
            r1 = 0
            r2 = 3
            r14 = 0
            if (r3 == 0) goto L_0x010c
            androidx.compose.animation.a r3 = androidx.compose.animation.EnterExitTransitionKt.v(r14, r1, r2, r14)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.a r4 = androidx.compose.animation.EnterExitTransitionKt.p(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.a r3 = r3.b(r4)
            r17 = r3
            goto L_0x010e
        L_0x010c:
            r17 = r4
        L_0x010e:
            if (r5 == 0) goto L_0x012a
            androidx.compose.animation.c r1 = androidx.compose.animation.EnterExitTransitionKt.x(r14, r1, r2, r14)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 15
            r23 = 0
            androidx.compose.animation.c r2 = androidx.compose.animation.EnterExitTransitionKt.C(r18, r19, r20, r21, r22, r23)
            androidx.compose.animation.c r1 = r1.b(r2)
            r14 = r1
            goto L_0x012b
        L_0x012a:
            r14 = r7
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            java.lang.String r1 = "AnimatedVisibility"
            r15 = r1
        L_0x0130:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            int r2 = r0 >> 3
            r3 = r2 & 14
            int r4 = r0 >> 12
            r4 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.d(r1, r15, r11, r3, r4)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3 r3 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3.f2492a
            r4 = r0 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r0 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r0 = r0 & r6
            r0 = r0 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r4
            r7 = r0 | r2
            r0 = r1
            r1 = r3
            r2 = r16
            r3 = r17
            r4 = r14
            r5 = r30
            r6 = r11
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            r5 = r14
            r6 = r15
            r3 = r16
            r4 = r17
        L_0x0165:
            e0.s0 r11 = r11.v()
            if (r11 != 0) goto L_0x016c
            goto L_0x017f
        L_0x016c:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4 r13 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
            r0 = r13
            r1 = r24
            r2 = r25
            r7 = r30
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r13)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.d(a2$t, boolean, p0.d, androidx.compose.animation.a, androidx.compose.animation.c, java.lang.String, lp0.q, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(boolean r23, p0.d r24, androidx.compose.animation.a r25, androidx.compose.animation.c r26, java.lang.String r27, lp0.q<? super p.b, ? super e0.g, ? super java.lang.Integer, bp0.k> r28, e0.g r29, int r30, int r31) {
        /*
            r8 = r28
            r9 = r30
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r8, r0)
            r0 = 1844970278(0x6df80326, float:9.594511E27)
            r1 = r29
            e0.g r10 = r1.t(r0)
            r0 = r31 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r9 | 6
            r11 = r23
            goto L_0x002d
        L_0x001b:
            r0 = r9 & 14
            r11 = r23
            if (r0 != 0) goto L_0x002c
            boolean r0 = r10.m(r11)
            if (r0 == 0) goto L_0x0029
            r0 = 4
            goto L_0x002a
        L_0x0029:
            r0 = 2
        L_0x002a:
            r0 = r0 | r9
            goto L_0x002d
        L_0x002c:
            r0 = r9
        L_0x002d:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0034
            r0 = r0 | 48
            goto L_0x0047
        L_0x0034:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0047
            r2 = r24
            boolean r3 = r10.k(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r0 = r0 | r3
            goto L_0x0049
        L_0x0047:
            r2 = r24
        L_0x0049:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0050
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r25
            boolean r5 = r10.k(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r0 = r0 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r25
        L_0x0065:
            r5 = r31 & 8
            if (r5 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            r6 = r26
            boolean r7 = r10.k(r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r7
            goto L_0x0081
        L_0x007f:
            r6 = r26
        L_0x0081:
            r7 = r31 & 16
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x008b:
            r13 = r9 & r12
            if (r13 != 0) goto L_0x009e
            r13 = r27
            boolean r14 = r10.k(r13)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r0 = r0 | r14
            goto L_0x00a0
        L_0x009e:
            r13 = r27
        L_0x00a0:
            r14 = r31 & 32
            r15 = 458752(0x70000, float:6.42848E-40)
            if (r14 == 0) goto L_0x00aa
            r14 = 196608(0x30000, float:2.75506E-40)
        L_0x00a8:
            r0 = r0 | r14
            goto L_0x00ba
        L_0x00aa:
            r14 = r9 & r15
            if (r14 != 0) goto L_0x00ba
            boolean r14 = r10.k(r8)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a8
        L_0x00ba:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r14 = r14 & r0
            r16 = 74898(0x12492, float:1.04954E-40)
            r14 = r14 ^ r16
            if (r14 != 0) goto L_0x00d4
            boolean r14 = r10.b()
            if (r14 != 0) goto L_0x00cc
            goto L_0x00d4
        L_0x00cc:
            r10.h()
            r3 = r4
            r4 = r6
        L_0x00d1:
            r5 = r13
            goto L_0x014e
        L_0x00d4:
            if (r1 == 0) goto L_0x00da
            p0.d$a r1 = p0.d.f16037h0
            r14 = r1
            goto L_0x00db
        L_0x00da:
            r14 = r2
        L_0x00db:
            r1 = 0
            r2 = 3
            r15 = 0
            if (r3 == 0) goto L_0x00fb
            androidx.compose.animation.a r3 = androidx.compose.animation.EnterExitTransitionKt.v(r15, r1, r2, r15)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 15
            r21 = 0
            androidx.compose.animation.a r4 = androidx.compose.animation.EnterExitTransitionKt.r(r16, r17, r18, r19, r20, r21)
            androidx.compose.animation.a r3 = r3.b(r4)
            r16 = r3
            goto L_0x00fd
        L_0x00fb:
            r16 = r4
        L_0x00fd:
            if (r5 == 0) goto L_0x0119
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 15
            r22 = 0
            androidx.compose.animation.c r3 = androidx.compose.animation.EnterExitTransitionKt.E(r17, r18, r19, r20, r21, r22)
            androidx.compose.animation.c r1 = androidx.compose.animation.EnterExitTransitionKt.x(r15, r1, r2, r15)
            androidx.compose.animation.c r1 = r3.b(r1)
            r15 = r1
            goto L_0x011a
        L_0x0119:
            r15 = r6
        L_0x011a:
            if (r7 == 0) goto L_0x011f
            java.lang.String r1 = "AnimatedVisibility"
            r13 = r1
        L_0x011f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            r2 = r0 & 14
            int r3 = r0 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.d(r1, r13, r10, r2, r3)
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1 r2 = androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1.f2475a
            int r3 = r0 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 48
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r3 = r3 & r12
            r3 = r3 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r4
            r7 = r3 | r0
            r0 = r1
            r1 = r2
            r2 = r14
            r3 = r16
            r4 = r15
            r5 = r28
            r6 = r10
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00d1
        L_0x014e:
            e0.s0 r10 = r10.v()
            if (r10 != 0) goto L_0x0155
            goto L_0x0166
        L_0x0155:
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2 r12 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            r0 = r12
            r1 = r23
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r12)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.e(boolean, p0.d, androidx.compose.animation.a, androidx.compose.animation.c, java.lang.String, lp0.q, e0.g, int, int):void");
    }

    private static final <T> EnterExitState g(Transition<T> transition, l<? super T, Boolean> lVar, T t, g gVar, int i11) {
        EnterExitState enterExitState;
        gVar.E(-721837653);
        gVar.I(-721837546, transition);
        if (!transition.q()) {
            gVar.E(-3687241);
            Object F = gVar.F();
            if (F == g.f14172a.a()) {
                F = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
                gVar.y(F);
            }
            gVar.P();
            h0 h0Var = (h0) F;
            if (lVar.invoke(transition.g()).booleanValue()) {
                h0Var.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) h0Var.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else if (lVar.invoke(t).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else if (lVar.invoke(transition.g()).booleanValue()) {
            enterExitState = EnterExitState.PostExit;
        } else {
            enterExitState = EnterExitState.PreEnter;
        }
        gVar.O();
        gVar.P();
        return enterExitState;
    }
}
