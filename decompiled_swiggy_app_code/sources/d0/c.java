package d0;

import d2.e;
import d2.h;
import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import t0.l;

/* compiled from: RippleAnimation.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final float f13803a = h.n((float) 10);

    public static final float a(e eVar, boolean z11, long j) {
        p.j(eVar, "$this$getRippleEndRadius");
        float k = f.k(g.a(l.i(j), l.g(j))) / 2.0f;
        return z11 ? k + eVar.v0(f13803a) : k;
    }

    public static final float b(long j) {
        return Math.max(l.i(j), l.g(j)) * 0.3f;
    }
}
