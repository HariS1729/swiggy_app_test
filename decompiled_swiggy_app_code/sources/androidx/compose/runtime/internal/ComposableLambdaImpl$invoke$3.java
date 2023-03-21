package androidx.compose.runtime.internal;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposableLambda.jvm.kt */
final class ComposableLambdaImpl$invoke$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposableLambdaImpl f6154a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6155b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f6156c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f6157d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f6158e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaImpl$invoke$3(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i11) {
        super(2);
        this.f6154a = composableLambdaImpl;
        this.f6155b = obj;
        this.f6156c = obj2;
        this.f6157d = obj3;
        this.f6158e = i11;
    }

    public final void a(g gVar, int i11) {
        kotlin.jvm.internal.p.j(gVar, "nc");
        this.f6154a.d(this.f6155b, this.f6156c, this.f6157d, gVar, this.f6158e | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
