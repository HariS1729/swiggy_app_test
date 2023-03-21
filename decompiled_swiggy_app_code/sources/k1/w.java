package k1;

import androidx.compose.ui.node.LayoutNode;
import e0.a;
import kotlin.jvm.internal.p;

/* compiled from: UiApplier.android.kt */
public final class w extends a<LayoutNode> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(LayoutNode layoutNode) {
        super(layoutNode);
        p.j(layoutNode, "root");
    }

    public void b(int i11, int i12) {
        ((LayoutNode) a()).f1(i11, i12);
    }

    public void c() {
        super.c();
        q t02 = ((LayoutNode) j()).t0();
        if (t02 != null) {
            t02.g();
        }
    }

    public void e(int i11, int i12, int i13) {
        ((LayoutNode) a()).S0(i11, i12, i13);
    }

    /* access modifiers changed from: protected */
    public void k() {
        ((LayoutNode) j()).e1();
    }

    /* renamed from: m */
    public void g(int i11, LayoutNode layoutNode) {
        p.j(layoutNode, "instance");
        ((LayoutNode) a()).H0(i11, layoutNode);
    }

    /* renamed from: n */
    public void f(int i11, LayoutNode layoutNode) {
        p.j(layoutNode, "instance");
    }
}
