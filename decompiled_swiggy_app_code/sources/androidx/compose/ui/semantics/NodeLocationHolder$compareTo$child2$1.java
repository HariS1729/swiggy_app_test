package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import i1.n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.r;
import t0.h;

/* compiled from: SemanticsSort.kt */
final class NodeLocationHolder$compareTo$child2$1 extends Lambda implements l<LayoutNode, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f7409a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NodeLocationHolder$compareTo$child2$1(h hVar) {
        super(1);
        this.f7409a = hVar;
    }

    /* renamed from: a */
    public final Boolean invoke(LayoutNode layoutNode) {
        p.j(layoutNode, "it");
        LayoutNodeWrapper e11 = r.e(layoutNode);
        return Boolean.valueOf(e11.D() && !p.e(this.f7409a, n.b(e11)));
    }
}
