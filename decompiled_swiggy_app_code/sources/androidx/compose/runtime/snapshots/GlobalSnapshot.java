package androidx.compose.runtime.snapshots;

import bp0.k;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.e;
import n0.o;

/* compiled from: Snapshot.kt */
public final class GlobalSnapshot extends a {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GlobalSnapshot(int r5, androidx.compose.runtime.snapshots.SnapshotIdSet r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            kotlin.jvm.internal.p.j(r6, r0)
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.C()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f6253h     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0037 }
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f6253h     // Catch:{ all -> 0x0037 }
            java.util.List r1 = kotlin.collections.s.G0(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            if (r1 == 0) goto L_0x0031
            java.lang.Object r3 = kotlin.collections.s.r0(r1)     // Catch:{ all -> 0x0037 }
            lp0.l r3 = (lp0.l) r3     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x0032
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r3 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch:{ all -> 0x0037 }
            r3.<init>(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0032
        L_0x0031:
            r3 = r2
        L_0x0032:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L_0x0037:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    public e A() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    public a N(l<Object, k> lVar, l<Object, k> lVar2) {
        return (a) SnapshotKt.T(new GlobalSnapshot$takeNestedMutableSnapshot$1(lVar, lVar2));
    }

    /* renamed from: Q */
    public Void l(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: R */
    public Void m(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }

    public void d() {
        synchronized (SnapshotKt.C()) {
            p();
            k kVar = k.f22762a;
        }
    }

    public void n() {
        SnapshotKt.x();
    }

    public b v(l<Object, k> lVar) {
        return SnapshotKt.T(new GlobalSnapshot$takeNestedSnapshot$1(lVar));
    }
}
