package n0;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.a;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Snapshot.kt */
public final class b extends a {
    private final a n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15730o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i11, SnapshotIdSet snapshotIdSet, l<Object, k> lVar, l<Object, k> lVar2, a aVar) {
        super(i11, snapshotIdSet, lVar, lVar2);
        p.j(snapshotIdSet, "invalid");
        p.j(aVar, "parent");
        this.n = aVar;
        aVar.l(this);
    }

    private final void Q() {
        if (!this.f15730o) {
            this.f15730o = true;
            this.n.m(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n0.e A() {
        /*
            r6 = this;
            androidx.compose.runtime.snapshots.a r0 = r6.n
            boolean r0 = r0.B()
            if (r0 != 0) goto L_0x00be
            androidx.compose.runtime.snapshots.a r0 = r6.n
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0012
            goto L_0x00be
        L_0x0012:
            java.util.Set r0 = r6.C()
            int r1 = r6.f()
            if (r0 == 0) goto L_0x0027
            androidx.compose.runtime.snapshots.a r2 = r6.n
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r2.g()
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.K(r2, r6, r3)
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.C()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.Y(r6)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0069
            int r4 = r0.size()     // Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0039
            goto L_0x0069
        L_0x0039:
            androidx.compose.runtime.snapshots.a r4 = r6.n     // Catch:{ all -> 0x00bb }
            int r4 = r4.f()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.a r5 = r6.n     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r5.g()     // Catch:{ all -> 0x00bb }
            n0.e r2 = r6.F(r4, r2, r5)     // Catch:{ all -> 0x00bb }
            n0.e$b r4 = n0.e.b.f15734a     // Catch:{ all -> 0x00bb }
            boolean r4 = kotlin.jvm.internal.p.e(r2, r4)     // Catch:{ all -> 0x00bb }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)
            return r2
        L_0x0053:
            androidx.compose.runtime.snapshots.a r2 = r6.n     // Catch:{ all -> 0x00bb }
            java.util.Set r2 = r2.C()     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0065
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00bb }
            r2.<init>()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.a r4 = r6.n     // Catch:{ all -> 0x00bb }
            r4.M(r2)     // Catch:{ all -> 0x00bb }
        L_0x0065:
            r2.addAll(r0)     // Catch:{ all -> 0x00bb }
            goto L_0x006c
        L_0x0069:
            r6.b()     // Catch:{ all -> 0x00bb }
        L_0x006c:
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            int r0 = r0.f()     // Catch:{ all -> 0x00bb }
            if (r0 >= r1) goto L_0x0079
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            r0.z()     // Catch:{ all -> 0x00bb }
        L_0x0079:
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.g()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.i(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r6.D()     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.h(r4)     // Catch:{ all -> 0x00bb }
            r0.u(r2)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            r0.G(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            int r1 = r6.w()     // Catch:{ all -> 0x00bb }
            r0.I(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r6.D()     // Catch:{ all -> 0x00bb }
            r0.H(r1)     // Catch:{ all -> 0x00bb }
            androidx.compose.runtime.snapshots.a r0 = r6.n     // Catch:{ all -> 0x00bb }
            int[] r1 = r6.E()     // Catch:{ all -> 0x00bb }
            r0.J(r1)     // Catch:{ all -> 0x00bb }
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x00bb }
            monitor-exit(r3)
            r0 = 1
            r6.L(r0)
            r6.Q()
            n0.e$b r0 = n0.e.b.f15734a
            return r0
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00be:
            n0.e$a r0 = new n0.e$a
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.b.A():n0.e");
    }

    public void d() {
        if (!e()) {
            super.d();
            Q();
        }
    }
}
