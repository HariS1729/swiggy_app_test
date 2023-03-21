package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: ConstraintScopeCommon.kt */
final class AnchorFunctions$verticalAnchorFunctions$2 extends Lambda implements q<a, Object, LayoutDirection, a> {

    /* renamed from: a  reason: collision with root package name */
    public static final AnchorFunctions$verticalAnchorFunctions$2 f7889a = new AnchorFunctions$verticalAnchorFunctions$2();

    AnchorFunctions$verticalAnchorFunctions$2() {
        super(3);
    }

    /* renamed from: a */
    public final a invoke(a aVar, Object obj, LayoutDirection layoutDirection) {
        p.j(aVar, "$this$arrayOf");
        p.j(obj, "other");
        p.j(layoutDirection, "layoutDirection");
        AnchorFunctions.f7878a.c(aVar, layoutDirection);
        a H = aVar.H(obj);
        p.i(H, "leftToRight(other)");
        return H;
    }
}
