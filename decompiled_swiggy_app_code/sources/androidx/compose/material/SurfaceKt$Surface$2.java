package androidx.compose.material;

import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.material.SurfaceKt$Surface$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
/* compiled from: Surface.kt */
final class SurfaceKt$Surface$2 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5418a;

    SurfaceKt$Surface$2(c<? super SurfaceKt$Surface$2> cVar) {
        super(2, cVar);
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((SurfaceKt$Surface$2) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SurfaceKt$Surface$2(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f5418a == 0) {
            g.b(obj);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
