package androidx.compose.animation.core;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
/* compiled from: InternalMutatorMutex.kt */
final class MutatorMutex$mutate$2 extends SuspendLambda implements p<j0, c<? super R>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f2685a;

    /* renamed from: b  reason: collision with root package name */
    Object f2686b;

    /* renamed from: c  reason: collision with root package name */
    Object f2687c;

    /* renamed from: d  reason: collision with root package name */
    int f2688d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f2689e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ MutatePriority f2690f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ MutatorMutex f2691g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<c<? super R>, Object> f2692h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, l<? super c<? super R>, ? extends Object> lVar, c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.f2690f = mutatePriority;
        this.f2691g = mutatorMutex;
        this.f2692h = lVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.f2690f, this.f2691g, this.f2692h, cVar);
        mutatorMutex$mutate$2.f2689e = obj;
        return mutatorMutex$mutate$2;
    }

    public final Object invoke(j0 j0Var, c<? super R> cVar) {
        return ((MutatorMutex$mutate$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0096=Splitter:B:20:0x0096, B:26:0x00a7=Splitter:B:26:0x00a7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r8.f2688d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r8.f2686b
            androidx.compose.animation.core.MutatorMutex r0 = (androidx.compose.animation.core.MutatorMutex) r0
            java.lang.Object r1 = r8.f2685a
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r2 = r8.f2689e
            androidx.compose.animation.core.MutatorMutex$a r2 = (androidx.compose.animation.core.MutatorMutex.a) r2
            bp0.g.b(r9)     // Catch:{ all -> 0x0020 }
            goto L_0x0096
        L_0x0020:
            r9 = move-exception
            goto L_0x00a7
        L_0x0023:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002b:
            java.lang.Object r1 = r8.f2687c
            androidx.compose.animation.core.MutatorMutex r1 = (androidx.compose.animation.core.MutatorMutex) r1
            java.lang.Object r3 = r8.f2686b
            lp0.l r3 = (lp0.l) r3
            java.lang.Object r5 = r8.f2685a
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.c) r5
            java.lang.Object r6 = r8.f2689e
            androidx.compose.animation.core.MutatorMutex$a r6 = (androidx.compose.animation.core.MutatorMutex.a) r6
            bp0.g.b(r9)
            r9 = r5
            goto L_0x0081
        L_0x0040:
            bp0.g.b(r9)
            java.lang.Object r9 = r8.f2689e
            wp0.j0 r9 = (wp0.j0) r9
            androidx.compose.animation.core.MutatorMutex$a r1 = new androidx.compose.animation.core.MutatorMutex$a
            androidx.compose.animation.core.MutatePriority r5 = r8.f2690f
            kotlin.coroutines.CoroutineContext r9 = r9.X0()
            wp0.k1$b r6 = wp0.k1.f29476l0
            kotlin.coroutines.CoroutineContext$a r9 = r9.get(r6)
            kotlin.jvm.internal.p.g(r9)
            wp0.k1 r9 = (wp0.k1) r9
            r1.<init>(r5, r9)
            androidx.compose.animation.core.MutatorMutex r9 = r8.f2691g
            r9.f(r1)
            androidx.compose.animation.core.MutatorMutex r9 = r8.f2691g
            kotlinx.coroutines.sync.c r9 = r9.f2682b
            lp0.l<fp0.c<? super R>, java.lang.Object> r5 = r8.f2692h
            androidx.compose.animation.core.MutatorMutex r6 = r8.f2691g
            r8.f2689e = r1
            r8.f2685a = r9
            r8.f2686b = r5
            r8.f2687c = r6
            r8.f2688d = r3
            java.lang.Object r3 = r9.a(r4, r8)
            if (r3 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r3 = r5
            r7 = r6
            r6 = r1
            r1 = r7
        L_0x0081:
            r8.f2689e = r6     // Catch:{ all -> 0x00a1 }
            r8.f2685a = r9     // Catch:{ all -> 0x00a1 }
            r8.f2686b = r1     // Catch:{ all -> 0x00a1 }
            r8.f2687c = r4     // Catch:{ all -> 0x00a1 }
            r8.f2688d = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a1 }
            if (r2 != r0) goto L_0x0092
            return r0
        L_0x0092:
            r0 = r1
            r1 = r9
            r9 = r2
            r2 = r6
        L_0x0096:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f2681a     // Catch:{ all -> 0x00af }
            r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00af }
            r1.c(r4)
            return r9
        L_0x00a1:
            r0 = move-exception
            r2 = r6
            r7 = r1
            r1 = r9
            r9 = r0
            r0 = r7
        L_0x00a7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f2681a     // Catch:{ all -> 0x00af }
            r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00af }
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00af:
            r9 = move-exception
            r1.c(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
