package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LayoutNodeWrapper.kt */
final class LayoutNodeWrapper$invalidateParentLayer$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNodeWrapper f6899a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeWrapper$invalidateParentLayer$1(LayoutNodeWrapper layoutNodeWrapper) {
        super(0);
        this.f6899a = layoutNodeWrapper;
    }

    public final void invoke() {
        LayoutNodeWrapper s12 = this.f6899a.s1();
        if (s12 != null) {
            s12.y1();
        }
    }
}
