package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.a;
import lp0.l;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", l = {350}, m = "invokeSuspend")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$animatedOpacity$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<Float, v1.k> f5330b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f5331c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v1.g<Float> f5332d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a<k> f5333e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedOpacity$2(Animatable<Float, v1.k> animatable, boolean z11, v1.g<Float> gVar, a<k> aVar, c<? super SnackbarHostKt$animatedOpacity$2> cVar) {
        super(2, cVar);
        this.f5330b = animatable;
        this.f5331c = z11;
        this.f5332d = gVar;
        this.f5333e = aVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SnackbarHostKt$animatedOpacity$2(this.f5330b, this.f5331c, this.f5332d, this.f5333e, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SnackbarHostKt$animatedOpacity$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5329a;
        if (i11 == 0) {
            g.b(obj);
            Animatable<Float, v1.k> animatable = this.f5330b;
            Float c11 = kotlin.coroutines.jvm.internal.a.c(this.f5331c ? 1.0f : 0.0f);
            v1.g<Float> gVar = this.f5332d;
            this.f5329a = 1;
            if (Animatable.f(animatable, c11, gVar, (Object) null, (l) null, this, 12, (Object) null) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f5333e.invoke();
        return k.f22762a;
    }
}
