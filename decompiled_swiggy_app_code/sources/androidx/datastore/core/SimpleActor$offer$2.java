package androidx.datastore.core;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
/* compiled from: SimpleActor.kt */
final class SimpleActor$offer$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f9771a;

    /* renamed from: b  reason: collision with root package name */
    int f9772b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SimpleActor<T> f9773c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleActor$offer$2(SimpleActor<T> simpleActor, c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.f9773c = simpleActor;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SimpleActor$offer$2(this.f9773c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SimpleActor$offer$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r7.f9772b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            bp0.g.b(r8)
            r8 = r7
            goto L_0x006e
        L_0x0013:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001b:
            java.lang.Object r1 = r7.f9771a
            lp0.p r1 = (lp0.p) r1
            bp0.g.b(r8)
            r4 = r1
            r1 = r0
            r0 = r7
            goto L_0x0060
        L_0x0026:
            bp0.g.b(r8)
            androidx.datastore.core.SimpleActor<T> r8 = r7.f9773c
            java.util.concurrent.atomic.AtomicInteger r8 = r8.f9767d
            int r8 = r8.get()
            if (r8 <= 0) goto L_0x0037
            r8 = 1
            goto L_0x0038
        L_0x0037:
            r8 = 0
        L_0x0038:
            if (r8 == 0) goto L_0x007d
            r8 = r7
        L_0x003b:
            androidx.datastore.core.SimpleActor<T> r1 = r8.f9773c
            wp0.j0 r1 = r1.f9764a
            wp0.k0.f(r1)
            androidx.datastore.core.SimpleActor<T> r1 = r8.f9773c
            lp0.p r1 = r1.f9765b
            androidx.datastore.core.SimpleActor<T> r4 = r8.f9773c
            yp0.f r4 = r4.f9766c
            r8.f9771a = r1
            r8.f9772b = r3
            java.lang.Object r4 = r4.c(r8)
            if (r4 != r0) goto L_0x005b
            return r0
        L_0x005b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r1
            r1 = r6
        L_0x0060:
            r5 = 0
            r0.f9771a = r5
            r0.f9772b = r2
            java.lang.Object r8 = r4.invoke(r8, r0)
            if (r8 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r8 = r0
            r0 = r1
        L_0x006e:
            androidx.datastore.core.SimpleActor<T> r1 = r8.f9773c
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f9767d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L_0x003b
            bp0.k r8 = bp0.k.f22762a
            return r8
        L_0x007d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
