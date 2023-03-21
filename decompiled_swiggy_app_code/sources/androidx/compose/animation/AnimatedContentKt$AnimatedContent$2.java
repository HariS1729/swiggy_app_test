package androidx.compose.animation;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import lp0.r;
import p.b;
import p.e;
import p0.a;
import p0.d;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$AnimatedContent$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ S f2393a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f2394b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<AnimatedContentScope<S>, e> f2395c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f2396d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r<b, S, g, Integer, k> f2397e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f2398f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f2399g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContent$2(S s11, d dVar, l<? super AnimatedContentScope<S>, e> lVar, a aVar, r<? super b, ? super S, ? super g, ? super Integer, k> rVar, int i11, int i12) {
        super(2);
        this.f2393a = s11;
        this.f2394b = dVar;
        this.f2395c = lVar;
        this.f2396d = aVar;
        this.f2397e = rVar;
        this.f2398f = i11;
        this.f2399g = i12;
    }

    public final void a(g gVar, int i11) {
        AnimatedContentKt.b(this.f2393a, this.f2394b, this.f2395c, this.f2396d, this.f2397e, gVar, this.f2398f | 1, this.f2399g);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
