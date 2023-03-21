package androidx.compose.animation.core;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Transition.kt */
final class Transition$updateTarget$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2769a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ S f2770b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2771c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transition$updateTarget$2(Transition<S> transition, S s11, int i11) {
        super(2);
        this.f2769a = transition;
        this.f2770b = s11;
        this.f2771c = i11;
    }

    public final void a(g gVar, int i11) {
        this.f2769a.G(this.f2770b, gVar, this.f2771c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
