package androidx.compose.animation;

import d2.p;
import e0.d1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$SizeModifier$measure$size$2 extends Lambda implements l<S, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AnimatedContentScope<S> f2455a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$SizeModifier$measure$size$2(AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.f2455a = animatedContentScope;
    }

    public final long a(S s11) {
        d1 d1Var = this.f2455a.h().get(s11);
        p pVar = d1Var == null ? null : (p) d1Var.getValue();
        return pVar == null ? p.f14019b.a() : pVar.j();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return p.b(a(obj));
    }
}
