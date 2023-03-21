package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.SubcomposeLayoutState;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: LazyLayoutPrefetcher.android.kt */
final class LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x.g f4130a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyLayoutItemContentFactory f4131b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubcomposeLayoutState f4132c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4133d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(x.g gVar, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeLayoutState subcomposeLayoutState, int i11) {
        super(2);
        this.f4130a = gVar;
        this.f4131b = lazyLayoutItemContentFactory;
        this.f4132c = subcomposeLayoutState;
        this.f4133d = i11;
    }

    public final void a(g gVar, int i11) {
        LazyLayoutPrefetcher_androidKt.a(this.f4130a, this.f4131b, this.f4132c, gVar, this.f4133d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
