package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import f0.e;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LayoutNode.kt */
final class LayoutNode$layoutChildren$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f6859a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNode$layoutChildren$1(LayoutNode layoutNode) {
        super(0);
        this.f6859a = layoutNode;
    }

    public final void invoke() {
        int i11 = 0;
        this.f6859a.f6849x = 0;
        e<LayoutNode> A0 = this.f6859a.A0();
        int m11 = A0.m();
        if (m11 > 0) {
            Object[] l11 = A0.l();
            int i12 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i12];
                layoutNode.f6848w = layoutNode.v0();
                layoutNode.v = Integer.MAX_VALUE;
                layoutNode.U().r(false);
                if (layoutNode.l0() == LayoutNode.UsageByParent.InLayoutBlock) {
                    layoutNode.r1(LayoutNode.UsageByParent.NotUsed);
                }
                i12++;
            } while (i12 < m11);
        }
        this.f6859a.c0().k1().d();
        e<LayoutNode> A02 = this.f6859a.A0();
        LayoutNode layoutNode2 = this.f6859a;
        int m12 = A02.m();
        if (m12 > 0) {
            Object[] l12 = A02.l();
            do {
                LayoutNode layoutNode3 = (LayoutNode) l12[i11];
                if (layoutNode3.f6848w != layoutNode3.v0()) {
                    layoutNode2.Y0();
                    layoutNode2.I0();
                    if (layoutNode3.v0() == Integer.MAX_VALUE) {
                        layoutNode3.R0();
                    }
                }
                layoutNode3.U().o(layoutNode3.U().h());
                i11++;
            } while (i11 < m12);
        }
    }
}
