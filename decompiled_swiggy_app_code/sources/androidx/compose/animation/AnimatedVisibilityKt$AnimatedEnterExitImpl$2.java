package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import lp0.q;
import p.b;
import p0.d;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<T> f2468a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<T, Boolean> f2469b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f2470c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f2471d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f2472e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ q<b, g, Integer, k> f2473f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f2474g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$2(Transition<T> transition, l<? super T, Boolean> lVar, d dVar, a aVar, c cVar, q<? super b, ? super g, ? super Integer, k> qVar, int i11) {
        super(2);
        this.f2468a = transition;
        this.f2469b = lVar;
        this.f2470c = dVar;
        this.f2471d = aVar;
        this.f2472e = cVar;
        this.f2473f = qVar;
        this.f2474g = i11;
    }

    public final void a(g gVar, int i11) {
        AnimatedVisibilityKt.a(this.f2468a, this.f2469b, this.f2470c, this.f2471d, this.f2472e, this.f2473f, gVar, this.f2474g | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
