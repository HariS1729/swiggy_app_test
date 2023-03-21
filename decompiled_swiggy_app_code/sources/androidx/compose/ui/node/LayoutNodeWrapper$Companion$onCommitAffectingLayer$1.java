package androidx.compose.ui.node;

import bp0.k;
import k1.o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LayoutNodeWrapper.kt */
final class LayoutNodeWrapper$Companion$onCommitAffectingLayer$1 extends Lambda implements l<LayoutNodeWrapper, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final LayoutNodeWrapper$Companion$onCommitAffectingLayer$1 f6882a = new LayoutNodeWrapper$Companion$onCommitAffectingLayer$1();

    LayoutNodeWrapper$Companion$onCommitAffectingLayer$1() {
        super(1);
    }

    public final void a(LayoutNodeWrapper layoutNodeWrapper) {
        p.j(layoutNodeWrapper, "wrapper");
        o h12 = layoutNodeWrapper.h1();
        if (h12 != null) {
            h12.invalidate();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((LayoutNodeWrapper) obj);
        return k.f22762a;
    }
}
