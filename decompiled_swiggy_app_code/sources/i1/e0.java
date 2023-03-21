package i1;

import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.b;
import d2.m;
import d2.q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.j0;

/* compiled from: Placeable.kt */
public abstract class e0 implements y {

    /* renamed from: a  reason: collision with root package name */
    private int f14876a;

    /* renamed from: b  reason: collision with root package name */
    private int f14877b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public long f14878c = q.a(0, 0);

    /* renamed from: d  reason: collision with root package name */
    private long f14879d = PlaceableKt.f6768b;

    /* compiled from: Placeable.kt */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0133a f14880a = new C0133a((i) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static LayoutDirection f14881b = LayoutDirection.Ltr;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static int f14882c;

        /* renamed from: i1.e0$a$a  reason: collision with other inner class name */
        /* compiled from: Placeable.kt */
        public static final class C0133a extends a {
            private C0133a() {
            }

            public /* synthetic */ C0133a(i iVar) {
                this();
            }

            /* access modifiers changed from: protected */
            public LayoutDirection g() {
                return a.f14881b;
            }

            /* access modifiers changed from: protected */
            public int h() {
                return a.f14882c;
            }
        }

        public static /* synthetic */ void j(a aVar, e0 e0Var, int i11, int i12, float f11, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 4) != 0) {
                    f11 = 0.0f;
                }
                aVar.i(e0Var, i11, i12, f11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public static /* synthetic */ void l(a aVar, e0 e0Var, long j, float f11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    f11 = 0.0f;
                }
                aVar.k(e0Var, j, f11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void n(a aVar, e0 e0Var, int i11, int i12, float f11, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 4) != 0) {
                    f11 = 0.0f;
                }
                aVar.m(e0Var, i11, i12, f11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public static /* synthetic */ void p(a aVar, e0 e0Var, long j, float f11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    f11 = 0.0f;
                }
                aVar.o(e0Var, j, f11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void r(a aVar, e0 e0Var, int i11, int i12, float f11, l lVar, int i13, Object obj) {
            if (obj == null) {
                float f12 = (i13 & 4) != 0 ? 0.0f : f11;
                if ((i13 & 8) != 0) {
                    lVar = PlaceableKt.f6767a;
                }
                aVar.q(e0Var, i11, i12, f12, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public static /* synthetic */ void t(a aVar, e0 e0Var, long j, float f11, l lVar, int i11, Object obj) {
            if (obj == null) {
                float f12 = (i11 & 2) != 0 ? 0.0f : f11;
                if ((i11 & 4) != 0) {
                    lVar = PlaceableKt.f6767a;
                }
                aVar.s(e0Var, j, f12, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void v(a aVar, e0 e0Var, int i11, int i12, float f11, l lVar, int i13, Object obj) {
            if (obj == null) {
                float f12 = (i13 & 4) != 0 ? 0.0f : f11;
                if ((i13 & 8) != 0) {
                    lVar = PlaceableKt.f6767a;
                }
                aVar.u(e0Var, i11, i12, f12, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public static /* synthetic */ void x(a aVar, e0 e0Var, long j, float f11, l lVar, int i11, Object obj) {
            if (obj == null) {
                float f12 = (i11 & 2) != 0 ? 0.0f : f11;
                if ((i11 & 4) != 0) {
                    lVar = PlaceableKt.f6767a;
                }
                aVar.w(e0Var, j, f12, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* access modifiers changed from: protected */
        public abstract LayoutDirection g();

        /* access modifiers changed from: protected */
        public abstract int h();

        public final void i(e0 e0Var, int i11, int i12, float f11) {
            p.j(e0Var, "<this>");
            long a11 = m.a(i11, i12);
            long T = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(a11) + d2.l.j(T), d2.l.k(a11) + d2.l.k(T)), f11, (l<? super j0, k>) null);
        }

        public final void k(e0 e0Var, long j, float f11) {
            p.j(e0Var, "$this$place");
            long T = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(j) + d2.l.j(T), d2.l.k(j) + d2.l.k(T)), f11, (l<? super j0, k>) null);
        }

        public final void m(e0 e0Var, int i11, int i12, float f11) {
            p.j(e0Var, "<this>");
            long a11 = m.a(i11, i12);
            if (g() == LayoutDirection.Ltr || h() == 0) {
                long T = e0Var.Y();
                e0Var.D0(m.a(d2.l.j(a11) + d2.l.j(T), d2.l.k(a11) + d2.l.k(T)), f11, (l<? super j0, k>) null);
                return;
            }
            long a12 = m.a((h() - d2.p.g(e0Var.f14878c)) - d2.l.j(a11), d2.l.k(a11));
            long T2 = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(a12) + d2.l.j(T2), d2.l.k(a12) + d2.l.k(T2)), f11, (l<? super j0, k>) null);
        }

        public final void o(e0 e0Var, long j, float f11) {
            p.j(e0Var, "$this$placeRelative");
            if (g() == LayoutDirection.Ltr || h() == 0) {
                long T = e0Var.Y();
                e0Var.D0(m.a(d2.l.j(j) + d2.l.j(T), d2.l.k(j) + d2.l.k(T)), f11, (l<? super j0, k>) null);
                return;
            }
            long a11 = m.a((h() - d2.p.g(e0Var.f14878c)) - d2.l.j(j), d2.l.k(j));
            long T2 = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(a11) + d2.l.j(T2), d2.l.k(a11) + d2.l.k(T2)), f11, (l<? super j0, k>) null);
        }

        public final void q(e0 e0Var, int i11, int i12, float f11, l<? super j0, k> lVar) {
            p.j(e0Var, "<this>");
            p.j(lVar, "layerBlock");
            long a11 = m.a(i11, i12);
            if (g() == LayoutDirection.Ltr || h() == 0) {
                long T = e0Var.Y();
                e0Var.D0(m.a(d2.l.j(a11) + d2.l.j(T), d2.l.k(a11) + d2.l.k(T)), f11, lVar);
                return;
            }
            long a12 = m.a((h() - d2.p.g(e0Var.f14878c)) - d2.l.j(a11), d2.l.k(a11));
            long T2 = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(a12) + d2.l.j(T2), d2.l.k(a12) + d2.l.k(T2)), f11, lVar);
        }

        public final void s(e0 e0Var, long j, float f11, l<? super j0, k> lVar) {
            p.j(e0Var, "$this$placeRelativeWithLayer");
            p.j(lVar, "layerBlock");
            if (g() == LayoutDirection.Ltr || h() == 0) {
                long T = e0Var.Y();
                e0Var.D0(m.a(d2.l.j(j) + d2.l.j(T), d2.l.k(j) + d2.l.k(T)), f11, lVar);
                return;
            }
            long a11 = m.a((h() - d2.p.g(e0Var.f14878c)) - d2.l.j(j), d2.l.k(j));
            long T2 = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(a11) + d2.l.j(T2), d2.l.k(a11) + d2.l.k(T2)), f11, lVar);
        }

        public final void u(e0 e0Var, int i11, int i12, float f11, l<? super j0, k> lVar) {
            p.j(e0Var, "<this>");
            p.j(lVar, "layerBlock");
            long a11 = m.a(i11, i12);
            long T = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(a11) + d2.l.j(T), d2.l.k(a11) + d2.l.k(T)), f11, lVar);
        }

        public final void w(e0 e0Var, long j, float f11, l<? super j0, k> lVar) {
            p.j(e0Var, "$this$placeWithLayer");
            p.j(lVar, "layerBlock");
            long T = e0Var.Y();
            e0Var.D0(m.a(d2.l.j(j) + d2.l.j(T), d2.l.k(j) + d2.l.k(T)), f11, lVar);
        }
    }

