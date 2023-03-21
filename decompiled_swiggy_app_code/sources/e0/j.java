package e0;

import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f0.b;
import f0.c;
import f0.d;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import lp0.p;
import lp0.q;
import n0.u;

/* compiled from: Composition.kt */
public final class j implements o {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.compose.runtime.a f14187a;

    /* renamed from: b  reason: collision with root package name */
    private final e<?> f14188b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Object> f14189c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14190d;

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<r0> f14191e;

    /* renamed from: f  reason: collision with root package name */
    private final v0 f14192f;

    /* renamed from: g  reason: collision with root package name */
    private final d<RecomposeScopeImpl> f14193g;

    /* renamed from: h  reason: collision with root package name */
    private final HashSet<RecomposeScopeImpl> f14194h;

    /* renamed from: i  reason: collision with root package name */
    private final d<p<?>> f14195i;
    private final List<q<e<?>, x0, q0, k>> j;
    private final List<q<e<?>, x0, q0, k>> k;

    /* renamed from: l  reason: collision with root package name */
    private final d<RecomposeScopeImpl> f14196l;

    /* renamed from: m  reason: collision with root package name */
    private b<RecomposeScopeImpl, c<Object>> f14197m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private j f14198o;

    /* renamed from: p  reason: collision with root package name */
    private int f14199p;
    private final ComposerImpl q;

    /* renamed from: r  reason: collision with root package name */
    private final CoroutineContext f14200r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f14201s;
    private boolean t;

    /* renamed from: u  reason: collision with root package name */
    private p<? super g, ? super Integer, k> f14202u;

    /* compiled from: Composition.kt */
    private static final class a implements q0 {

        /* renamed from: a  reason: collision with root package name */
        private final Set<r0> f14203a;

        /* renamed from: b  reason: collision with root package name */
        private final List<r0> f14204b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<r0> f14205c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private final List<lp0.a<k>> f14206d = new ArrayList();

        public a(Set<r0> set) {
            kotlin.jvm.internal.p.j(set, "abandoning");
            this.f14203a = set;
        }

        public void a(lp0.a<k> aVar) {
            kotlin.jvm.internal.p.j(aVar, "effect");
            this.f14206d.add(aVar);
        }

        public void b(r0 r0Var) {
            kotlin.jvm.internal.p.j(r0Var, "instance");
            int lastIndexOf = this.f14205c.lastIndexOf(r0Var);
            if (lastIndexOf >= 0) {
                this.f14205c.remove(lastIndexOf);
                this.f14203a.remove(r0Var);
                return;
            }
            this.f14204b.add(r0Var);
        }

        public void c(r0 r0Var) {
            kotlin.jvm.internal.p.j(r0Var, "instance");
            int lastIndexOf = this.f14204b.lastIndexOf(r0Var);
            if (lastIndexOf >= 0) {
                this.f14204b.remove(lastIndexOf);
                this.f14203a.remove(r0Var);
                return;
            }
            this.f14205c.add(r0Var);
        }

        public final void d() {
            if (!this.f14203a.isEmpty()) {
                Object a11 = g1.f14182a.a("Compose:abandons");
                try {
                    Iterator<r0> it2 = this.f14203a.iterator();
                    while (it2.hasNext()) {
                        it2.remove();
                        it2.next().f();
                    }
                    k kVar = k.f22762a;
                } finally {
                    g1.f14182a.b(a11);
                }
            }
        }

        public final void e() {
            if (!this.f14205c.isEmpty()) {
                Object a11 = g1.f14182a.a("Compose:onForgotten");
                try {
                    for (int size = this.f14205c.size() - 1; -1 < size; size--) {
                        r0 r0Var = this.f14205c.get(size);
                        if (!this.f14203a.contains(r0Var)) {
                            r0Var.g();
                        }
                    }
                    k kVar = k.f22762a;
                } finally {
                    g1.f14182a.b(a11);
                }
            }
            if (!this.f14204b.isEmpty()) {
                Object a12 = g1.f14182a.a("Compose:onRemembered");
                try {
                    List<r0> list = this.f14204b;
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        r0 r0Var2 = list.get(i11);
                        this.f14203a.remove(r0Var2);
                        r0Var2.b();
                    }
                    k kVar2 = k.f22762a;
                } finally {
                    g1.f14182a.b(a12);
                }
            }
        }

