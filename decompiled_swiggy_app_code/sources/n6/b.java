package n6;

import android.os.SystemClock;
import androidx.compose.ui.graphics.painter.Painter;
import e0.a1;
import e0.h0;
import i1.c;
import i1.i0;
import t0.l;
import t0.m;
import u0.e0;
import w0.f;

/* compiled from: CrossfadePainter.kt */
public final class b extends Painter {

    /* renamed from: g  reason: collision with root package name */
    private Painter f15888g;

    /* renamed from: h  reason: collision with root package name */
    private final Painter f15889h;

    /* renamed from: i  reason: collision with root package name */
    private final c f15890i;
    private final int j;
    private final boolean k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f15891l;

    /* renamed from: m  reason: collision with root package name */
    private final h0 f15892m = j.e(0, (a1) null, 2, (Object) null);
    private long n = -1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15893o;

    /* renamed from: p  reason: collision with root package name */
    private final h0 f15894p = j.e(Float.valueOf(1.0f), (a1) null, 2, (Object) null);
    private final h0 q = j.e((Object) null, (a1) null, 2, (Object) null);

    public b(Painter painter, Painter painter2, c cVar, int i11, boolean z11, boolean z12) {
        this.f15888g = painter;
        this.f15889h = painter2;
        this.f15890i = cVar;
        this.j = i11;
        this.k = z11;
        this.f15891l = z12;
    }

    private final long n(long j11, long j12) {
        l.a aVar = l.f16682b;
        boolean z11 = true;
        if (!(j11 == aVar.a()) && !l.k(j11)) {
            if (j12 != aVar.a()) {
                z11 = false;
            }
            if (!z11 && !l.k(j12)) {
                return i0.b(j11, this.f15890i.a(j11, j12));
            }
        }
        return j12;
    }

    private final long o() {
        Painter painter = this.f15888g;
        l lVar = null;
        l c11 = painter == null ? null : l.c(painter.k());
        long b11 = c11 == null ? l.f16682b.b() : c11.m();
        Painter painter2 = this.f15889h;
        if (painter2 != null) {
            lVar = l.c(painter2.k());
        }
        long b12 = lVar == null ? l.f16682b.b() : lVar.m();
        l.a aVar = l.f16682b;
        boolean z11 = true;
        boolean z12 = b11 != aVar.a();
        if (b12 == aVar.a()) {
            z11 = false;
        }
        if (z12 && z11) {
            return m.a(Math.max(l.i(b11), l.i(b12)), Math.max(l.g(b11), l.g(b12)));
        }
        if (this.f15891l) {
            if (z12) {
                return b11;
            }
            if (z11) {
                return b12;
            }
        }
        return aVar.a();
    }

    private final void p(f fVar, Painter painter, float f11) {
        if (painter != null && f11 > 0.0f) {
            long d11 = fVar.d();
            long n11 = n(painter.k(), d11);
            if ((d11 == l.f16682b.a()) || l.k(d11)) {
                painter.j(fVar, n11, f11, q());
                return;
            }
            float f12 = (float) 2;
            float i11 = (l.i(d11) - l.i(n11)) / f12;
            float g11 = (l.g(d11) - l.g(n11)) / f12;
            fVar.O().c().f(i11, g11, i11, g11);
            painter.j(fVar, n11, f11, q());
            float f13 = -i11;
            float f14 = -g11;
            fVar.O().c().f(f13, f14, f13, f14);
        }
    }

    private final e0 q() {
        return (e0) this.q.getValue();
    }

    private final int r() {
        return ((Number) this.f15892m.getValue()).intValue();
    }

    private final float s() {
        return ((Number) this.f15894p.getValue()).floatValue();
    }

    private final void t(e0 e0Var) {
        this.q.setValue(e0Var);
    }

    private final void u(int i11) {
        this.f15892m.setValue(Integer.valueOf(i11));
    }

    private final void v(float f11) {
        this.f15894p.setValue(Float.valueOf(f11));
    }

    /* access modifiers changed from: protected */
    public boolean a(float f11) {
        v(f11);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(e0 e0Var) {
        t(e0Var);
        return true;
    }

    public long k() {
        return o();
    }

    /* access modifiers changed from: protected */
    public void m(f fVar) {
        if (this.f15893o) {
            p(fVar, this.f15889h, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.n == -1) {
            this.n = uptimeMillis;
        }
        float f11 = ((float) (uptimeMillis - this.n)) / ((float) this.j);
        float l11 = l.l(f11, 0.0f, 1.0f) * s();
        float s11 = this.k ? s() - l11 : s();
        this.f15893o = f11 >= 1.0f;
        p(fVar, this.f15888g, s11);
        p(fVar, this.f15889h, l11);
        if (this.f15893o) {
            this.f15888g = null;
        } else {
            u(r() + 1);
        }
    }
}
