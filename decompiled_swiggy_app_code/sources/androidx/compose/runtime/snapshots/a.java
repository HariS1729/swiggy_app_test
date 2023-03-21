package androidx.compose.runtime.snapshots;

import bp0.h;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.b;
import n0.e;
import n0.u;
import n0.v;

/* compiled from: Snapshot.kt */
public class a extends b {

    /* renamed from: g  reason: collision with root package name */
    private final l<Object, k> f6282g;

    /* renamed from: h  reason: collision with root package name */
    private final l<Object, k> f6283h;

    /* renamed from: i  reason: collision with root package name */
    private Set<u> f6284i;
    private SnapshotIdSet j = SnapshotIdSet.f6234e.a();
    private int[] k = new int[0];

    /* renamed from: l  reason: collision with root package name */
    private int f6285l = 1;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6286m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i11, SnapshotIdSet snapshotIdSet, l<Object, k> lVar, l<Object, k> lVar2) {
        super(i11, snapshotIdSet, (i) null);
        p.j(snapshotIdSet, "invalid");
        this.f6282g = lVar;
        this.f6283h = lVar2;
    }

    private final void y() {
        Set<u> C = C();
        if (C != null) {
            O();
            M((Set<u>) null);
            int f11 = f();
            for (u k11 : C) {
                for (v k12 = k11.k(); k12 != null; k12 = k12.c()) {
                    if (k12.d() == f11 || s.O(this.j, Integer.valueOf(k12.d()))) {
                        k12.f(0);
                    }
                }
            }
        }
        b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        r2 = (java.util.List) r1.a();
        r1 = (java.util.Set) r1.b();
        r9.f6286m = true;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00dd, code lost:
        if (r1 == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e4, code lost:
        if ((!r1.isEmpty()) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e6, code lost:
        r5 = r2.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00eb, code lost:
        if (r6 >= r5) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        ((lp0.p) r2.get(r6)).invoke(r1, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        if (r0 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        r1 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (r3 >= r1) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0108, code lost:
        ((lp0.p) r2.get(r3)).invoke(r0, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0114, code lost:
        r0 = androidx.compose.runtime.snapshots.SnapshotKt.C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        q();
        r1 = bp0.k.f22762a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        return n0.e.b.f15734a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n0.e A() {
        /*
            r9 = this;
            java.util.Set r0 = r9.C()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "currentGlobalSnapshot.get()"
            kotlin.jvm.internal.p.i(r2, r3)
            androidx.compose.runtime.snapshots.a r2 = (androidx.compose.runtime.snapshots.a) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = androidx.compose.runtime.snapshots.SnapshotKt.f6249d
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            int r4 = r4.f()
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r3.i(r4)
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.K(r2, r9, r3)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.C()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.Y(r9)     // Catch:{ all -> 0x0125 }
            r4 = 1
            if (r0 == 0) goto L_0x0092
            int r5 = r0.size()     // Catch:{ all -> 0x0125 }
            if (r5 != 0) goto L_0x0044
            goto L_0x0092
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r5 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i     // Catch:{ all -> 0x0125 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x0125 }
            int r6 = androidx.compose.runtime.snapshots.SnapshotKt.f6250e     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotKt.f6249d     // Catch:{ all -> 0x0125 }
            int r8 = r5.f()     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r7.i(r8)     // Catch:{ all -> 0x0125 }
            n0.e r2 = r9.F(r6, r2, r7)     // Catch:{ all -> 0x0125 }
            n0.e$b r6 = n0.e.b.f15734a     // Catch:{ all -> 0x0125 }
            boolean r6 = kotlin.jvm.internal.p.e(r2, r6)     // Catch:{ all -> 0x0125 }
            if (r6 != 0) goto L_0x006c
            monitor-exit(r3)
            return r2
        L_0x006c:
            r9.c()     // Catch:{ all -> 0x0125 }
            java.lang.String r2 = "previousGlobalSnapshot"
            kotlin.jvm.internal.p.i(r5, r2)     // Catch:{ all -> 0x0125 }
            lp0.l r2 = androidx.compose.runtime.snapshots.SnapshotKt.f6246a     // Catch:{ all -> 0x0125 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.S(r5, r2)     // Catch:{ all -> 0x0125 }
            java.util.Set r2 = r5.C()     // Catch:{ all -> 0x0125 }
            r9.M(r1)     // Catch:{ all -> 0x0125 }
            r5.M(r1)     // Catch:{ all -> 0x0125 }
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f6252g     // Catch:{ all -> 0x0125 }
            java.util.List r1 = kotlin.collections.s.G0(r1)     // Catch:{ all -> 0x0125 }
            kotlin.Pair r1 = bp0.h.a(r1, r2)     // Catch:{ all -> 0x0125 }
            goto L_0x00cd
        L_0x0092:
            r9.c()     // Catch:{ all -> 0x0125 }
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f6254i     // Catch:{ all -> 0x0125 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x0125 }
            java.lang.String r5 = "previousGlobalSnapshot"
            kotlin.jvm.internal.p.i(r2, r5)     // Catch:{ all -> 0x0125 }
            lp0.l r5 = androidx.compose.runtime.snapshots.SnapshotKt.f6246a     // Catch:{ all -> 0x0125 }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.S(r2, r5)     // Catch:{ all -> 0x0125 }
            java.util.Set r2 = r2.C()     // Catch:{ all -> 0x0125 }
            if (r2 == 0) goto L_0x00c5
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x0125 }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00c5
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f6252g     // Catch:{ all -> 0x0125 }
            java.util.List r1 = kotlin.collections.s.G0(r1)     // Catch:{ all -> 0x0125 }
            kotlin.Pair r1 = bp0.h.a(r1, r2)     // Catch:{ all -> 0x0125 }
            goto L_0x00cd
        L_0x00c5:
            java.util.List r2 = kotlin.collections.k.j()     // Catch:{ all -> 0x0125 }
            kotlin.Pair r1 = bp0.h.a(r2, r1)     // Catch:{ all -> 0x0125 }
        L_0x00cd:
            monitor-exit(r3)
            java.lang.Object r2 = r1.a()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.b()
            java.util.Set r1 = (java.util.Set) r1
            r9.f6286m = r4
            r3 = 0
            if (r1 == 0) goto L_0x00f9
            boolean r5 = r1.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00f9
            int r5 = r2.size()
            r6 = 0
        L_0x00eb:
            if (r6 >= r5) goto L_0x00f9
            java.lang.Object r7 = r2.get(r6)
            lp0.p r7 = (lp0.p) r7
            r7.invoke(r1, r9)
            int r6 = r6 + 1
            goto L_0x00eb
        L_0x00f9:
            if (r0 == 0) goto L_0x0114
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0114
            int r1 = r2.size()
        L_0x0106:
            if (r3 >= r1) goto L_0x0114
            java.lang.Object r4 = r2.get(r3)
            lp0.p r4 = (lp0.p) r4
            r4.invoke(r0, r9)
            int r3 = r3 + 1
            goto L_0x0106
        L_0x0114:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.C()
            monitor-enter(r0)
            r9.q()     // Catch:{ all -> 0x0122 }
            bp0.k r1 = bp0.k.f22762a     // Catch:{ all -> 0x0122 }
            monitor-exit(r0)
            n0.e$b r0 = n0.e.b.f15734a
            return r0
        L_0x0122:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0125:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.A():n0.e");
    }

    public final boolean B() {
        return this.f6286m;
    }

    public Set<u> C() {
        return this.f6284i;
    }

    public final SnapshotIdSet D() {
        return this.j;
    }

    public final int[] E() {
        return this.k;
    }

    public final e F(int i11, Map<v, ? extends v> map, SnapshotIdSet snapshotIdSet) {
        v o11;
        v vVar;
        Pair pair;
        p.j(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet m11 = g().n(f()).m(this.j);
        Set<u> C = C();
        p.g(C);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (u next : C) {
            v k11 = next.k();
            v o12 = SnapshotKt.N(k11, i11, snapshotIdSet);
            if (!(o12 == null || (o11 = SnapshotKt.N(k11, f(), m11)) == null || p.e(o12, o11))) {
                v o13 = SnapshotKt.N(k11, f(), g());
                if (o13 != null) {
                    if (map == null || (vVar = (v) map.get(o12)) == null) {
                        vVar = next.d(o11, o12, o13);
                    }
                    if (vVar == null) {
                        return new e.a(this);
                    }
                    if (!p.e(vVar, o13)) {
                        if (p.e(vVar, o12)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(h.a(next, o12.b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!p.e(vVar, o11)) {
                                pair = h.a(next, vVar);
                            } else {
                                pair = h.a(next, o11.b());
                            }
                            arrayList.add(pair);
                        }
                    }
                } else {
                    Void unused = SnapshotKt.M();
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (arrayList != null) {
            z();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Pair pair2 = (Pair) arrayList.get(i12);
                u uVar = (u) pair2.a();
                v vVar2 = (v) pair2.b();
                vVar2.f(f());
                synchronized (SnapshotKt.C()) {
                    vVar2.e(uVar.k());
                    uVar.f(vVar2);
                    k kVar = k.f22762a;
                }
            }
        }
        if (arrayList2 != null) {
            C.removeAll(arrayList2);
        }
        return e.b.f15734a;
    }

    public final void G(int i11) {
        synchronized (SnapshotKt.C()) {
            this.j = this.j.n(i11);
            k kVar = k.f22762a;
        }
    }

    public final void H(SnapshotIdSet snapshotIdSet) {
        p.j(snapshotIdSet, "snapshots");
        synchronized (SnapshotKt.C()) {
            this.j = this.j.m(snapshotIdSet);
            k kVar = k.f22762a;
        }
    }

    public final void I(int i11) {
        if (i11 >= 0) {
            this.k = g.y(this.k, i11);
        }
    }

    public final void J(int[] iArr) {
        p.j(iArr, "handles");
        boolean z11 = true;
        if (!(iArr.length == 0)) {
            int[] iArr2 = this.k;
            if (iArr2.length != 0) {
                z11 = false;
            }
            if (z11) {
                this.k = iArr;
            } else {
                this.k = g.z(iArr2, iArr);
            }
        }
    }

    public final void K() {
        for (int Q : this.k) {
            SnapshotKt.Q(Q);
        }
    }

    public final void L(boolean z11) {
        this.f6286m = z11;
    }

    public void M(Set<u> set) {
        this.f6284i = set;
    }

    public a N(l<Object, k> lVar, l<Object, k> lVar2) {
        b bVar;
        x();
        P();
        G(f());
        synchronized (SnapshotKt.C()) {
            int h11 = SnapshotKt.f6250e;
            SnapshotKt.f6250e = h11 + 1;
            SnapshotKt.f6249d = SnapshotKt.f6249d.n(h11);
            SnapshotIdSet g11 = g();
            u(g11.n(h11));
            bVar = new b(h11, SnapshotKt.v(g11, f() + 1, h11), SnapshotKt.F(lVar, h(), false, 4, (Object) null), SnapshotKt.G(lVar2, j()), this);
        }
        if (!B() && !e()) {
            int f11 = f();
            synchronized (SnapshotKt.C()) {
                int h12 = SnapshotKt.f6250e;
                SnapshotKt.f6250e = h12 + 1;
                t(h12);
                SnapshotKt.f6249d = SnapshotKt.f6249d.n(f());
                k kVar = k.f22762a;
            }
            u(SnapshotKt.v(g(), f11 + 1, f()));
        }
        return bVar;
    }

    public final void O() {
        if (!(!this.f6286m)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r3.f6292d >= 0) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P() {
        /*
            r3 = this;
            boolean r0 = r3.f6286m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f6292d
            if (r0 < 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 == 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.P():void");
    }

    public void c() {
        SnapshotKt.f6249d = SnapshotKt.f6249d.i(f()).h(this.j);
    }

    public void d() {
        if (!e()) {
            super.d();
            m(this);
        }
    }

    public l<Object, k> h() {
        return this.f6282g;
    }

    public boolean i() {
        return false;
    }

    public l<Object, k> j() {
        return this.f6283h;
    }

    public void l(b bVar) {
        p.j(bVar, "snapshot");
        this.f6285l++;
    }

    public void m(b bVar) {
        p.j(bVar, "snapshot");
        int i11 = this.f6285l;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f6285l = i12;
            if (i12 == 0 && !this.f6286m) {
                y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public void n() {
        if (!this.f6286m && !e()) {
            z();
        }
    }

    public void o(u uVar) {
        p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        Set C = C();
        if (C == null) {
            C = new HashSet();
            M(C);
        }
        C.add(uVar);
    }

    public void q() {
        K();
        super.q();
    }

    public b v(l<Object, k> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        x();
        P();
        int f11 = f();
        G(f());
        synchronized (SnapshotKt.C()) {
            int h11 = SnapshotKt.f6250e;
            SnapshotKt.f6250e = h11 + 1;
            SnapshotKt.f6249d = SnapshotKt.f6249d.n(h11);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(h11, SnapshotKt.v(g(), f11 + 1, h11), lVar, this);
        }
        if (!B() && !e()) {
            int f12 = f();
            synchronized (SnapshotKt.C()) {
                int h12 = SnapshotKt.f6250e;
                SnapshotKt.f6250e = h12 + 1;
                t(h12);
                SnapshotKt.f6249d = SnapshotKt.f6249d.n(f());
                k kVar = k.f22762a;
            }
            u(SnapshotKt.v(g(), f12 + 1, f()));
        }
        return nestedReadonlySnapshot;
    }

    public final void z() {
        G(f());
        k kVar = k.f22762a;
        if (!B() && !e()) {
            int f11 = f();
            synchronized (SnapshotKt.C()) {
                int h11 = SnapshotKt.f6250e;
                SnapshotKt.f6250e = h11 + 1;
                t(h11);
                SnapshotKt.f6249d = SnapshotKt.f6249d.n(f());
            }
            u(SnapshotKt.v(g(), f11 + 1, f()));
        }
    }
}
