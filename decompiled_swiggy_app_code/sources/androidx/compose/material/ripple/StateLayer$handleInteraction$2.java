package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
/* compiled from: Ripple.kt */
final class StateLayer$handleInteraction$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5860a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StateLayer f5861b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v1.g<Float> f5862c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateLayer$handleInteraction$2(StateLayer stateLayer, v1.g<Float> gVar, c<? super StateLayer$handleInteraction$2> cVar) {
        super(2, cVar);
        this.f5861b = stateLayer;
        this.f5862c = gVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new StateLayer$handleInteraction$2(this.f5861b, this.f5862c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((StateLayer$handleInteraction$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5860a;
        if (i11 == 0) {
            g.b(obj);
            Animatable a11 = this.f5861b.f5853c;
            Float c11 = a.c(0.0f);
            v1.g<Float> gVar = this.f5862c;
            this.f5860a = 1;
            if (Animatable.f(a11, c11, gVar, (Object) null, (l) null, this, 12, (Object) null) == d11) {
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
