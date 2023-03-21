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

@d(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", l = {322}, m = "invokeSuspend")
/* compiled from: FloatingActionButton.kt */
final class DefaultFloatingActionButtonElevation$elevation$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4967a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<h, v1.k> f4968b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DefaultFloatingActionButtonElevation f4969c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f4970d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u.h f4971e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$2(Animatable<h, v1.k> animatable, DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation, float f11, u.h hVar, c<? super DefaultFloatingActionButtonElevation$elevation$2> cVar) {
        super(2, cVar);
        this.f4968b = animatable;
        this.f4969c = defaultFloatingActionButtonElevation;
        this.f4970d = f11;
        this.f4971e = hVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DefaultFloatingActionButtonElevation$elevation$2(this.f4968b, this.f4969c, this.f4970d, this.f4971e, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4967a;
        if (i11 == 0) {
            g.b(obj);
            float s11 = this.f4968b.m().s();
            u.h hVar = null;
            if (h.p(s11, this.f4969c.f4960b)) {
                hVar = new n(f.f16662b.c(), (i) null);
            } else if (h.p(s11, this.f4969c.f4961c)) {
                hVar = new u.f();
            } else if (h.p(s11, this.f4969c.f4962d)) {
                hVar = new u.d();
            }
            Animatable<h, v1.k> animatable = this.f4968b;
            float f11 = this.f4970d;
            u.h hVar2 = this.f4971e;
            this.f4967a = 1;
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
