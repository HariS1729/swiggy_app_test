package androidx.compose.animation.core;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: InfiniteTransition.kt */
final class InfiniteTransition$run$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InfiniteTransition f2671a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f2672b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$2(InfiniteTransition infiniteTransition, int i11) {
        super(2);
        this.f2671a = infiniteTransition;
        this.f2672b = i11;
    }

    public final void a(g gVar, int i11) {
        this.f2671a.h(gVar, this.f2672b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
