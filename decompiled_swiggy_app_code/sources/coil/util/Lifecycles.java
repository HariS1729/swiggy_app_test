package coil.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
/* compiled from: Lifecycles.kt */
public final class Lifecycles {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(androidx.lifecycle.Lifecycle r6, fp0.c<? super bp0.k> r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles$awaitStarted$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            coil.util.-Lifecycles$awaitStarted$1 r0 = (coil.util.Lifecycles$awaitStarted$1) r0
            int r1 = r0.f13689d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13689d = r1
            goto L_0x0018
        L_0x0013:
            coil.util.-Lifecycles$awaitStarted$1 r0 = new coil.util.-Lifecycles$awaitStarted$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13688c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13689d
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f13687b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f13686a
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            bp0.g.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0085
        L_0x0031:
            r7 = move-exception
            goto L_0x0097
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            bp0.g.b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.b()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L_0x004d
            bp0.k r6 = bp0.k.f22762a
            return r6
        L_0x004d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f13686a = r6     // Catch:{ all -> 0x0092 }
            r0.f13687b = r7     // Catch:{ all -> 0x0092 }
            r0.f13689d = r3     // Catch:{ all -> 0x0092 }
            wp0.o r2 = new wp0.o     // Catch:{ all -> 0x0092 }
            fp0.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r0)     // Catch:{ all -> 0x0092 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0092 }
            r2.w()     // Catch:{ all -> 0x0092 }
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch:{ all -> 0x0092 }
            r3.<init>(r2)     // Catch:{ all -> 0x0092 }
            r7.f25666a = r3     // Catch:{ all -> 0x0092 }
            kotlin.jvm.internal.p.g(r3)     // Catch:{ all -> 0x0092 }
            androidx.lifecycle.q r3 = (androidx.lifecycle.q) r3     // Catch:{ all -> 0x0092 }
            r6.a(r3)     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r2.t()     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.d()     // Catch:{ all -> 0x0092 }
            if (r2 != r3) goto L_0x0080
            kotlin.coroutines.jvm.internal.f.c(r0)     // Catch:{ all -> 0x0092 }
        L_0x0080:
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r0 = r6
            r6 = r7
        L_0x0085:
            T r6 = r6.f25666a
            androidx.lifecycle.q r6 = (androidx.lifecycle.q) r6
            if (r6 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r0.c(r6)
        L_0x008f:
            bp0.k r6 = bp0.k.f22762a
            return r6
        L_0x0092:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x0097:
            T r6 = r6.f25666a
            androidx.lifecycle.q r6 = (androidx.lifecycle.q) r6
            if (r6 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r0.c(r6)
        L_0x00a1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.Lifecycle, fp0.c):java.lang.Object");
    }

    public static final void b(Lifecycle lifecycle, q qVar) {
        lifecycle.c(qVar);
        lifecycle.a(qVar);
    }
}
