package androidx.compose.material;

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

@d(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1", f = "SnackbarHost.kt", l = {363}, m = "invokeSuspend")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$animatedScale$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5334a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<Float, v1.k> f5335b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f5336c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v1.g<Float> f5337d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$animatedScale$1(Animatable<Float, v1.k> animatable, boolean z11, v1.g<Float> gVar, c<? super SnackbarHostKt$animatedScale$1> cVar) {
        super(2, cVar);
        this.f5335b = animatable;
        this.f5336c = z11;
        this.f5337d = gVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SnackbarHostKt$animatedScale$1(this.f5335b, this.f5336c, this.f5337d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SnackbarHostKt$animatedScale$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5334a;
        if (i11 == 0) {
            g.b(obj);
            Animatable<Float, v1.k> animatable = this.f5335b;
            Float c11 = a.c(this.f5336c ? 1.0f : 0.8f);
            v1.g<Float> gVar = this.f5337d;
            this.f5334a = 1;
            if (Animatable.f(animatable, c11, gVar, (Object) null, (l) null, this, 12, (Object) null) == d11) {
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
