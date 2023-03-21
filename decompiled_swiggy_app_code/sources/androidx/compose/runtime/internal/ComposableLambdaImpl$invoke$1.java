package androidx.compose.runtime.internal;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposableLambda.jvm.kt */
final class ComposableLambdaImpl$invoke$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposableLambdaImpl f6147a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6148b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6149c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaImpl$invoke$1(ComposableLambdaImpl composableLambdaImpl, Object obj, int i11) {
        super(2);
        this.f6147a = composableLambdaImpl;
        this.f6148b = obj;
        this.f6149c = i11;
    }

    public final void a(g gVar, int i11) {
        kotlin.jvm.internal.p.j(gVar, "nc");
        this.f6147a.b(this.f6148b, gVar, this.f6149c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
