package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import d2.h;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.material.DefaultButtonElevation$elevation$2", f = "Button.kt", l = {552}, m = "invokeSuspend")
/* compiled from: Button.kt */
final class DefaultButtonElevation$elevation$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4951a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<h, v1.k> f4952b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f4953c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultButtonElevation$elevation$2(Animatable<h, v1.k> animatable, float f11, c<? super DefaultButtonElevation$elevation$2> cVar) {
        super(2, cVar);
        this.f4952b = animatable;
        this.f4953c = f11;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DefaultButtonElevation$elevation$2(this.f4952b, this.f4953c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DefaultButtonElevation$elevation$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4951a;
        if (i11 == 0) {
            g.b(obj);
            Animatable<h, v1.k> animatable = this.f4952b;
            h k = h.k(this.f4953c);
            this.f4951a = 1;
            if (animatable.v(k, this) == d11) {
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
