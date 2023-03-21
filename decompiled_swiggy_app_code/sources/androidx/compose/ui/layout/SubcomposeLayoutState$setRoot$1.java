package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutState$setRoot$1 extends Lambda implements p<LayoutNode, SubcomposeLayoutState, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SubcomposeLayoutState f6795a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f6795a = subcomposeLayoutState;
    }

    public final void a(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$null");
        kotlin.jvm.internal.p.j(subcomposeLayoutState, "it");
        SubcomposeLayoutState subcomposeLayoutState2 = this.f6795a;
        LayoutNodeSubcompositionsState w02 = layoutNode.w0();
        if (w02 == null) {
            w02 = new LayoutNodeSubcompositionsState(layoutNode, this.f6795a.f6788a);
            layoutNode.w1(w02);
        }
        subcomposeLayoutState2.f6789b = w02;
        this.f6795a.i().q();
        this.f6795a.i().v(this.f6795a.f6788a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (SubcomposeLayoutState) obj2);
        return k.f22762a;
    }
}
