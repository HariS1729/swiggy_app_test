package androidx.compose.foundation.lazy;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import w.c;

/* compiled from: LazyListItemProviderImpl.kt */
final class LazyListItemsSnapshot$Item$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LazyListItemsSnapshot f3986a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f3987b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f3988c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f3989d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemsSnapshot$Item$1(LazyListItemsSnapshot lazyListItemsSnapshot, c cVar, int i11, int i12) {
        super(2);
        this.f3986a = lazyListItemsSnapshot;
        this.f3987b = cVar;
        this.f3988c = i11;
        this.f3989d = i12;
    }

    public final void a(g gVar, int i11) {
        this.f3986a.a(this.f3987b, this.f3988c, gVar, this.f3989d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
