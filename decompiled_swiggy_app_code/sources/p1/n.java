package p1;

import a2.c;
import a2.d;
import a2.f;
import a2.j;
import a2.k;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.unit.LayoutDirection;
import d2.r;
import d2.s;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ParagraphStyle.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final long f16153a = r.f14022b.a();

    public static final m a(m mVar, m mVar2, float f11) {
        p.j(mVar, "start");
        p.j(mVar2, "stop");
        d dVar = (d) SpanStyleKt.c(mVar.f(), mVar2.f(), f11);
        f fVar = (f) SpanStyleKt.c(mVar.g(), mVar2.g(), f11);
        long e11 = SpanStyleKt.e(mVar.c(), mVar2.c(), f11);
        j h11 = mVar.h();
        if (h11 == null) {
            h11 = j.f940c.a();
        }
        j h12 = mVar2.h();
        if (h12 == null) {
            h12 = j.f940c.a();
        }
        return new m(dVar, fVar, e11, k.a(h11, h12, f11), b(mVar.e(), mVar2.e(), f11), (c) SpanStyleKt.c(mVar.d(), mVar2.d(), f11), (i) null);
    }

    private static final q b(q qVar, q qVar2, float f11) {
        if (qVar == null && qVar2 == null) {
            return null;
        }
        if (qVar == null) {
            qVar = q.f16165b.a();
        }
        if (qVar2 == null) {
            qVar2 = q.f16165b.a();
        }
        return a.b(qVar, qVar2, f11);
    }

    public static final m c(m mVar, LayoutDirection layoutDirection) {
        p.j(mVar, "style");
        p.j(layoutDirection, "direction");
        d f11 = mVar.f();
        d g11 = d.g(f11 != null ? f11.m() : d.f907b.f());
        f f12 = f.f(d0.e(layoutDirection, mVar.g()));
        long c11 = s.g(mVar.c()) ? f16153a : mVar.c();
        j h11 = mVar.h();
        if (h11 == null) {
            h11 = j.f940c.a();
        }
        return new m(g11, f12, c11, h11, mVar.e(), mVar.d(), (i) null);
    }
}
