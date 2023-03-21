package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
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
final class AnimatedContentKt$AnimatedContent$8 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2424a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f2425b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<AnimatedContentScope<S>, e> f2426c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f2427d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<S, Object> f2428e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r<b, S, g, Integer, k> f2429f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f2430g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f2431h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContent$8(Transition<S> transition, d dVar, l<? super AnimatedContentScope<S>, e> lVar, a aVar, l<? super S, ? extends Object> lVar2, r<? super b, ? super S, ? super g, ? super Integer, k> rVar, int i11, int i12) {
        super(2);
        this.f2424a = transition;
        this.f2425b = dVar;
        this.f2426c = lVar;
        this.f2427d = aVar;
        this.f2428e = lVar2;
        this.f2429f = rVar;
        this.f2430g = i11;
        this.f2431h = i12;
    }

    public final void a(g gVar, int i11) {
        AnimatedContentKt.a(this.f2424a, this.f2425b, this.f2426c, this.f2427d, this.f2428e, this.f2429f, gVar, this.f2430g | 1, this.f2431h);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
