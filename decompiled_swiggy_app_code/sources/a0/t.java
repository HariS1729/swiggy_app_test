package a0;

import t0.f;
import t0.g;
import t0.h;

/* compiled from: TextLayoutResultProxy.kt */
public final class t {
    /* access modifiers changed from: private */
    public static final long b(long j, h hVar) {
        float f11;
        float f12;
        if (f.m(j) < hVar.i()) {
            f11 = hVar.i();
        } else if (f.m(j) > hVar.j()) {
            f11 = hVar.j();
        } else {
            f11 = f.m(j);
        }
        if (f.n(j) < hVar.l()) {
            f12 = hVar.l();
        } else if (f.n(j) > hVar.e()) {
            f12 = hVar.e();
        } else {
            f12 = f.n(j);
        }
        return g.a(f11, f12);
    }
}
