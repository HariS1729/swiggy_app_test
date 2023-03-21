package androidx.compose.animation.core;

import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.v1;
import e0.a1;
import e0.d1;
import e0.h0;
import e0.s0;
import e0.u;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Transition.kt */
public final class Transition<S> {

    /* renamed from: a  reason: collision with root package name */
    private final v1.i0<S> f2732a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2733b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f2734c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f2735d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f2736e;

    /* renamed from: f  reason: collision with root package name */
    private final h0 f2737f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f2738g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final SnapshotStateList<Transition<S>.defpackage.d<?, ?>> f2739h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final SnapshotStateList<Transition<?>> f2740i;
    private final h0 j;
    private long k;

    /* renamed from: l  reason: collision with root package name */
    private final d1 f2741l;

    /* compiled from: Transition.kt */
    public final class a<T, V extends v1.n> {

        /* renamed from: a  reason: collision with root package name */
        private final v1.q0<T, V> f2742a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2743b;

        /* renamed from: c  reason: collision with root package name */
        private Transition<S>.defpackage.a<T, V>.defpackage.a<T, V> f2744c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Transition<S> f2745d;

        /* renamed from: androidx.compose.animation.core.Transition$a$a  reason: collision with other inner class name */
        /* compiled from: Transition.kt */
        public final class C0017a<T, V extends v1.n> implements d1<T> {

            /* renamed from: a  reason: collision with root package name */
            private final Transition<S>.defpackage.d<T, V> f2746a;

            /* renamed from: b  reason: collision with root package name */
            private l<? super b<S>, ? extends v1.a0<T>> f2747b;

            /* renamed from: c  reason: collision with root package name */
            private l<? super S, ? extends T> f2748c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Transition<S>.defpackage.a<T, V> f2749d;

            public C0017a(a aVar, Transition<S>.defpackage.d<T, V> dVar, l<? super b<S>, ? extends v1.a0<T>> lVar, l<? super S, ? extends T> lVar2) {
                p.j(aVar, "this$0");
                p.j(dVar, "animation");
                p.j(lVar, "transitionSpec");
                p.j(lVar2, "targetValueByState");
                this.f2749d = aVar;
                this.f2746a = dVar;
                this.f2747b = lVar;
                this.f2748c = lVar2;
            }

            public final Transition<S>.defpackage.d<T, V> d() {
                return this.f2746a;
            }

            public final l<S, T> f() {
                return this.f2748c;
            }

            public T getValue() {
                p(this.f2749d.f2745d.k());
                return this.f2746a.getValue();
            }

            public final l<b<S>, v1.a0<T>> k() {
                return this.f2747b;
            }

            public final void n(l<? super S, ? extends T> lVar) {
                p.j(lVar, "<set-?>");
                this.f2748c = lVar;
            }

            public final void o(l<? super b<S>, ? extends v1.a0<T>> lVar) {
                p.j(lVar, "<set-?>");
                this.f2747b = lVar;
            }

            public final void p(b<S> bVar) {
                p.j(bVar, "segment");
                Object invoke = this.f2748c.invoke(bVar.b());
                if (this.f2749d.f2745d.q()) {
                    this.f2746a.E(this.f2748c.invoke(bVar.c()), invoke, (v1.a0) this.f2747b.invoke(bVar));
                    return;
                }
                this.f2746a.F(invoke, (v1.a0) this.f2747b.invoke(bVar));
            }
        }

        public a(Transition transition, v1.q0<T, V> q0Var, String str) {
            p.j(transition, "this$0");
            p.j(q0Var, "typeConverter");
            p.j(str, "label");
            this.f2745d = transition;
            this.f2742a = q0Var;
            this.f2743b = str;
        }

        public final d1<T> a(l<? super b<S>, ? extends v1.a0<T>> lVar, l<? super S, ? extends T> lVar2) {
            p.j(lVar, "transitionSpec");
            p.j(lVar2, "targetValueByState");
            Transition<S>.defpackage.a<T, V>.defpackage.a<T, V> aVar = this.f2744c;
            if (aVar == null) {
                Transition<S> transition = this.f2745d;
                aVar = new C0017a<>(this, new d(transition, lVar2.invoke(transition.g()), v1.j.e(this.f2742a, lVar2.invoke(this.f2745d.g())), this.f2742a, this.f2743b), lVar, lVar2);
                Transition<S> transition2 = this.f2745d;
                c(aVar);
                transition2.d(aVar.d());
            }
            Transition<S> transition3 = this.f2745d;
            aVar.n(lVar2);
            aVar.o(lVar);
            aVar.p(transition3.k());
            return aVar;
        }

