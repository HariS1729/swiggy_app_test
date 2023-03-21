package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: OwnerSnapshotObserver.kt */
final class OwnerSnapshotObserver$onCommitAffectingLayout$1 extends Lambda implements l<LayoutNode, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingLayout$1 f6938a = new OwnerSnapshotObserver$onCommitAffectingLayout$1();

    OwnerSnapshotObserver$onCommitAffectingLayout$1() {
        super(1);
    }

    public final void a(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        if (layoutNode.o0()) {
            LayoutNode.i1(layoutNode, false, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((LayoutNode) obj);
        return k.f22762a;
    }
}
