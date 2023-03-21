package androidx.compose.runtime.snapshots;

import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.o;
import n0.u;

/* compiled from: Snapshot.kt */
public final class f extends b {

    /* renamed from: g  reason: collision with root package name */
    private final b f6306g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f6307h;

    /* renamed from: i  reason: collision with root package name */
    private final l<Object, k> f6308i;
    private final l<Object, k> j;
    private final b k;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r4 = r4.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(androidx.compose.runtime.snapshots.b r4, lp0.l<java.lang.Object, bp0.k> r5, boolean r6) {
        /*
            r3 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$a r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.f6234e
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.a()
            r1 = 0
            r2 = 0
            r3.<init>(r1, r0, r2)
            r3.f6306g = r4
            r3.f6307h = r6
            if (r4 == 0) goto L_0x0017
            lp0.l r4 = r4.h()
            if (r4 != 0) goto L_0x0025
        L_0x0017:
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            lp0.l r4 = r4.h()
        L_0x0025:
            lp0.l r4 = androidx.compose.runtime.snapshots.SnapshotKt.E(r5, r4, r6)
            r3.f6308i = r4
            r3.k = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.f.<init>(androidx.compose.runtime.snapshots.b, lp0.l, boolean):void");
    }

    private final b y() {
        b bVar = this.f6306g;
        if (bVar != null) {
            return bVar;
        }
        Object obj = SnapshotKt.f6254i.get();
        p.i(obj, "currentGlobalSnapshot.get()");
        return (b) obj;
    }

    /* renamed from: A */
    public Void m(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }

    public void d() {
        s(true);
    }

    public int f() {
        return y().f();
    }

    public SnapshotIdSet g() {
        return y().g();
    }

    public l<Object, k> h() {
        return this.f6308i;
    }

    public boolean i() {
        return y().i();
    }

    public l<Object, k> j() {
        return this.j;
    }

    public void n() {
        y().n();
    }

    public void o(u uVar) {
        p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        y().o(uVar);
    }

    public b v(l<Object, k> lVar) {
        l F = SnapshotKt.F(lVar, h(), false, 4, (Object) null);
        if (!this.f6307h) {
            return SnapshotKt.y(y().v((l<Object, k>) null), lVar);
        }
        return y().v(F);
    }

    /* renamed from: z */
    public Void l(b bVar) {
        p.j(bVar, "snapshot");
        o.b();
        throw new KotlinNothingValueException();
    }
}