        public final void f() {
            if (!this.f14206d.isEmpty()) {
                Object a11 = g1.f14182a.a("Compose:sideeffects");
                try {
                    List<lp0.a<k>> list = this.f14206d;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        list.get(i11).invoke();
                    }
                    this.f14206d.clear();
                    k kVar = k.f22762a;
                } finally {
                    g1.f14182a.b(a11);
                }
            }
        }
    }

    public j(androidx.compose.runtime.a aVar, e<?> eVar, CoroutineContext coroutineContext) {
        kotlin.jvm.internal.p.j(aVar, "parent");
        kotlin.jvm.internal.p.j(eVar, "applier");
        this.f14187a = aVar;
        this.f14188b = eVar;
        this.f14189c = new AtomicReference<>((Object) null);
        this.f14190d = new Object();
        HashSet<r0> hashSet = new HashSet<>();
        this.f14191e = hashSet;
        v0 v0Var = new v0();
        this.f14192f = v0Var;
        this.f14193g = new d<>();
        this.f14194h = new HashSet<>();
        this.f14195i = new d<>();
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.k = arrayList2;
        this.f14196l = new d<>();
        this.f14197m = new b<>(0, 1, (i) null);
        ComposerImpl composerImpl = new ComposerImpl(eVar, aVar, v0Var, hashSet, arrayList, arrayList2, this);
        aVar.m(composerImpl);
        this.q = composerImpl;
        this.f14200r = coroutineContext;
        this.f14201s = aVar instanceof Recomposer;
        this.f14202u = ComposableSingletons$CompositionKt.f5876a.a();
    }

    private final void A(Object obj) {
        d<RecomposeScopeImpl> dVar = this.f14193g;
        int a11 = dVar.f(obj);
        if (a11 >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : dVar.o(a11)) {
                if (recomposeScopeImpl.t(obj) == InvalidationResult.IMMINENT) {
                    this.f14196l.c(obj, recomposeScopeImpl);
                }
            }
        }
    }

    private final b<RecomposeScopeImpl, c<Object>> E() {
        b<RecomposeScopeImpl, c<Object>> bVar = this.f14197m;
        this.f14197m = new b<>(0, 1, (i) null);
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00a9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0045
            java.lang.Object r4 = r3.next()
            boolean r6 = r4 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r6 == 0) goto L_0x0022
            androidx.compose.runtime.RecomposeScopeImpl r4 = (androidx.compose.runtime.RecomposeScopeImpl) r4
            r4.t(r5)
            goto L_0x000d
        L_0x0022:
            d(r0, r1, r2, r4)
            f0.d<e0.p<?>> r5 = r0.f14195i
            int r4 = r5.f(r4)
            if (r4 < 0) goto L_0x000d
            f0.c r4 = r5.o(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0035:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x000d
            java.lang.Object r5 = r4.next()
            e0.p r5 = (e0.p) r5
            d(r0, r1, r2, r5)
            goto L_0x0035
        L_0x0045:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            if (r1 == 0) goto L_0x0106
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f14194h
            boolean r1 = r1.isEmpty()
            r6 = 1
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x0106
            f0.d<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f14193g
            int r7 = r1.j()
            r8 = 0
            r9 = 0
        L_0x005b:
            if (r8 >= r7) goto L_0x00e2
            int[] r10 = r1.k()
            r10 = r10[r8]
            f0.c[] r11 = r1.i()
            r11 = r11[r10]
            kotlin.jvm.internal.p.g(r11)
            int r12 = r11.size()
            r13 = 0
            r14 = 0
        L_0x0072:
            if (r13 >= r12) goto L_0x00ad
            java.lang.Object[] r15 = r11.f()
            r15 = r15[r13]
            java.util.Objects.requireNonNull(r15, r3)
            r4 = r15
            androidx.compose.runtime.RecomposeScopeImpl r4 = (androidx.compose.runtime.RecomposeScopeImpl) r4
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r5 = r0.f14194h
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L_0x009c
            T r5 = r2.f25666a
            java.util.HashSet r5 = (java.util.HashSet) r5
            if (r5 == 0) goto L_0x0096
            boolean r4 = r5.contains(r4)
            if (r4 != r6) goto L_0x0096
            r4 = 1
            goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r4 = 0
            goto L_0x009d
        L_0x009c:
            r4 = 1
        L_0x009d:
            if (r4 != 0) goto L_0x00a9
            if (r14 == r13) goto L_0x00a7
            java.lang.Object[] r4 = r11.f()
            r4[r14] = r15
        L_0x00a7:
            int r14 = r14 + 1
        L_0x00a9:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x0072
        L_0x00ad:
            int r4 = r11.size()
            r5 = r14
        L_0x00b2:
            if (r5 >= r4) goto L_0x00be
            java.lang.Object[] r12 = r11.f()
            r13 = 0
            r12[r5] = r13
            int r5 = r5 + 1
            goto L_0x00b2
        L_0x00be:
            r11.h(r14)
            int r4 = r11.size()
            if (r4 <= 0) goto L_0x00dd
            if (r9 == r8) goto L_0x00db
            int[] r4 = r1.k()
            r4 = r4[r9]
            int[] r5 = r1.k()
            r5[r9] = r10
            int[] r5 = r1.k()
            r5[r8] = r4
        L_0x00db:
            int r9 = r9 + 1
        L_0x00dd:
            int r8 = r8 + 1
            r5 = 0
            goto L_0x005b
        L_0x00e2:
            int r2 = r1.j()
            r3 = r9
        L_0x00e7:
            if (r3 >= r2) goto L_0x00f9
            java.lang.Object[] r4 = r1.l()
            int[] r5 = r1.k()
            r5 = r5[r3]
            r6 = 0
            r4[r5] = r6
            int r3 = r3 + 1
            goto L_0x00e7
        L_0x00f9:
            r1.p(r9)
            r16.u()
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f14194h
            r1.clear()
            goto L_0x019c
        L_0x0106:
            T r1 = r2.f25666a
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x019c
            f0.d<androidx.compose.runtime.RecomposeScopeImpl> r2 = r0.f14193g
            int r4 = r2.j()
            r5 = 0
            r6 = 0
        L_0x0114:
            if (r5 >= r4) goto L_0x017f
            int[] r7 = r2.k()
            r7 = r7[r5]
            f0.c[] r8 = r2.i()
            r8 = r8[r7]
            kotlin.jvm.internal.p.g(r8)
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L_0x012b:
            if (r10 >= r9) goto L_0x014c
            java.lang.Object[] r12 = r8.f()
            r12 = r12[r10]
            java.util.Objects.requireNonNull(r12, r3)
            r13 = r12
            androidx.compose.runtime.RecomposeScopeImpl r13 = (androidx.compose.runtime.RecomposeScopeImpl) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0149
            if (r11 == r10) goto L_0x0147
            java.lang.Object[] r13 = r8.f()
            r13[r11] = r12
        L_0x0147:
            int r11 = r11 + 1
        L_0x0149:
            int r10 = r10 + 1
            goto L_0x012b
        L_0x014c:
            int r9 = r8.size()
            r10 = r11
        L_0x0151:
            if (r10 >= r9) goto L_0x015d
            java.lang.Object[] r12 = r8.f()
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x0151
        L_0x015d:
            r8.h(r11)
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x017c
            if (r6 == r5) goto L_0x017a
            int[] r8 = r2.k()
            r8 = r8[r6]
            int[] r9 = r2.k()
            r9[r6] = r7
            int[] r7 = r2.k()
            r7[r5] = r8
        L_0x017a:
            int r6 = r6 + 1
        L_0x017c:
            int r5 = r5 + 1
            goto L_0x0114
        L_0x017f:
            int r1 = r2.j()
            r3 = r6
        L_0x0184:
            if (r3 >= r1) goto L_0x0196
            java.lang.Object[] r4 = r2.l()
            int[] r5 = r2.k()
            r5 = r5[r3]
            r7 = 0
            r4[r5] = r7
            int r3 = r3 + 1
            goto L_0x0184
        L_0x0196:
            r2.p(r6)
            r16.u()
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.b(java.util.Set, boolean):void");
    }

    private static final void d(j jVar, boolean z11, Ref$ObjectRef<HashSet<RecomposeScopeImpl>> ref$ObjectRef, Object obj) {
        d<RecomposeScopeImpl> dVar = jVar.f14193g;
        int a11 = dVar.f(obj);
        if (a11 >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : dVar.o(a11)) {
                if (!jVar.f14196l.m(obj, recomposeScopeImpl) && recomposeScopeImpl.t(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.u() || z11) {
                        T t11 = (HashSet) ref$ObjectRef.f25666a;
                        if (t11 == null) {
                            t11 = new HashSet();
                            ref$ObjectRef.f25666a = t11;
                        }
                        t11.add(recomposeScopeImpl);
                    } else {
                        jVar.f14194h.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    private final void t(List<q<e<?>, x0, q0, k>> list) {
        x0 p11;
        Object a11;
        a aVar = new a(this.f14191e);
        try {
            if (!list.isEmpty()) {
                Object a12 = g1.f14182a.a("Compose:applyChanges");
                try {
                    this.f14188b.d();
                    p11 = this.f14192f.p();
                    e<?> eVar = this.f14188b;
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        list.get(i11).invoke(eVar, p11, aVar);
                    }
                    list.clear();
                    k kVar = k.f22762a;
                    p11.F();
                    this.f14188b.c();
                    g1 g1Var = g1.f14182a;
                    g1Var.b(a12);
                    aVar.e();
                    aVar.f();
                    if (this.n) {
                        a11 = g1Var.a("Compose:unobserve");
                        this.n = false;
                        d<RecomposeScopeImpl> dVar = this.f14193g;
                        int j11 = dVar.j();
                        int i12 = 0;
                        for (int i13 = 0; i13 < j11; i13++) {
                            int i14 = dVar.k()[i13];
                            c cVar = dVar.i()[i14];
                            kotlin.jvm.internal.p.g(cVar);
                            int size2 = cVar.size();
                            int i15 = 0;
                            int i16 = 0;
                            while (i15 < size2) {
                                Object obj = cVar.f()[i15];
                                if (obj != null) {
                                    if (!(!((RecomposeScopeImpl) obj).s())) {
                                        if (i16 != i15) {
                                            cVar.f()[i16] = obj;
                                        }
                                        i16++;
                                    }
                                    i15++;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                            }
                            int size3 = cVar.size();
                            for (int i17 = i16; i17 < size3; i17++) {
                                cVar.f()[i17] = null;
                            }
                            cVar.h(i16);
                            if (cVar.size() > 0) {
                                if (i12 != i13) {
                                    int i18 = dVar.k()[i12];
                                    dVar.k()[i12] = i14;
                                    dVar.k()[i13] = i18;
                                }
                                i12++;
                            }
                        }
                        int j12 = dVar.j();
                        for (int i19 = i12; i19 < j12; i19++) {
                            dVar.l()[dVar.k()[i19]] = null;
                        }
                        dVar.p(i12);
                        u();
                        k kVar2 = k.f22762a;
                        g1.f14182a.b(a11);
                    }
                    if (this.k.isEmpty()) {
                        aVar.d();
                    }
                } catch (Throwable th2) {
                    g1.f14182a.b(a12);
                    throw th2;
                }
            } else if (this.k.isEmpty()) {
                aVar.d();
            }
        } catch (Throwable th3) {
            if (this.k.isEmpty()) {
                aVar.d();
            }
            throw th3;
        }
    }

    private final void u() {
        d<p<?>> dVar = this.f14195i;
        int j11 = dVar.j();
        int i11 = 0;
        for (int i12 = 0; i12 < j11; i12++) {
            int i13 = dVar.k()[i12];
            c cVar = dVar.i()[i13];
            kotlin.jvm.internal.p.g(cVar);
            int size = cVar.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = cVar.f()[i15];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f14193g.e((p) obj))) {
                    if (i14 != i15) {
                        cVar.f()[i14] = obj;
                    }
                    i14++;
                }
            }
            int size2 = cVar.size();
            for (int i16 = i14; i16 < size2; i16++) {
                cVar.f()[i16] = null;
            }
            cVar.h(i14);
            if (cVar.size() > 0) {
                if (i11 != i12) {
                    int i17 = dVar.k()[i11];
                    dVar.k()[i11] = i13;
                    dVar.k()[i12] = i17;
                }
                i11++;
            }
        }
        int j12 = dVar.j();
        for (int i18 = i11; i18 < j12; i18++) {
            dVar.l()[dVar.k()[i18]] = null;
        }
        dVar.p(i11);
        Iterator<RecomposeScopeImpl> it2 = this.f14194h.iterator();
        kotlin.jvm.internal.p.i(it2, "iterator()");
        while (it2.hasNext()) {
            if (!it2.next().u()) {
                it2.remove();
            }
        }
    }

    private final void v() {
        Object andSet = this.f14189c.getAndSet(k.f14208a);
        if (andSet == null) {
            return;
        }
        if (kotlin.jvm.internal.p.e(andSet, k.f14208a)) {
            throw new IllegalStateException("pending composition has not been applied".toString());
        } else if (andSet instanceof Set) {
            b((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set b11 : (Set[]) andSet) {
                b(b11, true);
            }
        } else {
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.f14189c).toString());
        }
    }

    private final void w() {
        Object andSet = this.f14189c.getAndSet((Object) null);
        if (kotlin.jvm.internal.p.e(andSet, k.f14208a)) {
            return;
        }
        if (andSet instanceof Set) {
            b((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set b11 : (Set[]) andSet) {
                b(b11, false);
            }
        } else if (andSet == null) {
            throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
        } else {
            throw new IllegalStateException(("corrupt pendingModifications drain: " + this.f14189c).toString());
        }
    }

    private final boolean x() {
        return this.q.A0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        return r1.z(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.f14187a.i(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (p() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return androidx.compose.runtime.InvalidationResult.DEFERRED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.compose.runtime.InvalidationResult z(androidx.compose.runtime.RecomposeScopeImpl r6, e0.c r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14190d
            monitor-enter(r0)
            e0.j r1 = r5.f14198o     // Catch:{ all -> 0x004e }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            e0.v0 r3 = r5.f14192f     // Catch:{ all -> 0x004e }
            int r4 = r5.f14199p     // Catch:{ all -> 0x004e }
            boolean r3 = r3.n(r4, r7)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0035
            boolean r3 = r5.p()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.ComposerImpl r3 = r5.q     // Catch:{ all -> 0x004e }
            boolean r3 = r3.E1(r6, r8)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r6
        L_0x0028:
            if (r8 != 0) goto L_0x0030
            f0.b<androidx.compose.runtime.RecomposeScopeImpl, f0.c<java.lang.Object>> r3 = r5.f14197m     // Catch:{ all -> 0x004e }
            r3.j(r6, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0035
        L_0x0030:
            f0.b<androidx.compose.runtime.RecomposeScopeImpl, f0.c<java.lang.Object>> r2 = r5.f14197m     // Catch:{ all -> 0x004e }
            e0.k.d(r2, r6, r8)     // Catch:{ all -> 0x004e }
        L_0x0035:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x003d
            androidx.compose.runtime.InvalidationResult r6 = r1.z(r6, r7, r8)
            return r6
        L_0x003d:
            androidx.compose.runtime.a r6 = r5.f14187a
            r6.i(r5)
            boolean r6 = r5.p()
            if (r6 == 0) goto L_0x004b
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x004d
        L_0x004b:
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x004d:
            return r6
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.z(androidx.compose.runtime.RecomposeScopeImpl, e0.c, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    public final void B(p<?> pVar) {
        kotlin.jvm.internal.p.j(pVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        if (!this.f14193g.e(pVar)) {
            this.f14195i.n(pVar);
        }
    }

    public final void C(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        kotlin.jvm.internal.p.j(obj, "instance");
        kotlin.jvm.internal.p.j(recomposeScopeImpl, "scope");
        this.f14193g.m(obj, recomposeScopeImpl);
    }

    public final void D(boolean z11) {
        this.n = z11;
    }

    public void a() {
        synchronized (this.f14190d) {
            for (Object obj : this.f14192f.i()) {
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            k kVar = k.f22762a;
        }
    }

    public void c(p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "content");
        if (!this.t) {
            this.f14202u = pVar;
            this.f14187a.a(this, pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* JADX INFO: finally extract failed */
    public void dispose() {
        synchronized (this.f14190d) {
            if (!this.t) {
                this.t = true;
                this.f14202u = ComposableSingletons$CompositionKt.f5876a.b();
                boolean z11 = this.f14192f.h() > 0;
                if (z11 || (true ^ this.f14191e.isEmpty())) {
                    a aVar = new a(this.f14191e);
                    if (z11) {
                        x0 p11 = this.f14192f.p();
                        try {
                            ComposerKt.U(p11, aVar);
                            k kVar = k.f22762a;
                            p11.F();
                            this.f14188b.clear();
                            aVar.e();
                        } catch (Throwable th2) {
                            p11.F();
                            throw th2;
                        }
                    }
                    aVar.d();
                }
                this.q.q0();
            }
            k kVar2 = k.f22762a;
        }
        this.f14187a.p(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.p.j(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r3.next()
            f0.d<androidx.compose.runtime.RecomposeScopeImpl> r1 = r2.f14193g
            boolean r1 = r1.e(r0)
            if (r1 != 0) goto L_0x0023
            f0.d<e0.p<?>> r1 = r2.f14195i
            boolean r0 = r1.e(r0)
            if (r0 == 0) goto L_0x0009
        L_0x0023:
            r3 = 1
            return r3
        L_0x0025:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.e(java.util.Set):boolean");
    }

    public void f() {
        synchronized (this.f14190d) {
            this.q.i0();
            if (!this.f14191e.isEmpty()) {
                new a(this.f14191e).d();
            }
            k kVar = k.f22762a;
        }
    }

    public void g() {
        synchronized (this.f14190d) {
            if (!this.k.isEmpty()) {
                t(this.k);
            }
            k kVar = k.f22762a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((!r3.f14191e.isEmpty()) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        new e0.j.a(r3.f14191e).d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(lp0.p<? super e0.g, ? super java.lang.Integer, bp0.k> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.p.j(r4, r0)
            java.lang.Object r0 = r3.f14190d     // Catch:{ all -> 0x001b }
            monitor-enter(r0)     // Catch:{ all -> 0x001b }
            r3.v()     // Catch:{ all -> 0x0018 }
            androidx.compose.runtime.ComposerImpl r1 = r3.q     // Catch:{ all -> 0x0018 }
            f0.b r2 = r3.E()     // Catch:{ all -> 0x0018 }
            r1.l0(r2, r4)     // Catch:{ all -> 0x0018 }
            bp0.k r4 = bp0.k.f22762a     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r4     // Catch:{ all -> 0x001b }
        L_0x001b:
            r4 = move-exception
            java.util.HashSet<e0.r0> r0 = r3.f14191e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0030
            e0.j$a r0 = new e0.j$a
            java.util.HashSet<e0.r0> r1 = r3.f14191e
            r0.<init>(r1)
            r0.d()
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.h(lp0.p):void");
    }

    public void i(List<Pair<g0, g0>> list) {
        kotlin.jvm.internal.p.j(list, "references");
        int size = list.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            } else if (!kotlin.jvm.internal.p.e(((g0) list.get(i11).c()).b(), this)) {
                break;
            } else {
                i11++;
            }
        }
        ComposerKt.X(z11);
        try {
            this.q.F0(list);
            k kVar = k.f22762a;
        } catch (Throwable th2) {
            if (!this.f14191e.isEmpty()) {
                new a(this.f14191e).d();
            }
            throw th2;
        }
    }

    public boolean isDisposed() {
        return this.t;
    }

    public boolean j() {
        boolean W0;
        synchronized (this.f14190d) {
            v();
            try {
                W0 = this.q.W0(E());
                if (!W0) {
                    w();
                }
            } catch (Throwable th2) {
                if (!this.f14191e.isEmpty()) {
                    new a(this.f14191e).d();
                }
                throw th2;
            }
        }
        return W0;
    }

    /* JADX INFO: finally extract failed */
    public void k(f0 f0Var) {
        kotlin.jvm.internal.p.j(f0Var, HexAttribute.HEX_ATTR_THREAD_STATE);
        a aVar = new a(this.f14191e);
        x0 p11 = f0Var.a().p();
        try {
            ComposerKt.U(p11, aVar);
            k kVar = k.f22762a;
            p11.F();
            aVar.e();
        } catch (Throwable th2) {
            p11.F();
            throw th2;
        }
    }

    public void l(Object obj) {
        RecomposeScopeImpl C0;
        kotlin.jvm.internal.p.j(obj, "value");
        if (!x() && (C0 = this.q.C0()) != null) {
            C0.G(true);
            this.f14193g.c(obj, C0);
            if (obj instanceof p) {
                this.f14195i.n(obj);
                for (u c11 : ((p) obj).l()) {
                    this.f14195i.c(c11, obj);
                }
            }
            C0.w(obj);
        }
    }

    public void m(lp0.a<k> aVar) {
        kotlin.jvm.internal.p.j(aVar, RenderingDetails.TYPE_BLOCK);
        this.q.P0(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.util.Set<? extends java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.p.j(r6, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r5.f14189c
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = 1
            goto L_0x0018
        L_0x0010:
            java.lang.Object r2 = e0.k.f14208a
            boolean r2 = kotlin.jvm.internal.p.e(r0, r2)
        L_0x0018:
            if (r2 == 0) goto L_0x001c
            r2 = r6
            goto L_0x003c
        L_0x001c:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002c
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r3 = 0
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r6
            goto L_0x003c
        L_0x002c:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            java.util.Objects.requireNonNull(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r2 = kotlin.collections.g.A(r1, r6)
        L_0x003c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.f14189c
            boolean r1 = r1.compareAndSet(r0, r2)
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x0053
            java.lang.Object r6 = r5.f14190d
            monitor-enter(r6)
            r5.w()     // Catch:{ all -> 0x0050 }
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x0050 }
            monitor-exit(r6)
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.f14189c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.n(java.util.Set):void");
    }

    public void o() {
        synchronized (this.f14190d) {
            t(this.j);
            w();
            k kVar = k.f22762a;
        }
    }

    public boolean p() {
        return this.q.L0();
    }

    public void q(Object obj) {
        kotlin.jvm.internal.p.j(obj, "value");
        synchronized (this.f14190d) {
            A(obj);
            d<p<?>> dVar = this.f14195i;
            int a11 = dVar.f(obj);
            if (a11 >= 0) {
                for (p A : dVar.o(a11)) {
                    A(A);
                }
            }
            k kVar = k.f22762a;
        }
    }

    public <R> R r(o oVar, int i11, lp0.a<? extends R> aVar) {
        kotlin.jvm.internal.p.j(aVar, RenderingDetails.TYPE_BLOCK);
        if (oVar == null || kotlin.jvm.internal.p.e(oVar, this) || i11 < 0) {
            return aVar.invoke();
        }
        this.f14198o = (j) oVar;
        this.f14199p = i11;
        try {
            return aVar.invoke();
        } finally {
            this.f14198o = null;
            this.f14199p = 0;
        }
    }

    public boolean s() {
        boolean z11;
        synchronized (this.f14190d) {
            z11 = this.f14197m.f() > 0;
        }
        return z11;
    }

    public final InvalidationResult y(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        kotlin.jvm.internal.p.j(recomposeScopeImpl, "scope");
        if (recomposeScopeImpl.m()) {
            recomposeScopeImpl.C(true);
        }
        c j11 = recomposeScopeImpl.j();
        if (j11 == null || !this.f14192f.q(j11) || !j11.b()) {
            return InvalidationResult.IGNORED;
        }
        if (!j11.b()) {
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.k()) {
            return InvalidationResult.IGNORED;
        }
        return z(recomposeScopeImpl, j11, obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(androidx.compose.runtime.a aVar, e eVar, CoroutineContext coroutineContext, int i11, i iVar) {
        this(aVar, eVar, (i11 & 4) != 0 ? null : coroutineContext);
    }
}
