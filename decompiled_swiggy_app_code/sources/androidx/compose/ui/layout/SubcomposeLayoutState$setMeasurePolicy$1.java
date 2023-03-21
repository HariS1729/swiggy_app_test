package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import d2.b;
import i1.j0;
import i1.u;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutState$setMeasurePolicy$1 extends Lambda implements p<LayoutNode, p<? super j0, ? super b, ? extends u>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SubcomposeLayoutState f6794a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f6794a = subcomposeLayoutState;
    }

    public final void a(LayoutNode layoutNode, p<? super j0, ? super b, ? extends u> pVar) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$null");
        kotlin.jvm.internal.p.j(pVar, "it");
        layoutNode.e(this.f6794a.i().k(pVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (p) obj2);
        return k.f22762a;
    }
}
