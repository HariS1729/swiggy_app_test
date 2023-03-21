package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.s0;
import kotlin.jvm.internal.p;
import x.g;
import x.h;

/* compiled from: LazyLayoutPrefetcher.android.kt */
public final class LazyLayoutPrefetcher_androidKt {
    public static final void a(g gVar, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, e0.g gVar2, int i11) {
        p.j(gVar, "prefetchState");
        p.j(lazyLayoutItemContentFactory, "itemContentFactory");
        p.j(subcomposeLayoutState, "subcomposeLayoutState");
        e0.g t = gVar2.t(1113453182);
        View view = (View) t.z(AndroidCompositionLocals_androidKt.k());
        int i12 = SubcomposeLayoutState.f6787f;
        t.E(1618982084);
        boolean k = t.k(subcomposeLayoutState) | t.k(gVar) | t.k(view);
        Object F = t.F();
        if (k || F == e0.g.f14172a.a()) {
            t.y(new h(gVar, subcomposeLayoutState, lazyLayoutItemContentFactory, view));
        }
        t.P();
        s0 v = t.v();
        if (v != null) {
            v.a(new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(gVar, lazyLayoutItemContentFactory, subcomposeLayoutState, i11));
        }
    }
}
