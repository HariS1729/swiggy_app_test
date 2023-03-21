package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.b;
import bp0.k;
import e0.p;
import g0.f;
import java.util.HashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import lp0.l;
import n0.t;
import n0.u;
import n0.v;

/* compiled from: DerivedState.kt */
final class DerivedSnapshotState<T> implements u, p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final lp0.a<T> f5999a;

    /* renamed from: b  reason: collision with root package name */
    private a<T> f6000b = new a<>();

    /* compiled from: DerivedState.kt */
    private static final class a<T> extends v {

        /* renamed from: f  reason: collision with root package name */
        public static final C0018a f6001f = new C0018a((i) null);

        /* renamed from: g  reason: collision with root package name */
        private static final Object f6002g = new Object();

        /* renamed from: c  reason: collision with root package name */
        private HashSet<u> f6003c;

        /* renamed from: d  reason: collision with root package name */
        private Object f6004d = f6002g;

        /* renamed from: e  reason: collision with root package name */
        private int f6005e;

        /* renamed from: androidx.compose.runtime.DerivedSnapshotState$a$a  reason: collision with other inner class name */
        /* compiled from: DerivedState.kt */
        public static final class C0018a {
            private C0018a() {
            }

            public /* synthetic */ C0018a(i iVar) {
                this();
            }
        }

        public void a(v vVar) {
            kotlin.jvm.internal.p.j(vVar, "value");
            a aVar = (a) vVar;
            this.f6003c = aVar.f6003c;
            this.f6004d = aVar.f6004d;
            this.f6005e = aVar.f6005e;
        }

        public v b() {
            return new a();
        }

        public final HashSet<u> g() {
            return this.f6003c;
        }

        public final Object h() {
            return this.f6004d;
        }

        public final boolean i(p<?> pVar, b bVar) {
            kotlin.jvm.internal.p.j(pVar, "derivedState");
            kotlin.jvm.internal.p.j(bVar, "snapshot");
            return this.f6004d != f6002g && this.f6005e == j(pVar, bVar);
        }

        /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final int j(e0.p<?> r8, androidx.compose.runtime.snapshots.b r9) {
            /*
                r7 = this;
                java.lang.String r0 = "derivedState"
                kotlin.jvm.internal.p.j(r8, r0)
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.p.j(r9, r0)
                java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.C()
                monitor-enter(r0)
                java.util.HashSet<n0.u> r1 = r7.f6003c     // Catch:{ all -> 0x00a0 }
                monitor-exit(r0)
                r0 = 7
                if (r1 == 0) goto L_0x009f
                e0.b1 r2 = androidx.compose.runtime.h.f6140a
                java.lang.Object r2 = r2.a()
                g0.f r2 = (g0.f) r2
                if (r2 != 0) goto L_0x0025
                g0.f r2 = g0.a.b()
            L_0x0025:
                int r3 = r2.size()
                r4 = 0
                r5 = 0
            L_0x002b:
                if (r5 >= r3) goto L_0x003f
                java.lang.Object r6 = r2.get(r5)
                kotlin.Pair r6 = (kotlin.Pair) r6
                java.lang.Object r6 = r6.a()
                lp0.l r6 = (lp0.l) r6
                r6.invoke(r8)
                int r5 = r5 + 1
                goto L_0x002b
            L_0x003f:
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0085 }
            L_0x0043:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0085 }
                if (r3 == 0) goto L_0x006b
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0085 }
                n0.u r3 = (n0.u) r3     // Catch:{ all -> 0x0085 }
                n0.v r5 = r3.k()     // Catch:{ all -> 0x0085 }
                java.lang.String r6 = "stateObject"
                kotlin.jvm.internal.p.i(r3, r6)     // Catch:{ all -> 0x0085 }
                n0.v r3 = androidx.compose.runtime.snapshots.SnapshotKt.P(r5, r3, r9)     // Catch:{ all -> 0x0085 }
                int r0 = r0 * 31
                int r5 = e0.b.a(r3)     // Catch:{ all -> 0x0085 }
                int r0 = r0 + r5
                int r0 = r0 * 31
                int r3 = r3.d()     // Catch:{ all -> 0x0085 }
                int r0 = r0 + r3
                goto L_0x0043
            L_0x006b:
                bp0.k r9 = bp0.k.f22762a     // Catch:{ all -> 0x0085 }
                int r9 = r2.size()
            L_0x0071:
                if (r4 >= r9) goto L_0x009f
                java.lang.Object r1 = r2.get(r4)
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r1 = r1.b()
                lp0.l r1 = (lp0.l) r1
                r1.invoke(r8)
                int r4 = r4 + 1
                goto L_0x0071
            L_0x0085:
                r9 = move-exception
                int r0 = r2.size()
            L_0x008a:
                if (r4 >= r0) goto L_0x009e
                java.lang.Object r1 = r2.get(r4)
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r1 = r1.b()
                lp0.l r1 = (lp0.l) r1
                r1.invoke(r8)
                int r4 = r4 + 1
                goto L_0x008a
            L_0x009e:
                throw r9
            L_0x009f:
                return r0
            L_0x00a0:
                r8 = move-exception
                monitor-exit(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.a.j(e0.p, androidx.compose.runtime.snapshots.b):int");
        }

        public final void k(HashSet<u> hashSet) {
            this.f6003c = hashSet;
        }

        public final void l(Object obj) {
            this.f6004d = obj;
        }

        public final void m(int i11) {
            this.f6005e = i11;
        }
    }

    public DerivedSnapshotState(lp0.a<? extends T> aVar) {
        kotlin.jvm.internal.p.j(aVar, "calculation");
        this.f5999a = aVar;
    }

    private final a<T> n(a<T> aVar, b bVar, lp0.a<? extends T> aVar2) {
        b.a aVar3;
        a<T> aVar4;
        if (aVar.i(this, bVar)) {
            return aVar;
        }
        Boolean bool = (Boolean) h.f6141b.a();
        int i11 = 0;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        HashSet hashSet = new HashSet();
        f fVar = (f) h.f6140a.a();
        if (fVar == null) {
            fVar = g0.a.b();
        }
        int size = fVar.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((l) ((Pair) fVar.get(i12)).a()).invoke(this);
        }
        if (!booleanValue) {
            try {
                h.f6141b.b(Boolean.TRUE);
            } catch (Throwable th2) {
                int size2 = fVar.size();
                while (i11 < size2) {
                    ((l) ((Pair) fVar.get(i11)).b()).invoke(this);
                    i11++;
                }
                throw th2;
            }
        }
        Object d11 = b.f6287e.d(new DerivedSnapshotState$currentRecord$result$1$result$1(this, hashSet), (l<Object, k>) null, aVar2);
        if (!booleanValue) {
            h.f6141b.b(Boolean.FALSE);
        }
        int size3 = fVar.size();
        while (i11 < size3) {
            ((l) ((Pair) fVar.get(i11)).b()).invoke(this);
            i11++;
        }
        synchronized (SnapshotKt.C()) {
            aVar3 = b.f6287e;
            b b11 = aVar3.b();
            aVar4 = (a) SnapshotKt.I(this.f6000b, this, b11);
            aVar4.k(hashSet);
            aVar4.m(aVar4.j(this, b11));
            aVar4.l(d11);
        }
        if (!booleanValue) {
            aVar3.c();
        }
        return aVar4;
    }

    private final String o() {
        a<T> aVar = this.f6000b;
        b.a aVar2 = b.f6287e;
        a aVar3 = (a) SnapshotKt.A(aVar, aVar2.b());
        return aVar3.i(this, aVar2.b()) ? String.valueOf(aVar3.h()) : "<Not calculated>";
    }

    public /* synthetic */ v d(v vVar, v vVar2, v vVar3) {
        return t.a(this, vVar, vVar2, vVar3);
    }

    public void f(v vVar) {
        kotlin.jvm.internal.p.j(vVar, "value");
        this.f6000b = (a) vVar;
    }

    public T getValue() {
        l<Object, k> h11 = b.f6287e.b().h();
        if (h11 != null) {
            h11.invoke(this);
        }
        return h();
    }

    public T h() {
        a<T> aVar = this.f6000b;
        b.a aVar2 = b.f6287e;
        return n((a) SnapshotKt.A(aVar, aVar2.b()), aVar2.b(), this.f5999a).h();
    }

    public v k() {
        return this.f6000b;
    }

    public Set<u> l() {
        a<T> aVar = this.f6000b;
        b.a aVar2 = b.f6287e;
        HashSet<u> g11 = n((a) SnapshotKt.A(aVar, aVar2.b()), aVar2.b(), this.f5999a).g();
        return g11 != null ? g11 : d0.b();
    }

    public String toString() {
        a aVar = (a) SnapshotKt.A(this.f6000b, b.f6287e.b());
        return "DerivedState(value=" + o() + ")@" + hashCode();
    }
}
