package k1;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.p;

/* compiled from: LayoutNode.kt */
public final class j {
    public static final q a(LayoutNode layoutNode) {
        p.j(layoutNode, "<this>");
        q t02 = layoutNode.t0();
        if (t02 != null) {
            return t02;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
