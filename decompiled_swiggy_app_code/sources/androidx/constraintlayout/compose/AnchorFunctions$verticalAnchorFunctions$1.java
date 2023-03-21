package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: ConstraintScopeCommon.kt */
final class AnchorFunctions$verticalAnchorFunctions$1 extends Lambda implements q<a, Object, LayoutDirection, a> {

    /* renamed from: a  reason: collision with root package name */
    public static final AnchorFunctions$verticalAnchorFunctions$1 f7888a = new AnchorFunctions$verticalAnchorFunctions$1();

    AnchorFunctions$verticalAnchorFunctions$1() {
        super(3);
    }

    /* renamed from: a */
    public final a invoke(a aVar, Object obj, LayoutDirection layoutDirection) {
        p.j(aVar, "$this$arrayOf");
        p.j(obj, "other");
        p.j(layoutDirection, "layoutDirection");
        AnchorFunctions.f7878a.c(aVar, layoutDirection);
        a G = aVar.G(obj);
        p.i(G, "leftToLeft(other)");
        return G;
    }
}
