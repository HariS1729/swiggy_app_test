package androidx.compose.animation;

import bp0.k;
import defpackage.v1;
import e0.g;
import e0.m;
import e0.u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;
import wp0.j0;

/* compiled from: AnimationModifier.kt */
final class AnimationModifierKt$animateContentSize$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<d2.p, d2.p, k> f2514a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v1.a0<d2.p> f2515b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimationModifierKt$animateContentSize$2(p<? super d2.p, ? super d2.p, k> pVar, v1.a0<d2.p> a0Var) {
        super(3);
        this.f2514a = pVar;
        this.f2515b = a0Var;
    }

    public final d a(d dVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(dVar, "$this$composed");
        gVar.E(996776706);
        gVar.E(-723524056);
        gVar.E(-3687241);
        Object F = gVar.F();
        g.a aVar = g.f14172a;
        if (F == aVar.a()) {
            m mVar = new m(u.i(EmptyCoroutineContext.f25631a, gVar));
            gVar.y(mVar);
            F = mVar;
        }
        gVar.P();
        j0 a11 = ((m) F).a();
        gVar.P();
        v1.a0<d2.p> a0Var = this.f2515b;
        gVar.E(-3686930);
        boolean k = gVar.k(a11);
        Object F2 = gVar.F();
        if (k || F2 == aVar.a()) {
            F2 = new SizeAnimationModifier(a0Var, a11);
            gVar.y(F2);
        }
        gVar.P();
        SizeAnimationModifier sizeAnimationModifier = (SizeAnimationModifier) F2;
        sizeAnimationModifier.f(this.f2514a);
        d N = r0.d.b(dVar).N(sizeAnimationModifier);
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
