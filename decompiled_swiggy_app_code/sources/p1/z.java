package p1;

import a2.l;
import kotlin.jvm.internal.p;
import t0.f;
import t0.h;
import t0.i;
import t0.m;
import u0.u;
import u0.w;
import u0.x;

/* compiled from: TextPainter.kt */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f16200a = new z();

    private z() {
    }

    public final void a(x xVar, y yVar) {
        p.j(xVar, "canvas");
        p.j(yVar, "textLayoutResult");
        boolean z11 = yVar.h() && l.d(yVar.k().f(), l.f950a.a());
        if (z11) {
            h b11 = i.b(f.f16662b.c(), m.a((float) d2.p.g(yVar.A()), (float) d2.p.f(yVar.A())));
            xVar.a();
            w.e(xVar, b11, 0, 2, (Object) null);
        }
        try {
            u f11 = yVar.k().i().f();
            if (f11 != null) {
                yVar.v().A(xVar, f11, yVar.k().i().t(), yVar.k().i().w());
            } else {
                yVar.v().B(xVar, yVar.k().i().g(), yVar.k().i().t(), yVar.k().i().w());
            }
        } finally {
            if (z11) {
                xVar.o();
            }
        }
    }
}
