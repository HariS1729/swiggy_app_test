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
final class AnimatedVisibilityKt$AnimatedVisibility$13 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<T> f2476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<T, Boolean> f2477b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f2478c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f2479d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f2480e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ q<b, g, Integer, k> f2481f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f2482g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f2483h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedVisibility$13(Transition<T> transition, l<? super T, Boolean> lVar, d dVar, a aVar, c cVar, q<? super b, ? super g, ? super Integer, k> qVar, int i11, int i12) {
        super(2);
        this.f2476a = transition;
        this.f2477b = lVar;
        this.f2478c = dVar;
        this.f2479d = aVar;
        this.f2480e = cVar;
        this.f2481f = qVar;
        this.f2482g = i11;
        this.f2483h = i12;
    }

    public final void a(g gVar, int i11) {
        AnimatedVisibilityKt.b(this.f2476a, this.f2477b, this.f2478c, this.f2479d, this.f2480e, this.f2481f, gVar, this.f2482g | 1, this.f2483h);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
