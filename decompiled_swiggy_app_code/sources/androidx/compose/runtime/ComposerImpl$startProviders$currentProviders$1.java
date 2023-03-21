package androidx.compose.runtime;

import e0.d1;
import e0.g;
import e0.l;
import e0.n0;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Composer.kt */
final class ComposerImpl$startProviders$currentProviders$1 extends Lambda implements p<g, Integer, g0.g<l<Object>, ? extends d1<? extends Object>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0<?>[] f5969a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g0.g<l<Object>, d1<Object>> f5970b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$startProviders$currentProviders$1(n0<?>[] n0VarArr, g0.g<l<Object>, ? extends d1<? extends Object>> gVar) {
        super(2);
        this.f5969a = n0VarArr;
        this.f5970b = gVar;
    }

    public final g0.g<l<Object>, d1<Object>> a(g gVar, int i11) {
        gVar.E(935231726);
        g0.g<l<Object>, d1<Object>> d11 = ComposerKt.y(this.f5969a, this.f5970b, gVar, 8);
        gVar.P();
        return d11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((g) obj, ((Number) obj2).intValue());
    }
}
