package androidx.compose.foundation.layout;

import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;

/* compiled from: WindowInsetsPadding.android.kt */
public final class WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1 extends Lambda implements q<d, g, Integer, d> {
    public WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(359872873);
        WindowInsetsHolder c11 = WindowInsetsHolder.v.c(gVar, 8);
        gVar.E(1157296644);
        boolean k = gVar.k(c11);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new InsetsPaddingModifier(c11.e(), (l) null, 2, (i) null);
            gVar.y(F);
        }
        gVar.P();
        InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) F;
        gVar.P();
        return insetsPaddingModifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
