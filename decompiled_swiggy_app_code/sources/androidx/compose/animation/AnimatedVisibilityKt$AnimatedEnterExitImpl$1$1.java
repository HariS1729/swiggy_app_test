package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import bp0.g;
import bp0.k;
import e0.h0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {862}, m = "invokeSuspend")
/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f2463a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Transition<EnterExitState> f2464b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0<Boolean> f2465c;

    /* compiled from: Collect.kt */
    public static final class a implements e<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f2467a;

        public a(h0 h0Var) {
            this.f2467a = h0Var;
        }

        public Object emit(Boolean bool, c<? super k> cVar) {
            this.f2467a.setValue(kotlin.coroutines.jvm.internal.a.a(bool.booleanValue()));
            return k.f22762a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, h0<Boolean> h0Var, c<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> cVar) {
        super(2, cVar);
        this.f2464b = transition;
        this.f2465c = h0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.f2464b, this.f2465c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f2463a;
        if (i11 == 0) {
            g.b(obj);
            final Transition<EnterExitState> transition = this.f2464b;
            kotlinx.coroutines.flow.d n = androidx.compose.runtime.g.n(new lp0.a<Boolean>() {
                /* renamed from: a */
                public final Boolean invoke() {
                    EnterExitState g11 = transition.g();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(g11 == enterExitState || transition.m() == enterExitState);
                }
            });
            a aVar = new a(this.f2465c);
            this.f2463a = 1;
            if (n.collect(aVar, this) == d11) {
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
