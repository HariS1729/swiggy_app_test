package androidx.compose.ui.platform;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import yp0.f;

@d(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
/* compiled from: GlobalSnapshotManager.android.kt */
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f7146a;

    /* renamed from: b  reason: collision with root package name */
    Object f7147b;

    /* renamed from: c  reason: collision with root package name */
    int f7148c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f<k> f7149d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$1(f<k> fVar, c<? super GlobalSnapshotManager$ensureStarted$1> cVar) {
        super(2, cVar);
        this.f7149d = fVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.f7149d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r7.f7148c
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r7.f7147b
            yp0.h r1 = (yp0.h) r1
            java.lang.Object r3 = r7.f7146a
            yp0.s r3 = (yp0.s) r3
            bp0.g.b(r8)     // Catch:{ all -> 0x0063 }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L_0x0041
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0023:
            bp0.g.b(r8)
            yp0.f<bp0.k> r3 = r7.f7149d
            yp0.h r8 = r3.iterator()     // Catch:{ all -> 0x0063 }
            r1 = r8
            r8 = r7
        L_0x002e:
            r8.f7146a = r3     // Catch:{ all -> 0x0063 }
            r8.f7147b = r1     // Catch:{ all -> 0x0063 }
            r8.f7148c = r2     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r1.a(r8)     // Catch:{ all -> 0x0063 }
            if (r4 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L_0x0041:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0060 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0060 }
            if (r8 == 0) goto L_0x005a
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0060 }
            bp0.k r8 = (bp0.k) r8     // Catch:{ all -> 0x0060 }
            androidx.compose.runtime.snapshots.b$a r8 = androidx.compose.runtime.snapshots.b.f6287e     // Catch:{ all -> 0x0060 }
            r8.g()     // Catch:{ all -> 0x0060 }
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x002e
        L_0x005a:
            yp0.k.a(r4, r5)
            bp0.k r8 = bp0.k.f22762a
            return r8
        L_0x0060:
            r8 = move-exception
            r3 = r4
            goto L_0x0064
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            yp0.k.a(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
