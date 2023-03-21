package androidx.compose.animation.core;

import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.sync.c;
import kotlinx.coroutines.sync.d;
import lp0.l;
import wp0.k0;
import wp0.k1;

/* compiled from: InternalMutatorMutex.kt */
public final class MutatorMutex {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f2681a = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f2682b = d.b(false, 1, (Object) null);

    /* compiled from: InternalMutatorMutex.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final MutatePriority f2683a;

        /* renamed from: b  reason: collision with root package name */
        private final k1 f2684b;

        public a(MutatePriority mutatePriority, k1 k1Var) {
            p.j(mutatePriority, HexAttribute.HEX_ATTR_THREAD_PRI);
            p.j(k1Var, "job");
            this.f2683a = mutatePriority;
            this.f2684b = k1Var;
        }

        public final boolean a(a aVar) {
            p.j(aVar, "other");
            return this.f2683a.compareTo(aVar.f2683a) >= 0;
        }

        public final void b() {
            k1.a.a(this.f2684b, (CancellationException) null, 1, (Object) null);
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, l lVar, fp0.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, lVar, cVar);
    }

    /* access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f2681a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!this.f2681a.compareAndSet(aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(MutatePriority mutatePriority, l<? super fp0.c<? super R>, ? extends Object> lVar, fp0.c<? super R> cVar) {
        return k0.e(new MutatorMutex$mutate$2(mutatePriority, this, lVar, (fp0.c<? super MutatorMutex$mutate$2>) null), cVar);
    }
}
