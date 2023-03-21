package androidx.compose.runtime.snapshots;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.o;
import n0.u;

/* compiled from: Snapshot.kt */
public final class e extends a {
    private final a n;

    /* renamed from: o  reason: collision with root package name */
    private final l<Object, k> f6304o;

    /* renamed from: p  reason: collision with root package name */
    private final l<Object, k> f6305p;
    private final boolean q;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.h();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(androidx.compose.runtime.snapshots.a r5, lp0.l<java.lang.Object, bp0.k> r6, lp0.l<java.lang.Object, bp0.k> r7, boolean r8) {
        /*
            r4 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$a r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f6234e
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.a()
            if (r5 == 0) goto L_0x000e
            lp0.l r1 = r5.h()
            if (r1 != 0) goto L_0x001c
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            lp0.l r1 = r1.h()
        L_0x001c:
            lp0.l r1 = androidx.compose.runtime.snapshots.SnapshotKt.E(r6, r1, r8)
            if (r5 == 0) goto L_0x0028
            lp0.l r2 = r5.j()
            if (r2 != 0) goto L_0x0036
        L_0x0028:
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i
            java.lang.Object r2 = r2.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2
            lp0.l r2 = r2.j()
        L_0x0036:
            lp0.l r2 = androidx.compose.runtime.snapshots.SnapshotKt.G(r7, r2)
            r3 = 0
            r4.<init>(r3, r0, r1, r2)
            r4.n = r5
            r4.f6304o = r6
            r4.f6305p = r7
            r4.q = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.e.<init>(androidx.compose.runtime.snapshots.a, lp0.l, lp0.l, boolean):void");
    }

    private final a Q() {
        a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        Object obj = SnapshotKt.f6254i.get();
        p.i(obj, "currentGlobalSnapshot.get()");
        return (a) obj;
    }

    public n0.e A() {
        return Q().A();
    }

    public Set<u> C() {
        return Q().C();
    }

    public void M(Set<u> set) {
        o.b();
        throw new KotlinNothingValueException();
    }

    public a N(l<Object, k> lVar, l<Object, k> lVar2) {
        l F = SnapshotKt.F(lVar, h(), false, 4, (Object) null);
        l l11 = SnapshotKt.G(lVar2, j());
        if (!this.q) {
            return new e(Q().N((l<Object, k>) null, l11), F, l11, false);
        }
        return Q().N(F, l11);
    }

    /* renamed from: R */
    public Void l(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: S */
    public Void m(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }

    public void d() {
        s(true);
    }

    public int f() {
        return Q().f();
    }

    public SnapshotIdSet g() {
        return Q().g();
    }

    public boolean i() {
        return Q().i();
    }

    public void n() {
        Q().n();
    }

    public void o(u uVar) {
        p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        Q().o(uVar);
    }

    public void t(int i11) {
        o.b();
        throw new KotlinNothingValueException();
    }

    public void u(SnapshotIdSet snapshotIdSet) {
        p.j(snapshotIdSet, "value");
        o.b();
        throw new KotlinNothingValueException();
    }

    public b v(l<Object, k> lVar) {
        l F = SnapshotKt.F(lVar, h(), false, 4, (Object) null);
        if (!this.q) {
            return SnapshotKt.y(Q().v((l<Object, k>) null), lVar);
        }
        return Q().v(F);
    }
}
