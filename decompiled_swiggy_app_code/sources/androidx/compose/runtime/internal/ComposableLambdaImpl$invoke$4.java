package androidx.compose.runtime.internal;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposableLambda.jvm.kt */
final class ComposableLambdaImpl$invoke$4 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposableLambdaImpl f6159a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6160b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f6161c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f6162d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Object f6163e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f6164f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaImpl$invoke$4(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        super(2);
        this.f6159a = composableLambdaImpl;
        this.f6160b = obj;
        this.f6161c = obj2;
        this.f6162d = obj3;
        this.f6163e = obj4;
        this.f6164f = i11;
    }

    public final void a(g gVar, int i11) {
        kotlin.jvm.internal.p.j(gVar, "nc");
        this.f6159a.e(this.f6160b, this.f6161c, this.f6162d, this.f6163e, gVar, this.f6164f | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
