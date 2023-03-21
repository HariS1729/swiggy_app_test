package androidx.compose.runtime.snapshots;

import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Set;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;
import n0.c;
import n0.u;

/* compiled from: Snapshot.kt */
public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6287e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f6288f = 8;

    /* renamed from: a  reason: collision with root package name */
    private SnapshotIdSet f6289a;

    /* renamed from: b  reason: collision with root package name */
    private int f6290b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6291c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f6292d;

    /* compiled from: Snapshot.kt */
    public static final class a {

        /* renamed from: androidx.compose.runtime.snapshots.b$a$a  reason: collision with other inner class name */
        /* compiled from: Snapshot.kt */
        static final class C0020a implements c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p<Set<? extends Object>, b, k> f6293a;

            C0020a(p<? super Set<? extends Object>, ? super b, k> pVar) {
                this.f6293a = pVar;
            }

            public final void dispose() {
                p<Set<? extends Object>, b, k> pVar = this.f6293a;
                synchronized (SnapshotKt.C()) {
                    SnapshotKt.f6252g.remove(pVar);
                    k kVar = k.f22762a;
                }
            }
        }

        /* renamed from: androidx.compose.runtime.snapshots.b$a$b  reason: collision with other inner class name */
        /* compiled from: Snapshot.kt */
        static final class C0021b implements c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l<Object, k> f6294a;

            C0021b(l<Object, k> lVar) {
                this.f6294a = lVar;
            }

            public final void dispose() {
                l<Object, k> lVar = this.f6294a;
                synchronized (SnapshotKt.C()) {
                    SnapshotKt.f6253h.remove(lVar);
                }
                SnapshotKt.x();
            }
        }

        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final b a() {
            return SnapshotKt.z((b) SnapshotKt.f6247b.a(), (l) null, 2, (Object) null);
        }

        public final b b() {
            return SnapshotKt.B();
        }

        public final void c() {
            SnapshotKt.B().n();
        }

        public final <T> T d(l<Object, k> lVar, l<Object, k> lVar2, lp0.a<? extends T> aVar) {
            b bVar;
            b k;
            kotlin.jvm.internal.p.j(aVar, RenderingDetails.TYPE_BLOCK);
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            b bVar2 = (b) SnapshotKt.f6247b.a();
            if (bVar2 == null || (bVar2 instanceof a)) {
                bVar = new e(bVar2 instanceof a ? (a) bVar2 : null, lVar, lVar2, true);
            } else if (lVar == null) {
                return aVar.invoke();
            } else {
                bVar = bVar2.v(lVar);
            }
            try {
                k = bVar.k();
                T invoke = aVar.invoke();
                bVar.r(k);
                bVar.d();
                return invoke;
            } catch (Throwable th2) {
                bVar.d();
                throw th2;
            }
        }

        public final c e(p<? super Set<? extends Object>, ? super b, k> pVar) {
            kotlin.jvm.internal.p.j(pVar, "observer");
            Object unused = SnapshotKt.w(SnapshotKt.f6246a);
            synchronized (SnapshotKt.C()) {
                SnapshotKt.f6252g.add(pVar);
            }
            return new C0020a(pVar);
        }

        public final c f(l<Object, k> lVar) {
            kotlin.jvm.internal.p.j(lVar, "observer");
            synchronized (SnapshotKt.C()) {
                SnapshotKt.f6253h.add(lVar);
            }
            SnapshotKt.x();
            return new C0021b(lVar);
        }

        public final void g() {
            boolean z11;
            synchronized (SnapshotKt.C()) {
                Set<u> C = ((GlobalSnapshot) SnapshotKt.f6254i.get()).C();
                z11 = false;
                if (C != null && (!C.isEmpty())) {
                    z11 = true;
                }
            }
            if (z11) {
                SnapshotKt.x();
            }
        }

        public final a h(l<Object, k> lVar, l<Object, k> lVar2) {
            a N;
            b B = SnapshotKt.B();
            a aVar = B instanceof a ? (a) B : null;
            if (aVar != null && (N = aVar.N(lVar, lVar2)) != null) {
                return N;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        public final b i(l<Object, k> lVar) {
            return SnapshotKt.B().v(lVar);
        }
    }

    private b(int i11, SnapshotIdSet snapshotIdSet) {
        this.f6289a = snapshotIdSet;
        this.f6290b = i11;
        this.f6292d = i11 != 0 ? SnapshotKt.U(i11, g()) : -1;
    }

    public /* synthetic */ b(int i11, SnapshotIdSet snapshotIdSet, i iVar) {
        this(i11, snapshotIdSet);
    }

    public final void b() {
        synchronized (SnapshotKt.C()) {
            c();
            q();
            k kVar = k.f22762a;
        }
    }

    public void c() {
        SnapshotKt.f6249d = SnapshotKt.f6249d.i(f());
    }

    public void d() {
        this.f6291c = true;
        synchronized (SnapshotKt.C()) {
            p();
            k kVar = k.f22762a;
        }
    }

    public final boolean e() {
        return this.f6291c;
    }

    public int f() {
        return this.f6290b;
    }

    public SnapshotIdSet g() {
        return this.f6289a;
    }

    public abstract l<Object, k> h();

    public abstract boolean i();

    public abstract l<Object, k> j();

    public b k() {
        b bVar = (b) SnapshotKt.f6247b.a();
        SnapshotKt.f6247b.b(this);
        return bVar;
    }

    public abstract void l(b bVar);

    public abstract void m(b bVar);

    public abstract void n();

    public abstract void o(u uVar);

    public final void p() {
        int i11 = this.f6292d;
        if (i11 >= 0) {
            SnapshotKt.Q(i11);
            this.f6292d = -1;
        }
    }

    public void q() {
        p();
    }

    public void r(b bVar) {
        SnapshotKt.f6247b.b(bVar);
    }

    public final void s(boolean z11) {
        this.f6291c = z11;
    }

    public void t(int i11) {
        this.f6290b = i11;
    }

    public void u(SnapshotIdSet snapshotIdSet) {
        kotlin.jvm.internal.p.j(snapshotIdSet, "<set-?>");
        this.f6289a = snapshotIdSet;
    }

    public abstract b v(l<Object, k> lVar);

    public final int w() {
        int i11 = this.f6292d;
        this.f6292d = -1;
        return i11;
    }

    public final void x() {
        if (!(!this.f6291c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
