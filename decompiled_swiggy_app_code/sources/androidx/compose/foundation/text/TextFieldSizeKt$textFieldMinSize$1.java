package androidx.compose.foundation.text;

import e0.d1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.q;
import p0.d;
import p1.c0;

/* compiled from: TextFieldSize.kt */
final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0 f4623a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldSizeKt$textFieldMinSize$1(c0 c0Var) {
        super(3);
        this.f4623a = c0Var;
    }

    private static final Object b(d1<? extends Object> d1Var) {
        return d1Var.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: p1.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: e0.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: androidx.compose.foundation.text.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p0.d a(p0.d r11, e0.g r12, int r13) {
        /*
            r10 = this;
            java.lang.String r13 = "$this$composed"
            kotlin.jvm.internal.p.j(r11, r13)
            r11 = 1582736677(0x5e56a525, float:3.86670229E18)
            r12.E(r11)
            e0.m0 r11 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r11 = r12.z(r11)
            d2.e r11 = (d2.e) r11
            e0.m0 r13 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r13 = r12.z(r13)
            u1.i$b r13 = (u1.i.b) r13
            e0.m0 r0 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r0 = r12.z(r0)
            r6 = r0
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.ui.unit.LayoutDirection) r6
            p1.c0 r0 = r10.f4623a
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.E(r1)
            boolean r2 = r12.k(r0)
            boolean r3 = r12.k(r6)
            r2 = r2 | r3
            java.lang.Object r3 = r12.F()
            if (r2 != 0) goto L_0x0049
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0050
        L_0x0049:
            p1.c0 r3 = p1.d0.d(r0, r6)
            r12.y(r3)
        L_0x0050:
            r12.P()
            r7 = r3
            p1.c0 r7 = (p1.c0) r7
            r12.E(r1)
            boolean r0 = r12.k(r13)
            boolean r1 = r12.k(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r12.F()
            if (r0 != 0) goto L_0x0070
            e0.g$a r0 = e0.g.f14172a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00a9
        L_0x0070:
            u1.i r0 = r7.h()
            u1.v r1 = r7.m()
            if (r1 != 0) goto L_0x0080
            u1.v$a r1 = u1.v.f16949b
            u1.v r1 = r1.f()
        L_0x0080:
            u1.s r2 = r7.k()
            if (r2 == 0) goto L_0x008b
            int r2 = r2.i()
            goto L_0x0091
        L_0x008b:
            u1.s$a r2 = u1.s.f16939b
            int r2 = r2.b()
        L_0x0091:
            u1.t r3 = r7.l()
            if (r3 == 0) goto L_0x009c
            int r3 = r3.m()
            goto L_0x00a2
        L_0x009c:
            u1.t$a r3 = u1.t.f16943b
            int r3 = r3.a()
        L_0x00a2:
            e0.d1 r1 = r13.a(r0, r1, r2, r3)
            r12.y(r1)
        L_0x00a9:
            r12.P()
            r8 = r1
            e0.d1 r8 = (e0.d1) r8
            p1.c0 r4 = r10.f4623a
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.E(r0)
            java.lang.Object r0 = r12.F()
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x00d3
            androidx.compose.foundation.text.a r9 = new androidx.compose.foundation.text.a
            java.lang.Object r5 = b(r8)
            r0 = r9
            r1 = r6
            r2 = r11
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r12.y(r9)
        L_0x00d3:
            r12.P()
            r9 = r0
            androidx.compose.foundation.text.a r9 = (androidx.compose.foundation.text.a) r9
            java.lang.Object r5 = b(r8)
            r0 = r9
            r1 = r6
            r2 = r11
            r3 = r13
            r4 = r7
            r0.c(r1, r2, r3, r4, r5)
            p0.d$a r11 = p0.d.f16037h0
            androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1 r13 = new androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1
            r13.<init>(r9)
            p0.d r11 = androidx.compose.ui.layout.LayoutModifierKt.a(r11, r13)
            r12.P()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.a(p0.d, e0.g, int):p0.d");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
