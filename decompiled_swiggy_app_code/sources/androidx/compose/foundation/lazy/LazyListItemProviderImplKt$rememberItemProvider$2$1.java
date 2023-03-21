package androidx.compose.foundation.lazy;

import bp0.k;
import e0.d1;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import rp0.f;

/* compiled from: LazyListItemProviderImpl.kt */
final class LazyListItemProviderImplKt$rememberItemProvider$2$1 extends Lambda implements a<LazyListItemsSnapshot> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<l<c, k>> f3981a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h0<f> f3982b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemProviderImplKt$rememberItemProvider$2$1(d1<? extends l<? super c, k>> d1Var, h0<f> h0Var) {
        super(0);
        this.f3981a = d1Var;
        this.f3982b = h0Var;
    }

    /* renamed from: a */
    public final LazyListItemsSnapshot invoke() {
        LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
        this.f3981a.getValue().invoke(lazyListScopeImpl);
        return new LazyListItemsSnapshot(lazyListScopeImpl.f(), lazyListScopeImpl.e(), this.f3982b.getValue());
    }
}
