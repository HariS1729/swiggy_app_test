package androidx.compose.foundation.lazy;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: LazyList.kt */
final class LazyListKt$ScrollPositionUpdater$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w.k f4002a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f4003b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4004c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListKt$ScrollPositionUpdater$1(w.k kVar, LazyListState lazyListState, int i11) {
        super(2);
        this.f4002a = kVar;
        this.f4003b = lazyListState;
        this.f4004c = i11;
    }

    public final void a(g gVar, int i11) {
        LazyListKt.b(this.f4002a, this.f4003b, gVar, this.f4004c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
