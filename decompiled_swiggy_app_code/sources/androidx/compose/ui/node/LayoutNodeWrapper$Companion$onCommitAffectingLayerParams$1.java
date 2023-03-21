package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LayoutNodeWrapper.kt */
final class LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1 extends Lambda implements l<LayoutNodeWrapper, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1 f6883a = new LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1();

    LayoutNodeWrapper$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    public final void a(LayoutNodeWrapper layoutNodeWrapper) {
        p.j(layoutNodeWrapper, "wrapper");
        if (layoutNodeWrapper.o0()) {
            layoutNodeWrapper.U1();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((LayoutNodeWrapper) obj);
        return k.f22762a;
    }
}
