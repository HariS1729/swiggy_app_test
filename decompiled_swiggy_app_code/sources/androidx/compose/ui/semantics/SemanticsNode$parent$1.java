package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.j;
import n1.k;

/* compiled from: SemanticsNode.kt */
final class SemanticsNode$parent$1 extends Lambda implements l<LayoutNode, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsNode$parent$1 f7426a = new SemanticsNode$parent$1();

    SemanticsNode$parent$1() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(LayoutNode layoutNode) {
        j j;
        p.j(layoutNode, "it");
        k j11 = a.j(layoutNode);
        boolean z11 = true;
        if (j11 == null || (j = j11.j()) == null || !j.l()) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