        public final Transition<S>.defpackage.a<T, V>.defpackage.a<T, V> b() {
            return this.f2744c;
        }

        public final void c(Transition<S>.defpackage.a<T, V>.defpackage.a<T, V> aVar) {
            this.f2744c = aVar;
        }

        public final void d() {
            Transition<S>.defpackage.a<T, V>.defpackage.a<T, V> aVar = this.f2744c;
            if (aVar != null) {
                Transition<S> transition = this.f2745d;
                aVar.d().E(aVar.f().invoke(transition.k().c()), aVar.f().invoke(transition.k().b()), aVar.k().invoke(transition.k()));
            }
        }
    }

    /* compiled from: Transition.kt */
    public interface b<S> {

        /* compiled from: Transition.kt */
        public static final class a {
            public static <S> boolean a(b<S> bVar, S s11, S s12) {
                p.j(bVar, "this");
                return p.e(s11, bVar.c()) && p.e(s12, bVar.b());
            }
        }

        boolean a(S s11, S s12);

        S b();

        S c();
    }

    /* compiled from: Transition.kt */
    private static final class c<S> implements b<S> {

        /* renamed from: a  reason: collision with root package name */
        private final S f2756a;

        /* renamed from: b  reason: collision with root package name */
        private final S f2757b;

        public c(S s11, S s12) {
            this.f2756a = s11;
            this.f2757b = s12;
        }

        public boolean a(S s11, S s12) {
            return b.a.a(this, s11, s12);
        }

        public S b() {
            return this.f2757b;
        }

        public S c() {
            return this.f2756a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return p.e(c(), bVar.c()) && p.e(b(), bVar.b());
            }
        }

