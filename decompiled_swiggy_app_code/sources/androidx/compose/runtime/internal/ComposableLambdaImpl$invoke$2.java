package androidx.compose.runtime.internal;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposableLambda.jvm.kt */
final class ComposableLambdaImpl$invoke$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposableLambdaImpl f6150a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6151b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f6152c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f6153d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaImpl$invoke$2(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, int i11) {
        super(2);
        this.f6150a = composableLambdaImpl;
        this.f6151b = obj;
        this.f6152c = obj2;
        this.f6153d = i11;
    }

    public final void a(g gVar, int i11) {
        kotlin.jvm.internal.p.j(gVar, "nc");
        this.f6150a.c(this.f6151b, this.f6152c, gVar, this.f6153d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
