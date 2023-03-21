package c0;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import defpackage.v1;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import lp0.l;
import p.k;
import u0.d0;

/* compiled from: TextFieldDefaults.kt */
final class f implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f12694a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12695b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12696c;

    /* renamed from: d  reason: collision with root package name */
    private final long f12697d;

    /* renamed from: e  reason: collision with root package name */
    private final long f12698e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12699f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12700g;

    /* renamed from: h  reason: collision with root package name */
    private final long f12701h;

    /* renamed from: i  reason: collision with root package name */
    private final long f12702i;
    private final long j;
    private final long k;

    /* renamed from: l  reason: collision with root package name */
    private final long f12703l;

    /* renamed from: m  reason: collision with root package name */
    private final long f12704m;
    private final long n;

    /* renamed from: o  reason: collision with root package name */
    private final long f12705o;

    /* renamed from: p  reason: collision with root package name */
    private final long f12706p;
    private final long q;

    /* renamed from: r  reason: collision with root package name */
    private final long f12707r;

    /* renamed from: s  reason: collision with root package name */
    private final long f12708s;
    private final long t;

    /* renamed from: u  reason: collision with root package name */
    private final long f12709u;

    private f(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33) {
        this.f12694a = j11;
        this.f12695b = j12;
        this.f12696c = j13;
        this.f12697d = j14;
        this.f12698e = j15;
        this.f12699f = j16;
        this.f12700g = j17;
        this.f12701h = j18;
        this.f12702i = j19;
        this.j = j21;
        this.k = j22;
        this.f12703l = j23;
        this.f12704m = j24;
        this.n = j25;
        this.f12705o = j26;
        this.f12706p = j27;
        this.q = j28;
        this.f12707r = j29;
        this.f12708s = j31;
        this.t = j32;
        this.f12709u = j33;
    }

    public /* synthetic */ f(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, i iVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33);
    }

    private static final boolean k(d1<Boolean> d1Var) {
        return d1Var.getValue().booleanValue();
    }

    private static final boolean l(d1<Boolean> d1Var) {
        return d1Var.getValue().booleanValue();
    }

    public d1<d0> a(boolean z11, g gVar, int i11) {
        gVar.E(163023731);
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(this.f12705o), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> b(boolean z11, g gVar, int i11) {
        gVar.E(-509860761);
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(z11 ? this.f12694a : this.f12695b), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> c(boolean z11, boolean z12, g gVar, int i11) {
        long j11;
        gVar.E(-2025568038);
        if (!z11) {
            j11 = this.f12704m;
        } else if (z12) {
            j11 = this.n;
        } else {
            j11 = this.f12703l;
        }
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(j11), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> d(boolean z11, g gVar, int i11) {
        gVar.E(-1692277385);
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(z11 ? this.f12697d : this.f12696c), gVar, 0);
        gVar.P();
        return m11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p.e(s.b(f.class), s.b(obj.getClass()))) {
            return false;
        }
        f fVar = (f) obj;
        return d0.n(this.f12694a, fVar.f12694a) && d0.n(this.f12695b, fVar.f12695b) && d0.n(this.f12696c, fVar.f12696c) && d0.n(this.f12697d, fVar.f12697d) && d0.n(this.f12698e, fVar.f12698e) && d0.n(this.f12699f, fVar.f12699f) && d0.n(this.f12700g, fVar.f12700g) && d0.n(this.f12701h, fVar.f12701h) && d0.n(this.f12702i, fVar.f12702i) && d0.n(this.j, fVar.j) && d0.n(this.k, fVar.k) && d0.n(this.f12703l, fVar.f12703l) && d0.n(this.f12704m, fVar.f12704m) && d0.n(this.n, fVar.n) && d0.n(this.f12705o, fVar.f12705o) && d0.n(this.f12706p, fVar.f12706p) && d0.n(this.q, fVar.q) && d0.n(this.f12707r, fVar.f12707r) && d0.n(this.f12708s, fVar.f12708s) && d0.n(this.t, fVar.t) && d0.n(this.f12709u, fVar.f12709u);
    }

    public d1<d0> f(boolean z11, g gVar, int i11) {
        gVar.E(-853664209);
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(z11 ? this.t : this.f12709u), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> g(boolean z11, boolean z12, g gVar, int i11) {
        long j11;
        gVar.E(-1018451296);
        if (!z11) {
            j11 = this.j;
        } else if (z12) {
            j11 = this.k;
        } else {
            j11 = this.f12702i;
        }
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(j11), gVar, 0);
        gVar.P();
        return m11;
    }

    public d1<d0> h(boolean z11, boolean z12, u.i iVar, g gVar, int i11) {
        long j11;
        d1<d0> d1Var;
        p.j(iVar, "interactionSource");
        gVar.E(-2054208596);
        d1<Boolean> a11 = FocusInteractionKt.a(iVar, gVar, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.f12701h;
        } else if (z12) {
            j11 = this.f12700g;
        } else if (k(a11)) {
            j11 = this.f12698e;
        } else {
            j11 = this.f12699f;
        }
        long j12 = j11;
        if (z11) {
            gVar.E(-2054208139);
            d1Var = k.a(j12, v1.h.i(150, 0, (v1.y) null, 6, (Object) null), (l<? super d0, bp0.k>) null, gVar, 48, 4);
            gVar.P();
        } else {
            gVar.E(-2054208034);
            d1Var = androidx.compose.runtime.g.m(d0.h(j12), gVar, 0);
            gVar.P();
        }
        gVar.P();
        return d1Var;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((d0.t(this.f12694a) * 31) + d0.t(this.f12695b)) * 31) + d0.t(this.f12696c)) * 31) + d0.t(this.f12697d)) * 31) + d0.t(this.f12698e)) * 31) + d0.t(this.f12699f)) * 31) + d0.t(this.f12700g)) * 31) + d0.t(this.f12701h)) * 31) + d0.t(this.f12702i)) * 31) + d0.t(this.j)) * 31) + d0.t(this.k)) * 31) + d0.t(this.f12703l)) * 31) + d0.t(this.f12704m)) * 31) + d0.t(this.n)) * 31) + d0.t(this.f12705o)) * 31) + d0.t(this.f12706p)) * 31) + d0.t(this.q)) * 31) + d0.t(this.f12707r)) * 31) + d0.t(this.f12708s)) * 31) + d0.t(this.t)) * 31) + d0.t(this.f12709u);
    }

    public d1<d0> j(boolean z11, boolean z12, u.i iVar, g gVar, int i11) {
        long j11;
        p.j(iVar, "interactionSource");
        gVar.E(863335084);
        d1<Boolean> a11 = FocusInteractionKt.a(iVar, gVar, (i11 >> 6) & 14);
        if (!z11) {
            j11 = this.f12707r;
        } else if (z12) {
            j11 = this.f12708s;
        } else if (l(a11)) {
            j11 = this.f12706p;
        } else {
            j11 = this.q;
        }
        d1<d0> m11 = androidx.compose.runtime.g.m(d0.h(j11), gVar, 0);
        gVar.P();
        return m11;
    }
}