    private final void E0() {
        this.f14876a = l.m(d2.p.g(this.f14878c), b.p(this.f14879d), b.n(this.f14879d));
        this.f14877b = l.m(d2.p.f(this.f14878c), b.o(this.f14879d), b.m(this.f14879d));
    }

    public final int A0() {
        return this.f14876a;
    }

    /* access modifiers changed from: protected */
    public abstract void D0(long j, float f11, l<? super j0, k> lVar);

    /* access modifiers changed from: protected */
    public final void F0(long j) {
        if (!d2.p.e(this.f14878c, j)) {
            this.f14878c = j;
            E0();
        }
    }

    /* access modifiers changed from: protected */
    public final void G0(long j) {
        if (!b.g(this.f14879d, j)) {
            this.f14879d = j;
            E0();
        }
    }

    /* access modifiers changed from: protected */
    public final long Y() {
        return m.a((this.f14876a - d2.p.g(this.f14878c)) / 2, (this.f14877b - d2.p.f(this.f14878c)) / 2);
    }

    public final int e0() {
        return this.f14877b;
    }

    public int f0() {
        return d2.p.f(this.f14878c);
    }

    /* access modifiers changed from: protected */
    public final long n0() {
        return this.f14878c;
    }

    public /* synthetic */ Object p() {
        return x.a(this);
    }

    public int q0() {
        return d2.p.g(this.f14878c);
    }

    /* access modifiers changed from: protected */
    public final long z0() {
        return this.f14879d;
    }
}
