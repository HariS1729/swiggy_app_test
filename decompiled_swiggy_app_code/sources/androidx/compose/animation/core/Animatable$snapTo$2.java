package androidx.compose.animation.core;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;

@d(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* compiled from: Animatable.kt */
final class Animatable$snapTo$2 extends SuspendLambda implements l<c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f2628a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<T, V> f2629b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ T f2630c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Animatable$snapTo$2(Animatable<T, V> animatable, T t, c<? super Animatable$snapTo$2> cVar) {
        super(1, cVar);
        this.f2629b = animatable;
        this.f2630c = t;
    }

    public final c<k> create(c<?> cVar) {
        return new Animatable$snapTo$2(this.f2629b, this.f2630c, cVar);
    }

    public final Object invoke(c<? super k> cVar) {
        return ((Animatable$snapTo$2) create(cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f2628a == 0) {
            g.b(obj);
            this.f2629b.j();
            Object a11 = this.f2629b.h(this.f2630c);
            this.f2629b.l().s(a11);
            this.f2629b.u(a11);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
