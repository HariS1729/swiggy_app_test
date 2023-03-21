package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.b;
import bp0.k;
import e0.c0;
import e0.d0;
import e0.e0;
import e0.f0;
import e0.g;
import e0.g0;
import e0.o;
import e0.p0;
import fp0.c;
import g0.h;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.s;
import lp0.l;
import lp0.q;
import n0.e;
import wp0.j0;
import wp0.k1;
import wp0.n;
import wp0.n1;
import wp0.z;

/* compiled from: Recomposer.kt */
public final class Recomposer extends a {
    public static final a t = new a((i) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f6039u = 8;
    /* access modifiers changed from: private */
    public static final kotlinx.coroutines.flow.i<h<b>> v = s.a(g0.a.c());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f6040a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastFrameClock f6041b;

    /* renamed from: c  reason: collision with root package name */
    private final z f6042c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineContext f6043d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Object f6044e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public k1 f6045f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Throwable f6046g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final List<o> f6047h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final List<Set<Object>> f6048i = new ArrayList();
    /* access modifiers changed from: private */
    public final List<o> j = new ArrayList();
    private final List<o> k = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final List<g0> f6049l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final Map<e0<Object>, List<g0>> f6050m = new LinkedHashMap();
    private final Map<g0, f0> n = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public n<? super k> f6051o;

    /* renamed from: p  reason: collision with root package name */
    private int f6052p;
    /* access modifiers changed from: private */
    public boolean q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final kotlinx.coroutines.flow.i<State> f6053r = s.a(State.Inactive);
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final b f6054s = new b();

    /* compiled from: Recomposer.kt */
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* compiled from: Recomposer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void c(androidx.compose.runtime.Recomposer.b r4) {
            /*
                r3 = this;
            L_0x0000:
                kotlinx.coroutines.flow.i r0 = androidx.compose.runtime.Recomposer.v
                java.lang.Object r0 = r0.getValue()
                g0.h r0 = (g0.h) r0
                g0.h r1 = r0.add(r4)
                if (r0 == r1) goto L_0x001a
                kotlinx.coroutines.flow.i r2 = androidx.compose.runtime.Recomposer.v
                boolean r0 = r2.c(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.a.c(androidx.compose.runtime.Recomposer$b):void");
        }

        /* access modifiers changed from: private */
        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public final void d(androidx.compose.runtime.Recomposer.b r4) {
            /*
                r3 = this;
            L_0x0000:
                kotlinx.coroutines.flow.i r0 = androidx.compose.runtime.Recomposer.v
                java.lang.Object r0 = r0.getValue()
                g0.h r0 = (g0.h) r0
                g0.h r1 = r0.remove(r4)
                if (r0 == r1) goto L_0x001a
                kotlinx.coroutines.flow.i r2 = androidx.compose.runtime.Recomposer.v
                boolean r0 = r2.c(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.a.d(androidx.compose.runtime.Recomposer$b):void");
        }
    }

    /* compiled from: Recomposer.kt */
    private final class b {
        public b() {
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        p.j(coroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f6041b = broadcastFrameClock;
        z a11 = n1.a((k1) coroutineContext.get(k1.f29476l0));
        a11.C(new Recomposer$effectJob$1$1(this));
        this.f6042c = a11;
        this.f6043d = coroutineContext.plus(broadcastFrameClock).plus(a11);
    }

    private final void R(androidx.compose.runtime.snapshots.a aVar) {
        try {
            if (aVar.A() instanceof e.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            aVar.d();
        }
    }

    /* access modifiers changed from: private */
    public final Object S(c<? super k> cVar) {
        k kVar;
        if (Z()) {
            return k.f22762a;
        }
        wp0.o oVar = new wp0.o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        synchronized (this.f6044e) {
            if (Z()) {
                Result.a aVar = Result.f25582b;
                oVar.resumeWith(Result.b(k.f22762a));
            } else {
                this.f6051o = oVar;
            }
            kVar = k.f22762a;
        }
        Object t11 = oVar.t();
        if (t11 == b.d()) {
            f.c(cVar);
        }
        return t11 == b.d() ? t11 : kVar;
    }

    /* access modifiers changed from: private */
    public final n<k> U() {
        State state;
        if (this.f6053r.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.f6047h.clear();
            this.f6048i.clear();
            this.j.clear();
            this.k.clear();
            this.f6049l.clear();
            n<? super k> nVar = this.f6051o;
            if (nVar != null) {
                n.a.a(nVar, (Throwable) null, 1, (Object) null);
            }
            this.f6051o = null;
            return null;
        }
        if (this.f6045f == null) {
            this.f6048i.clear();
            this.j.clear();
            state = this.f6041b.k() ? State.InactivePendingWork : State.Inactive;
        } else if ((!this.j.isEmpty()) || (!this.f6048i.isEmpty()) || (!this.k.isEmpty()) || (!this.f6049l.isEmpty()) || this.f6052p > 0 || this.f6041b.k()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this.f6053r.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        n<? super k> nVar2 = this.f6051o;
        this.f6051o = null;
        return nVar2;
    }

    /* access modifiers changed from: private */
    public final void V() {
        int i11;
        List list;
        synchronized (this.f6044e) {
            if (!this.f6050m.isEmpty()) {
                List w11 = l.w(this.f6050m.values());
                this.f6050m.clear();
                list = new ArrayList(w11.size());
                int size = w11.size();
                for (int i12 = 0; i12 < size; i12++) {
                    g0 g0Var = (g0) w11.get(i12);
                    list.add(bp0.h.a(g0Var, this.n.get(g0Var)));
                }
                this.n.clear();
            } else {
                list = k.j();
            }
        }
        int size2 = list.size();
        for (i11 = 0; i11 < size2; i11++) {
            Pair pair = (Pair) list.get(i11);
            g0 g0Var2 = (g0) pair.a();
            f0 f0Var = (f0) pair.b();
            if (f0Var != null) {
                g0Var2.b().k(f0Var);
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean Y() {
        return (this.j.isEmpty() ^ true) || this.f6041b.k();
    }

    /* access modifiers changed from: private */
    public final boolean Z() {
        boolean z11;
        synchronized (this.f6044e) {
            z11 = true;
            if (!(!this.f6048i.isEmpty()) && !(!this.j.isEmpty()) && !this.f6041b.k()) {
                z11 = false;
            }
        }
        return z11;
    }

    /* access modifiers changed from: private */
    public final boolean a0() {
        boolean z11;
        boolean z12;
        synchronized (this.f6044e) {
            z11 = !this.q;
        }
        if (z11) {
            return true;
        }
        Iterator<k1> it2 = this.f6042c.L().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().b()) {
                    z12 = true;
                    break;
                }
            } else {
                z12 = false;
                break;
            }
        }
        if (z12) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = new java.util.ArrayList();
        d0(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        e0(r0, (f0.c<java.lang.Object>) null);
        d0(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c0(e0.o r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f6044e
            monitor-enter(r0)
            java.util.List<e0.g0> r1 = r7.f6049l     // Catch:{ all -> 0x0042 }
            int r2 = r1.size()     // Catch:{ all -> 0x0042 }
            r3 = 0
            r4 = 0
        L_0x000b:
            r5 = 1
            if (r4 >= r2) goto L_0x0023
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0042 }
            e0.g0 r6 = (e0.g0) r6     // Catch:{ all -> 0x0042 }
            e0.o r6 = r6.b()     // Catch:{ all -> 0x0042 }
            boolean r6 = kotlin.jvm.internal.p.e(r6, r8)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0023
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0023:
            if (r3 != 0) goto L_0x0027
            monitor-exit(r0)
            return
        L_0x0027:
            bp0.k r1 = bp0.k.f22762a     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            d0(r0, r7, r8)
        L_0x0032:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0041
            r1 = 0
            r7.e0(r0, r1)
            d0(r0, r7, r8)
            goto L_0x0032
        L_0x0041:
            return
        L_0x0042:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.c0(e0.o):void");
    }

    private static final void d0(List<g0> list, Recomposer recomposer, o oVar) {
        list.clear();
        synchronized (recomposer.f6044e) {
            Iterator<g0> it2 = recomposer.f6049l.iterator();
            while (it2.hasNext()) {
                g0 next = it2.next();
                if (p.e(next.b(), oVar)) {
                    list.add(next);
                    it2.remove();
                }
            }
            k kVar = k.f22762a;
        }
    }

    /* access modifiers changed from: private */
    public final List<o> e0(List<g0> list, f0.c<Object> cVar) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            g0 g0Var = list.get(i11);
            o b11 = g0Var.b();
            Object obj = hashMap.get(b11);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b11, obj);
            }
            ((ArrayList) obj).add(g0Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            o oVar = (o) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.X(!oVar.p());
            androidx.compose.runtime.snapshots.a h11 = androidx.compose.runtime.snapshots.b.f6287e.h(g0(oVar), l0(oVar, cVar));
            try {
                androidx.compose.runtime.snapshots.b k11 = h11.k();
                try {
                    synchronized (this.f6044e) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            g0 g0Var2 = (g0) list2.get(i12);
                            arrayList.add(bp0.h.a(g0Var2, p0.b(this.f6050m, g0Var2.c())));
                        }
                    }
                    oVar.i(arrayList);
                    k kVar = k.f22762a;
                    h11.r(k11);
                } catch (Throwable th2) {
                    h11.r(k11);
                    throw th2;
                }
            } finally {
                R(h11);
            }
        }
        return s.E0(hashMap.keySet());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[Catch:{ all -> 0x002b, all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e0.o f0(e0.o r7, f0.c<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r7.p()
            r1 = 0
            if (r0 != 0) goto L_0x0050
            boolean r0 = r7.isDisposed()
            if (r0 == 0) goto L_0x000e
            goto L_0x0050
        L_0x000e:
            androidx.compose.runtime.snapshots.b$a r0 = androidx.compose.runtime.snapshots.b.f6287e
            lp0.l r2 = r6.g0(r7)
            lp0.l r3 = r6.l0(r7, r8)
            androidx.compose.runtime.snapshots.a r0 = r0.h(r2, r3)
            androidx.compose.runtime.snapshots.b r2 = r0.k()     // Catch:{ all -> 0x004b }
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L_0x002d
            boolean r5 = r8.g()     // Catch:{ all -> 0x002b }
            if (r5 != r3) goto L_0x002d
            goto L_0x002e
        L_0x002b:
            r7 = move-exception
            goto L_0x0047
        L_0x002d:
            r3 = 0
        L_0x002e:
            if (r3 == 0) goto L_0x0038
            androidx.compose.runtime.Recomposer$performRecompose$1$1 r3 = new androidx.compose.runtime.Recomposer$performRecompose$1$1     // Catch:{ all -> 0x002b }
            r3.<init>(r8, r7)     // Catch:{ all -> 0x002b }
            r7.m(r3)     // Catch:{ all -> 0x002b }
        L_0x0038:
            boolean r8 = r7.j()     // Catch:{ all -> 0x002b }
            r0.r(r2)     // Catch:{ all -> 0x004b }
            r6.R(r0)
            if (r8 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r7 = r1
        L_0x0046:
            return r7
        L_0x0047:
            r0.r(r2)     // Catch:{ all -> 0x004b }
            throw r7     // Catch:{ all -> 0x004b }
        L_0x004b:
            r7 = move-exception
            r6.R(r0)
            throw r7
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.f0(e0.o, f0.c):e0.o");
    }

    private final l<Object, k> g0(o oVar) {
        return new Recomposer$readObserverOf$1(oVar);
    }

    private final Object h0(q<? super j0, ? super c0, ? super c<? super k>, ? extends Object> qVar, c<? super k> cVar) {
        Object g11 = wp0.h.g(this.f6041b, new Recomposer$recompositionRunner$2(this, qVar, d0.a(cVar.getContext()), (c<? super Recomposer$recompositionRunner$2>) null), cVar);
        return g11 == b.d() ? g11 : k.f22762a;
    }

    /* access modifiers changed from: private */
    public final void i0() {
        if (!this.f6048i.isEmpty()) {
            List<Set<Object>> list = this.f6048i;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Set set = list.get(i11);
                List<o> list2 = this.f6047h;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    list2.get(i12).n(set);
                }
            }
            this.f6048i.clear();
            if (U() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public final void j0(k1 k1Var) {
        synchronized (this.f6044e) {
            Throwable th2 = this.f6046g;
            if (th2 != null) {
                throw th2;
            } else if (this.f6053r.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            } else if (this.f6045f == null) {
                this.f6045f = k1Var;
                U();
            } else {
                throw new IllegalStateException("Recomposer already running".toString());
            }
        }
    }

    private final l<Object, k> l0(o oVar, f0.c<Object> cVar) {
        return new Recomposer$writeObserverOf$1(oVar, cVar);
    }

    public final void T() {
        synchronized (this.f6044e) {
            if (this.f6053r.getValue().compareTo(State.Idle) >= 0) {
                this.f6053r.setValue(State.ShuttingDown);
            }
            k kVar = k.f22762a;
        }
        k1.a.a(this.f6042c, (CancellationException) null, 1, (Object) null);
    }

    public final long W() {
        return this.f6040a;
    }

    public final r<State> X() {
        return this.f6053r;
    }

    public void a(o oVar, lp0.p<? super g, ? super Integer, k> pVar) {
        androidx.compose.runtime.snapshots.b k11;
        p.j(oVar, "composition");
        p.j(pVar, "content");
        boolean p11 = oVar.p();
        b.a aVar = androidx.compose.runtime.snapshots.b.f6287e;
        androidx.compose.runtime.snapshots.a h11 = aVar.h(g0(oVar), l0(oVar, (f0.c<Object>) null));
        try {
            k11 = h11.k();
            oVar.h(pVar);
            k kVar = k.f22762a;
            h11.r(k11);
            R(h11);
            if (!p11) {
                aVar.c();
            }
            synchronized (this.f6044e) {
                if (this.f6053r.getValue().compareTo(State.ShuttingDown) > 0 && !this.f6047h.contains(oVar)) {
                    this.f6047h.add(oVar);
                }
            }
            c0(oVar);
            oVar.o();
            oVar.g();
            if (!p11) {
                aVar.c();
            }
        } catch (Throwable th2) {
            R(h11);
            throw th2;
        }
    }

    public void b(g0 g0Var) {
        p.j(g0Var, "reference");
        synchronized (this.f6044e) {
            p0.a(this.f6050m, g0Var.c(), g0Var);
        }
    }

    public final Object b0(c<? super k> cVar) {
        Object t11 = kotlinx.coroutines.flow.f.t(X(), new Recomposer$join$2((c<? super Recomposer$join$2>) null), cVar);
        return t11 == b.d() ? t11 : k.f22762a;
    }

    public boolean d() {
        return false;
    }

    public int f() {
        return 1000;
    }

    public CoroutineContext g() {
        return this.f6043d;
    }

    public void h(g0 g0Var) {
        n<k> U;
        p.j(g0Var, "reference");
        synchronized (this.f6044e) {
            this.f6049l.add(g0Var);
            U = U();
        }
        if (U != null) {
            Result.a aVar = Result.f25582b;
            U.resumeWith(Result.b(k.f22762a));
        }
    }

    public void i(o oVar) {
        n<k> nVar;
        p.j(oVar, "composition");
        synchronized (this.f6044e) {
            if (!this.j.contains(oVar)) {
                this.j.add(oVar);
                nVar = U();
            } else {
                nVar = null;
            }
        }
        if (nVar != null) {
            Result.a aVar = Result.f25582b;
            nVar.resumeWith(Result.b(k.f22762a));
        }
    }

    public void j(g0 g0Var, f0 f0Var) {
        p.j(g0Var, "reference");
        p.j(f0Var, CardTypeAdapterFactory.DATA);
        synchronized (this.f6044e) {
            this.n.put(g0Var, f0Var);
            k kVar = k.f22762a;
        }
    }

    public f0 k(g0 g0Var) {
        f0 remove;
        p.j(g0Var, "reference");
        synchronized (this.f6044e) {
            remove = this.n.remove(g0Var);
        }
        return remove;
    }

    public final Object k0(c<? super k> cVar) {
        Object h02 = h0(new Recomposer$runRecomposeAndApplyChanges$2(this, (c<? super Recomposer$runRecomposeAndApplyChanges$2>) null), cVar);
        return h02 == b.d() ? h02 : k.f22762a;
    }

    public void l(Set<o0.a> set) {
        p.j(set, "table");
    }

    public void p(o oVar) {
        p.j(oVar, "composition");
        synchronized (this.f6044e) {
            this.f6047h.remove(oVar);
            this.j.remove(oVar);
            this.k.remove(oVar);
            k kVar = k.f22762a;
        }
    }
}