        public int hashCode() {
            Object c11 = c();
            int i11 = 0;
            int hashCode = (c11 == null ? 0 : c11.hashCode()) * 31;
            Object b11 = b();
            if (b11 != null) {
                i11 = b11.hashCode();
            }
            return hashCode + i11;
        }
    }

    /* compiled from: Transition.kt */
    public final class d<T, V extends v1.n> implements d1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final v1.q0<T, V> f2758a;

        /* renamed from: b  reason: collision with root package name */
        private final String f2759b;

        /* renamed from: c  reason: collision with root package name */
        private final h0 f2760c;

        /* renamed from: d  reason: collision with root package name */
        private final h0 f2761d = j.e(v1.h.g(0.0f, 0.0f, (Object) null, 7, (Object) null), (a1) null, 2, (Object) null);

        /* renamed from: e  reason: collision with root package name */
        private final h0 f2762e;

        /* renamed from: f  reason: collision with root package name */
        private final h0 f2763f;

        /* renamed from: g  reason: collision with root package name */
        private final h0 f2764g;

        /* renamed from: h  reason: collision with root package name */
        private final h0 f2765h;

        /* renamed from: i  reason: collision with root package name */
        private final h0 f2766i;
        private V j;
        private final v1.a0<T> k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Transition<S> f2767l;

        public d(Transition transition, T t, V v, v1.q0<T, V> q0Var, String str) {
            Object obj;
            p.j(transition, "this$0");
            p.j(v, "initialVelocityVector");
            p.j(q0Var, "typeConverter");
            p.j(str, "label");
            this.f2767l = transition;
            this.f2758a = q0Var;
            this.f2759b = str;
            this.f2760c = j.e(t, (a1) null, 2, (Object) null);
            this.f2762e = j.e(new v1.o0(f(), q0Var, t, p(), v), (a1) null, 2, (Object) null);
            this.f2763f = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
            this.f2764g = j.e(0L, (a1) null, 2, (Object) null);
            this.f2765h = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
            this.f2766i = j.e(t, (a1) null, 2, (Object) null);
            this.j = v;
            Float f11 = (Float) v1.c1.h().get(q0Var);
            if (f11 == null) {
                obj = null;
            } else {
                float floatValue = f11.floatValue();
                v1.n nVar = (v1.n) q().a().invoke(t);
                int b11 = nVar.b();
                for (int i11 = 0; i11 < b11; i11++) {
                    nVar.e(i11, floatValue);
                }
                obj = q().b().invoke(nVar);
            }
            this.k = v1.h.g(0.0f, 0.0f, obj, 3, (Object) null);
        }

        private final void A(T t) {
            this.f2760c.setValue(t);
        }

        private final void C(T t, boolean z11) {
            v1.a0<T> a0Var;
            if (z11) {
                a0Var = f() instanceof v1.l0 ? f() : this.k;
            } else {
                a0Var = f();
            }
            v(new v1.o0(a0Var, this.f2758a, t, p(), this.j));
            this.f2767l.r();
        }

        static /* synthetic */ void D(d dVar, Object obj, boolean z11, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            dVar.C(obj, z11);
        }

        private final boolean n() {
            return ((Boolean) this.f2765h.getValue()).booleanValue();
        }

        private final long o() {
            return ((Number) this.f2764g.getValue()).longValue();
        }

        private final T p() {
            return this.f2760c.getValue();
        }

        private final void v(v1.o0<T, V> o0Var) {
            this.f2762e.setValue(o0Var);
        }

        private final void w(v1.a0<T> a0Var) {
            this.f2761d.setValue(a0Var);
        }

        private final void y(boolean z11) {
            this.f2765h.setValue(Boolean.valueOf(z11));
        }

        private final void z(long j11) {
            this.f2764g.setValue(Long.valueOf(j11));
        }

        public void B(T t) {
            this.f2766i.setValue(t);
        }

        public final void E(T t, T t11, v1.a0<T> a0Var) {
            p.j(a0Var, "animationSpec");
            A(t11);
            w(a0Var);
            if (!p.e(d().h(), t) || !p.e(d().f(), t11)) {
                D(this, t, false, 2, (Object) null);
            }
        }

        public final void F(T t, v1.a0<T> a0Var) {
            p.j(a0Var, "animationSpec");
            if (!p.e(p(), t) || n()) {
                A(t);
                w(a0Var);
                D(this, (Object) null, !r(), 1, (Object) null);
                x(false);
                z(this.f2767l.j());
                y(false);
            }
        }

        public final v1.o0<T, V> d() {
            return (v1.o0) this.f2762e.getValue();
        }

        public final v1.a0<T> f() {
            return (v1.a0) this.f2761d.getValue();
        }

        public T getValue() {
            return this.f2766i.getValue();
        }

        public final long k() {
            return d().c();
        }

        public final v1.q0<T, V> q() {
            return this.f2758a;
        }

        public final boolean r() {
            return ((Boolean) this.f2763f.getValue()).booleanValue();
        }

        public final void s(long j11) {
            long o11 = j11 - o();
            B(d().e(o11));
            this.j = d().g(o11);
            if (d().b(o11)) {
                x(true);
                z(0);
            }
        }

        public final void t() {
            y(true);
        }

        public final void u(long j11) {
            B(d().e(j11));
            this.j = d().g(j11);
        }

        public final void x(boolean z11) {
            this.f2763f.setValue(Boolean.valueOf(z11));
        }
    }

    public Transition(v1.i0<S> i0Var, String str) {
        p.j(i0Var, "transitionState");
        this.f2732a = i0Var;
        this.f2733b = str;
        this.f2734c = j.e(g(), (a1) null, 2, (Object) null);
        this.f2735d = j.e(new c(g(), g()), (a1) null, 2, (Object) null);
        this.f2736e = j.e(0L, (a1) null, 2, (Object) null);
        this.f2737f = j.e(Long.MIN_VALUE, (a1) null, 2, (Object) null);
        this.f2738g = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
        this.f2739h = g.d();
        this.f2740i = g.d();
        this.j = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
        this.f2741l = g.c(new Transition$totalDurationNanos$2(this));
    }

    private final void C(b<S> bVar) {
        this.f2735d.setValue(bVar);
    }

    private final void D(long j11) {
        this.f2737f.setValue(Long.valueOf(j11));
    }

    private final long l() {
        return ((Number) this.f2737f.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    public final void r() {
        F(true);
        if (q()) {
            long j11 = 0;
            for (d next : this.f2739h) {
                j11 = Math.max(j11, next.k());
                next.u(i());
            }
            F(false);
        }
    }

    public final void A(long j11) {
        this.f2736e.setValue(Long.valueOf(j11));
    }

    public final void B(boolean z11) {
        this.j.setValue(Boolean.valueOf(z11));
    }

    public final void E(S s11) {
        this.f2734c.setValue(s11);
    }

    public final void F(boolean z11) {
        this.f2738g.setValue(Boolean.valueOf(z11));
    }

    public final void G(S s11, e0.g gVar, int i11) {
        int i12;
        e0.g t = gVar.t(-1598251902);
        if ((i11 & 14) == 0) {
            i12 = (t.k(s11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(this) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && t.b()) {
            t.h();
        } else if (!q() && !p.e(m(), s11)) {
            C(new c(m(), s11));
            z(m());
            E(s11);
            if (!p()) {
                F(true);
            }
            for (Transition<S>.defpackage.d<?, ?> t11 : this.f2739h) {
                t11.t();
            }
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new Transition$updateTarget$2(this, s11, i11));
        }
    }

    public final boolean d(Transition<S>.defpackage.d<?, ?> dVar) {
        p.j(dVar, "animation");
        return this.f2739h.add(dVar);
    }

    public final boolean e(Transition<?> transition) {
        p.j(transition, "transition");
        return this.f2740i.add(transition);
    }

    public final void f(S s11, e0.g gVar, int i11) {
        int i12;
        e0.g t = gVar.t(-1097578271);
        if ((i11 & 14) == 0) {
            i12 = (t.k(s11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(this) ? 32 : 16;
        }
        if (((i12 & 91) ^ 18) == 0 && t.b()) {
            t.h();
        } else if (!q()) {
            G(s11, t, (i12 & 14) | (i12 & 112));
            if (!p.e(s11, g()) || p() || o()) {
                int i13 = (i12 >> 3) & 14;
                t.E(-3686930);
                boolean k11 = t.k(this);
                Object F = t.F();
                if (k11 || F == e0.g.f14172a.a()) {
                    F = new Transition$animateTo$1$1(this, (fp0.c<? super Transition$animateTo$1$1>) null);
                    t.y(F);
                }
                t.P();
                u.e(this, (lp0.p) F, t, i13);
            }
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new Transition$animateTo$2(this, s11, i11));
        }
    }

    public final S g() {
        return this.f2732a.a();
    }

    public final String h() {
        return this.f2733b;
    }

    public final long i() {
        return this.k;
    }

    public final long j() {
        return ((Number) this.f2736e.getValue()).longValue();
    }

    public final b<S> k() {
        return (b) this.f2735d.getValue();
    }

    public final S m() {
        return this.f2734c.getValue();
    }

    public final long n() {
        return ((Number) this.f2741l.getValue()).longValue();
    }

    public final boolean o() {
        return ((Boolean) this.f2738g.getValue()).booleanValue();
    }

    public final boolean p() {
        return l() != Long.MIN_VALUE;
    }

    public final boolean q() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void s(long j11) {
        if (l() == Long.MIN_VALUE) {
            u(j11);
        }
        F(false);
        A(j11 - l());
        boolean z11 = true;
        for (d next : this.f2739h) {
            if (!next.r()) {
                next.s(j());
            }
            if (!next.r()) {
                z11 = false;
            }
        }
        for (Transition next2 : this.f2740i) {
            if (!p.e(next2.m(), next2.g())) {
                next2.s(j());
            }
            if (!p.e(next2.m(), next2.g())) {
                z11 = false;
            }
        }
        if (z11) {
            t();
        }
    }

    public final void t() {
        D(Long.MIN_VALUE);
        z(m());
        A(0);
        this.f2732a.d(false);
    }

    public final void u(long j11) {
        D(j11);
        this.f2732a.d(true);
    }

    public final void v(Transition<S>.defpackage.a<?, ?> aVar) {
        d<?, ?> d11;
        p.j(aVar, "deferredAnimation");
        a.C0017a<?, ?> b11 = aVar.b();
        if (b11 != null && (d11 = b11.d()) != null) {
            w(d11);
        }
    }

    public final void w(Transition<S>.defpackage.d<?, ?> dVar) {
        p.j(dVar, "animation");
        this.f2739h.remove((Object) dVar);
    }

    public final boolean x(Transition<?> transition) {
        p.j(transition, "transition");
        return this.f2740i.remove((Object) transition);
    }

    public final void y(S s11, S s12, long j11) {
        D(Long.MIN_VALUE);
        this.f2732a.d(false);
        if (!q() || !p.e(g(), s11) || !p.e(m(), s12)) {
            z(s11);
            E(s12);
            B(true);
            C(new c(s11, s12));
        }
        for (Transition next : this.f2740i) {
            if (next.q()) {
                next.y(next.g(), next.m(), j11);
            }
        }
        for (Transition<S>.defpackage.d<?, ?> u11 : this.f2739h) {
            u11.u(j11);
        }
        this.k = j11;
    }

    public final void z(S s11) {
        this.f2732a.c(s11);
    }

    public Transition(S s11, String str) {
        this(new v1.i0(s11), str);
    }
}
