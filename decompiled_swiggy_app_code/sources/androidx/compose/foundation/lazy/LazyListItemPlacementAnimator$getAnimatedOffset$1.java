package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import d2.l;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", l = {266}, m = "invokeSuspend")
/* compiled from: LazyListItemPlacementAnimator.kt */
final class LazyListItemPlacementAnimator$getAnimatedOffset$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3961a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f3962b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemPlacementAnimator$getAnimatedOffset$1(d dVar, c<? super LazyListItemPlacementAnimator$getAnimatedOffset$1> cVar) {
        super(2, cVar);
        this.f3962b = dVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LazyListItemPlacementAnimator$getAnimatedOffset$1(this.f3962b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((LazyListItemPlacementAnimator$getAnimatedOffset$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3961a;
        if (i11 == 0) {
            g.b(obj);
            Animatable<l, v1.l> a11 = this.f3962b.a();
            l b11 = l.b(this.f3962b.d());
            this.f3961a = 1;
            if (a11.v(b11, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f3962b.e(false);
        return k.f22762a;
    }
}
