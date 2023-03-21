package androidx.compose.runtime.internal;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposableLambda.jvm.kt */
final class ComposableLambdaImpl$invoke$5 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposableLambdaImpl f6165a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6166b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f6167c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f6168d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Object f6169e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Object f6170f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f6171g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaImpl$invoke$5(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        super(2);
        this.f6165a = composableLambdaImpl;
        this.f6166b = obj;
        this.f6167c = obj2;
        this.f6168d = obj3;
        this.f6169e = obj4;
        this.f6170f = obj5;
        this.f6171g = i11;
    }

    public final void a(g gVar, int i11) {
        kotlin.jvm.internal.p.j(gVar, "nc");
        this.f6165a.f(this.f6166b, this.f6167c, this.f6168d, this.f6169e, this.f6170f, gVar, this.f6171g | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
