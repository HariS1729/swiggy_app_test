package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import d2.l;
import defpackage.v1;
import fp0.c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import w.j;
import wp0.j0;

@d(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyListItemPlacementAnimator.kt", l = {400}, m = "invokeSuspend")
/* compiled from: LazyListItemPlacementAnimator.kt */
final class LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3963a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f3964b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v1.a0<l> f3965c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(d dVar, v1.a0<l> a0Var, c<? super LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1> cVar) {
        super(2, cVar);
        this.f3964b = dVar;
        this.f3965c = a0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.f3964b, this.f3965c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        v1.g gVar;
        Object d11 = b.d();
        int i11 = this.f3963a;
        if (i11 == 0) {
            g.b(obj);
            if (this.f3964b.a().r()) {
                v1.a0<l> a0Var = this.f3965c;
                if (a0Var instanceof v1.l0) {
                    gVar = (v1.l0) a0Var;
                } else {
                    gVar = j.f17365a;
                }
            } else {
                gVar = this.f3965c;
            }
            v1.g gVar2 = gVar;
            Animatable<l, v1.l> a11 = this.f3964b.a();
            l b11 = l.b(this.f3964b.d());
            this.f3963a = 1;
            if (Animatable.f(a11, b11, gVar2, (Object) null, (lp0.l) null, this, 12, (Object) null) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (CancellationException unused) {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f3964b.e(false);
        return k.f22762a;
    }
}
