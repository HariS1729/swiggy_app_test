package androidx.compose.foundation;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
/* compiled from: MutatorMutex.kt */
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements p<j0, c<? super R>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f3116a;

    /* renamed from: b  reason: collision with root package name */
    Object f3117b;

    /* renamed from: c  reason: collision with root package name */
    Object f3118c;

    /* renamed from: d  reason: collision with root package name */
    Object f3119d;

    /* renamed from: e  reason: collision with root package name */
    int f3120e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f3121f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ MutatePriority f3122g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ MutatorMutex f3123h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<T, c<? super R>, Object> f3124i;
    final /* synthetic */ T j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, p<? super T, ? super c<? super R>, ? extends Object> pVar, T t, c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.f3122g = mutatePriority;
        this.f3123h = mutatorMutex;
        this.f3124i = pVar;
        this.j = t;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.f3122g, this.f3123h, this.f3124i, this.j, cVar);
        mutatorMutex$mutateWith$2.f3121f = obj;
        return mutatorMutex$mutateWith$2;
    }

    public final Object invoke(j0 j0Var, c<? super R> cVar) {
        return ((MutatorMutex$mutateWith$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x009e=Splitter:B:20:0x009e, B:26:0x00af=Splitter:B:26:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r9.f3120e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            if (r1 == r3) goto L_0x002b
            if (r1 != r2) goto L_0x0023
            java.lang.Object r0 = r9.f3117b
            androidx.compose.foundation.MutatorMutex r0 = (androidx.compose.foundation.MutatorMutex) r0
            java.lang.Object r1 = r9.f3116a
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.c) r1
            java.lang.Object r2 = r9.f3121f
            androidx.compose.foundation.MutatorMutex$a r2 = (androidx.compose.foundation.MutatorMutex.a) r2
            bp0.g.b(r10)     // Catch:{ all -> 0x0020 }
            goto L_0x009e
        L_0x0020:
            r10 = move-exception
            goto L_0x00af
        L_0x0023:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002b:
            java.lang.Object r1 = r9.f3119d
            androidx.compose.foundation.MutatorMutex r1 = (androidx.compose.foundation.MutatorMutex) r1
            java.lang.Object r3 = r9.f3118c
            java.lang.Object r5 = r9.f3117b
            lp0.p r5 = (lp0.p) r5
            java.lang.Object r6 = r9.f3116a
            kotlinx.coroutines.sync.c r6 = (kotlinx.coroutines.sync.c) r6
            java.lang.Object r7 = r9.f3121f
            androidx.compose.foundation.MutatorMutex$a r7 = (androidx.compose.foundation.MutatorMutex.a) r7
            bp0.g.b(r10)
            r10 = r6
            goto L_0x0087
        L_0x0042:
            bp0.g.b(r10)
            java.lang.Object r10 = r9.f3121f
            wp0.j0 r10 = (wp0.j0) r10
            androidx.compose.foundation.MutatorMutex$a r1 = new androidx.compose.foundation.MutatorMutex$a
            androidx.compose.foundation.MutatePriority r5 = r9.f3122g
            kotlin.coroutines.CoroutineContext r10 = r10.X0()
            wp0.k1$b r6 = wp0.k1.f29476l0
            kotlin.coroutines.CoroutineContext$a r10 = r10.get(r6)
            kotlin.jvm.internal.p.g(r10)
            wp0.k1 r10 = (wp0.k1) r10
            r1.<init>(r5, r10)
            androidx.compose.foundation.MutatorMutex r10 = r9.f3123h
            r10.g(r1)
            androidx.compose.foundation.MutatorMutex r10 = r9.f3123h
            kotlinx.coroutines.sync.c r10 = r10.f3105b
            lp0.p<T, fp0.c<? super R>, java.lang.Object> r5 = r9.f3124i
            T r6 = r9.j
            androidx.compose.foundation.MutatorMutex r7 = r9.f3123h
            r9.f3121f = r1
            r9.f3116a = r10
            r9.f3117b = r5
            r9.f3118c = r6
            r9.f3119d = r7
            r9.f3120e = r3
            java.lang.Object r3 = r10.a(r4, r9)
            if (r3 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r3 = r6
            r8 = r7
            r7 = r1
            r1 = r8
        L_0x0087:
            r9.f3121f = r7     // Catch:{ all -> 0x00a9 }
            r9.f3116a = r10     // Catch:{ all -> 0x00a9 }
            r9.f3117b = r1     // Catch:{ all -> 0x00a9 }
            r9.f3118c = r4     // Catch:{ all -> 0x00a9 }
            r9.f3119d = r4     // Catch:{ all -> 0x00a9 }
            r9.f3120e = r2     // Catch:{ all -> 0x00a9 }
            java.lang.Object r2 = r5.invoke(r3, r9)     // Catch:{ all -> 0x00a9 }
            if (r2 != r0) goto L_0x009a
            return r0
        L_0x009a:
            r0 = r1
            r1 = r10
            r10 = r2
            r2 = r7
        L_0x009e:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f3104a     // Catch:{ all -> 0x00b7 }
            r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00b7 }
            r1.c(r4)
            return r10
        L_0x00a9:
            r0 = move-exception
            r2 = r7
            r8 = r1
            r1 = r10
            r10 = r0
            r0 = r8
        L_0x00af:
            java.util.concurrent.atomic.AtomicReference r0 = r0.f3104a     // Catch:{ all -> 0x00b7 }
            r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00b7 }
            throw r10     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r10 = move-exception
            r1.c(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
