package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import d2.h;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import lp0.p;
import t0.f;
import u.n;
import wp0.j0;

@d(c = "androidx.compose.material.DefaultButtonElevation$elevation$3", f = "Button.kt", l = {562}, m = "invokeSuspend")
/* compiled from: Button.kt */
final class DefaultButtonElevation$elevation$3 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<h, v1.k> f4955b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DefaultButtonElevation f4956c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f4957d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u.h f4958e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultButtonElevation$elevation$3(Animatable<h, v1.k> animatable, DefaultButtonElevation defaultButtonElevation, float f11, u.h hVar, c<? super DefaultButtonElevation$elevation$3> cVar) {
        super(2, cVar);
        this.f4955b = animatable;
        this.f4956c = defaultButtonElevation;
        this.f4957d = f11;
        this.f4958e = hVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DefaultButtonElevation$elevation$3(this.f4955b, this.f4956c, this.f4957d, this.f4958e, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DefaultButtonElevation$elevation$3) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4954a;
        if (i11 == 0) {
            g.b(obj);
            float s11 = this.f4955b.m().s();
            u.h hVar = null;
            if (h.p(s11, this.f4956c.f4943b)) {
                hVar = new n(f.f16662b.c(), (i) null);
            } else if (h.p(s11, this.f4956c.f4945d)) {
                hVar = new u.f();
            } else if (h.p(s11, this.f4956c.f4946e)) {
                hVar = new u.d();
            }
            Animatable<h, v1.k> animatable = this.f4955b;
            float f11 = this.f4957d;
            u.h hVar2 = this.f4958e;
            this.f4954a = 1;
            if (c0.i.d(animatable, f11, hVar, hVar2, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
