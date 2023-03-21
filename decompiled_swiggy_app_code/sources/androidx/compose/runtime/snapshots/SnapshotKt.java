package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotIdSet;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import e0.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import lp0.l;
import lp0.p;
import n0.f;
import n0.u;
import n0.v;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: Snapshot.kt */
public final class SnapshotKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final l<SnapshotIdSet, k> f6246a = SnapshotKt$emptyLambda$1.f6256a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final b1<b> f6247b = new b1<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f6248c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static SnapshotIdSet f6249d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static int f6250e;

    /* renamed from: f  reason: collision with root package name */
    private static final f f6251f = new f();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final List<p<Set<? extends Object>, b, k>> f6252g = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List<l<Object, k>> f6253h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReference<GlobalSnapshot> f6254i;
    private static final b j;

    static {
        SnapshotIdSet.a aVar = SnapshotIdSet.f6234e;
        f6249d = aVar.a();
        f6250e = 1;
        int i11 = f6250e;
        f6250e = i11 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i11, aVar.a());
        f6249d = f6249d.n(globalSnapshot.f());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f6254i = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        kotlin.jvm.internal.p.i(globalSnapshot2, "currentGlobalSnapshot.get()");
        j = globalSnapshot2;
    }

    public static final <T extends v> T A(T t, b bVar) {
        kotlin.jvm.internal.p.j(t, PDPageLabelRange.STYLE_ROMAN_LOWER);
        kotlin.jvm.internal.p.j(bVar, "snapshot");
        T N = N(t, bVar.f(), bVar.g());
        if (N != null) {
            return N;
        }
        M();
        throw new KotlinNothingValueException();
    }

    public static final b B() {
        b a11 = f6247b.a();
        if (a11 != null) {
            return a11;
        }
        GlobalSnapshot globalSnapshot = f6254i.get();
        kotlin.jvm.internal.p.i(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    public static final Object C() {
        return f6248c;
    }

    public static final b D() {
        return j;
    }

    /* access modifiers changed from: private */
    public static final l<Object, k> E(l<Object, k> lVar, l<Object, k> lVar2, boolean z11) {
        if (!z11) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || kotlin.jvm.internal.p.e(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new SnapshotKt$mergedReadObserver$1(lVar, lVar2);
    }

    static /* synthetic */ l F(l lVar, l lVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return E(lVar, lVar2, z11);
    }

    /* access modifiers changed from: private */
    public static final l<Object, k> G(l<Object, k> lVar, l<Object, k> lVar2) {
        if (lVar == null || lVar2 == null || kotlin.jvm.internal.p.e(lVar, lVar2)) {
            return lVar == null ? lVar2 : lVar;
        }
        return new SnapshotKt$mergedWriteObserver$1(lVar, lVar2);
    }

    public static final <T extends v> T H(T t, u uVar) {
        kotlin.jvm.internal.p.j(t, "<this>");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        T V = V(uVar);
        if (V != null) {
            V.f(Integer.MAX_VALUE);
            return V;
        }
        T b11 = t.b();
        b11.f(Integer.MAX_VALUE);
        b11.e(uVar.k());
        uVar.f(b11);
        return b11;
    }

    public static final <T extends v> T I(T t, u uVar, b bVar) {
        kotlin.jvm.internal.p.j(t, "<this>");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        kotlin.jvm.internal.p.j(bVar, "snapshot");
        T H = H(t, uVar);
        H.a(t);
        H.f(bVar.f());
        return H;
    }

    public static final void J(b bVar, u uVar) {
        kotlin.jvm.internal.p.j(bVar, "snapshot");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        l<Object, k> j11 = bVar.j();
        if (j11 != null) {
            j11.invoke(uVar);
        }
    }

    /* access modifiers changed from: private */
    public static final Map<v, v> K(a aVar, a aVar2, SnapshotIdSet snapshotIdSet) {
        v N;
        Set<u> C = aVar2.C();
        int f11 = aVar.f();
        if (C == null) {
            return null;
        }
        SnapshotIdSet m11 = aVar2.g().n(aVar2.f()).m(aVar2.D());
        HashMap hashMap = null;
        for (u next : C) {
            v k = next.k();
            v N2 = N(k, f11, snapshotIdSet);
            if (!(N2 == null || (N = N(k, f11, m11)) == null || kotlin.jvm.internal.p.e(N2, N))) {
                v N3 = N(k, aVar2.f(), aVar2.g());
                if (N3 != null) {
                    v d11 = next.d(N, N2, N3);
                    if (d11 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(N2, d11);
                    hashMap = hashMap;
                } else {
                    M();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends v> T L(T t, u uVar, b bVar, T t11) {
        kotlin.jvm.internal.p.j(t, "<this>");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        kotlin.jvm.internal.p.j(bVar, "snapshot");
        kotlin.jvm.internal.p.j(t11, "candidate");
        if (bVar.i()) {
            bVar.o(uVar);
        }
        int f11 = bVar.f();
        if (t11.d() == f11) {
            return t11;
        }
        T H = H(t, uVar);
        H.f(f11);
        bVar.o(uVar);
        return H;
    }

    /* access modifiers changed from: private */
    public static final Void M() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* access modifiers changed from: private */
    public static final <T extends v> T N(T t, int i11, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t != null) {
            if (X(t, i11, snapshotIdSet) && (t11 == null || t11.d() < t.d())) {
                t11 = t;
            }
            t = t.c();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final <T extends v> T O(T t, u uVar) {
        kotlin.jvm.internal.p.j(t, "<this>");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        return P(t, uVar, B());
    }

    public static final <T extends v> T P(T t, u uVar, b bVar) {
        kotlin.jvm.internal.p.j(t, "<this>");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        kotlin.jvm.internal.p.j(bVar, "snapshot");
        l<Object, k> h11 = bVar.h();
        if (h11 != null) {
            h11.invoke(uVar);
        }
        T N = N(t, bVar.f(), bVar.g());
        if (N != null) {
            return N;
        }
        M();
        throw new KotlinNothingValueException();
    }

    public static final void Q(int i11) {
        f6251f.f(i11);
    }

    /* access modifiers changed from: private */
    public static final Void R() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* access modifiers changed from: private */
    public static final <T> T S(b bVar, l<? super SnapshotIdSet, ? extends T> lVar) {
        T invoke = lVar.invoke(f6249d.i(bVar.f()));
        synchronized (C()) {
            int i11 = f6250e;
            f6250e = i11 + 1;
            f6249d = f6249d.i(bVar.f());
            f6254i.set(new GlobalSnapshot(i11, f6249d));
            bVar.d();
            f6249d = f6249d.n(i11);
            k kVar = k.f22762a;
        }
        return invoke;
    }

    /* access modifiers changed from: private */
    public static final <T extends b> T T(l<? super SnapshotIdSet, ? extends T> lVar) {
        return (b) w(new SnapshotKt$takeNewSnapshot$1(lVar));
    }

    public static final int U(int i11, SnapshotIdSet snapshotIdSet) {
        int a11;
        kotlin.jvm.internal.p.j(snapshotIdSet, "invalid");
        int l11 = snapshotIdSet.l(i11);
        synchronized (C()) {
            a11 = f6251f.a(l11);
        }
        return a11;
    }

    private static final v V(u uVar) {
        int e11 = f6251f.e(f6250e) - 1;
        SnapshotIdSet a11 = SnapshotIdSet.f6234e.a();
        v vVar = null;
        for (v k = uVar.k(); k != null; k = k.c()) {
            if (k.d() == 0) {
                return k;
            }
            if (X(k, e11, a11)) {
                if (vVar != null) {
                    return k.d() < vVar.d() ? k : vVar;
                }
                vVar = k;
            }
        }
        return null;
    }

    private static final boolean W(int i11, int i12, SnapshotIdSet snapshotIdSet) {
        return i12 != 0 && i12 <= i11 && !snapshotIdSet.k(i12);
    }

    private static final boolean X(v vVar, int i11, SnapshotIdSet snapshotIdSet) {
        return W(i11, vVar.d(), snapshotIdSet);
    }

    /* access modifiers changed from: private */
    public static final void Y(b bVar) {
        if (!f6249d.k(bVar.f())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends v> T Z(T t, u uVar, b bVar) {
        kotlin.jvm.internal.p.j(t, "<this>");
        kotlin.jvm.internal.p.j(uVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        kotlin.jvm.internal.p.j(bVar, "snapshot");
        if (bVar.i()) {
            bVar.o(uVar);
        }
        T N = N(t, bVar.f(), bVar.g());
        if (N == null) {
            M();
            throw new KotlinNothingValueException();
        } else if (N.d() == bVar.f()) {
            return N;
        } else {
            T I = I(N, uVar, bVar);
            bVar.o(uVar);
            return I;
        }
    }

    public static final SnapshotIdSet v(SnapshotIdSet snapshotIdSet, int i11, int i12) {
        kotlin.jvm.internal.p.j(snapshotIdSet, "<this>");
        while (i11 < i12) {
            snapshotIdSet = snapshotIdSet.n(i11);
            i11++;
        }
        return snapshotIdSet;
    }

    /* access modifiers changed from: private */
    public static final <T> T w(l<? super SnapshotIdSet, ? extends T> lVar) {
        T S;
        List G0;
        GlobalSnapshot globalSnapshot = f6254i.get();
        synchronized (C()) {
            kotlin.jvm.internal.p.i(globalSnapshot, "previousGlobalSnapshot");
            S = S(globalSnapshot, lVar);
        }
        Set<u> C = globalSnapshot.C();
        if (C != null) {
            synchronized (C()) {
                G0 = s.G0(f6252g);
            }
            int size = G0.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((p) G0.get(i11)).invoke(C, globalSnapshot);
            }
        }
        return S;
    }

    /* access modifiers changed from: private */
    public static final void x() {
        w(SnapshotKt$advanceGlobalSnapshot$2.f6255a);
    }

    /* access modifiers changed from: private */
    public static final b y(b bVar, l<Object, k> lVar) {
        boolean z11 = bVar instanceof a;
        if (!z11 && bVar != null) {
            return new f(bVar, lVar, false);
        }
        return new e(z11 ? (a) bVar : null, lVar, (l<Object, k>) null, false);
    }

    static /* synthetic */ b z(b bVar, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        return y(bVar, lVar);
    }
}
