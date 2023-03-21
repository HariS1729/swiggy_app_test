package androidx.compose.foundation.interaction;

import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.u;
import fp0.c;
import kotlin.jvm.internal.p;
import u.i;

/* compiled from: HoverInteraction.kt */
public final class HoverInteractionKt {
    public static final d1<Boolean> a(i iVar, g gVar, int i11) {
        p.j(iVar, "<this>");
        gVar.E(1206586544);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        u.e(iVar, new HoverInteractionKt$collectIsHoveredAsState$1(iVar, h0Var, (c<? super HoverInteractionKt$collectIsHoveredAsState$1>) null), gVar, i11 & 14);
        gVar.P();
        return h0Var;
    }
}
