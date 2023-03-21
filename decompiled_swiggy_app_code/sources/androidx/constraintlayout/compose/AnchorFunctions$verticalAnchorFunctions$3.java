package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;

/* compiled from: ConstraintScopeCommon.kt */
final class AnchorFunctions$verticalAnchorFunctions$3 extends Lambda implements q<a, Object, LayoutDirection, a> {

    /* renamed from: a  reason: collision with root package name */
    public static final AnchorFunctions$verticalAnchorFunctions$3 f7890a = new AnchorFunctions$verticalAnchorFunctions$3();

    AnchorFunctions$verticalAnchorFunctions$3() {
        super(3);
    }

    /* renamed from: a */
    public final a invoke(a aVar, Object obj, LayoutDirection layoutDirection) {
        p.j(aVar, "$this$arrayOf");
        p.j(obj, "other");
        p.j(layoutDirection, "layoutDirection");
        AnchorFunctions.f7878a.d(aVar, layoutDirection);
        a P = aVar.P(obj);
        p.i(P, "rightToLeft(other)");
        return P;
    }
}
