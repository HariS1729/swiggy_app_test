package androidx.compose.foundation;

import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.s0;
import e0.t0;
import i1.c;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.a;
import p0.d;
import u0.e0;

/* compiled from: Image.kt */
public final class ImageKt {
    public static final void a(Painter painter, String str, d dVar, a aVar, c cVar, float f11, e0 e0Var, g gVar, int i11, int i12) {
        d dVar2;
        String str2 = str;
        p.j(painter, "painter");
        g t = gVar.t(1142754848);
        d.a aVar2 = (i12 & 4) != 0 ? d.f16037h0 : dVar;
        a e11 = (i12 & 8) != 0 ? a.f16019a.e() : aVar;
        c e12 = (i12 & 16) != 0 ? c.f14864a.e() : cVar;
        float f12 = (i12 & 32) != 0 ? 1.0f : f11;
        e0 e0Var2 = (i12 & 64) != 0 ? null : e0Var;
        t.E(-816794123);
        if (str2 != null) {
            d.a aVar3 = d.f16037h0;
            t.E(1157296644);
            boolean k = t.k(str2);
            Object F = t.F();
            if (k || F == g.f14172a.a()) {
                F = new ImageKt$Image$semantics$1$1(str2);
                t.y(F);
            }
            t.P();
            dVar2 = SemanticsModifierKt.c(aVar3, false, (l) F, 1, (Object) null);
        } else {
            dVar2 = d.f16037h0;
        }
        t.P();
        d b11 = PainterModifierKt.b(r0.d.b(aVar2.N(dVar2)), painter, false, e11, e12, f12, e0Var2, 2, (Object) null);
        ImageKt$Image$2 imageKt$Image$2 = ImageKt$Image$2.f3044a;
        t.E(-1323940314);
        e eVar = (e) t.z(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
        n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
        ComposeUiNode.Companion companion = ComposeUiNode.J;
        lp0.a<ComposeUiNode> a11 = companion.a();
        q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(b11);
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
        Updater.c(a12, imageKt$Image$2, companion.d());
        Updater.c(a12, eVar, companion.b());
        Updater.c(a12, layoutDirection, companion.c());
        Updater.c(a12, n1Var, companion.f());
        t.o();
        b12.invoke(t0.a(t0.b(t)), t, 0);
        t.E(2058660585);
        t.E(-2077995625);
        t.P();
        t.P();
        t.d();
        t.P();
        s0 v = t.v();
        if (v != null) {
            v.a(new ImageKt$Image$3(painter, str, aVar2, e11, e12, f12, e0Var2, i11, i12));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: x0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: p0.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(u0.l0 r16, java.lang.String r17, p0.d r18, p0.a r19, i1.c r20, float r21, u0.e0 r22, int r23, e0.g r24, int r25, int r26) {
        /*
            r0 = r16
            r10 = r24
            r8 = r25
            r1 = r26
            java.lang.String r2 = "bitmap"
            kotlin.jvm.internal.p.j(r0, r2)
            r2 = -1396260732(0xffffffffacc6c084, float:-5.648872E-12)
            r10.E(r2)
            r2 = r1 & 4
            if (r2 == 0) goto L_0x001b
            p0.d$a r2 = p0.d.f16037h0
            r9 = r2
            goto L_0x001d
        L_0x001b:
            r9 = r18
        L_0x001d:
            r2 = r1 & 8
            if (r2 == 0) goto L_0x0029
            p0.a$a r2 = p0.a.f16019a
            p0.a r2 = r2.e()
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r19
        L_0x002b:
            r2 = r1 & 16
            if (r2 == 0) goto L_0x0037
            i1.c$a r2 = i1.c.f14864a
            i1.c r2 = r2.e()
            r12 = r2
            goto L_0x0039
        L_0x0037:
            r12 = r20
        L_0x0039:
            r2 = r1 & 32
            if (r2 == 0) goto L_0x0042
            r2 = 1065353216(0x3f800000, float:1.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0042:
            r13 = r21
        L_0x0044:
            r2 = r1 & 64
            if (r2 == 0) goto L_0x004b
            r2 = 0
            r14 = r2
            goto L_0x004d
        L_0x004b:
            r14 = r22
        L_0x004d:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0059
            w0.f$a r1 = w0.f.f17432j0
            int r1 = r1.b()
            r5 = r1
            goto L_0x005b
        L_0x0059:
            r5 = r23
        L_0x005b:
            r1 = 1157296644(0x44faf204, float:2007.563)
            r10.E(r1)
            boolean r1 = r10.k(r0)
            java.lang.Object r2 = r24.F()
            if (r1 != 0) goto L_0x0073
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0082
        L_0x0073:
            r1 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r0 = r16
            x0.a r2 = x0.b.b(r0, r1, r3, r5, r6, r7)
            r10.y(r2)
        L_0x0082:
            r24.P()
            r0 = r2
            x0.a r0 = (x0.a) r0
            r1 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 | 8
            r2 = r8 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r8
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r8
            r8 = r1 | r2
            r15 = 0
            r1 = r17
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r24
            r9 = r15
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r24.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.b(u0.l0, java.lang.String, p0.d, p0.a, i1.c, float, u0.e0, int, e0.g, int, int):void");
    }
}
