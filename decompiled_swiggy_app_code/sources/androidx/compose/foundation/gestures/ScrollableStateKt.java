package androidx.compose.foundation.gestures;

import defpackage.y1;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ScrollableState.kt */
public final class ScrollableStateKt {
    public static final y1.r a(l<? super Float, Float> lVar) {
        p.j(lVar, "consumeScrollDelta");
        return new DefaultScrollableState(lVar);
    }

    public static final y1.r b(l<? super Float, Float> lVar, g gVar, int i11) {
        p.j(lVar, "consumeScrollDelta");
        gVar.E(-180460798);
        d1<T> m11 = androidx.compose.runtime.g.m(lVar, gVar, i11 & 14);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = a(new ScrollableStateKt$rememberScrollableState$1$1(m11));
            gVar.y(F);
        }
        gVar.P();
        y1.r rVar = (y1.r) F;
        gVar.P();
        return rVar;
    }
}
