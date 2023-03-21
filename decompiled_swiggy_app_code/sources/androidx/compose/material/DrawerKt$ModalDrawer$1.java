package androidx.compose.material;

import bp0.k;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import u0.j1;
import wp0.j0;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1 extends Lambda implements q<a2.f, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DrawerState f4981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4982b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4983c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f4984d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ j1 f4985e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f4986f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f4987g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ float f4988h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4989i;
    final /* synthetic */ j0 j;
    final /* synthetic */ q<a2.h, g, Integer, k> k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1(DrawerState drawerState, boolean z11, int i11, long j11, j1 j1Var, long j12, long j13, float f11, p<? super g, ? super Integer, k> pVar, j0 j0Var, q<? super a2.h, ? super g, ? super Integer, k> qVar) {
        super(3);
        this.f4981a = drawerState;
        this.f4982b = z11;
        this.f4983c = i11;
        this.f4984d = j11;
        this.f4985e = j1Var;
        this.f4986f = j12;
        this.f4987g = j13;
        this.f4988h = f11;
        this.f4989i = pVar;
        this.j = j0Var;
        this.k = qVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: lp0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.a2.f r38, e0.g r39, int r40) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r13 = r39
            java.lang.String r2 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.p.j(r1, r2)
            r2 = r40 & 14
            r3 = 2
            if (r2 != 0) goto L_0x001c
            boolean r2 = r13.k(r1)
            if (r2 == 0) goto L_0x0018
            r2 = 4
            goto L_0x0019
        L_0x0018:
            r2 = 2
        L_0x0019:
            r2 = r40 | r2
            goto L_0x001e
        L_0x001c:
            r2 = r40
        L_0x001e:
            r2 = r2 & 91
            r2 = r2 ^ 18
            if (r2 != 0) goto L_0x0030
            boolean r2 = r39.b()
            if (r2 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r39.h()
            goto L_0x0335
        L_0x0030:
            long r8 = r38.c()
            boolean r1 = d2.b.j(r8)
            if (r1 == 0) goto L_0x0336
            int r1 = d2.b.n(r8)
            float r1 = (float) r1
            float r1 = -r1
            r2 = 0
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            androidx.compose.material.DrawerValue r5 = androidx.compose.material.DrawerValue.Closed
            kotlin.Pair r4 = bp0.h.a(r4, r5)
            r10 = 0
            r3[r10] = r4
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            androidx.compose.material.DrawerValue r5 = androidx.compose.material.DrawerValue.Open
            kotlin.Pair r4 = bp0.h.a(r4, r5)
            r11 = 1
            r3[r11] = r4
            java.util.Map r16 = kotlin.collections.x.i(r3)
            e0.m0 r3 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r3 = r13.z(r3)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r3 != r4) goto L_0x0070
            r19 = 1
            goto L_0x0072
        L_0x0070:
            r19 = 0
        L_0x0072:
            p0.d$a r12 = p0.d.f16037h0
            androidx.compose.material.DrawerState r3 = r0.f4981a
            androidx.compose.material.SwipeableState r15 = r3.e()
            androidx.compose.foundation.gestures.Orientation r17 = androidx.compose.foundation.gestures.Orientation.Horizontal
            float r23 = androidx.compose.material.DrawerKt.f4979b
            boolean r3 = r0.f4982b
            r20 = 0
            androidx.compose.material.DrawerKt$ModalDrawer$1$1 r21 = androidx.compose.material.DrawerKt$ModalDrawer$1.AnonymousClass1.f4990a
            r22 = 0
            r24 = 32
            r25 = 0
            r14 = r12
            r18 = r3
            p0.d r3 = androidx.compose.material.SwipeableKt.g(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.material.DrawerState r14 = r0.f4981a
            int r15 = r0.f4983c
            long r4 = r0.f4984d
            u0.j1 r7 = r0.f4985e
            r40 = r12
            long r11 = r0.f4986f
            r16 = r3
            long r2 = r0.f4987g
            float r10 = r0.f4988h
            lp0.p<e0.g, java.lang.Integer, bp0.k> r6 = r0.f4989i
            r19 = r2
            boolean r2 = r0.f4982b
            wp0.j0 r3 = r0.j
            r21 = r10
            lp0.q<a2$h, e0.g, java.lang.Integer, bp0.k> r10 = r0.k
            r0 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r13.E(r0)
            p0.a$a r22 = p0.a.f16019a
            p0.a r0 = r22.o()
            r24 = r7
            r7 = 0
            i1.t r0 = androidx.compose.foundation.layout.BoxKt.h(r0, r7, r13, r7)
            r7 = 1376089394(0x52057532, float:1.43299215E11)
            r13.E(r7)
            e0.m0 r7 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r7 = r13.z(r7)
            d2.e r7 = (d2.e) r7
            r26 = r11
            e0.m0 r11 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r11 = r13.z(r11)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.ui.unit.LayoutDirection) r11
            e0.m0 r12 = androidx.compose.ui.platform.CompositionLocalsKt.n()
            java.lang.Object r12 = r13.z(r12)
            androidx.compose.ui.platform.n1 r12 = (androidx.compose.ui.platform.n1) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r28 = androidx.compose.ui.node.ComposeUiNode.J
            r29 = r10
            lp0.a r10 = r28.a()
            r30 = r8
            lp0.q r8 = androidx.compose.ui.layout.LayoutKt.b(r16)
            e0.e r9 = r39.u()
            boolean r9 = r9 instanceof e0.e
            if (r9 != 0) goto L_0x0103
            e0.f.c()
        L_0x0103:
            r39.f()
            boolean r9 = r39.s()
            if (r9 == 0) goto L_0x0110
            r13.K(r10)
            goto L_0x0113
        L_0x0110:
            r39.c()
        L_0x0113:
            r39.J()
            e0.g r9 = androidx.compose.runtime.Updater.a(r39)
            lp0.p r10 = r28.d()
            androidx.compose.runtime.Updater.c(r9, r0, r10)
            lp0.p r0 = r28.b()
            androidx.compose.runtime.Updater.c(r9, r7, r0)
            lp0.p r0 = r28.c()
            androidx.compose.runtime.Updater.c(r9, r11, r0)
            lp0.p r0 = r28.f()
            androidx.compose.runtime.Updater.c(r9, r12, r0)
            r39.o()
            e0.g r0 = e0.t0.b(r39)
            e0.t0 r0 = e0.t0.a(r0)
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8.invoke(r0, r13, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.E(r0)
            r7 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r13.E(r7)
            androidx.compose.foundation.layout.BoxScopeInstance r8 = androidx.compose.foundation.layout.BoxScopeInstance.f3698a
            r8 = 413823892(0x18aa7394, float:4.4060674E-24)
            r13.E(r8)
            r8 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r13.E(r8)
            p0.a r8 = r22.o()
            r9 = 0
            i1.t r8 = androidx.compose.foundation.layout.BoxKt.h(r8, r9, r13, r9)
            r9 = 1376089394(0x52057532, float:1.43299215E11)
            r13.E(r9)
            e0.m0 r9 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r9 = r13.z(r9)
            d2.e r9 = (d2.e) r9
            e0.m0 r10 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r10 = r13.z(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.ui.unit.LayoutDirection) r10
            e0.m0 r11 = androidx.compose.ui.platform.CompositionLocalsKt.n()
            java.lang.Object r11 = r13.z(r11)
            androidx.compose.ui.platform.n1 r11 = (androidx.compose.ui.platform.n1) r11
            lp0.a r12 = r28.a()
            lp0.q r7 = androidx.compose.ui.layout.LayoutKt.b(r40)
            e0.e r0 = r39.u()
            boolean r0 = r0 instanceof e0.e
            if (r0 != 0) goto L_0x01a3
            e0.f.c()
        L_0x01a3:
            r39.f()
            boolean r0 = r39.s()
            if (r0 == 0) goto L_0x01b0
            r13.K(r12)
            goto L_0x01b3
        L_0x01b0:
            r39.c()
        L_0x01b3:
            r39.J()
            e0.g r0 = androidx.compose.runtime.Updater.a(r39)
            lp0.p r12 = r28.d()
            androidx.compose.runtime.Updater.c(r0, r8, r12)
            lp0.p r8 = r28.b()
            androidx.compose.runtime.Updater.c(r0, r9, r8)
            lp0.p r8 = r28.c()
            androidx.compose.runtime.Updater.c(r0, r10, r8)
            lp0.p r8 = r28.f()
            androidx.compose.runtime.Updater.c(r0, r11, r8)
            r39.o()
            e0.g r0 = e0.t0.b(r39)
            e0.t0 r0 = e0.t0.a(r0)
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.invoke(r0, r13, r9)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r13.E(r0)
            r0 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r13.E(r0)
            r0 = 392275659(0x1761a6cb, float:7.2911943E-25)
            r13.E(r0)
            int r0 = r15 >> 27
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.invoke(r13, r0)
            r39.P()
            r39.P()
            r39.P()
            r39.d()
            r39.P()
            r39.P()
            boolean r0 = r14.f()
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$2 r7 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$2
            r7.<init>(r2, r14, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r6 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
            r9 = -3686095(0xffffffffffc7c131, float:NaN)
            r13.E(r9)
            boolean r2 = r13.k(r2)
            boolean r8 = r13.k(r8)
            r2 = r2 | r8
            boolean r8 = r13.k(r14)
            r2 = r2 | r8
            java.lang.Object r8 = r39.F()
            if (r2 != 0) goto L_0x024c
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x0255
        L_0x024c:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1 r8 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$3$1
            r2 = 0
            r8.<init>(r1, r2, r14)
            r13.y(r8)
        L_0x0255:
            r39.P()
            r6 = r8
            lp0.a r6 = (lp0.a) r6
            int r1 = r15 >> 15
            r8 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r0
            r9 = r19
            r2 = r7
            r0 = r3
            r3 = r6
            r6 = r39
            r11 = r24
            r7 = r8
            androidx.compose.material.DrawerKt.b(r1, r2, r3, r4, r6, r7)
            c0.x$a r1 = c0.x.f12750a
            int r1 = r1.e()
            r2 = 6
            java.lang.String r1 = c0.y.a(r1, r13, r2)
            e0.m0 r2 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r2 = r13.z(r2)
            d2.e r2 = (d2.e) r2
            int r3 = d2.b.p(r30)
            float r3 = r2.k(r3)
            int r4 = d2.b.o(r30)
            float r4 = r2.k(r4)
            int r5 = d2.b.n(r30)
            float r5 = r2.k(r5)
            int r6 = d2.b.m(r30)
            float r2 = r2.k(r6)
            r6 = r40
            p0.d r2 = androidx.compose.foundation.layout.SizeKt.v(r6, r3, r4, r5, r2)
            r3 = -3686930(0xffffffffffc7bdee, float:NaN)
            r13.E(r3)
            boolean r3 = r13.k(r14)
            java.lang.Object r4 = r39.F()
            if (r3 != 0) goto L_0x02c0
            e0.g$a r3 = e0.g.f14172a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x02c8
        L_0x02c0:
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1 r4 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$5$1
            r4.<init>(r14)
            r13.y(r4)
        L_0x02c8:
            r39.P()
            lp0.l r4 = (lp0.l) r4
            p0.d r30 = androidx.compose.foundation.layout.OffsetKt.a(r2, r4)
            r31 = 0
            r32 = 0
            float r33 = androidx.compose.material.DrawerKt.f4978a
            r34 = 0
            r35 = 11
            r36 = 0
            p0.d r2 = androidx.compose.foundation.layout.PaddingKt.m(r30, r31, r32, r33, r34, r35, r36)
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$6 r3 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$6
            r3.<init>(r1, r14, r0)
            r0 = 0
            r1 = 1
            r4 = 0
            p0.d r0 = androidx.compose.ui.semantics.SemanticsModifierKt.c(r2, r4, r3, r1, r0)
            r7 = 0
            r2 = -819910972(0xffffffffcf2126c4, float:-2.70367232E9)
            androidx.compose.material.DrawerKt$ModalDrawer$1$2$7 r3 = new androidx.compose.material.DrawerKt$ModalDrawer$1$2$7
            r4 = r29
            r3.<init>(r4, r15)
            l0.a r12 = l0.b.b(r13, r2, r1, r3)
            r1 = 1572864(0x180000, float:2.204052E-39)
            int r2 = r15 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r15 >> 12
            r3 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r15
            r14 = r1 | r2
            r15 = 16
            r1 = r0
            r2 = r11
            r3 = r26
            r5 = r9
            r8 = r21
            r9 = r12
            r10 = r39
            r11 = r14
            r12 = r15
            androidx.compose.material.SurfaceKt.b(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r39.P()
            r39.P()
            r39.P()
            r39.d()
            r39.P()
            r39.P()
        L_0x0335:
            return
        L_0x0336:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Drawer shouldn't have infinite width"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt$ModalDrawer$1.a(a2$f, e0.g, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((a2.f) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
