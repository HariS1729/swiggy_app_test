package androidx.compose.foundation.lazy;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: LazyListItemProviderImpl.kt */
final class LazyListItemProviderImpl$Item$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyListItemProviderImpl f3968a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f3969b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f3970c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemProviderImpl$Item$1(LazyListItemProviderImpl lazyListItemProviderImpl, int i11, int i12) {
        super(2);
        this.f3968a = lazyListItemProviderImpl;
        this.f3969b = i11;
        this.f3970c = i12;
    }

    public final void a(g gVar, int i11) {
        this.f3968a.e(this.f3969b, gVar, this.f3970c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
