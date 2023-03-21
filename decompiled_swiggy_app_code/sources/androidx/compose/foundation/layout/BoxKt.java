package androidx.compose.foundation.layout;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import i1.r;
import i1.t;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: Box.kt */
public final class BoxKt {

    /* renamed from: a  reason: collision with root package name */
    private static final t f3677a = d(a.f16019a.o(), false);

    /* renamed from: b  reason: collision with root package name */
    private static final t f3678b = BoxKt$EmptyBoxMeasurePolicy$1.f3681a;

    public static final void a(d dVar, g gVar, int i11) {
        int i12;
        p.j(dVar, "modifier");
        g t = gVar.t(-211209833);
        if ((i11 & 14) == 0) {
            i12 = (t.k(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) != 2 || !t.b()) {
            t tVar = f3678b;
            t.E(-1323940314);
            e eVar = (e) t.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(dVar);
            int i13 = (((((i12 << 3) & 112) | 384) << 9) & 7168) | 6;
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
            Updater.c(a12, tVar, companion.d());
            Updater.c(a12, eVar, companion.b());
            Updater.c(a12, layoutDirection, companion.c());
            Updater.c(a12, n1Var, companion.f());
            t.o();
            b11.invoke(t0.a(t0.b(t)), t, Integer.valueOf((i13 >> 3) & 112));
            t.E(2058660585);
            t.E(1021196736);
            if (((i13 >> 9) & 14 & 11) == 2 && t.b()) {
                t.h();
            }
            t.P();
            t.P();
            t.d();
            t.P();
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new BoxKt$Box$3(dVar, i11));
        }
    }

    public static final t d(a aVar, boolean z11) {
        p.j(aVar, "alignment");
        return new BoxKt$boxMeasurePolicy$1(z11, aVar);
    }

    private static final b e(r rVar) {
        Object p11 = rVar.p();
        if (p11 instanceof b) {
            return (b) p11;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean f(r rVar) {
        b e11 = e(rVar);
        if (e11 != null) {
            return e11.d();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(i1.e0.a r13, i1.e0 r14, i1.r r15, androidx.compose.ui.unit.LayoutDirection r16, int r17, int r18, p0.a r19) {
        /*
            androidx.compose.foundation.layout.b r0 = e(r15)
            if (r0 == 0) goto L_0x000f
            p0.a r0 = r0.c()
            if (r0 != 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r1 = r0
            goto L_0x0011
        L_0x000f:
            r1 = r19
        L_0x0011:
            int r0 = r14.A0()
            int r2 = r14.e0()
            long r2 = d2.q.a(r0, r2)
            long r4 = d2.q.a(r17, r18)
            r6 = r16
            long r8 = r1.a(r2, r4, r6)
            r10 = 0
            r11 = 2
            r12 = 0
            r6 = r13
            r7 = r14
            i1.e0.a.l(r6, r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.g(i1.e0$a, i1.e0, i1.r, androidx.compose.ui.unit.LayoutDirection, int, int, p0.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: i1.t} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final i1.t h(p0.a r1, boolean r2, e0.g r3, int r4) {
        /*
            java.lang.String r4 = "alignment"
            kotlin.jvm.internal.p.j(r1, r4)
            r4 = 56522820(0x35e7844, float:6.5377995E-37)
            r3.E(r4)
            p0.a$a r4 = p0.a.f16019a
            p0.a r4 = r4.o()
            boolean r4 = kotlin.jvm.internal.p.e(r1, r4)
            if (r4 == 0) goto L_0x001c
            if (r2 != 0) goto L_0x001c
            i1.t r1 = f3677a
            goto L_0x004a
        L_0x001c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r3.E(r0)
            boolean r0 = r3.k(r1)
            boolean r4 = r3.k(r4)
            r4 = r4 | r0
            java.lang.Object r0 = r3.F()
            if (r4 != 0) goto L_0x003d
            e0.g$a r4 = e0.g.f14172a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x0044
        L_0x003d:
            i1.t r0 = d(r1, r2)
            r3.y(r0)
        L_0x0044:
            r3.P()
            r1 = r0
            i1.t r1 = (i1.t) r1
        L_0x004a:
            r3.P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.h(p0.a, boolean, e0.g, int):i1.t");
    }
}
