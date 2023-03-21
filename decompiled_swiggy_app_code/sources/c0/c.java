package c0;

import androidx.compose.runtime.g;
import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.h0;
import kotlin.jvm.internal.i;
import u0.d0;

/* compiled from: Colors.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f12671a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f12672b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f12673c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f12674d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f12675e;

    /* renamed from: f  reason: collision with root package name */
    private final h0 f12676f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f12677g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f12678h;

    /* renamed from: i  reason: collision with root package name */
    private final h0 f12679i;
    private final h0 j;
    private final h0 k;

    /* renamed from: l  reason: collision with root package name */
    private final h0 f12680l;

    /* renamed from: m  reason: collision with root package name */
    private final h0 f12681m;

    private c(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        this.f12671a = g.g(d0.h(j11), g.o());
        this.f12672b = g.g(d0.h(j12), g.o());
        this.f12673c = g.g(d0.h(j13), g.o());
        this.f12674d = g.g(d0.h(j14), g.o());
        this.f12675e = g.g(d0.h(j15), g.o());
        this.f12676f = g.g(d0.h(j16), g.o());
        this.f12677g = g.g(d0.h(j17), g.o());
        this.f12678h = g.g(d0.h(j18), g.o());
        this.f12679i = g.g(d0.h(j19), g.o());
        this.j = g.g(d0.h(j21), g.o());
        this.k = g.g(d0.h(j22), g.o());
        this.f12680l = g.g(d0.h(j23), g.o());
        this.f12681m = g.g(Boolean.valueOf(z11), g.o());
    }

    public /* synthetic */ c(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11, i iVar) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11);
    }

    public static /* synthetic */ c b(c cVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11, int i11, Object obj) {
        int i12 = i11;
        return cVar.a((i12 & 1) != 0 ? cVar.j() : j11, (i12 & 2) != 0 ? cVar.k() : j12, (i12 & 4) != 0 ? cVar.l() : j13, (i12 & 8) != 0 ? cVar.m() : j14, (i12 & 16) != 0 ? cVar.c() : j15, (i12 & 32) != 0 ? cVar.n() : j16, (i12 & 64) != 0 ? cVar.d() : j17, (i12 & 128) != 0 ? cVar.g() : j18, (i12 & 256) != 0 ? cVar.h() : j19, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? cVar.e() : j21, (i12 & 1024) != 0 ? cVar.i() : j22, (i12 & 2048) != 0 ? cVar.f() : j23, (i12 & 4096) != 0 ? cVar.o() : z11);
    }

    public final void A(long j11) {
        this.f12674d.setValue(d0.h(j11));
    }

    public final void B(long j11) {
        this.f12676f.setValue(d0.h(j11));
    }

    public final c a(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, boolean z11) {
        return new c(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, z11, (i) null);
    }

    public final long c() {
        return ((d0) this.f12675e.getValue()).v();
    }

    public final long d() {
        return ((d0) this.f12677g.getValue()).v();
    }

    public final long e() {
        return ((d0) this.j.getValue()).v();
    }

    public final long f() {
        return ((d0) this.f12680l.getValue()).v();
    }

    public final long g() {
        return ((d0) this.f12678h.getValue()).v();
    }

    public final long h() {
        return ((d0) this.f12679i.getValue()).v();
    }

    public final long i() {
        return ((d0) this.k.getValue()).v();
    }

    public final long j() {
        return ((d0) this.f12671a.getValue()).v();
    }

    public final long k() {
        return ((d0) this.f12672b.getValue()).v();
    }

    public final long l() {
        return ((d0) this.f12673c.getValue()).v();
    }

    public final long m() {
        return ((d0) this.f12674d.getValue()).v();
    }

    public final long n() {
        return ((d0) this.f12676f.getValue()).v();
    }

    public final boolean o() {
        return ((Boolean) this.f12681m.getValue()).booleanValue();
    }

    public final void p(long j11) {
        this.f12675e.setValue(d0.h(j11));
    }

    public final void q(long j11) {
        this.f12677g.setValue(d0.h(j11));
    }

    public final void r(boolean z11) {
        this.f12681m.setValue(Boolean.valueOf(z11));
    }

    public final void s(long j11) {
        this.j.setValue(d0.h(j11));
    }

    public final void t(long j11) {
        this.f12680l.setValue(d0.h(j11));
    }

    public String toString() {
        return "Colors(primary=" + d0.u(j()) + ", primaryVariant=" + d0.u(k()) + ", secondary=" + d0.u(l()) + ", secondaryVariant=" + d0.u(m()) + ", background=" + d0.u(c()) + ", surface=" + d0.u(n()) + ", error=" + d0.u(d()) + ", onPrimary=" + d0.u(g()) + ", onSecondary=" + d0.u(h()) + ", onBackground=" + d0.u(e()) + ", onSurface=" + d0.u(i()) + ", onError=" + d0.u(f()) + ", isLight=" + o() + ')';
    }

    public final void u(long j11) {
        this.f12678h.setValue(d0.h(j11));
    }

    public final void v(long j11) {
        this.f12679i.setValue(d0.h(j11));
    }

    public final void w(long j11) {
        this.k.setValue(d0.h(j11));
    }

    public final void x(long j11) {
        this.f12671a.setValue(d0.h(j11));
    }

    public final void y(long j11) {
        this.f12672b.setValue(d0.h(j11));
    }

    public final void z(long j11) {
        this.f12673c.setValue(d0.h(j11));
    }
}
