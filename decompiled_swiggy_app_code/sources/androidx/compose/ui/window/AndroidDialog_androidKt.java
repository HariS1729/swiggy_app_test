package androidx.compose.ui.window;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.d1;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import lp0.a;
import lp0.p;
import lp0.q;
import p0.d;

/* compiled from: AndroidDialog.android.kt */
public final class AndroidDialog_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.ui.window.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: androidx.compose.ui.window.c} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if ((r24 & 2) != 0) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(lp0.a<bp0.k> r19, androidx.compose.ui.window.b r20, lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r21, e0.g r22, int r23, int r24) {
        /*
            r7 = r19
            r8 = r21
            r9 = r23
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.p.j(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r8, r0)
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r22
            e0.g r6 = r1.t(r0)
            r0 = r24 & 1
            if (r0 == 0) goto L_0x0020
            r0 = r9 | 6
            goto L_0x0030
        L_0x0020:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x002f
            boolean r0 = r6.k(r7)
            if (r0 == 0) goto L_0x002c
            r0 = 4
            goto L_0x002d
        L_0x002c:
            r0 = 2
        L_0x002d:
            r0 = r0 | r9
            goto L_0x0030
        L_0x002f:
            r0 = r9
        L_0x0030:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r24 & 2
            if (r1 != 0) goto L_0x0043
            r1 = r20
            boolean r2 = r6.k(r1)
            if (r2 == 0) goto L_0x0045
            r2 = 32
            goto L_0x0047
        L_0x0043:
            r1 = r20
        L_0x0045:
            r2 = 16
        L_0x0047:
            r0 = r0 | r2
            goto L_0x004b
        L_0x0049:
            r1 = r20
        L_0x004b:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0062
            boolean r2 = r6.k(r8)
            if (r2 == 0) goto L_0x005f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r0 = r0 | r2
        L_0x0062:
            r2 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x0076
            boolean r2 = r6.b()
            if (r2 != 0) goto L_0x006f
            goto L_0x0076
        L_0x006f:
            r6.h()
            r2 = r1
            r15 = r6
            goto L_0x014d
        L_0x0076:
            r6.H()
            r2 = r9 & 1
            if (r2 == 0) goto L_0x008c
            boolean r2 = r6.i()
            if (r2 == 0) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            r6.h()
            r2 = r24 & 2
            if (r2 == 0) goto L_0x009d
            goto L_0x009b
        L_0x008c:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x009d
            androidx.compose.ui.window.b r1 = new androidx.compose.ui.window.b
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x009b:
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x009d:
            r5 = r1
            r6.A()
            e0.m0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r1 = r6.z(r1)
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            e0.m0 r1 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r1 = r6.z(r1)
            r4 = r1
            d2.e r4 = (d2.e) r4
            e0.m0 r1 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r1 = r6.z(r1)
            r2 = r1
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.ui.unit.LayoutDirection) r2
            r1 = 0
            androidx.compose.runtime.a r15 = e0.f.d(r6, r1)
            int r0 = r0 >> 6
            r0 = r0 & 14
            e0.d1 r0 = androidx.compose.runtime.g.m(r8, r6, r0)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r11 = 0
            r12 = 0
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1 r13 = androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1.f7779a
            r16 = 3080(0xc08, float:4.316E-42)
            r17 = 6
            r14 = r6
            r18 = r15
            r15 = r16
            r16 = r17
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.b(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.E(r11)
            boolean r11 = r6.k(r3)
            boolean r12 = r6.k(r4)
            r11 = r11 | r12
            java.lang.Object r12 = r6.F()
            if (r11 != 0) goto L_0x0108
            e0.g$a r11 = e0.g.f14172a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x0104
            goto L_0x0108
        L_0x0104:
            r14 = r2
            r13 = r5
            r15 = r6
            goto L_0x0134
        L_0x0108:
            androidx.compose.ui.window.c r12 = new androidx.compose.ui.window.c
            java.lang.String r11 = "dialogId"
            kotlin.jvm.internal.p.i(r10, r11)
            r11 = r0
            r0 = r12
            r13 = 0
            r1 = r19
            r14 = r2
            r2 = r5
            r15 = r4
            r4 = r14
            r13 = r5
            r5 = r15
            r15 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 488261145(0x1d1a4619, float:2.041797E-21)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1 r1 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
            r1.<init>(r11)
            r2 = 1
            l0.a r0 = l0.b.c(r0, r2, r1)
            r1 = r18
            r12.c(r1, r0)
            r15.y(r12)
        L_0x0134:
            r15.P()
            androidx.compose.ui.window.c r12 = (androidx.compose.ui.window.c) r12
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1
            r0.<init>(r12)
            r1 = 8
            e0.u.b(r12, r0, r15, r1)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2
            r0.<init>(r12, r7, r13, r14)
            r1 = 0
            e0.u.g(r0, r15, r1)
            r2 = r13
        L_0x014d:
            e0.s0 r6 = r15.v()
            if (r6 != 0) goto L_0x0154
            goto L_0x0165
        L_0x0154:
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3 r10 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            r0 = r10
            r1 = r19
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r10)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidDialog_androidKt.a(lp0.a, androidx.compose.ui.window.b, lp0.p, e0.g, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p<g, Integer, k> b(d1<? extends p<? super g, ? super Integer, k>> d1Var) {
        return (p) d1Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(d dVar, p<? super g, ? super Integer, k> pVar, g gVar, int i11, int i12) {
        int i13;
        g t = gVar.t(-1177876616);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (t.k(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= t.k(pVar) ? 32 : 16;
        }
        if ((i13 & 91) != 18 || !t.b()) {
            if (i14 != 0) {
                dVar = d.f16037h0;
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.f7780a;
            t.E(-1323940314);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(dVar);
            int i15 = (((((i13 << 3) & 112) | ((i13 >> 3) & 14)) << 9) & 7168) | 6;
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
            Updater.c(a12, androidDialog_androidKt$DialogLayout$1, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, Integer.valueOf((i15 >> 3) & 112));
            t.E(2058660585);
            pVar.invoke(t, Integer.valueOf((i15 >> 9) & 14));
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AndroidDialog_androidKt$DialogLayout$2(dVar, pVar, i11, i12));
        }
    }
}
