package k1;

import androidx.compose.ui.node.DepthSortedSet;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: LayoutTreeConsistencyChecker.kt */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f15360a;

    /* renamed from: b  reason: collision with root package name */
    private final DepthSortedSet f15361b;

    /* renamed from: c  reason: collision with root package name */
    private final List<LayoutNode> f15362c;

    public k(LayoutNode layoutNode, DepthSortedSet depthSortedSet, List<LayoutNode> list) {
        p.j(layoutNode, "root");
        p.j(depthSortedSet, "relayoutNodes");
        p.j(list, "postponedMeasureRequests");
        this.f15360a = layoutNode;
        this.f15361b = depthSortedSet;
        this.f15362c = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r0 != null && r0.g()) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(androidx.compose.ui.node.LayoutNode r6) {
        /*
            r5 = this;
            androidx.compose.ui.node.LayoutNode r0 = r6.u0()
            boolean r1 = r6.g()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0022
            int r1 = r6.v0()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L_0x008c
            if (r0 == 0) goto L_0x001f
            boolean r1 = r0.g()
            if (r1 != r3) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x008c
        L_0x0022:
            boolean r1 = r6.i0()
            if (r1 == 0) goto L_0x0031
            java.util.List<androidx.compose.ui.node.LayoutNode> r1 = r5.f15362c
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x0031
            return r3
        L_0x0031:
            if (r0 == 0) goto L_0x0038
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r0.g0()
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            boolean r4 = r6.i0()
            if (r4 == 0) goto L_0x005a
            androidx.compose.ui.node.DepthSortedSet r4 = r5.f15361b
            boolean r6 = r4.b(r6)
            if (r6 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0051
            boolean r6 = r0.i0()
            if (r6 != r3) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            if (r6 != 0) goto L_0x0058
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r1 != r6) goto L_0x0059
        L_0x0058:
            r2 = 1
        L_0x0059:
            return r2
        L_0x005a:
            boolean r4 = r6.f0()
            if (r4 == 0) goto L_0x008c
            androidx.compose.ui.node.DepthSortedSet r4 = r5.f15361b
            boolean r6 = r4.b(r6)
            if (r6 != 0) goto L_0x008a
            if (r0 == 0) goto L_0x0072
            boolean r6 = r0.i0()
            if (r6 != r3) goto L_0x0072
            r6 = 1
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            if (r6 != 0) goto L_0x008a
            if (r0 == 0) goto L_0x007f
            boolean r6 = r0.f0()
            if (r6 != r3) goto L_0x007f
            r6 = 1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 != 0) goto L_0x008a
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r1 == r6) goto L_0x008a
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r1 != r6) goto L_0x008b
        L_0x008a:
            r2 = 1
        L_0x008b:
            return r2
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.k.b(androidx.compose.ui.node.LayoutNode):boolean");
    }

    private final boolean c(LayoutNode layoutNode) {
        if (!b(layoutNode)) {
            return false;
        }
        List<LayoutNode> W = layoutNode.W();
        int size = W.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!c(W.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        p.i(sb2, "append(value)");
        sb2.append(10);
        p.i(sb2, "append('\\n')");
        e(this, sb2, this.f15360a, 0);
        String sb3 = sb2.toString();
        p.i(sb3, "stringBuilder.toString()");
        return sb3;
    }

    private static final void e(k kVar, StringBuilder sb2, LayoutNode layoutNode, int i11) {
        String f11 = kVar.f(layoutNode);
        if (f11.length() > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append("..");
            }
            sb2.append(f11);
            p.i(sb2, "append(value)");
            sb2.append(10);
            p.i(sb2, "append('\\n')");
            i11++;
        }
        List<LayoutNode> W = layoutNode.W();
        int size = W.size();
        for (int i13 = 0; i13 < size; i13++) {
            e(kVar, sb2, W.get(i13), i11);
        }
    }

    private final String f(LayoutNode layoutNode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(layoutNode);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(layoutNode.g0());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!layoutNode.g()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + layoutNode.l0() + ']');
        if (!b(layoutNode)) {
            sb2.append("[INCONSISTENT]");
        }
        String sb4 = sb2.toString();
        p.i(sb4, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb4;
    }

    public final void a() {
        if (!c(this.f15360a)) {
            System.out.println(d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
