package androidx.compose.ui.layout;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutState$setCompositionContext$1 extends Lambda implements p<LayoutNode, a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SubcomposeLayoutState f6793a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f6793a = subcomposeLayoutState;
    }

    public final void a(LayoutNode layoutNode, a aVar) {
        kotlin.jvm.internal.p.j(layoutNode, "$this$null");
        kotlin.jvm.internal.p.j(aVar, "it");
        this.f6793a.i().u(aVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((LayoutNode) obj, (a) obj2);
        return k.f22762a;
    }
}
