package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.h;
import wp0.j0;
import wp0.k1;

@d(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
/* compiled from: PausingDispatcher.kt */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements p<j0, c<? super T>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f10651a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f10652b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Lifecycle f10653c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Lifecycle.State f10654d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<j0, c<? super T>, Object> f10655e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, p<? super j0, ? super c<? super T>, ? extends Object> pVar, c<? super PausingDispatcherKt$whenStateAtLeast$2> cVar) {
        super(2, cVar);
        this.f10653c = lifecycle;
        this.f10654d = state;
        this.f10655e = pVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f10653c, this.f10654d, this.f10655e, cVar);
        pausingDispatcherKt$whenStateAtLeast$2.f10652b = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(j0 j0Var, c<? super T> cVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        m mVar;
        Object d11 = b.d();
        int i11 = this.f10651a;
        if (i11 == 0) {
            g.b(obj);
            k1 k1Var = (k1) ((j0) this.f10652b).X0().get(k1.f29476l0);
            if (k1Var != null) {
                b0 b0Var = new b0();
                m mVar2 = new m(this.f10653c, this.f10654d, b0Var.f10716b, k1Var);
                try {
                    p<j0, c<? super T>, Object> pVar = this.f10655e;
                    this.f10652b = mVar2;
                    this.f10651a = 1;
                    obj = h.g(b0Var, pVar, this);
                    if (obj == d11) {
                        return d11;
                    }
                    mVar = mVar2;
                } catch (Throwable th2) {
                    th = th2;
                    mVar = mVar2;
                    mVar.b();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i11 == 1) {
            mVar = (m) this.f10652b;
            try {
                g.b(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mVar.b();
        return obj;
    }
}
