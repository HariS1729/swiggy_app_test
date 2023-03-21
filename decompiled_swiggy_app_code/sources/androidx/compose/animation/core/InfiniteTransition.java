package androidx.compose.animation.core;

import defpackage.v1;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import e0.s0;
import e0.u;
import f0.e;
import fp0.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: InfiniteTransition.kt */
public final class InfiniteTransition {

    /* renamed from: e  reason: collision with root package name */
    public static final int f2655e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e<a<?, ?>> f2656a = new e<>(new a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final h0 f2657b = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private long f2658c = Long.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f2659d = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);

    /* compiled from: InfiniteTransition.kt */
    public final class a<T, V extends v1.n> implements d1<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f2660a;

        /* renamed from: b  reason: collision with root package name */
        private T f2661b;

        /* renamed from: c  reason: collision with root package name */
        private final v1.q0<T, V> f2662c;

        /* renamed from: d  reason: collision with root package name */
        private v1.g<T> f2663d;

        /* renamed from: e  reason: collision with root package name */
        private final h0 f2664e;

        /* renamed from: f  reason: collision with root package name */
        private v1.o0<T, V> f2665f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2666g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2667h;

        /* renamed from: i  reason: collision with root package name */
        private long f2668i;
        final /* synthetic */ InfiniteTransition j;

        public a(InfiniteTransition infiniteTransition, T t, T t11, v1.q0<T, V> q0Var, v1.g<T> gVar) {
            p.j(infiniteTransition, "this$0");
            p.j(q0Var, "typeConverter");
            p.j(gVar, "animationSpec");
            this.j = infiniteTransition;
            this.f2660a = t;
            this.f2661b = t11;
            this.f2662c = q0Var;
            this.f2663d = gVar;
            this.f2664e = j.e(t, (a1) null, 2, (Object) null);
            this.f2665f = new v1.o0(this.f2663d, q0Var, this.f2660a, this.f2661b, (v1.n) null, 16, (i) null);
        }

        public final T d() {
            return this.f2660a;
        }

        public final T f() {
            return this.f2661b;
        }

        public T getValue() {
            return this.f2664e.getValue();
        }

        public final boolean k() {
            return this.f2666g;
        }

        public final void n(long j11) {
            this.j.i(false);
            if (this.f2667h) {
                this.f2667h = false;
                this.f2668i = j11;
            }
            long j12 = j11 - this.f2668i;
            o(this.f2665f.e(j12));
            this.f2666g = this.f2665f.b(j12);
        }

        public void o(T t) {
            this.f2664e.setValue(t);
        }

        public final void p(T t, T t11, v1.g<T> gVar) {
            p.j(gVar, "animationSpec");
            this.f2660a = t;
            this.f2661b = t11;
            this.f2663d = gVar;
            this.f2665f = new v1.o0(gVar, this.f2662c, t, t11, (v1.n) null, 16, (i) null);
            this.j.i(true);
            this.f2666g = false;
            this.f2667h = true;
        }
    }

    private final boolean d() {
        return ((Boolean) this.f2657b.getValue()).booleanValue();
    }

    private final boolean e() {
        return ((Boolean) this.f2659d.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void f(long j) {
        boolean z11;
        if (this.f2658c == Long.MIN_VALUE) {
            this.f2658c = j;
        }
        long j11 = j - this.f2658c;
        e<a<?, ?>> eVar = this.f2656a;
        int m11 = eVar.m();
        if (m11 > 0) {
            Object[] l11 = eVar.l();
            int i11 = 0;
            z11 = true;
            do {
                a aVar = (a) l11[i11];
                if (!aVar.k()) {
                    aVar.n(j11);
                }
                if (!aVar.k()) {
                    z11 = false;
                }
                i11++;
            } while (i11 < m11);
        } else {
            z11 = true;
        }
        j(!z11);
    }

    /* access modifiers changed from: private */
    public final void i(boolean z11) {
        this.f2657b.setValue(Boolean.valueOf(z11));
    }

    private final void j(boolean z11) {
        this.f2659d.setValue(Boolean.valueOf(z11));
    }

    public final void c(a<?, ?> aVar) {
        p.j(aVar, "animation");
        this.f2656a.b(aVar);
        i(true);
    }

    public final void g(a<?, ?> aVar) {
        p.j(aVar, "animation");
        this.f2656a.r(aVar);
    }

    public final void h(g gVar, int i11) {
        g t = gVar.t(2102343854);
        if (e() || d()) {
            u.e(this, new InfiniteTransition$run$1(this, (c<? super InfiniteTransition$run$1>) null), t, 8);
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new InfiniteTransition$run$2(this, i11));
        }
    }
}
