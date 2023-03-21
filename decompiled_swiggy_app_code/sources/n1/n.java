package n1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.a;
import kotlin.jvm.internal.p;

/* compiled from: SemanticsOwner.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f15809a;

    public n(LayoutNode layoutNode) {
        p.j(layoutNode, "rootNode");
        this.f15809a = layoutNode;
    }

    public final SemanticsNode a() {
        k j = a.j(this.f15809a);
        p.g(j);
        return new SemanticsNode(j, false);
    }
}
