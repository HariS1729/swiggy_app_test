package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SemanticsNode.kt */
final class SemanticsNode$parent$2 extends Lambda implements l<LayoutNode, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsNode$parent$2 f7427a = new SemanticsNode$parent$2();

    SemanticsNode$parent$2() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(LayoutNode layoutNode) {
        p.j(layoutNode, "it");
        return Boolean.valueOf(a.j(layoutNode) != null);
    }
}
