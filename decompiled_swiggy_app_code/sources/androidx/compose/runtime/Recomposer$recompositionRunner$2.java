package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.b;
import bp0.g;
import bp0.k;
import e0.c0;
import e0.o;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import lp0.q;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.n;
import wp0.n1;

@d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {744}, m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f6065a;

    /* renamed from: b  reason: collision with root package name */
    int f6066b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f6067c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Recomposer f6068d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<j0, c0, c<? super k>, Object> f6069e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c0 f6070f;

    @d(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {745}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2  reason: invalid class name */
    /* compiled from: Recomposer.kt */
    static final class AnonymousClass2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f6071a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6072b;

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass2 r02 = new AnonymousClass2(qVar, c0Var, cVar);
            r02.f6072b = obj;
            return r02;
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f6071a;
            if (i11 == 0) {
                g.b(obj);
                q<j0, c0, c<? super k>, Object> qVar = qVar;
                c0 c0Var = c0Var;
                this.f6071a = 1;
                if (qVar.invoke((j0) this.f6072b, c0Var, this) == d11) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$recompositionRunner$2(Recomposer recomposer, q<? super j0, ? super c0, ? super c<? super k>, ? extends Object> qVar, c0 c0Var, c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.f6068d = recomposer;
        this.f6069e = qVar;
        this.f6070f = c0Var;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.f6068d, this.f6069e, this.f6070f, cVar);
        recomposer$recompositionRunner$2.f6067c = obj;
        return recomposer$recompositionRunner$2;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((Recomposer$recompositionRunner$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        k1 k1Var;
        n0.c cVar;
        Object d11 = b.d();
        int i11 = this.f6066b;
        if (i11 == 0) {
            g.b(obj);
            k1Var = n1.l(((j0) this.f6067c).X0());
            this.f6068d.j0(k1Var);
            n0.c e11 = b.f6287e.e(new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.f6068d));
            Recomposer.t.c(this.f6068d.f6054s);
            try {
                Object E = this.f6068d.f6044e;
                Recomposer recomposer = this.f6068d;
                synchronized (E) {
                    List z11 = recomposer.f6047h;
                    int size = z11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((o) z11.get(i12)).a();
                    }
                    k kVar = k.f22762a;
                }
                final q<j0, c0, c<? super k>, Object> qVar = this.f6069e;
                final c0 c0Var = this.f6070f;
                AnonymousClass2 r42 = new AnonymousClass2((c<? super AnonymousClass2>) null);
                this.f6067c = k1Var;
                this.f6065a = e11;
                this.f6066b = 1;
                if (k0.e(r42, this) == d11) {
                    return d11;
                }
                cVar = e11;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                cVar = e11;
                th2 = th4;
                cVar.dispose();
                Object E2 = this.f6068d.f6044e;
                Recomposer recomposer2 = this.f6068d;
                synchronized (E2) {
                    if (recomposer2.f6045f == k1Var) {
                        recomposer2.f6045f = null;
                    }
                    n unused = recomposer2.U();
                }
                Recomposer.t.d(this.f6068d.f6054s);
                throw th2;
            }
        } else if (i11 == 1) {
            cVar = (n0.c) this.f6065a;
            k1Var = (k1) this.f6067c;
            try {
                g.b(obj);
            } catch (Throwable th5) {
                th2 = th5;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar.dispose();
        Object E3 = this.f6068d.f6044e;
        Recomposer recomposer3 = this.f6068d;
        synchronized (E3) {
            if (recomposer3.f6045f == k1Var) {
                recomposer3.f6045f = null;
            }
            n unused2 = recomposer3.U();
        }
        Recomposer.t.d(this.f6068d.f6054s);
        return k.f22762a;
    }
}
