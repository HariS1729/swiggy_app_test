package androidx.compose.animation;

import defpackage.v1;
import kotlin.jvm.internal.i;
import lp0.p;
import p.e;
import p.l;

/* compiled from: AnimatedContent.kt */
public final class AnimatedContentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.compose.animation.AnimatedContentScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: p0.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void a(androidx.compose.animation.core.Transition<S> r23, p0.d r24, lp0.l<? super androidx.compose.animation.AnimatedContentScope<S>, p.e> r25, p0.a r26, lp0.l<? super S, ? extends java.lang.Object> r27, lp0.r<? super p.b, ? super S, ? super e0.g, ? super java.lang.Integer, bp0.k> r28, e0.g r29, int r30, int r31) {
        /*
            r8 = r23
            r9 = r28
            r10 = r30
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r9, r0)
            r0 = -441518303(0xffffffffe5aef721, float:-1.0328131E23)
            r1 = r29
            e0.g r11 = r1.t(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r31 & r0
            if (r0 == 0) goto L_0x0022
            r0 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.k(r8)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r10
            goto L_0x0032
        L_0x0031:
            r0 = r10
        L_0x0032:
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r24
            boolean r3 = r11.k(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r24
        L_0x004e:
            r3 = r31 & 2
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r25
            boolean r5 = r11.k(r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r25
        L_0x006a:
            r5 = r31 & 4
            if (r5 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r26
            boolean r7 = r11.k(r6)
            if (r7 == 0) goto L_0x0080
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r7
            goto L_0x0086
        L_0x0084:
            r6 = r26
        L_0x0086:
            r7 = r31 & 8
            if (r7 == 0) goto L_0x008d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008d:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00a2
            r12 = r27
            boolean r13 = r11.k(r12)
            if (r13 == 0) goto L_0x009e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r0 = r0 | r13
            goto L_0x00a4
        L_0x00a2:
            r12 = r27
        L_0x00a4:
            r13 = r31 & 16
            if (r13 == 0) goto L_0x00ac
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x00aa:
            r0 = r0 | r13
            goto L_0x00bd
        L_0x00ac:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00bd
            boolean r13 = r11.k(r9)
            if (r13 == 0) goto L_0x00ba
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00ba:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00aa
        L_0x00bd:
            r13 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r13
            r14 = 74898(0x12492, float:1.04954E-40)
            r0 = r0 ^ r14
            if (r0 != 0) goto L_0x00d7
            boolean r0 = r11.b()
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d7
        L_0x00cf:
            r11.h()
            r3 = r4
            r4 = r6
            r5 = r12
            goto L_0x0388
        L_0x00d7:
            if (r1 == 0) goto L_0x00dd
            p0.d$a r0 = p0.d.f16037h0
            r14 = r0
            goto L_0x00de
        L_0x00dd:
            r14 = r2
        L_0x00de:
            if (r3 == 0) goto L_0x00e4
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 r0 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$3.f2400a
            r15 = r0
            goto L_0x00e5
        L_0x00e4:
            r15 = r4
        L_0x00e5:
            if (r5 == 0) goto L_0x00ee
            p0.a$a r0 = p0.a.f16019a
            p0.a r0 = r0.o()
            r6 = r0
        L_0x00ee:
            if (r7 == 0) goto L_0x00f3
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 r0 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$4.f2401a
            r12 = r0
        L_0x00f3:
            e0.m0 r0 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r0 = r11.z(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r1 = -3686930(0xffffffffffc7bdee, float:NaN)
            r11.E(r1)
            boolean r2 = r11.k(r8)
            java.lang.Object r3 = r11.F()
            if (r2 != 0) goto L_0x0115
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x011d
        L_0x0115:
            androidx.compose.animation.AnimatedContentScope r3 = new androidx.compose.animation.AnimatedContentScope
            r3.<init>(r8, r6, r0)
            r11.y(r3)
        L_0x011d:
            r11.P()
            r7 = r3
            androidx.compose.animation.AnimatedContentScope r7 = (androidx.compose.animation.AnimatedContentScope) r7
            r11.E(r1)
            boolean r2 = r11.k(r8)
            java.lang.Object r3 = r11.F()
            r5 = 0
            r4 = 1
            if (r2 != 0) goto L_0x013a
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0149
        L_0x013a:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r3 = r23.g()
            r2[r5] = r3
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.g.e(r2)
            r11.y(r3)
        L_0x0149:
            r11.P()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            r11.E(r1)
            boolean r1 = r11.k(r8)
            java.lang.Object r2 = r11.F()
            if (r1 != 0) goto L_0x0163
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x016b
        L_0x0163:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r11.y(r2)
        L_0x016b:
            r11.P()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r23.g()
            java.lang.Object r5 = r23.m()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r5)
            if (r1 == 0) goto L_0x01b6
            int r1 = r3.size()
            if (r1 != r4) goto L_0x0193
            r5 = 0
            java.lang.Object r1 = r3.get(r5)
            java.lang.Object r5 = r23.g()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r5)
            if (r1 != 0) goto L_0x019d
        L_0x0193:
            r3.clear()
            java.lang.Object r1 = r23.g()
            r3.add(r1)
        L_0x019d:
            int r1 = r2.size()
            if (r1 != r4) goto L_0x01ad
            java.lang.Object r1 = r23.g()
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x01b0
        L_0x01ad:
            r2.clear()
        L_0x01b0:
            r7.j(r6)
            r7.k(r0)
        L_0x01b6:
            java.lang.Object r0 = r23.g()
            java.lang.Object r1 = r23.m()
            boolean r0 = kotlin.jvm.internal.p.e(r0, r1)
            if (r0 != 0) goto L_0x0208
            java.lang.Object r0 = r23.m()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0208
            java.util.Iterator r0 = r3.iterator()
            r5 = 0
        L_0x01d3:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x01f5
            java.lang.Object r4 = r0.next()
            java.lang.Object r4 = r12.invoke(r4)
            java.lang.Object r1 = r23.m()
            java.lang.Object r1 = r12.invoke(r1)
            boolean r1 = kotlin.jvm.internal.p.e(r4, r1)
            if (r1 == 0) goto L_0x01f1
            r0 = -1
            goto L_0x01f7
        L_0x01f1:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x01d3
        L_0x01f5:
            r0 = -1
            r5 = -1
        L_0x01f7:
            if (r5 != r0) goto L_0x0201
            java.lang.Object r0 = r23.m()
            r3.add(r0)
            goto L_0x0208
        L_0x0201:
            java.lang.Object r0 = r23.m()
            r3.set(r5, r0)
        L_0x0208:
            java.lang.Object r0 = r23.m()
            boolean r0 = r2.containsKey(r0)
            if (r0 != 0) goto L_0x026d
            r2.clear()
            int r0 = r3.size()
            r1 = -1
            int r5 = r0 + -1
            if (r5 < 0) goto L_0x026d
            r0 = 0
        L_0x021f:
            int r4 = r0 + 1
            java.lang.Object r1 = r3.get(r0)
            r0 = -985562382(0xffffffffc54182f2, float:-3096.184)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1 r8 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
            r9 = -985562382(0xffffffffc54182f2, float:-3096.184)
            r0 = r8
            r26 = r1
            r1 = r23
            r17 = r2
            r2 = r26
            r16 = r3
            r3 = r13
            r18 = r4
            r10 = 1
            r4 = r15
            r19 = r5
            r20 = 0
            r5 = r7
            r21 = r6
            r6 = r28
            r22 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            l0.a r0 = l0.b.c(r9, r10, r8)
            r1 = r26
            r2 = r17
            r2.put(r1, r0)
            r0 = r18
            r1 = r19
            if (r0 <= r1) goto L_0x025f
            goto L_0x0275
        L_0x025f:
            r8 = r23
            r9 = r28
            r10 = r30
            r5 = r1
            r3 = r16
            r6 = r21
            r7 = r22
            goto L_0x021f
        L_0x026d:
            r16 = r3
            r21 = r6
            r22 = r7
            r20 = 0
        L_0x0275:
            androidx.compose.animation.core.Transition$b r0 = r23.k()
            r1 = -3686552(0xffffffffffc7bf68, float:NaN)
            r11.E(r1)
            r3 = r22
            boolean r1 = r11.k(r3)
            boolean r0 = r11.k(r0)
            r0 = r0 | r1
            java.lang.Object r1 = r11.F()
            if (r0 != 0) goto L_0x0298
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x02a2
        L_0x0298:
            java.lang.Object r0 = r15.invoke(r3)
            r1 = r0
            p.e r1 = (p.e) r1
            r11.y(r1)
        L_0x02a2:
            r11.P()
            p.e r1 = (p.e) r1
            r0 = 72
            p0.d r0 = r3.d(r1, r11, r0)
            p0.d r0 = r14.N(r0)
            r1 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r11.E(r1)
            java.lang.Object r1 = r11.F()
            e0.g$a r4 = e0.g.f14172a
            java.lang.Object r4 = r4.a()
            if (r1 != r4) goto L_0x02cb
            androidx.compose.animation.AnimatedContentMeasurePolicy r1 = new androidx.compose.animation.AnimatedContentMeasurePolicy
            r1.<init>(r3)
            r11.y(r1)
        L_0x02cb:
            r11.P()
            androidx.compose.animation.AnimatedContentMeasurePolicy r1 = (androidx.compose.animation.AnimatedContentMeasurePolicy) r1
            r3 = 1376089335(0x520574f7, float:1.43298249E11)
            r11.E(r3)
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r3 = r11.z(r3)
            d2.e r3 = (d2.e) r3
            e0.m0 r4 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r4 = r11.z(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.ui.unit.LayoutDirection) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.J
            lp0.a r6 = r5.a()
            lp0.q r0 = androidx.compose.ui.layout.LayoutKt.b(r0)
            e0.e r7 = r11.u()
            boolean r7 = r7 instanceof e0.e
            if (r7 != 0) goto L_0x02ff
            e0.f.c()
        L_0x02ff:
            r11.f()
            boolean r7 = r11.s()
            if (r7 == 0) goto L_0x030c
            r11.K(r6)
            goto L_0x030f
        L_0x030c:
            r11.c()
        L_0x030f:
            r11.J()
            e0.g r6 = androidx.compose.runtime.Updater.a(r11)
            lp0.p r7 = r5.d()
            androidx.compose.runtime.Updater.c(r6, r1, r7)
            lp0.p r1 = r5.b()
            androidx.compose.runtime.Updater.c(r6, r3, r1)
            lp0.p r1 = r5.c()
            androidx.compose.runtime.Updater.c(r6, r4, r1)
            r11.o()
            e0.g r1 = e0.t0.b(r11)
            e0.t0 r1 = e0.t0.a(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r0.invoke(r1, r11, r3)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.E(r0)
            r0 = -740842621(0xffffffffd3d7a383, float:-1.85232248E12)
            r11.E(r0)
            java.util.Iterator r0 = r16.iterator()
        L_0x034d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0377
            java.lang.Object r1 = r0.next()
            r3 = -1739565873(0xffffffff985054cf, float:-2.6926187E-24)
            java.lang.Object r4 = r12.invoke(r1)
            r11.I(r3, r4)
            java.lang.Object r1 = r2.get(r1)
            lp0.p r1 = (lp0.p) r1
            if (r1 != 0) goto L_0x036a
            goto L_0x0373
        L_0x036a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1.invoke(r11, r3)
            bp0.k r1 = bp0.k.f22762a
        L_0x0373:
            r11.O()
            goto L_0x034d
        L_0x0377:
            r11.P()
            r11.P()
            r11.d()
            r11.P()
            r5 = r12
            r2 = r14
            r3 = r15
            r4 = r21
        L_0x0388:
            e0.s0 r9 = r11.v()
            if (r9 != 0) goto L_0x038f
            goto L_0x03a0
        L_0x038f:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$8 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$8
            r0 = r10
            r1 = r23
            r6 = r28
            r7 = r30
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x03a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.a(androidx.compose.animation.core.Transition, p0.d, lp0.l, p0.a, lp0.l, lp0.r, e0.g, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void b(S r16, p0.d r17, lp0.l<? super androidx.compose.animation.AnimatedContentScope<S>, p.e> r18, p0.a r19, lp0.r<? super p.b, ? super S, ? super e0.g, ? super java.lang.Integer, bp0.k> r20, e0.g r21, int r22, int r23) {
        /*
            r1 = r16
            r11 = r20
            r12 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r11, r0)
            r0 = -441539443(0xffffffffe5aea48d, float:-1.030909E23)
            r2 = r21
            e0.g r0 = r2.t(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.k(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r17
            boolean r5 = r0.k(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r17
        L_0x0047:
            r5 = r23 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r18
            boolean r7 = r0.k(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r18
        L_0x0063:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r19
            boolean r9 = r0.k(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r9
            goto L_0x007f
        L_0x007d:
            r8 = r19
        L_0x007f:
            r9 = r23 & 16
            if (r9 == 0) goto L_0x0086
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0086:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r12
            if (r9 != 0) goto L_0x0098
            boolean r9 = r0.k(r11)
            if (r9 == 0) goto L_0x0095
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r2 = r2 | r9
        L_0x0098:
            r9 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r2
            r9 = r9 ^ 9362(0x2492, float:1.3119E-41)
            if (r9 != 0) goto L_0x00ae
            boolean r9 = r0.b()
            if (r9 != 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            r0.h()
            r2 = r4
            r3 = r6
            r4 = r8
            goto L_0x00f4
        L_0x00ae:
            if (r3 == 0) goto L_0x00b4
            p0.d$a r3 = p0.d.f16037h0
            r13 = r3
            goto L_0x00b5
        L_0x00b4:
            r13 = r4
        L_0x00b5:
            if (r5 == 0) goto L_0x00bb
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 r3 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$1.f2392a
            r14 = r3
            goto L_0x00bc
        L_0x00bb:
            r14 = r6
        L_0x00bc:
            if (r7 == 0) goto L_0x00c6
            p0.a$a r3 = p0.a.f16019a
            p0.a r3 = r3.o()
            r15 = r3
            goto L_0x00c7
        L_0x00c6:
            r15 = r8
        L_0x00c7:
            r3 = r2 & 8
            r3 = r3 | 48
            r4 = r2 & 14
            r3 = r3 | r4
            r4 = 0
            java.lang.String r5 = "AnimatedContent"
            androidx.compose.animation.core.Transition r3 = androidx.compose.animation.core.TransitionKt.d(r1, r5, r0, r3, r4)
            r6 = 0
            r4 = r2 & 112(0x70, float:1.57E-43)
            r5 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            int r2 = r2 << 3
            r2 = r2 & r5
            r9 = r4 | r2
            r10 = 8
            r2 = r3
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r20
            r8 = r0
            a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r13
            r3 = r14
            r4 = r15
        L_0x00f4:
            e0.s0 r8 = r0.v()
            if (r8 != 0) goto L_0x00fb
            goto L_0x010c
        L_0x00fb:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 r9 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
            r0 = r9
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.b(java.lang.Object, p0.d, lp0.l, p0.a, lp0.r, e0.g, int, int):void");
    }

    public static final l c(boolean z11, p<? super d2.p, ? super d2.p, ? extends v1.a0<d2.p>> pVar) {
        kotlin.jvm.internal.p.j(pVar, "sizeAnimationSpec");
        return new e(z11, pVar);
    }

    public static /* synthetic */ l d(boolean z11, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            pVar = AnimatedContentKt$SizeTransform$1.f2432a;
        }
        return c(z11, pVar);
    }

    public static final e e(a aVar, c cVar) {
        kotlin.jvm.internal.p.j(aVar, "<this>");
        kotlin.jvm.internal.p.j(cVar, "exit");
        return new e(aVar, cVar, 0.0f, (l) null, 12, (i) null);
    }
}
