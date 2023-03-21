package n1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.NodeLocationHolder;
import androidx.compose.ui.semantics.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SemanticsSort.kt */
public final class r {
    public static final LayoutNode a(LayoutNode layoutNode, l<? super LayoutNode, Boolean> lVar) {
        p.j(layoutNode, "<this>");
        p.j(lVar, "predicate");
        if (lVar.invoke(layoutNode).booleanValue()) {
            return layoutNode;
        }
        List<LayoutNode> W = layoutNode.W();
        int size = W.size();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode a11 = a(W.get(i11), lVar);
            if (a11 != null) {
                return a11;
            }
        }
        return null;
    }

    public static final List<k> b(LayoutNode layoutNode, List<k> list) {
        p.j(layoutNode, "<this>");
        p.j(list, "list");
        if (!layoutNode.L0()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        List<LayoutNode> W = layoutNode.W();
        int size = W.size();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = W.get(i11);
            if (layoutNode2.L0()) {
                arrayList.add(new NodeLocationHolder(layoutNode, layoutNode2));
            }
        }
        List<NodeLocationHolder> d11 = d(arrayList);
        ArrayList arrayList2 = new ArrayList(d11.size());
        int size2 = d11.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(d11.get(i12).h());
        }
        int size3 = arrayList2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i13);
            k j = a.j(layoutNode3);
            if (j != null) {
                list.add(j);
            } else {
                b(layoutNode3, list);
            }
        }
        return list;
    }

    public static /* synthetic */ List c(LayoutNode layoutNode, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return b(layoutNode, list);
    }

    private static final List<NodeLocationHolder> d(List<NodeLocationHolder> list) {
        try {
            NodeLocationHolder.f7402e.a(NodeLocationHolder.ComparisonStrategy.Stripe);
            List<NodeLocationHolder> G0 = s.G0(list);
            o.x(G0);
            return G0;
        } catch (IllegalArgumentException unused) {
            NodeLocationHolder.f7402e.a(NodeLocationHolder.ComparisonStrategy.Location);
            List<NodeLocationHolder> G02 = s.G0(list);
            o.x(G02);
            return G02;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.node.LayoutNodeWrapper e(androidx.compose.ui.node.LayoutNode r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r1, r0)
            n1.k r0 = androidx.compose.ui.semantics.a.i(r1)
            if (r0 != 0) goto L_0x000f
            n1.k r0 = androidx.compose.ui.semantics.a.j(r1)
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.b()
            if (r0 != 0) goto L_0x001b
        L_0x0017:
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r1.c0()
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.r.e(androidx.compose.ui.node.LayoutNode):androidx.compose.ui.node.LayoutNodeWrapper");
    }
}
