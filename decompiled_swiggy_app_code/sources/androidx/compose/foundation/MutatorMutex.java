package androidx.compose.foundation;

import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.sync.c;
import kotlinx.coroutines.sync.d;
import lp0.l;
import wp0.k0;
import wp0.k1;

/* compiled from: MutatorMutex.kt */
public final class MutatorMutex {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f3104a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f3105b = d.b(false, 1, (Object) null);

    /* compiled from: MutatorMutex.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final MutatePriority f3106a;

        /* renamed from: b  reason: collision with root package name */
        private final k1 f3107b;

        public a(MutatePriority mutatePriority, k1 k1Var) {
            p.j(mutatePriority, HexAttribute.HEX_ATTR_THREAD_PRI);
            p.j(k1Var, "job");
            this.f3106a = mutatePriority;
            this.f3107b = k1Var;
        }

        public final boolean a(a aVar) {
            p.j(aVar, "other");
            return this.f3106a.compareTo(aVar.f3106a) >= 0;
        }

        public final void b() {
            k1.a.a(this.f3107b, (CancellationException) null, 1, (Object) null);
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, l lVar, fp0.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, lVar, cVar);
    }

    /* access modifiers changed from: private */
    public final void g(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f3104a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f3104a.compareAndSet(aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(MutatePriority mutatePriority, l<? super fp0.c<? super R>, ? extends Object> lVar, fp0.c<? super R> cVar) {
        return k0.e(new MutatorMutex$mutate$2(mutatePriority, this, lVar, (fp0.c<? super MutatorMutex$mutate$2>) null), cVar);
    }

    public final <T, R> Object f(T t, MutatePriority mutatePriority, lp0.p<? super T, ? super fp0.c<? super R>, ? extends Object> pVar, fp0.c<? super R> cVar) {
        return k0.e(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t, (fp0.c<? super MutatorMutex$mutateWith$2>) null), cVar);
    }
}
