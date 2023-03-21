package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import d2.p;
import defpackage.v1;
import e0.d1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$SizeModifier$measure$size$1 extends Lambda implements l<Transition.b<S>, v1.a0<p>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AnimatedContentScope<S> f2453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnimatedContentScope<S>.SizeModifier f2454b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$SizeModifier$measure$size$1(AnimatedContentScope<S> animatedContentScope, AnimatedContentScope<S>.SizeModifier sizeModifier) {
        super(1);
        this.f2453a = animatedContentScope;
        this.f2454b = sizeModifier;
    }

    /* renamed from: a */
    public final v1.a0<p> invoke(Transition.b<S> bVar) {
        kotlin.jvm.internal.p.j(bVar, "$this$animate");
        d1 d1Var = this.f2453a.h().get(bVar.c());
        p pVar = d1Var == null ? null : (p) d1Var.getValue();
        long a11 = pVar == null ? p.f14019b.a() : pVar.j();
        d1 d1Var2 = this.f2453a.h().get(bVar.b());
        p pVar2 = d1Var2 == null ? null : (p) d1Var2.getValue();
        long a12 = pVar2 == null ? p.f14019b.a() : pVar2.j();
        p.l value = this.f2454b.a().getValue();
        v1.a0<p> b11 = value == null ? null : value.b(a11, a12);
        return b11 == null ? v1.h.g(0.0f, 0.0f, (Object) null, 7, (Object) null) : b11;
    }
}
